package com.example.movie.service;

import com.example.movie.dto.request.MovieCategoryRequest;
import com.example.movie.dto.response.MovieCategoryResponse;

public interface MovieCategoryService {

	MovieCategoryResponse findById(Long id);

	MovieCategoryResponse deleteById(Long id);

	MovieCategoryResponse addById(MovieCategoryRequest movieCategory);

	MovieCategoryResponse updateMovieCategory(MovieCategoryRequest movieCategory);

}
