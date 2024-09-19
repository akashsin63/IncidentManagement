package com.Incident.IncidentMangement.Controller;

import com.Incident.IncidentMangement.Dto.IncidentDto;
import com.Incident.IncidentMangement.model.Incident;
import com.Incident.IncidentMangement.model.User;
import com.Incident.IncidentMangement.service.IncidentService;
import com.Incident.IncidentMangement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {
    @Autowired
    private IncidentService incidentService;

    @Autowired
    private UserService userService;

    @PostMapping
    public Incident createIncident(@RequestBody IncidentDto incidentDto , @RequestParam Long userId){
        Incident incident = new Incident();
        incident.setType(incidentDto.getType());
        incident.setDetails(incidentDto.getDetails());
        incident.setPriority(incidentDto.getPriority());
        incident.setStatus(incidentDto.getStatus());
        incident.setReporterName(incidentDto.getReporterName());

        User user = userService.findByEmail(incidentDto.getReporterName()).orElseThrow(() -> new RuntimeException("user not found"))
    }



}
