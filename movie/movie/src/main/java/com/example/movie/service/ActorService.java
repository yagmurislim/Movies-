package com.example.movie.service;

import com.example.movie.dto.request.ActorRequest;
import com.example.movie.dto.response.ActorResponse;


public interface ActorService {

	ActorResponse findById(Long id);

	ActorResponse deleteById(Long id);

	

	ActorResponse updateActor(ActorRequest actor);

	ActorResponse addActor(ActorRequest actor);

	

}
