package com.example.movie.dto.request;

import com.example.movie.entity.User;

public class CommentRequest {
	



	
	

	private Long comment_id;
	
    @Override
	public String toString() {
		return "CommentRequest [comment_id=" + comment_id + ", description=" + description + ", user=" + user + "]";
	}

	private String description;
    
    private User user;
    
    
    

	public CommentRequest() {
		
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







	public User getUser() {
		return user;
	}







	public void setUser(User user) {
		this.user = user;
	}







	public CommentRequest(Long comment_id, String description, User user) {
		super();
		this.comment_id = comment_id;
		this.description = description;
		this.user = user;
	}
	
	

	

}
