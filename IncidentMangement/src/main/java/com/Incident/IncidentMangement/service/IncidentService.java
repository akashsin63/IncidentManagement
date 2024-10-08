package com.Incident.IncidentMangement.service;

import com.Incident.IncidentMangement.model.Incident;
import com.Incident.IncidentMangement.repo.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class IncidentService {
    @Autowired
    private IncidentRepository incidentRepository;
    public Incident createIncident(Incident incident){
        incident.setIncidentId(generateIncidentId());
        incident.setReportedDateTime(LocalDateTime.now());
        return incidentRepository.save(incident);
    }
    public Optional<Incident> findByIncidentId(String incidentId){
        return incidentRepository.findByIncidentId(incidentId);
    }
    public Incident updateIncident(Incident incident){
        return incidentRepository.save(incident);
    }

    private String generateIncidentId() {
        Random random = new Random();
        int randomNumber = 10000 + random.nextInt(90000);
        return "RMG" + randomNumber + LocalDateTime.now().getYear();
    }
}
