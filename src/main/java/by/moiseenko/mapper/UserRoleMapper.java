package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.UserRole;

public class UserRoleMapper implements RowMapper<UserRole> {

    @Override
    public UserRole mapRow(ResultSet rs, int rowNum) throws SQLException {
	UserRole userRole = UserRole.valueOf("USER_ROLE_TYPE");
	userRole.setActive(rs.getBoolean("USER_ROLE_ACTIVE"));
	return userRole;
    }

}
