package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserSocketController {

    @Autowired
    private RSocketRequester socketRequester;

    @GetMapping("/api/user/v1/socket/{userId}")
    public Mono<String> getUserById(@PathVariable("userId") String userId) {
        return socketRequester
                .route("getUserById")
                .data(userId)
                .retrieveMono(String.class);
    }
}
