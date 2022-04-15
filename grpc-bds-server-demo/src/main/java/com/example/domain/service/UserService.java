package com.example.domain.service;

import com.example.domain.entity.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> addUser(User user);

    Mono<User> fetchByOid(String oid);

    Mono<User> fetchByUserId(String userId);
}
