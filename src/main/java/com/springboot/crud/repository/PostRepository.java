package com.springboot.crud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.crud.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	List<Post> findByTitleContaining(String text);
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' }}")
	List<Post> findByTitle(String text);

}
