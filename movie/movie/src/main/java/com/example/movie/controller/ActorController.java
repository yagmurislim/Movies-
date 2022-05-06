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

import com.example.movie.dto.request.ActorRequest;
import com.example.movie.dto.response.ActorResponse;
import com.example.movie.service.ActorService;


@RestController
@RequestMapping("/actor")
@CrossOrigin
//@RequestScope
public class ActorController {
	private final ActorService  actorService ;

	public ActorController(ActorService actorService) {
		
		this.actorService = actorService;
	}
	
	
	
	
	@GetMapping("/{id}")
	public ActorResponse  FindById(@PathVariable Long id) {
		return actorService.findById(id);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable Long id) {
		actorService.deleteById(id);
	}
	
	@PostMapping
	public ActorResponse  addById(@RequestBody ActorRequest actor) {
		return (ActorResponse) actorService.addActor(actor);
	}
	
	@PutMapping
	public ActorResponse updateById(@RequestBody ActorRequest actor) {
		return actorService.updateActor(actor);
	}
	
	
	

}
