package com.example.movie.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.movie.dto.request.CommentRequest;
import com.example.movie.dto.response.CommentResponse;
import com.example.movie.service.CommentService;


@RestController
@CrossOrigin
@RequestMapping("/comment")
@RequestScope
public class CommentController {
	
	private final CommentService commentService;

	public CommentController(CommentService commentService) {
		
		this.commentService = commentService;
	}
	

	@GetMapping("/{comment_id}")
	public CommentResponse FindById(@PathVariable Long comment_id ) {
		return commentService.findById(comment_id);
	}
	
	@DeleteMapping("/{comment_id}")
	public CommentResponse deleteById(@PathVariable Long comment_id) {
		return  commentService.deleteById(comment_id);
	}
	
	
	@PostMapping
	public CommentResponse addById(@RequestBody CommentRequest comment) {
		return commentService.addComment(comment);
	}
	
	@PutMapping
	public CommentResponse updateById(@RequestBody CommentRequest comment) {
		return commentService.updateComment(comment);
	}

}
