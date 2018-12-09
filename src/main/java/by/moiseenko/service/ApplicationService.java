package by.moiseenko.service;

import by.moiseenko.entity.User;

public interface ApplicationService {

    User authorization(String name, String password);

    Boolean checkStatus(User user);

    String checkRole(User user);
}
