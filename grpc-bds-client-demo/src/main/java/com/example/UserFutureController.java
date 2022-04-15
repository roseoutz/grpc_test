package com.example;

import com.example.grpc.UserIDRequest;
import com.example.grpc.UserOidRequest;
import com.example.grpc.UserRpcResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api/user/future/v1")
public class UserFutureController {

    @Autowired
    private UserFutureStub userFutureStub;

    @GetMapping("/id/{userId}")
    public Mono<UserRpcResponse> getUserByUserId(@PathVariable("userId") String userId) {
        return Mono.just(UserIDRequest.newBuilder().setUserId(userId).build())
                .flatMap(userIDRequest -> {
                    try {
                        return Mono.just(userFutureStub.getUserByUserId(userIDRequest));
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return Mono.empty();
                });
    }

    @GetMapping("/oid/{oid}")
    public Mono<UserRpcResponse> getUserByOid(@PathVariable("oid") String oid) {
        return Mono.just(UserOidRequest.newBuilder().setOid(oid).build())
                .flatMap(userOidRequest -> {
                    try {
                        return Mono.just(userFutureStub.getUserByOid(userOidRequest));
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return Mono.empty();
                });
    }
}
