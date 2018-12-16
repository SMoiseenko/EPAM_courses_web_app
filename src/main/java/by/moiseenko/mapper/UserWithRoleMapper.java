package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.User;
import by.moiseenko.entity.UserRole;

public class UserWithRoleMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	User user = new User();
	UserRole userRole = UserRole.valueOf(rs.getString("USER_ROLE_TYPE"));
	userRole.setActive(rs.getBoolean("USER_ROLE_ACTIVE"));
	user.setUserRole(userRole);
	user.setId(rs.getInt("ID"));
	user.setLogin(rs.getString("LOGIN"));
	user.setPassword(rs.getString("PASSWORD"));
	user.setFirstName(rs.getString("NAME"));
	user.setLastName(rs.getString("SURNAME"));
	user.setEmail(rs.getString("E_MAIL"));
	user.setPhoneNumber(rs.getString("MOB_NUMBER"));
	user.setAddress(rs.getString("ADDRESS"));
	user.setBalance(rs.getBigDecimal("BALANCE"));
	user.setActive(rs.getBoolean("ACTIVE"));
	return user;
    }

}