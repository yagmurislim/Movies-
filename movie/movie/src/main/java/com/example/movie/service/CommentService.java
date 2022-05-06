package com.example.movie.service;

import com.example.movie.dto.request.CommentRequest;
import com.example.movie.dto.response.CommentResponse;

public interface CommentService {

	CommentResponse findById(Long comment_id);

	CommentResponse deleteById(Long comment_id);

	CommentResponse updateComment(CommentRequest comment);

	CommentResponse addComment(CommentRequest comment);

}
