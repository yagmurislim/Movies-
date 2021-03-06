package com.example.movie.service;

import com.example.movie.dto.request.MovieRequest;
import com.example.movie.dto.response.MovieResponse;

public interface MovieService {

	MovieResponse findByName(String name);

	MovieResponse deleteMovie(Long id);

	MovieResponse addMovie(MovieRequest movie);

	MovieResponse updateMovie(MovieRequest movie);


}
