package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.UserDao;
import by.moiseenko.entity.User;
import by.moiseenko.mapper.UserMapper;

@Repository
public class UserDaoImpl implements UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User getUserById(int id) {

	return null;
    }

    @Override
    public List<User> getAllUsers() {

	String sql = "SELECT * FROM users JOIN roles ON users.role_id = roles.id";
	return jdbcTemplate.query(sql, new UserMapper());
    }

}
