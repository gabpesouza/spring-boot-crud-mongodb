package com.springboot.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
