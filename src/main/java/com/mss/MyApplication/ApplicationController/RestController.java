package com.mss.MyApplication.ApplicationController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mss.MyApplication.modal.User;
import com.mss.MyApplication.services.UserServices;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserServices userService;


	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname,@RequestParam int age, @RequestParam String password) {
		User user = new User(username, firstname, lastname, age, password);
		userService.saveUser(user);
		return "User Saved";
	}

}
