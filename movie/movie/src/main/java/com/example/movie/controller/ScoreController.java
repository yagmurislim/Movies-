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

import com.example.movie.dto.request.ScoreRequest;
import com.example.movie.dto.response.ScoreResponse;
import com.example.movie.service.ScoreService;

@RestController
@CrossOrigin
@RequestMapping("/score")
@RequestScope

public class ScoreController {
	private final ScoreService scoreService;

	public ScoreController(ScoreService scoreService) {
		
		this.scoreService = scoreService;
	}
	
	@GetMapping("/{id}")
	public ScoreResponse FindById(@PathVariable  Long id ) {
		return  scoreService.findById(id);
	}
	
	
	
	@DeleteMapping("{id}")
	public void  deleteById(@PathVariable Long id) {
		scoreService.deleteById(id);
	}
	
	@PostMapping
	public ScoreResponse addById(@RequestBody  ScoreRequest score ) {
	return (ScoreResponse) scoreService.addScore(score);
	}
	
	@PutMapping
	public ScoreResponse updateById(@RequestBody ScoreRequest score ) {
		return scoreService.updateScore(score);
	}

}
