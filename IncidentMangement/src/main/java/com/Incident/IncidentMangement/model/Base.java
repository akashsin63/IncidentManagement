package com.Incident.IncidentMangement.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

}
