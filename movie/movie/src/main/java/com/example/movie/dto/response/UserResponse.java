package com.example.movie.dto.response;

import javax.validation.constraints.Email;

public class UserResponse {

	

	private Long user_id;

	private String fullName;
	@Email
     private String email;

	private String password;

	public UserResponse() {
		
	}

	public Long getUser_id() {
		return user_id;
	}

	public UserResponse(Long user_id, String fullName, @Email String email, String password) {
		super();
		this.user_id = user_id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
