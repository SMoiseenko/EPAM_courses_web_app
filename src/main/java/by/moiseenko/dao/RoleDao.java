package by.moiseenko.dao;

import by.moiseenko.entity.Role;

public interface RoleDao {

    Role getRoleByName(int id);

    Role getRoleById(String name);

}
