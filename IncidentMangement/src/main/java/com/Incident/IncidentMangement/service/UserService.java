package com.Incident.IncidentMangement.service;

import com.Incident.IncidentMangement.model.User;
import com.Incident.IncidentMangement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public static User createUser(User user) {
        // Add any additional checks or transformations here
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    }
