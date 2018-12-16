package by.moiseenko.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.UserRoleDao;
import by.moiseenko.entity.UserRole;
import by.moiseenko.mapper.UserRoleMapper;

@Repository
public class UserRoleDaoImpl implements UserRoleDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserRoleDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserRole getRoleByType(String roleType) {
	String sql = "SELECT * FROM roles WHERE type=?";
	return jdbcTemplate.queryForObject(sql, new UserRoleMapper(), roleType);
    }

}
