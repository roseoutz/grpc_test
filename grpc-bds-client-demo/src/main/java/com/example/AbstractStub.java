package com.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractStub {

    @Value("${grpc.host}")
    private String host;

    @Value("${grpc.port}")
    private int port;

    private ManagedChannel managedChannel;

    public ManagedChannel channel() {
        return ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    }
}
