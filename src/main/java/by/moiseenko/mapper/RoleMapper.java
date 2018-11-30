package by.moiseenko.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import by.moiseenko.entity.Role;

public class RoleMapper implements RowMapper<Role> {

    @Override
    public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
	Role role = new Role();
	role.setId(rs.getInt("id"));
	role.setRole(rs.getString("role"));
	role.setActive(rs.getBoolean("active"));
	return null;
    }

}
