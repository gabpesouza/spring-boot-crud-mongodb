package com.springboot.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.domain.User;
import com.springboot.crud.dto.UserDto;
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
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public User fromDto(UserDto obj) {
		return new User(obj.getId(),obj.getName(),obj.getEmail());
	}
	
	

}
