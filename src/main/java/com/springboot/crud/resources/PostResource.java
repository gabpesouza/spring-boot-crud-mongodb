package com.springboot.crud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.domain.Post;
import com.springboot.crud.resources.util.Urldecodifier;
import com.springboot.crud.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	@Autowired
	private PostService postService;
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<Post> findById(@PathVariable String id){
		Post post = postService.findById(id);
		
		return ResponseEntity.ok(post);
	}
	@GetMapping
	private ResponseEntity<List<Post>> findAll(){
		return ResponseEntity.ok(postService.findAll());
	}
	
	/* querie com findbytitle */
	
	@GetMapping(value ="/titlesearch" )
	private ResponseEntity<List<Post>> consult(@RequestParam(value = "text", defaultValue = "") String s){
		 s = Urldecodifier.decode(s);
		
		List<Post> findByTitle = postService.findByTitle(s);
		return ResponseEntity.ok(findByTitle);
		
	}

}
