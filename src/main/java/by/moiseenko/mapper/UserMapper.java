package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.Role;
import by.moiseenko.entity.User;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	User user = new User();
	Role role = new Role();
	user.setId(rs.getInt("ID"));
	user.setLogin(rs.getString("LOGIN"));
	user.setPassword(rs.getString("PASSWORD"));
	role.setId(rs.getInt("ROLE_ID"));
	role.setRole(rs.getString("ROLE_TYPE"));
	user.setRole(role);
	user.setFirstName(rs.getString("NAME"));
	user.setLastName(rs.getString("SURNAME"));
	user.setEmail(rs.getString("E_MAIL"));
	user.setPhoneNumber(rs.getString("MOB_NUMBER"));
	user.setAddress(rs.getString("ADDRESS"));
	user.setActive(rs.getBoolean("STATUS"));
	return user;
    }

}