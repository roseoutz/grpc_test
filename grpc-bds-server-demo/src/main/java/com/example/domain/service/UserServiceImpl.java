package com.example.domain.service;

import com.example.domain.entity.User;
import com.example.domain.repository.UserR2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserR2Repository userR2Repository;

    private String generateOid() {
        return Base64.getEncoder().encodeToString(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
    }
    @Override
    public Mono<User> addUser(User user) {
        if (Objects.isNull(user.getOid())) {
            user.setOid(generateOid());
        }
        user.setNew();
        return userR2Repository.save(user);
    }

    @Override
    public Mono<User> fetchByOid(String oid) {
        return userR2Repository.findById(oid);
    }

    @Override
    public Mono<User> fetchByUserId(String userId) {
        return userR2Repository.findByUserId(userId);
    }
}
