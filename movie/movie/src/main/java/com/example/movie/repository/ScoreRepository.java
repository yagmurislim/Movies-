package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.Score;
@Repository
public interface ScoreRepository extends JpaRepository<Score , Long> {
	
	
	

}
