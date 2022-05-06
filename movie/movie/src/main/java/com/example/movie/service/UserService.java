package com.example.movie.service;

import com.example.movie.dto.request.UserRequest;
import com.example.movie.dto.response.UserResponse;

public interface UserService {

	UserResponse findById(Long id);

	void deleteById(Long id);

	UserResponse addUser(UserRequest user);

	UserResponse updateUser(UserRequest user);
	
	

}
