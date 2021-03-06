package com.example.movie.dto.request;

import java.util.Objects;

public class MovieRequest {

	private Long id;
	private String name;
	private String date;
	private String budget;
	private String subject;


	public MovieRequest() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	

	@Override
	public int hashCode() {
		return Objects.hash(budget, date, id, name, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieRequest other = (MovieRequest) obj;
		return Objects.equals(budget, other.budget) && Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "MovieRequest [id=" + id + ", name=" + name + ", date=" + date + ", budget=" + budget + ", subject="
				+ subject + "]";
	}

	

}
