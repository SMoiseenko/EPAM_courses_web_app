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
    public User autorisation(String name, String password) {
	User user = null;
	for (User usr : userDao.getAllUsers()) {
	    if (usr.getLogin().equals(name) & usr.getPassword().equals(password) & usr.isActive() == true) {
		user = usr;
		break;
	    }
	}
	return user;
    }

    @Override
    public List<User> getAllUsers() {
	return userDao.getAllUsers();
    }

}
