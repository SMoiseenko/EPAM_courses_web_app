package by.moiseenko.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.UserDao;
import by.moiseenko.entity.User;
import by.moiseenko.mapper.UserWithRoleMapper;

@Repository
public class UserDaoImpl implements UserDao {

    private final String SQL_ADD_USER = "INSERT INTO users (login, password, first_name, last_name, email, phone, address) VALUE (?,?,?,?,?,?,?)";

    private final String SQL_GET_ALL_USERS_WITH_ROLES = "SELECT users.id AS ID, users.login AS LOGIN, users.password AS PASSWORD, users.first_name AS NAME, users.last_name AS SURNAME, users.email AS E_MAIL, users.phone AS MOB_NUMBER, users.address AS ADDRESS, users.balance AS BALANCE, users.active AS ACTIVE, users_roles.type AS USER_ROLE_TYPE, users_roles.active AS USER_ROLE_ACTIVE  FROM users JOIN users_roles ON users.role_type = users_roles.type";

    private final String SQL_USER_AUTHORIZATION = "SELECT users.id AS ID, users.login AS LOGIN, users.password AS PASSWORD, users.first_name AS NAME, users.last_name AS SURNAME, users.email AS E_MAIL, users.phone AS MOB_NUMBER, users.address AS ADDRESS, users.balance AS BALANCE, users.active AS ACTIVE, users_roles.type AS USER_ROLE_TYPE, users_roles.active AS USER_ROLE_ACTIVE  FROM users JOIN users_roles ON users.role_type = users_roles.type WHERE users.login = ? AND users.password = ?";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Boolean addUser(User user) {
	jdbcTemplate.update(SQL_ADD_USER, user.getLogin(), user.getPassword(), user.getFirstName(), user.getLastName(),
		user.getEmail(), user.getPhoneNumber(), user.getAddress());
	return true;
    }

    @Override
    public User getUserById(int id) {

	return null;
    }

    @Override
    public List<User> getAllUsersWithRoles() {
	return jdbcTemplate.query(SQL_GET_ALL_USERS_WITH_ROLES, new UserWithRoleMapper());
    }

    @Override
    public User authorization(String name, String password) {
	try {
	    return jdbcTemplate.queryForObject(SQL_USER_AUTHORIZATION, new Object[] { name, password },
		    new UserWithRoleMapper());
	} catch (EmptyResultDataAccessException e) {
	    System.out.println("Wrong user login or password!!!");
	    return null;
	}
    }

}
