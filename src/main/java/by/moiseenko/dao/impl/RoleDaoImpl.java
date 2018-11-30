package by.moiseenko.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import by.moiseenko.dao.RoleDao;
import by.moiseenko.entity.Role;
import by.moiseenko.mapper.RoleMapper;

@Repository
public class RoleDaoImpl implements RoleDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public RoleDaoImpl(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Role getRoleByName(int id) {
	String sql = "SELECT * FROM role WHERE id=?";
	return jdbcTemplate.queryForObject(sql, new RoleMapper(), id);
    }

    @Override
    public Role getRoleById(String name) {
	String sql = "SELECT * FROM role WHERE name=?";
	return jdbcTemplate.queryForObject(sql, new RoleMapper(), name);
    }

}
