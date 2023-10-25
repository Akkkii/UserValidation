package com.techno.signia.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techno.signia.validation.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserId(int id);

}
