package com.example.movie.service.business;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.MovieCategoryRequest;
import com.example.movie.dto.response.MovieCategoryResponse;
import com.example.movie.service.MovieCategoryService;

@Service
public class MovieCategoryServiceImpl implements MovieCategoryService {

	private final MovieCategoryService MovieCategoryService;
	private ModelMapper modelMapper;
	
	
	public MovieCategoryServiceImpl(com.example.movie.service.MovieCategoryService movieCategoryService,
			ModelMapper modelMapper) {
	
		MovieCategoryService = movieCategoryService;
		this.modelMapper = modelMapper;
	}

//	
//	@Override
//	public MovieCategoryResponse findById(Long id) {
//		var category = MovieCategory.findById(id).orElseThrow();
//		return modelMapper.map(category, MovieCategoryResponse.class);
//	}

	@Override
	public MovieCategoryResponse deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public MovieCategoryResponse addById(MovieCategoryRequest movieCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieCategoryResponse updateMovieCategory(MovieCategoryRequest movieCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieCategoryResponse findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
