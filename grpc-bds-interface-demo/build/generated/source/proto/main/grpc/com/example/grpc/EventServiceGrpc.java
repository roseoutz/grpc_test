package com.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: eventService.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEvent",
      requestType = com.example.grpc.EventRequest.class,
      responseType = com.example.grpc.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EventRequest, com.example.grpc.EventResponse> getSendEventMethod;
    if ((getSendEventMethod = EventServiceGrpc.getSendEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSendEventMethod = EventServiceGrpc.getSendEventMethod) == null) {
          EventServiceGrpc.getSendEventMethod = getSendEventMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EventRequest, com.example.grpc.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("sendEvent"))
              .build();
        }
      }
    }
    return getSendEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventServerStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEventServerStream",
      requestType = com.example.grpc.EventRequest.class,
      responseType = com.example.grpc.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventServerStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EventRequest, com.example.grpc.EventResponse> getSendEventServerStreamMethod;
    if ((getSendEventServerStreamMethod = EventServiceGrpc.getSendEventServerStreamMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSendEventServerStreamMethod = EventServiceGrpc.getSendEventServerStreamMethod) == null) {
          EventServiceGrpc.getSendEventServerStreamMethod = getSendEventServerStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EventRequest, com.example.grpc.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendEventServerStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("sendEventServerStream"))
              .build();
        }
      }
    }
    return getSendEventServerStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventClientStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEventClientStream",
      requestType = com.example.grpc.EventRequest.class,
      responseType = com.example.grpc.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventClientStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EventRequest, com.example.grpc.EventResponse> getSendEventClientStreamMethod;
    if ((getSendEventClientStreamMethod = EventServiceGrpc.getSendEventClientStreamMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSendEventClientStreamMethod = EventServiceGrpc.getSendEventClientStreamMethod) == null) {
          EventServiceGrpc.getSendEventClientStreamMethod = getSendEventClientStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EventRequest, com.example.grpc.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendEventClientStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("sendEventClientStream"))
              .build();
        }
      }
    }
    return getSendEventClientStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEventStream",
      requestType = com.example.grpc.EventRequest.class,
      responseType = com.example.grpc.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.grpc.EventRequest,
      com.example.grpc.EventResponse> getSendEventStreamMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.EventRequest, com.example.grpc.EventResponse> getSendEventStreamMethod;
    if ((getSendEventStreamMethod = EventServiceGrpc.getSendEventStreamMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getSendEventStreamMethod = EventServiceGrpc.getSendEventStreamMethod) == null) {
          EventServiceGrpc.getSendEventStreamMethod = getSendEventStreamMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.EventRequest, com.example.grpc.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendEventStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("sendEventStream"))
              .build();
        }
      }
    }
    return getSendEventStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * Server(1) : Client(1)
     * - unary RPC
     * - Client 가 요청을 보내고 Server 가 응답하는 형태
     * </pre>
     */
    public void sendEvent(com.example.grpc.EventRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEventMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Server(N) : Client(1)
     * - Server Streaming RPC
     * - Client 가 요청을 보내고 Server로 부터 더이상 메시지가 없을 때까지 스트림을 읽음.
     * </pre>
     */
    public void sendEventServerStream(com.example.grpc.EventRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEventServerStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Server(1) : Client(N)
     * - Client Streaming RPC
     * - Client 가 스트림으로 Server 로 요청을 보내고, 더이상 메시지가 없을 때 응답을 리턴함.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.EventRequest> sendEventClientStream(
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendEventClientStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Server(N) : Client(M)
     * - Bidirectional Streaming RPC
     * - Client 와 Server 가 서로 독립적으로 스트림을 읽고 쓴다.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.EventRequest> sendEventStream(
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendEventStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.EventRequest,
                com.example.grpc.EventResponse>(
                  this, METHODID_SEND_EVENT)))
          .addMethod(
            getSendEventServerStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.grpc.EventRequest,
                com.example.grpc.EventResponse>(
                  this, METHODID_SEND_EVENT_SERVER_STREAM)))
          .addMethod(
            getSendEventClientStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.grpc.EventRequest,
                com.example.grpc.EventResponse>(
                  this, METHODID_SEND_EVENT_CLIENT_STREAM)))
          .addMethod(
            getSendEventStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.grpc.EventRequest,
                com.example.grpc.EventResponse>(
                  this, METHODID_SEND_EVENT_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Server(1) : Client(1)
     * - unary RPC
     * - Client 가 요청을 보내고 Server 가 응답하는 형태
     * </pre>
     */
    public void sendEvent(com.example.grpc.EventRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Server(N) : Client(1)
     * - Server Streaming RPC
     * - Client 가 요청을 보내고 Server로 부터 더이상 메시지가 없을 때까지 스트림을 읽음.
     * </pre>
     */
    public void sendEventServerStream(com.example.grpc.EventRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSendEventServerStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Server(1) : Client(N)
     * - Client Streaming RPC
     * - Client 가 스트림으로 Server 로 요청을 보내고, 더이상 메시지가 없을 때 응답을 리턴함.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.EventRequest> sendEventClientStream(
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendEventClientStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     **
     * Server(N) : Client(M)
     * - Bidirectional Streaming RPC
     * - Client 와 Server 가 서로 독립적으로 스트림을 읽고 쓴다.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.grpc.EventRequest> sendEventStream(
        io.grpc.stub.StreamObserver<com.example.grpc.EventResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendEventStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Server(1) : Client(1)
     * - unary RPC
     * - Client 가 요청을 보내고 Server 가 응답하는 형태
     * </pre>
     */
    public com.example.grpc.EventResponse sendEvent(com.example.grpc.EventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Server(N) : Client(1)
     * - Server Streaming RPC
     * - Client 가 요청을 보내고 Server로 부터 더이상 메시지가 없을 때까지 스트림을 읽음.
     * </pre>
     */
    public java.util.Iterator<com.example.grpc.EventResponse> sendEventServerStream(
        com.example.grpc.EventRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSendEventServerStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Server(1) : Client(1)
     * - unary RPC
     * - Client 가 요청을 보내고 Server 가 응답하는 형태
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.EventResponse> sendEvent(
        com.example.grpc.EventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EVENT = 0;
  private static final int METHODID_SEND_EVENT_SERVER_STREAM = 1;
  private static final int METHODID_SEND_EVENT_CLIENT_STREAM = 2;
  private static final int METHODID_SEND_EVENT_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EVENT:
          serviceImpl.sendEvent((com.example.grpc.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.EventResponse>) responseObserver);
          break;
        case METHODID_SEND_EVENT_SERVER_STREAM:
          serviceImpl.sendEventServerStream((com.example.grpc.EventRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.EventResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EVENT_CLIENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendEventClientStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.EventResponse>) responseObserver);
        case METHODID_SEND_EVENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendEventStream(
              (io.grpc.stub.StreamObserver<com.example.grpc.EventResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.EventServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getSendEventMethod())
              .addMethod(getSendEventServerStreamMethod())
              .addMethod(getSendEventClientStreamMethod())
              .addMethod(getSendEventStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
