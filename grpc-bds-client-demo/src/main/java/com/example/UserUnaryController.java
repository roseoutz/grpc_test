package com.example;

import com.example.grpc.UserIDRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user/unary/v1")
public class UserUnaryController {

    @Autowired
    private UserUnaryStub userUnaryStub;

    @GetMapping("/{userId}")
    public Mono<String> getUserByUserId(@PathVariable("userId") String userId) {
        UserIDRequest userIDRequest = UserIDRequest.newBuilder().setUserId(userId).build();
        userUnaryStub.getUserByUserId(userIDRequest);
        return Mono.just("OK");
    }

}
