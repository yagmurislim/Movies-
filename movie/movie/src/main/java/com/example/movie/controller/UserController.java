package com.example.movie.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.movie.dto.request.UserRequest;
import com.example.movie.dto.response.UserResponse;
import com.example.movie.service.UserService;
@RestController
@CrossOrigin
@RequestMapping("/user")
@RequestScope
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
	
		this.userService = userService;
	}
	
	@GetMapping("/{id}")
	public UserResponse FindById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		userService.deleteById(id);
	}
	
	@PostMapping
	public UserResponse addById(@RequestBody UserRequest user) {
		return (UserResponse) userService.addUser(user);
	}

	@PutMapping
	public UserResponse updateById(@RequestBody UserRequest user) {
		return userService.updateUser(user);
	}
}
