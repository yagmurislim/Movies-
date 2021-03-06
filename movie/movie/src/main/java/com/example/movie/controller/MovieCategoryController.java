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

import com.example.movie.dto.request.MovieCategoryRequest;
import com.example.movie.dto.response.MovieCategoryResponse;
import com.example.movie.service.MovieCategoryService;

@RestController
@RequestMapping("/movieCategory")
@CrossOrigin
@RequestScope
public class MovieCategoryController {

 private final MovieCategoryService  movieCategoryService;

public MovieCategoryController(MovieCategoryService movieCategoryService) {
	
	this.movieCategoryService = movieCategoryService;
	
	
}

@GetMapping("{/İd}")
public MovieCategoryResponse FidById(@PathVariable Long id) {
	return movieCategoryService.findById(id);
}

@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id) {
	movieCategoryService.deleteById(id);
}

@PostMapping
public MovieCategoryResponse addById(@RequestBody MovieCategoryRequest movieCategory) {
 return (MovieCategoryResponse) movieCategoryService.addById(movieCategory);
}

@PutMapping
public MovieCategoryResponse updateById(@RequestBody MovieCategoryRequest movieCategory) {
	return movieCategoryService.updateMovieCategory(movieCategory);
}

}



