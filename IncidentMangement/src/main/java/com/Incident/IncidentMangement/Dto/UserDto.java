package com.Incident.IncidentMangement.Dto;

import com.Incident.IncidentMangement.model.Base;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDto extends Base {
    private String username;
    private String email;
    private String phoneNumber;
    private String address;
    private String pinCode;
    private String city;
    private String country;
}
