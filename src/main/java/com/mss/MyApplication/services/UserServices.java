package com.mss.MyApplication.services;



import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mss.MyApplication.modal.User;
import com.mss.MyApplication.repository.UserRepository;

@Service
@Transactional
public class UserServices {

	private final UserRepository userRepository;
	
	public UserServices(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	public User findByUsernameAndPassword(String username, String password) {
		return userRepository.findByUsernameAndPassword(username, password);
	}
}
