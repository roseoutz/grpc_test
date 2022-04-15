package com.example.socket;

import com.example.domain.dto.UserDTO;
import com.example.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class UserSocketController {

    @Autowired
    private UserService userService;

    @MessageMapping("getUserByOid")
    public Mono<UserDTO> getUserByOid(String userOid) {
        return userService.fetchByOid(userOid);
    }

    @MessageMapping("getUserById")
    public Mono<UserDTO> getUserById(String userId) {
        return userService.fetchByUserId(userId);
    }
}
