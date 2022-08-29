package com.springboot.crud.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.domain.User;
import com.springboot.crud.dto.UserDto;
import com.springboot.crud.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService userService;

	@GetMapping
	public ResponseEntity<List<UserDto>> findAll() {
		List<User> list = userService.findAll();
		List<UserDto> listDto = list.stream().map(x -> new UserDto(x)).collect(Collectors.toList());
		

		return ResponseEntity.ok(listDto);

	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDto> findById(@PathVariable String id){
		User user = userService.findById(id);
		UserDto userDto = new UserDto(user);
		
		return ResponseEntity.ok(userDto);
		
	
	}
}
