package com.example.movie.dto.request;

public class ActorRequest {
	

	@Override
	public String toString() {
		return "ActorRequest [id=" + id + ", fullName=" + fullName + ", birth=" + birth + "]";
	}

	private Long id;

	private String fullName;

	private int birth;
	
	

	public ActorRequest() {
	
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
