package com.example.movie.dto.response;

public class CommentResponse {

	private Long comment_id;

	private String description;

	public CommentResponse() {

	}

	public CommentResponse(Long comment_id, String description) {
		super();
		this.comment_id = comment_id;
		this.description = description;
	}

	public Long getComment_id() {
		return comment_id;
	}

	public void setComment_id(Long comment_id) {
		this.comment_id = comment_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static Object findById(Long comment_id2) {
		// TODO Auto-generated method stub
		return null;
	}

}
