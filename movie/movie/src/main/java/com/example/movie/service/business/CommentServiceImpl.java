package com.example.movie.service.business;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.CommentRequest;
import com.example.movie.dto.response.CommentResponse;
import com.example.movie.entity.Comment;
import com.example.movie.exception.RestExceptionBase;
import com.example.movie.repository.CommentRepository;
import com.example.movie.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService {
	
	private final CommentRepository commentRepository;
	private ModelMapper modelMapper;
	
	public CommentServiceImpl(CommentRepository commentRepository, ModelMapper modelMapper) {
		
		this.commentRepository = commentRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public CommentResponse findById(Long comment_id) {
		
		var comment= commentRepository.findById(comment_id).orElseThrow(()->new EntityNotFoundException());
		return modelMapper.map(comment_id, CommentResponse.class);
		
		
		
	}

	@Override
	@Transactional
	public CommentResponse deleteById(Long comment_id) {
		var comment = commentRepository.findById(comment_id).orElseThrow(()->new RestExceptionBase("Can not find the Movie!", "unknown.Movie","2"));
		commentRepository.deleteById(comment.getComment_id());
		return modelMapper.map(comment,CommentResponse.class);
		
	}
	

	@Override
	@Transactional
	public CommentResponse updateComment(CommentRequest comment) {
		
		var updateComment = commentRepository.findById(comment.getComment_id()).orElseThrow();
		modelMapper.map(comment,updateComment);
		return modelMapper.map(commentRepository.saveAndFlush(updateComment),CommentResponse.class);
		
	}

	@Override
	@Transactional
	public CommentResponse addComment(CommentRequest comment) {
		var addComment = modelMapper.map(comment, Comment.class);
		return modelMapper.map(commentRepository.save(addComment), CommentResponse.class);
		
	}


	
}
