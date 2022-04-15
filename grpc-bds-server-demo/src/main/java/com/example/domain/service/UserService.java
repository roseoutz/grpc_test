package com.example.domain.service;

import com.example.domain.dto.UserDTO;
import com.example.domain.entity.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<UserDTO> addUser(UserDTO user);

    Mono<UserDTO> fetchByOid(String oid);

    Mono<UserDTO> fetchByUserId(String userId);
}
