package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor , Long> {

	
	
	
}
