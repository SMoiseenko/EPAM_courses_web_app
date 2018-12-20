package by.moiseenko.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.UserDao;
import by.moiseenko.entity.User;
import by.moiseenko.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
	super();
	this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsersWithRoles() {

	return userDao.getAllUsersWithRoles();
    }

    @Override
    public Boolean addUser(User user) {
	userDao.addUser(user);
	return true;
    }

    @Override
    public User authorization(String name, String password) {
	User user = userDao.authorization(name, password);
	return user;
    }

    @Override
    public Boolean checkStatus(User user) {
	return user.isActive();
    }

    @Override
    public String checkRole(User user) {
	return user.getUserRole().getType();
    }

}
