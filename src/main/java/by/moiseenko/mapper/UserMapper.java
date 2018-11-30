package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.User;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	User user = new User();
	user.setId(rs.getInt("id"));
	user.setLogin(rs.getString("login"));
	user.setPassword(rs.getString("password"));
	// user.setRole(new RoleDaoImpl(jdbcTemplate).getRoleByName(id));
	user.setFirstName(rs.getString("firstName"));
	user.setLastName(rs.getString("lastName"));
	user.setEmail(rs.getString("email"));
	user.setPhoneNumber(rs.getString("phone"));
	user.setAdress(rs.getString("adress"));
	user.setActive(rs.getBoolean("active"));

	return user;
    }

}