package com.example.controller;

import com.example.domain.dto.UserDTO;
import com.example.domain.entity.User;
import com.example.domain.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{oid}")
    public Mono<UserDTO> getByOid(@PathVariable("oid") String oid) {
        return userService.fetchByOid(oid)
                .map(entity -> UserDTO
                        .builder()
                        .oid(entity.getOid())
                        .userId(entity.getUserId())
                        .username(entity.getUsername())
                        .password(entity.getPassword())
                        .cellPhone(entity.getCellPhone())
                        .build()
                );
    }

    @GetMapping("/user/{userId}")
    public Mono<UserDTO> getByUserId(@PathVariable("userId") String userId) {
        return userService.fetchByUserId(userId)
                .map(entity -> UserDTO
                        .builder()
                        .oid(entity.getOid())
                        .userId(entity.getUserId())
                        .username(entity.getUsername())
                        .password(entity.getPassword())
                        .cellPhone(entity.getCellPhone())
                        .build()
                );
    }

    @PostMapping("/user")
    public Mono<UserDTO> addUser(@RequestBody User user) {
        return userService.addUser(user)
                .map(entity -> UserDTO
                        .builder()
                        .oid(entity.getOid())
                        .userId(entity.getUserId())
                        .username(entity.getUsername())
                        .password(entity.getPassword())
                        .cellPhone(entity.getCellPhone())
                        .build()
                );
    }
}
