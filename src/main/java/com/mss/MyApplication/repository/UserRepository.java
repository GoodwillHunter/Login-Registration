package com.mss.MyApplication.repository;

import org.springframework.data.repository.CrudRepository;

import com.mss.MyApplication.modal.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByUsernameAndPassword(String username, String password);
}
