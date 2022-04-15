package com.example;

import com.example.grpc.*;
import io.grpc.Deadline;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class UserUnaryStub extends AbstractStub {

    private UserGrpcServiceGrpc.UserGrpcServiceStub stub() {
        return UserGrpcServiceGrpc.newStub(channel())
                .withDeadline(Deadline.after(3000, TimeUnit.MILLISECONDS));
    }

    public void addUser(UserRpcRequest userRpcRequest) {
        stub().addUser(userRpcRequest, new StreamObserver<UserRpcResponse>() {
                    @Override
                    public void onNext(UserRpcResponse value) {
                        log.info(value.toString());
                    }

                    @Override
                    public void onError(Throwable t) {
                        log.error(t.getMessage(), t);
                    }

                    @Override
                    public void onCompleted() {
                        log.info("On Complete!!!");
                    }
                }

        );
    }

    public void getUserByOid(UserOidRequest userOidRequest) {
        stub().getByOid(userOidRequest, new StreamObserver<UserRpcResponse>() {
                    @Override
                    public void onNext(UserRpcResponse value) {
                        log.info(value.toString());
                    }

                    @Override
                    public void onError(Throwable t) {
                        log.error(t.getMessage(), t);
                    }

                    @Override
                    public void onCompleted() {
                        log.info("On Complete!!!");
                    }
                }

        );
    }


    public void getUserByUserId(UserIDRequest userIDRequest) {
        stub().getByUserId(userIDRequest, new StreamObserver<UserRpcResponse>() {
                    @Override
                    public void onNext(UserRpcResponse value) {
                        log.info(value.toString());
                    }

                    @Override
                    public void onError(Throwable t) {
                        log.error(t.getMessage(), t);
                    }

                    @Override
                    public void onCompleted() {
                        log.info("On Complete!!!");
                    }
                }

        );
    }
}
