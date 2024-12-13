package com.ms.user.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ms.user.models.UserModel;

public interface UserRepository extends MongoRepository<UserModel, String> {
}
