package com.dbc.register.registeruser.persistence.repository;

import com.dbc.register.registeruser.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
