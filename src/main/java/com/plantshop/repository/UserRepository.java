package com.plantshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.plantshop.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
