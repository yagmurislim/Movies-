package com.example.movie.dto.response;

public class MovieResponse {

	private Long id;
	private String name;
	private String date;
	private String budget;
	private String subject;

	
	
	public MovieResponse() {
	
	}


	public MovieResponse(Long id2, String name2, String date2, String budget2, String subject2) {
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "MovieResponse [id=" + id + ", name=" + name + ", date=" + date + ", budget=" + budget + ", subject="
				+ subject + "]";
	}
	
	
	

}
