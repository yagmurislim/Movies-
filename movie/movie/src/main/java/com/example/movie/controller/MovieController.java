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

import com.example.movie.dto.request.MovieRequest;
import com.example.movie.dto.response.MovieResponse;
import com.example.movie.service.MovieService;

@RestController
@CrossOrigin
@RequestMapping("/movie")
@RequestScope//her istek attıgın zaman farklı nesne üzerinde işlem yapıyor.Örnegin update delete yapıyoruz bu işlem için hep 
//request istek attıgında new diye yeni nesne oluşturu.

public class MovieController {
	
	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	
	@GetMapping("/{name}")
	public MovieResponse FindByName(@PathVariable String name) {
		return movieService.findByName(name);
	}
	
//	@DeleteMapping("/{name}")
//	public MovieResponse delete(@RequestBody Long id) {
//		return movieService.deleteById(id);
//	}
	
	@DeleteMapping("/{id}")
	public MovieResponse delete(@PathVariable Long id) {
		return movieService.deleteMovie(id);
	}
	
	@PostMapping
	public MovieResponse addMovie(@RequestBody MovieRequest movie) {
		return (MovieResponse) movieService.addMovie(movie);
	}

@PutMapping
public MovieResponse updateMovie(@RequestBody MovieRequest movie ) {
	return movieService.updateMovie(movie);
}
	
	}
	
	
	

