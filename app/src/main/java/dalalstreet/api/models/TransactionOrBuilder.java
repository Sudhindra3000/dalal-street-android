// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/Transaction.proto

package dalalstreet.api.models;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Transaction)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional uint32 id = 1;</code>
   */
  int getId();

  /**
   * <code>optional uint32 user_id = 2;</code>
   */
  int getUserId();

  /**
   * <code>optional uint32 stock_id = 3;</code>
   */
  int getStockId();

  /**
   * <code>optional .proto.TransactionType type = 4;</code>
   */
  int getTypeValue();
  /**
   * <code>optional .proto.TransactionType type = 4;</code>
   */
  TransactionType getType();

  /**
   * <code>optional int32 stock_quantity = 5;</code>
   */
  int getStockQuantity();

  /**
   * <code>optional uint32 price = 6;</code>
   */
  int getPrice();

  /**
   * <code>optional int32 total = 7;</code>
   */
  int getTotal();

  /**
   * <code>optional string created_at = 8;</code>
   */
  String getCreatedAt();
  /**
   * <code>optional string created_at = 8;</code>
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();
}