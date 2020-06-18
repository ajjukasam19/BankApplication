package com.userfront.Dao;

import org.springframework.data.repository.CrudRepository;

import com.userfront.Domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
