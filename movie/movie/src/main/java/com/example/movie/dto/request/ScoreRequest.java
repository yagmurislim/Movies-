package com.example.movie.dto.request;

import java.util.Objects;

public class ScoreRequest {
	
	private Long id;
	private int vote;
	
	
	public ScoreRequest() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getVote() {
		return vote;
	}


	public void setVote(int vote) {
		this.vote = vote;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, vote);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreRequest other = (ScoreRequest) obj;
		return Objects.equals(id, other.id) && vote == other.vote;
	}


	@Override
	public String toString() {
		return "ScoreRequest [id=" + id + ", vote=" + vote + "]";
	}
	

	
	
	
}
