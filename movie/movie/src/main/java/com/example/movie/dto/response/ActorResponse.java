package com.example.movie.dto.response;

public class ActorResponse {

	private Long id;

	private String fullName;

	private int birth;

	public ActorResponse() {
		
	}

	public ActorResponse(Long id2, int birth2, String fullName2) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	
	
	
}
