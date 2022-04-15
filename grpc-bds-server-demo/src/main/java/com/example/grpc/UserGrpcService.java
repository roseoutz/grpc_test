package com.example.grpc;

import com.example.domain.dto.UserDTO;
import com.example.domain.entity.User;
import com.example.domain.service.UserService;
import com.google.protobuf.NullValue;
import io.grpc.Status;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
public class UserGrpcService extends UserGrpcServiceGrpc.UserGrpcServiceImplBase{

    private final UserService userService;

    protected UserRpcResponse convertToResponse(UserDTO user) {
        return UserRpcResponse.newBuilder()
                .setStatusCode(HttpStatus.OK.value())
                .setSuccess(true)
                .setErrorCode(NullValue.NULL_VALUE)
                .setErrorDescription(NullValue.NULL_VALUE)
                .putDataMap("oid", user.getOid())
                .putDataMap("userId", user.getUserId())
                .putDataMap("username", user.getUsername())
                .putDataMap("cellPhone", user.getCellPhone())
                .build();
    }

    protected UserDTO convertToUser(UserRpcRequest request) {
        return UserDTO.builder()
                .userId(request.getUserId())
                .username(request.getUsername())
                .password(request.getPassword())
                .cellPhone(request.getCellPhone())
                .build();
    }
    @Override
    public void getByOid(UserOidRequest request,
                         io.grpc.stub.StreamObserver<UserRpcResponse> responseObserver) {
        userService.fetchByOid(request.getOid())
                .filter(Objects::nonNull)
                .map(this::convertToResponse)
                .subscribe(
                        responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted

                );
    }

    @Override
    public void getByUserId(UserIDRequest request,
                            io.grpc.stub.StreamObserver<UserRpcResponse> responseObserver) {
        String userId = request.getUserId();
        userService.fetchByUserId(userId.replace("\\n", ""))
                .filter(Objects::nonNull)
                .map(this::convertToResponse)
                .subscribe(
                        responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted
                );
    }

    @Override
    public void addUser(UserRpcRequest request,
                        io.grpc.stub.StreamObserver<UserRpcResponse> responseObserver) {
        userService.addUser(convertToUser(request))
                .map(this::convertToResponse)
                .subscribe(
                        responseObserver::onNext,
                        responseObserver::onError,
                        responseObserver::onCompleted
                );
    }
}
