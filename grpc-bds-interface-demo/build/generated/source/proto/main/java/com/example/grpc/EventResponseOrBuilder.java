// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: eventDto.proto

package com.example.grpc;

public interface EventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.example.grpc.EventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.example.grpc.ResultStatus status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.com.example.grpc.ResultStatus status = 1;</code>
   * @return The status.
   */
  com.example.grpc.ResultStatus getStatus();
  /**
   * <code>.com.example.grpc.ResultStatus status = 1;</code>
   */
  com.example.grpc.ResultStatusOrBuilder getStatusOrBuilder();

  /**
   * <code>string result = 2;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <code>string result = 2;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();
}
