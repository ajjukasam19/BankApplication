package com.userfront.Dao;

import org.springframework.data.repository.CrudRepository;

import com.userfront.Domain.User;

public interface UserDao extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);

}
