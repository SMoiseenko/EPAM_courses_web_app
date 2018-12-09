package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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

	String sql = "SELECT users.id AS ID, users.login AS LOGIN, users.password AS PASSWORD, roles.type AS ROLE_TYPE, roles.id AS ROLE_ID,"
		+ " users.first_name AS NAME, users.last_name AS SURNAME, users.email AS E_MAIL, users.phone AS MOB_NUMBER, users.address AS ADDRESS,"
		+ " users.balance AS BALANCE, users.active AS `STATUS` FROM users JOIN roles ON users.role_id = roles.id";
	return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public User authorization(String name, String password) {
	try {
	    String sql = "SELECT users.id AS ID, users.login AS LOGIN, users.password AS PASSWORD, roles.type AS ROLE_TYPE, roles.id AS ROLE_ID,"
		    + " roles.active AS ROLE_ACTIVE, users.first_name AS NAME, users.last_name AS SURNAME, users.email AS E_MAIL, users.phone AS MOB_NUMBER,"
		    + " users.address AS ADDRESS, users.balance AS BALANCE, users.active AS `STATUS` FROM users JOIN roles ON users.role_id = roles.id"
		    + " WHERE users.login = ? AND users.password = ?";
	    return jdbcTemplate.queryForObject(sql, new Object[] { name, password }, new UserMapper());
	} catch (EmptyResultDataAccessException e) {
	    System.out.println("Wrong user login or password!!!");
	    return null;
	}
    }

}
