package com.newgen.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newgen.user.model.User;

@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping(path = "/usAll")
//	public List<User> findAllUsers(){
//		return userService.findAll();
//	}
//	

}
