package com.example.grpc.service;

import com.example.grpc.EventRequest;
import com.example.grpc.EventResponse;
import com.example.grpc.EventServiceGrpc;
import com.example.grpc.ResultStatus;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Slf4j
@Service
public class EventService extends EventServiceGrpc.EventServiceImplBase {

    @Override
    public void sendEvent(EventRequest request, StreamObserver<EventResponse> responseStreamObserver) {
        try {
            log.info("sendEvent : {}", request.toString());

            responseStreamObserver
                    .onNext(
                            EventResponse.newBuilder()
                                    .setStatus(ResultStatus.newBuilder()
                                            .setCode(Status.OK.getCode().value())
                                            .setMessage("SUCCESS")
                                            .build()
                                    )
                                    .setResult("Success Event")
                                    .build()
                    );

            responseStreamObserver.onCompleted();
        } catch (Exception e) {
            responseStreamObserver.onError(e);
        }
    }

    @Override
    public void sendEventServerStream(EventRequest eventRequest, StreamObserver<EventResponse> responseStreamObserver) {

        try {
            log.info("sendEventServerStream : {}", eventRequest.toString());

            Flux.range(0, 5)
                    .doOnNext(integer -> {
                        responseStreamObserver.onNext(
                                EventResponse.newBuilder()
                                        .setStatus(ResultStatus.newBuilder()
                                                .setCode(Status.OK.getCode().value())
                                                .setMessage("SUCCESS!!!")
                                                .build())
                                        .setResult("Success Event " + integer)
                                        .build()
                        );
                    })
                    .doOnComplete(responseStreamObserver::onCompleted)
                    .subscribe();
            } catch (Exception e) {
            responseStreamObserver.onError(e);
        }
    }


    @Override
    public StreamObserver<EventRequest> sendEventClientStream(StreamObserver<EventResponse> responseObserver) {
        return new StreamObserver<EventRequest>() {
            @Override
            public void onNext(EventRequest value) {
                log.info("sendEventClientStream request onNext : {}", value.toString());
            }

            @Override
            public void onError(Throwable t) {
                log.info("sendEventClientStream request onError : {}", t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        EventResponse.newBuilder()
                                .setStatus(ResultStatus.newBuilder()
                                        .setCode(Status.OK.getCode().value())
                                        .setMessage("SUCCESS!!!")
                                        .build())
                                .setResult("Success Event")
                                .build()
                );
                responseObserver.onCompleted();
            }
        };
    }


    @Override
    public StreamObserver<EventRequest> sendEventStream(StreamObserver<EventResponse> responseObserver) {
        StreamObserver<EventRequest> requestStreamObserver = new StreamObserver<EventRequest>() {
            @Override
            public void onNext(EventRequest value) {
                for (int i = 0; i < 10; i++) {
                    responseObserver.onNext(
                            EventResponse.newBuilder()
                                    .setStatus(ResultStatus.newBuilder()
                                            .setCode(Status.OK.getCode().value())
                                            .setMessage("SUCCESS!!!")
                                            .build())
                                    .setResult("Success Event " + i)
                                    .build()
                    );
                }
            }

            @Override
            public void onError(Throwable t) {
                log.info("sendEventClientStream request onError : {}", t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestStreamObserver;
    }
}



