package com.example.movie.dto.response;

import java.util.Objects;

public class ScoreResponse {

	
	private Long id;
	private int vote;
	
	public ScoreResponse() {
		
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
		ScoreResponse other = (ScoreResponse) obj;
		return Objects.equals(id, other.id) && vote == other.vote;
	}

	@Override
	public String toString() {
		return "ScoreResponse [id=" + id + ", vote=" + vote + "]";
	}
	
	
	
}
