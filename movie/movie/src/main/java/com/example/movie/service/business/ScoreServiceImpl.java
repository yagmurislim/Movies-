package com.example.movie.service.business;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.ScoreRequest;
import com.example.movie.dto.response.ScoreResponse;
import com.example.movie.entity.Score;
import com.example.movie.exception.RestExceptionBase;
import com.example.movie.repository.ScoreRepository;
import com.example.movie.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService {
	private final ScoreRepository scoreRepository;
	private ModelMapper modelMapper;
	

	public ScoreServiceImpl(ScoreRepository scoreRepository, ModelMapper modelMapper) {
		
		this.scoreRepository = scoreRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public ScoreResponse findById(Long id) {
		var score = scoreRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
		return modelMapper.map(score, ScoreResponse.class);
	}

	@Override
	@Transactional
	public ScoreResponse deleteById(Long id) {
		var score = scoreRepository.findById(id).orElseThrow(()->new RestExceptionBase("Can not find the Actor!", "unknown.Actor","2"));
		scoreRepository.deleteById(score.getId());
		return modelMapper.map(score,ScoreResponse.class);
	}
	
	

	@Override
	@Transactional
	public ScoreResponse addScore(ScoreRequest score) {
		var addScore = modelMapper.map(score, Score.class);
		return modelMapper.map(scoreRepository.save(addScore),ScoreResponse.class);
	}

	@Override
	@Transactional
	public ScoreResponse updateScore(ScoreRequest score) {
		
		var updateScore = scoreRepository.findById(score.getId()).orElseThrow();
		modelMapper.map(score, updateScore);
		return modelMapper.map(scoreRepository.save(updateScore), ScoreResponse.class);
	}

	
}
