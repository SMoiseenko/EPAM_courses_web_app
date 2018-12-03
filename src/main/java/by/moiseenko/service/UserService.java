package by.moiseenko.service;

import java.util.List;

import by.moiseenko.entity.User;

public interface UserService {

    User autorisation(String name, String password);

    List<User> getAllUsers();

}
