package com.Incident.IncidentMangement.service;
import com.Incident.IncidentMangement.model.User;

import java.util.List;

public interface IUserService {

    public User createUser(User user);
    public User updateUser();
    public User deleteUser();

}
