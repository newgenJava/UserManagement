package com.newgen.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.newgen.user.model.User;
import com.newgen.user.services.UserJPAService;

@RestController
@RequestMapping("/users")
public class UserJPAController {
	
	@Autowired
	private UserJPAService userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
		Optional<User> user = userService.getUserByID(id);
		
		if(!user.isPresent()) {
			//Throw errors
		}
		
		return user.map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.notFound().build());
		
//		return userService.getAllUsers();
	}

}
