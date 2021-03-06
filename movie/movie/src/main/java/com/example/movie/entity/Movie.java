package com.example.movie.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Table(name = "movies")
@Entity
@Getter 
@Setter 

@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Movie {
	public Movie(Long id2, String name2, String date2, String budget2, String subject2) {
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
	private String name;
	private String date;
	private String budget;
	private String  subject;
	
	//@Max()
	//private int score;

	@ManyToMany
	@JoinTable(name="movie_actor",
	joinColumns = {
			@JoinColumn(name="movie_id")//moviden gelen id
	},
	inverseJoinColumns= {
			@JoinColumn(name="actor_id")//actor tablosundan gelen id
	}
	)
	private List<Actor>actors;//actors lerim field ım oluyor
			
			
	@OneToMany(mappedBy = "movie")
	private List<Score> score;
	

}
