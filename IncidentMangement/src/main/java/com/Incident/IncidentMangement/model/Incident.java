package com.Incident.IncidentMangement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Table(name = "incident")
@Data
public class Incident extends Base {
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String incidentId;
    @Column(nullable = false)
    private String type; // "Enterprise" or "Government"
    @Column(nullable = false)
    private String reporterName;
    @Column(nullable = true)
    private String details;
    @Column(nullable = false)
    private LocalDateTime reportedDateTime;
    @Column(nullable = false)
    private String priority; // "High", "Medium", "Low"

    @Column(nullable = false)
    private String status; // "Open", "In progress", "Closed"

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
