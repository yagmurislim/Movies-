package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.MovieCategory;
@Repository
public interface MovieCategoryRepository extends JpaRepository<MovieCategory,Long>{

}
