package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.User;

public interface UserService {

    List<User> getAllUsers();

    Boolean addUser(User user);

    User authorization(String name, String password);

    Boolean checkStatus(User user);

    String checkRole(User user);

}
