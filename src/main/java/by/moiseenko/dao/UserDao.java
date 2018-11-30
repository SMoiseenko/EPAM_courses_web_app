package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.User;

public interface UserDao {

    void createUser(User user);

    User getUserById(int id);

    List<User> getAllUsers();
}
