// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventDto.proto

package com.example.grpc;

public interface EventRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.EventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.com.example.grpc.Type type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.com.example.grpc.Type type = 2;</code>
   * @return The type.
   */
  com.example.grpc.Type getType();
}
