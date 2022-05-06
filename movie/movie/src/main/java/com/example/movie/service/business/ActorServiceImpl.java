package com.example.movie.service.business;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.ActorRequest;
import com.example.movie.dto.response.ActorResponse;
import com.example.movie.entity.Actor;
import com.example.movie.exception.RestExceptionBase;
import com.example.movie.repository.ActorRepository;
import com.example.movie.service.ActorService;
@Service
public class ActorServiceImpl implements ActorService {

	private final ActorRepository actorRepository;
		private ModelMapper modelMapper;
		
		public ActorServiceImpl(ActorRepository actorRepository, ModelMapper modelMapper) {
			this.actorRepository = actorRepository;
			this.modelMapper = modelMapper;
		}

		@Override
		public ActorResponse findById(Long id) {
			var actor = actorRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
			return modelMapper.map(actor, ActorResponse.class);
			
		}
       
		@Override
		 @Transactional//transactional veri üzerinde degişim  yapılıyorsa kullanılır.
		public ActorResponse deleteById(Long id) {
		var actor = actorRepository.findById(id).orElseThrow(()->new RestExceptionBase("Can not find the Actor!", "unknown.Actor","2"));
			actorRepository.deleteById(actor.getId());
			return modelMapper.map(actor,ActorResponse.class);
						
			
		}
           
		@Override
		@Transactional
		public ActorResponse addActor(ActorRequest actor) {
		//System.err.println(actor.getFullName());
			var addActor =modelMapper.map(actor, Actor.class);
		//	System.err.println(addActor.getFullName());
			return modelMapper.map(actorRepository.save(addActor),ActorResponse.class);
			}
		

		@Override
		@Transactional
		public ActorResponse updateActor(ActorRequest actor) {
			//System.err.println(actor.getFullName());
			var updateActor = actorRepository.findById(actor.getId()).orElseThrow();
			//System.err.println(updateActor.getFullName());
			modelMapper.map(actor,updateActor);
			//System.err.println(updateActor.getFullName());
			return modelMapper.map(actorRepository.saveAndFlush(updateActor), ActorResponse.class);
			
		
		}
		
		
		
		
		
	}


