package com.example.movie.dto.request;

public class MovieCategoryRequest {
	
	
	@Override
	public String toString() {
		return "MovieCategoryRequest [id=" + id + ", comedy=" + comedy + ", tradegy=" + tradegy + ", horror=" + horror
				+ ", dram=" + dram + "]";
	}

	private Long id;

	private String comedy;

	private String tradegy;

	private String horror;

	private String dram;

	public MovieCategoryRequest() {
		
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
