package com.mongodbProject.learning_mongodb.repository;

import com.mongodbProject.learning_mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
