package com.example.movie.service;

import com.example.movie.dto.request.ScoreRequest;
import com.example.movie.dto.response.ScoreResponse;

public interface ScoreService {

	ScoreResponse findById(Long id);

	ScoreResponse deleteById(Long id);

	ScoreResponse addScore(ScoreRequest score);

	ScoreResponse updateScore(ScoreRequest score);

}
