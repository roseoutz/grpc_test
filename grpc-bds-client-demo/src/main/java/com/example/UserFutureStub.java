package com.example;

import com.example.grpc.*;
import io.grpc.Deadline;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class UserFutureStub extends AbstractStub {

    private UserGrpcServiceGrpc.UserGrpcServiceFutureStub stub() {
        return UserGrpcServiceGrpc.newFutureStub(channel())
                .withDeadline(Deadline.after(3000, TimeUnit.MILLISECONDS));
    }

    public UserRpcResponse addUser(UserRpcRequest userRpcRequest) throws ExecutionException, InterruptedException {
        return stub().addUser(userRpcRequest)
                .get();
    }

    public UserRpcResponse getUserByOid(UserOidRequest userOidRequest) throws ExecutionException, InterruptedException {
        return stub().getByOid(userOidRequest)
                .get();
    }

    public UserRpcResponse getUserByUserId(UserIDRequest userIdRequest) throws ExecutionException, InterruptedException {
        return stub().getByUserId(userIdRequest)
                .get();
    }
}
