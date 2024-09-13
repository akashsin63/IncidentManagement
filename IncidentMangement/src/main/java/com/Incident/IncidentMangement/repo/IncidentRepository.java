package com.Incident.IncidentMangement.repo;

import com.Incident.IncidentMangement.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IncidentRepository extends JpaRepository<Incident,Long> {

    Optional<Incident> findByIncidentId(String incidentId);
}
