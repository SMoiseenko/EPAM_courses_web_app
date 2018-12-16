package by.moiseenko.dao;

import by.moiseenko.entity.UserRole;

public interface UserRoleDao {

    UserRole getRoleByType(String roleType);

}
