package com.example.movie.dto.response;

public class MovieCategoryResponse {

	

	private Long id;

	private String comedy;

	private String tradegy;

	private String horror;

	private String dram;

	public MovieCategoryResponse() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComedy() {
		return comedy;
	}

	public void setComedy(String comedy) {
		this.comedy = comedy;
	}

	public String getTradegy() {
		return tradegy;
	}

	public void setTradegy(String tradegy) {
		this.tradegy = tradegy;
	}

	public String getHorror() {
		return horror;
	}

	public void setHorror(String horror) {
		this.horror = horror;
	}

	public String getDram() {
		return dram;
	}

	public void setDram(String dram) {
		this.dram = dram;
	}
	
	
	
	
}
