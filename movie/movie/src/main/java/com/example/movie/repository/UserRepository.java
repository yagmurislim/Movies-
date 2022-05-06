package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User , Long>{
	
	

}
