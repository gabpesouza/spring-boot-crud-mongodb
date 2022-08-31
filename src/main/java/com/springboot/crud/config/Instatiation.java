package com.springboot.crud.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springboot.crud.domain.Post;
import com.springboot.crud.domain.User;
import com.springboot.crud.dto.AuthorDto;
import com.springboot.crud.dto.CommentDto;
import com.springboot.crud.dto.UserDto;
import com.springboot.crud.repository.PostRepository;
import com.springboot.crud.repository.UserRepository;
@Configuration
public class Instatiation implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		User user = new User(null,"Gabriel Pereira","gabriel@gmail.com");
		User user1 = new User(null,"Raissa Lima","raissa@gmail.com");
		User user2 = new User(null,"Rafael Pereira","rafael@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user,user1,user2));
		
		Post post = new Post(null,sdf.parse("21/03/2018"),"Viagem Brasil","Viajando, abracos", new AuthorDto(user));
		Post post1 = new Post(null,sdf.parse("23/05/1997"),"Viagem para Paris", "Volto logo", new AuthorDto(user));
		
		CommentDto c1 = new CommentDto("boa viagem", sdf.parse("25/05/2008"), new AuthorDto(user2));
		CommentDto c2 = new CommentDto("Sentirei sua falta", sdf.parse("23/05/2008"), new AuthorDto(user));
		
		post.getComments().addAll(Arrays.asList(c1,c2));
		
		postRepository.saveAll(Arrays.asList(post,post1));
		
		
		user.getPosts().addAll(Arrays.asList(post,post1));
		
		userRepository.save(user);
		
		
		
		
		
	}

}
