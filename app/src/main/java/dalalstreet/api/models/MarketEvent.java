// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: models/MarketEvent.proto

package dalalstreet.api.models;

/**
 * Protobuf type {@code proto.MarketEvent}
 */
public  final class MarketEvent extends
    com.google.protobuf.GeneratedMessageLite<
            MarketEvent, MarketEvent.Builder> implements
    // @@protoc_insertion_point(message_implements:proto.MarketEvent)
        MarketEventOrBuilder {
  private MarketEvent() {
    headline_ = "";
    text_ = "";
    createdAt_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>optional uint32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }
  /**
   * <code>optional uint32 id = 1;</code>
   */
  private void setId(int value) {

    id_ = value;
  }
  /**
   * <code>optional uint32 id = 1;</code>
   */
  private void clearId() {

    id_ = 0;
  }

  public static final int STOCK_ID_FIELD_NUMBER = 2;
  private int stockId_;
  /**
   * <code>optional uint32 stock_id = 2;</code>
   */
  public int getStockId() {
    return stockId_;
  }
  /**
   * <code>optional uint32 stock_id = 2;</code>
   */
  private void setStockId(int value) {

    stockId_ = value;
  }
  /**
   * <code>optional uint32 stock_id = 2;</code>
   */
  private void clearStockId() {

    stockId_ = 0;
  }

  public static final int HEADLINE_FIELD_NUMBER = 3;
  private String headline_;
  /**
   * <code>optional string headline = 3;</code>
   */
  public String getHeadline() {
    return headline_;
  }
  /**
   * <code>optional string headline = 3;</code>
   */
  public com.google.protobuf.ByteString
      getHeadlineBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(headline_);
  }
  /**
   * <code>optional string headline = 3;</code>
   */
  private void setHeadline(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    headline_ = value;
  }
  /**
   * <code>optional string headline = 3;</code>
   */
  private void clearHeadline() {

    headline_ = getDefaultInstance().getHeadline();
  }
  /**
   * <code>optional string headline = 3;</code>
   */
  private void setHeadlineBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    headline_ = value.toStringUtf8();
  }

  public static final int TEXT_FIELD_NUMBER = 4;
  private String text_;
  /**
   * <code>optional string text = 4;</code>
   */
  public String getText() {
    return text_;
  }
  /**
   * <code>optional string text = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTextBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(text_);
  }
  /**
   * <code>optional string text = 4;</code>
   */
  private void setText(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    text_ = value;
  }
  /**
   * <code>optional string text = 4;</code>
   */
  private void clearText() {

    text_ = getDefaultInstance().getText();
  }
  /**
   * <code>optional string text = 4;</code>
   */
  private void setTextBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    text_ = value.toStringUtf8();
  }

  public static final int EMOTION_SCORE_FIELD_NUMBER = 5;
  private int emotionScore_;
  /**
   * <code>optional sint32 emotion_score = 5;</code>
   */
  public int getEmotionScore() {
    return emotionScore_;
  }
  /**
   * <code>optional sint32 emotion_score = 5;</code>
   */
  private void setEmotionScore(int value) {

    emotionScore_ = value;
  }
  /**
   * <code>optional sint32 emotion_score = 5;</code>
   */
  private void clearEmotionScore() {

    emotionScore_ = 0;
  }

  public static final int IS_GLOBAL_FIELD_NUMBER = 7;
  private boolean isGlobal_;
  /**
   * <code>optional bool is_global = 7;</code>
   */
  public boolean getIsGlobal() {
    return isGlobal_;
  }
  /**
   * <code>optional bool is_global = 7;</code>
   */
  private void setIsGlobal(boolean value) {

    isGlobal_ = value;
  }
  /**
   * <code>optional bool is_global = 7;</code>
   */
  private void clearIsGlobal() {

    isGlobal_ = false;
  }

  public static final int CREATED_AT_FIELD_NUMBER = 6;
  private String createdAt_;
  /**
   * <code>optional string created_at = 6;</code>
   */
  public String getCreatedAt() {
    return createdAt_;
  }
  /**
   * <code>optional string created_at = 6;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedAtBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(createdAt_);
  }
  /**
   * <code>optional string created_at = 6;</code>
   */
  private void setCreatedAt(
      String value) {
    if (value == null) {
    throw new NullPointerException();
  }

    createdAt_ = value;
  }
  /**
   * <code>optional string created_at = 6;</code>
   */
  private void clearCreatedAt() {

    createdAt_ = getDefaultInstance().getCreatedAt();
  }
  /**
   * <code>optional string created_at = 6;</code>
   */
  private void setCreatedAtBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

    createdAt_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeUInt32(1, id_);
    }
    if (stockId_ != 0) {
      output.writeUInt32(2, stockId_);
    }
    if (!headline_.isEmpty()) {
      output.writeString(3, getHeadline());
    }
    if (!text_.isEmpty()) {
      output.writeString(4, getText());
    }
    if (emotionScore_ != 0) {
      output.writeSInt32(5, emotionScore_);
    }
    if (!createdAt_.isEmpty()) {
      output.writeString(6, getCreatedAt());
    }
    if (isGlobal_ != false) {
      output.writeBool(7, isGlobal_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, id_);
    }
    if (stockId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, stockId_);
    }
    if (!headline_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getHeadline());
    }
    if (!text_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getText());
    }
    if (emotionScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeSInt32Size(5, emotionScore_);
    }
    if (!createdAt_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(6, getCreatedAt());
    }
    if (isGlobal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isGlobal_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static MarketEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static MarketEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static MarketEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static MarketEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static MarketEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static MarketEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static MarketEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static MarketEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static MarketEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static MarketEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(MarketEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code proto.MarketEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
              MarketEvent, Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.MarketEvent)
          MarketEventOrBuilder {
    // Construct using dalalstreet.api.models.MarketEvent.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional uint32 id = 1;</code>
     */
    public int getId() {
      return instance.getId();
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    public Builder setId(int value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <code>optional uint32 id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }

    /**
     * <code>optional uint32 stock_id = 2;</code>
     */
    public int getStockId() {
      return instance.getStockId();
    }
    /**
     * <code>optional uint32 stock_id = 2;</code>
     */
    public Builder setStockId(int value) {
      copyOnWrite();
      instance.setStockId(value);
      return this;
    }
    /**
     * <code>optional uint32 stock_id = 2;</code>
     */
    public Builder clearStockId() {
      copyOnWrite();
      instance.clearStockId();
      return this;
    }

    /**
     * <code>optional string headline = 3;</code>
     */
    public String getHeadline() {
      return instance.getHeadline();
    }
    /**
     * <code>optional string headline = 3;</code>
     */
    public com.google.protobuf.ByteString
        getHeadlineBytes() {
      return instance.getHeadlineBytes();
    }
    /**
     * <code>optional string headline = 3;</code>
     */
    public Builder setHeadline(
        String value) {
      copyOnWrite();
      instance.setHeadline(value);
      return this;
    }
    /**
     * <code>optional string headline = 3;</code>
     */
    public Builder clearHeadline() {
      copyOnWrite();
      instance.clearHeadline();
      return this;
    }
    /**
     * <code>optional string headline = 3;</code>
     */
    public Builder setHeadlineBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHeadlineBytes(value);
      return this;
    }

    /**
     * <code>optional string text = 4;</code>
     */
    public String getText() {
      return instance.getText();
    }
    /**
     * <code>optional string text = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      return instance.getTextBytes();
    }
    /**
     * <code>optional string text = 4;</code>
     */
    public Builder setText(
        String value) {
      copyOnWrite();
      instance.setText(value);
      return this;
    }
    /**
     * <code>optional string text = 4;</code>
     */
    public Builder clearText() {
      copyOnWrite();
      instance.clearText();
      return this;
    }
    /**
     * <code>optional string text = 4;</code>
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTextBytes(value);
      return this;
    }

    /**
     * <code>optional sint32 emotion_score = 5;</code>
     */
    public int getEmotionScore() {
      return instance.getEmotionScore();
    }
    /**
     * <code>optional sint32 emotion_score = 5;</code>
     */
    public Builder setEmotionScore(int value) {
      copyOnWrite();
      instance.setEmotionScore(value);
      return this;
    }
    /**
     * <code>optional sint32 emotion_score = 5;</code>
     */
    public Builder clearEmotionScore() {
      copyOnWrite();
      instance.clearEmotionScore();
      return this;
    }

    /**
     * <code>optional bool is_global = 7;</code>
     */
    public boolean getIsGlobal() {
      return instance.getIsGlobal();
    }
    /**
     * <code>optional bool is_global = 7;</code>
     */
    public Builder setIsGlobal(boolean value) {
      copyOnWrite();
      instance.setIsGlobal(value);
      return this;
    }
    /**
     * <code>optional bool is_global = 7;</code>
     */
    public Builder clearIsGlobal() {
      copyOnWrite();
      instance.clearIsGlobal();
      return this;
    }

    /**
     * <code>optional string created_at = 6;</code>
     */
    public String getCreatedAt() {
      return instance.getCreatedAt();
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedAtBytes() {
      return instance.getCreatedAtBytes();
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    public Builder setCreatedAt(
        String value) {
      copyOnWrite();
      instance.setCreatedAt(value);
      return this;
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    public Builder clearCreatedAt() {
      copyOnWrite();
      instance.clearCreatedAt();
      return this;
    }
    /**
     * <code>optional string created_at = 6;</code>
     */
    public Builder setCreatedAtBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCreatedAtBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.MarketEvent)
  }
  protected final Object dynamicMethod(
      MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new MarketEvent();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        MarketEvent other = (MarketEvent) arg1;
        id_ = visitor.visitInt(id_ != 0, id_,
            other.id_ != 0, other.id_);
        stockId_ = visitor.visitInt(stockId_ != 0, stockId_,
            other.stockId_ != 0, other.stockId_);
        headline_ = visitor.visitString(!headline_.isEmpty(), headline_,
            !other.headline_.isEmpty(), other.headline_);
        text_ = visitor.visitString(!text_.isEmpty(), text_,
            !other.text_.isEmpty(), other.text_);
        emotionScore_ = visitor.visitInt(emotionScore_ != 0, emotionScore_,
            other.emotionScore_ != 0, other.emotionScore_);
        isGlobal_ = visitor.visitBoolean(isGlobal_ != false, isGlobal_,
            other.isGlobal_ != false, other.isGlobal_);
        createdAt_ = visitor.visitString(!createdAt_.isEmpty(), createdAt_,
            !other.createdAt_.isEmpty(), other.createdAt_);
        if (visitor == MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 8: {

                id_ = input.readUInt32();
                break;
              }
              case 16: {

                stockId_ = input.readUInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                headline_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                text_ = s;
                break;
              }
              case 40: {

                emotionScore_ = input.readSInt32();
                break;
              }
              case 50: {
                String s = input.readStringRequireUtf8();

                createdAt_ = s;
                break;
              }
              case 56: {

                isGlobal_ = input.readBool();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (MarketEvent.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:proto.MarketEvent)
  private static final MarketEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new MarketEvent();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static MarketEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MarketEvent> PARSER;

  public static com.google.protobuf.Parser<MarketEvent> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
