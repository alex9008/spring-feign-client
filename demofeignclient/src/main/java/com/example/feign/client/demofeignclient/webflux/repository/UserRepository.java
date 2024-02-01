package com.example.feign.client.demofeignclient.webflux.repository;

import com.example.feign.client.demofeignclient.webflux.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
