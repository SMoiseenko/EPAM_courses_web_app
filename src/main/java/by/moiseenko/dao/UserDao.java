package by.moiseenko.dao;

import java.util.List;

import by.moiseenko.entity.User;

public interface UserDao {

    User authorization(String name, String password);

    Boolean addUser(User user);

    User getUserById(int id);

    List<User> getAllUsersWithRoles();
}
