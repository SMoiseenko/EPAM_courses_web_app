package by.moiseenko.dao;

import by.moiseenko.entity.User;

public interface UserDao {

    void createUser(User user);

    User getUserById(int id);

}
