package com.example.hellofunction.repository;

import com.example.hellofunction.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {

}
