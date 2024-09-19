package com.Incident.IncidentMangement.Controller;

import com.Incident.IncidentMangement.Dto.UserDto;
import com.Incident.IncidentMangement.Dto.IncidentDto;
import com.Incident.IncidentMangement.model.User;
import com.Incident.IncidentMangement.repo.UserRepository;
import com.Incident.IncidentMangement.service.IUserService;
import com.Incident.IncidentMangement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    public UserController(IUserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody UserDto userDto){

    }

}
