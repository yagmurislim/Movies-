package com.example.movie.service.business;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.movie.dto.request.UserRequest;
import com.example.movie.dto.response.UserResponse;
import com.example.movie.entity.User;
import com.example.movie.repository.UserRepository;
import com.example.movie.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private ModelMapper modelMapper;
	
	public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
	
		this.userRepository = userRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public UserResponse findById(Long id) {
		var user = userRepository.findById(id).orElseThrow();
        return modelMapper.map(user, UserResponse.class);		
		

	}

	@Override
	@Transactional
	public void  deleteById(Long id) {
		var user = userRepository.findById(id).orElseThrow();
		userRepository.deleteById(user.getUser_id());
		
	}

	@Override
	public UserResponse addUser(UserRequest user) {
		var adduser =modelMapper.map(user, User.class);
	
			return modelMapper.map(userRepository.save(adduser),UserResponse.class);
	}

	@Override
	public UserResponse updateUser(UserRequest user) {
		
		var updateUser = userRepository.findById(user.getUser_id()).orElseThrow();
	
		modelMapper.map(user,updateUser);

		return modelMapper.map(userRepository.saveAndFlush(updateUser), UserResponse.class);
		
	}

}
