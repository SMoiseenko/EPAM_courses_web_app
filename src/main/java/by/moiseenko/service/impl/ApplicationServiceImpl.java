package by.moiseenko.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.moiseenko.dao.UserDao;
import by.moiseenko.entity.User;
import by.moiseenko.service.ApplicationService;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private UserDao userDao;

    @Autowired
    public ApplicationServiceImpl(UserDao userDao) {
	super();
	this.userDao = userDao;
    }

    @Override
    public User authorization(String name, String password) {
	User user = userDao.authorization(name, password);
	System.out.println(user);
	return user;
    }

    @Override
    public Boolean checkStatus(User user) {
	return user.isActive();
    }

    @Override
    public String checkRole(User user) {
	return user.getRole().getRole();
    }

}
