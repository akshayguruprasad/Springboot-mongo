package com.akshay.spring.springbootregisteration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.akshay.spring.springbootregisteration.modal.User;

public interface UserRepository extends MongoRepository<User,Integer> {

}
