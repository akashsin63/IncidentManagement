package com.Incident.IncidentMangement.Dto;

import lombok.Data;

@Data
public class IncidentDto {
    private String type;
    private String reporterName;
    private String details;
    private String priority;
    private String status;
}
