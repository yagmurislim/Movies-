package com.example.movie.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
	public User(Long user_id2, String fullName2, String email2, String password2) {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long user_id;

	private String fullName;
	@Email

	private String email;

	private String password;
     @JsonIgnore
	@OneToMany(mappedBy = "user")
	private List<Comment> comments;// entity
     
     
 @OneToMany(mappedBy = "user")//burdaki user score daki user diyiyorum
 private List<Score> score;//entity  bir userın bir sürü scorı olabilir
     
     

}
