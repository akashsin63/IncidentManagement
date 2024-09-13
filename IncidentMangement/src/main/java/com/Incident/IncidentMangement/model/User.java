package com.Incident.IncidentMangement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
@AllArgsConstructor

@Entity
@Table(name = "users")
@Data

public class User extends Base {

    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true, length = 10)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false, length = 6)
    private String pinCode;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Incident> incidents = new ArrayList<>();


}
