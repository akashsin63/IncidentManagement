package com.Incident.IncidentMangement.Controller;

import com.Incident.IncidentMangement.Dto.UserDto;
import com.Incident.IncidentMangement.model.User;
import com.Incident.IncidentMangement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User createUser(@RequestBody UserDto userDto){
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setAddress(userDto.getAddress());
        user.setPinCode(userDto.getPinCode());
        user.setCity(userDto.getCity());
        user.setCountry(userDto.getCountry());

        return UserService.createUser(user);
    }

}
