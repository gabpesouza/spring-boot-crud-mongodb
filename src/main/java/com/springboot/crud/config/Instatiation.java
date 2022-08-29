package com.springboot.crud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springboot.crud.domain.User;
import com.springboot.crud.repository.UserRepository;
@Configuration
public class Instatiation implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		
		User user = new User(null,"Gabriel Pereira","gabriel@gmail.com");
		User user1 = new User(null,"Raissa Lima","raissa@gmail.com");
		User user2 = new User(null,"Rafael Pereira","rafael@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user,user1,user2));
		
		
		
		
		
		
		
	}

}
