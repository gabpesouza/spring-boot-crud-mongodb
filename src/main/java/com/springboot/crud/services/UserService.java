package com.springboot.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.domain.User;
import com.springboot.crud.repository.UserRepository;
import com.springboot.crud.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(String id) {
	 Optional<User> user = userRepository.findById(id);
	 return user.orElseThrow(() -> new ObjectNotFoundException(id));
	}
	
	

}
