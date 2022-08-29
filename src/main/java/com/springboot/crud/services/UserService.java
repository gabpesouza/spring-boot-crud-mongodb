package com.springboot.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.domain.User;
import com.springboot.crud.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	

}
