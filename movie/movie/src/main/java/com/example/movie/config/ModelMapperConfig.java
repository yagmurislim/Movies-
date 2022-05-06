package com.example.movie.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
//	
//	private static final Converter<Actor, ActorResponse> ACTOR_TO_ACTOR_RESPONSE_CONVERTER = 
//			(context)->{
//				var actorResponse=new ActorResponse();
//				actorResponse.setBirth(context.getSource().getBirth());
//				actorResponse.setFullName(context.getSource().getFullName());
//				actorResponse.setId(context.getSource().getId());
//				return actorResponse;
//			};
//			
//			
//private static final Converter<ActorRequest, Actor> ACTOR_REQUEST_TO_ACTOR_CONVERTER = 
//      
//(context)->{
//	var actor=context.getDestination();
//	
//	actor.setId(context.getSource().getId());
//	actor.setBirth(context.getSource().getBirth());
//	actor.setFullName(context.getSource().getFullName());
//	return actor;
//	
//};
//		
//					
//			
//	private static final Converter<User,UserResponse> USER_TO_USER_RESPONSE_CONVERTER = 
//			context -> new UserResponse(
//			
//			context.getSource().getUser_id(),
//			
//			context.getSource().getFullName(),
//			context.getSource().getEmail(),
//			context.getSource().getPassword());
//	
//	
//	private static final Converter<UserRequest, User> USER_REQUEST_TO_USER_CONVERTER =
//			context -> new User(
//					context.getSource().getUser_id(),
//					context.getSource().getFullName(),
//					context.getSource().getEmail(),
//					context.getSource().getPassword());	
//					
//					
//			
//			
//
//		  
//	
//	private static final Converter<Comment, CommentResponse> COMMENT_TO_COMMENT_RESPONSE_CONVERTER = 
//			context -> new CommentResponse(
//					context.getSource().getComment_id(), 
//					
//					context.getSource().getDescription());
//  
//			
//	
//			private static final Converter<CommentRequest, Comment> COMMENT_REQUEST_TO_COMMENT_CONVERTER = 
//				      
//				
//				context -> new Comment(
//							context.getSource().getComment_id(), 
//						
//						context.getSource().getDescription(),
//						context.getSource().getUser());
//	
//		
//			
//			
//			
//			private static final Converter<Movie,MovieResponse> MOVIE_TO_MOVIE_RESPONSE_CONVERTER = 
//					context -> new  MovieResponse(
//							context.getSource().getId(),
//							context.getSource().getName(),
//							context.getSource().getDate(),
//							context.getSource().getBudget(),
//							context.getSource().getSubject());
//					
//					
//					
//					
//					private static final Converter<MovieRequest,Movie> MOVIE_TO_MOVIE_REQUEST_CONVERTER =
//							
//							context -> new  Movie(
//									context.getSource().getId(),
//									context.getSource().getName(),
//									context.getSource().getDate(),
//									context.getSource().getBudget(),
//									context.getSource().getSubject());
					
					
							
							
							@Bean
							public ModelMapper mapper() {
								var mapper = new ModelMapper();
								//mapper.addConverter(USER_TO_USER_RESPONSE_CONVERTER, User.class, UserResponse.class);
								//mapper.addConverter(USER_REQUEST_TO_USER_CONVERTER, UserRequest.class, User.class);
								//mapper.addConverter(ACTOR_TO_ACTOR_RESPONSE_CONVERTER, Actor.class, ActorResponse.class);
								//mapper.addConverter(ACTOR_REQUEST_TO_ACTOR_CONVERTER, ActorRequest.class, Actor.class);
								//mapper.addConverter(COMMENT_TO_COMMENT_RESPONSE_CONVERTER, Comment.class, CommentResponse.class);
								//mapper.addConverter(COMMENT_REQUEST_TO_COMMENT_CONVERTER, CommentRequest.class, Comment.class);
								//mapper.addConverter(MOVIE_TO_MOVIE_RESPONSE_CONVERTER, Movie.class, MovieResponse.class);
								//mapper.addConverter(MOVIE_TO_MOVIE_REQUEST_CONVERTER, MovieRequest.class, Movie.class);
								
								
								return mapper;
							}
							
							
							
							
							}



