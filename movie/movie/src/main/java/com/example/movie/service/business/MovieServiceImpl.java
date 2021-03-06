package com.example.movie.service.business;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.MovieRequest;
import com.example.movie.dto.response.MovieResponse;
import com.example.movie.entity.Movie;
import com.example.movie.exception.RestExceptionBase;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	
	private final MovieRepository movieRepository;
	private ModelMapper  modelMapper;
	public MovieServiceImpl(MovieRepository movieRepository, ModelMapper modelMapper) {
		super();
		this.movieRepository = movieRepository;
		this.modelMapper = modelMapper;
	}
	
	@Override
	public MovieResponse findByName(String name) {
		var movie = movieRepository.findByName(name).orElseThrow(()->new EntityNotFoundException());
		return modelMapper.map(movie, MovieResponse.class);
	}

	@Override
	@Transactional
	public MovieResponse deleteMovie(Long id) {
		var movie = movieRepository.findById(id).orElseThrow(()->new RestExceptionBase("Can not find the Movie!", "unknown.Movie","2"));
		movieRepository.deleteById(movie.getId());
		return modelMapper.map(movie, MovieResponse.class);
		
	}

	@Override
	@Transactional
	public MovieResponse addMovie(MovieRequest movie) {
	
		var addMovie = modelMapper.map(movie, Movie.class);
		return modelMapper.map(movieRepository.save(addMovie), MovieResponse.class);
		
		
	}

	@Override
	@Transactional
	public MovieResponse updateMovie(MovieRequest movie) {
		var updateMovie = movieRepository.findById(movie.getId()).orElseThrow();
		modelMapper.map(movie, updateMovie);
		return modelMapper.map(movieRepository.saveAndFlush(updateMovie), MovieResponse.class );
	}


	
	
	

}
