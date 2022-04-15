package com.example.domain.service;

import com.example.domain.dto.UserDTO;
import com.example.domain.entity.User;
import com.example.domain.repository.UserR2Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserR2Repository userR2Repository;

    private UserDTO convertToDto(User user) {
        return UserDTO
                .builder()
                .oid(user.getOid())
                .userId(user.getUserId())
                .username(user.getUsername())
                .cellPhone(user.getCellPhone())
                .password(user.getPassword())
                .build();
    }

    private User convertToEntity(UserDTO user) {
        User userEntity = new User();
        userEntity.setOid(user.getOid());
        userEntity.setUserId(user.getUserId());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setCellPhone(user.getCellPhone());
        return userEntity;
    }
    private String generateOid() {
        return Base64.getEncoder().encodeToString(UUID.randomUUID().toString().getBytes(StandardCharsets.UTF_8));
    }
    @Override
    public Mono<UserDTO> addUser(UserDTO user) {
        User userEntity = convertToEntity(user);
        userEntity.setOid(generateOid());
        userEntity.setIsNew(true);
        return userR2Repository.save(userEntity)
                .map(this::convertToDto);
    }

    @Override
    public Mono<UserDTO> fetchByOid(String oid) {
        return userR2Repository.findById(oid)
                .map(this::convertToDto);
    }

    @Override
    public Mono<UserDTO> fetchByUserId(String userId) {
        userR2Repository.findAll()
                .doOnNext(entity -> log.info(entity.toString()))
                .subscribe();
        return userR2Repository.findByUserId(userId)
                .map(this::convertToDto);
    }
}
