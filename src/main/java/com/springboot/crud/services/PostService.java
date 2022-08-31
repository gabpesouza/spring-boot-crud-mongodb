package com.springboot.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.domain.Post;
import com.springboot.crud.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;
	
	
	public Post findById(String id){
		
		Optional<Post> post = postRepository.findById(id);
		return post.get();
		
		
	}
	
	public List<Post> findAll(){
		return postRepository.findAll();
	}
	
	public List<Post> findByTitle(String text){
		
		return postRepository.findByTitleContaining(text);
	}

}
