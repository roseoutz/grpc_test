package com.example.domain.repository;

import com.example.domain.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserR2Repository extends R2dbcRepository<User, String> {

    Mono<User> findByUserId(String userId);
}
