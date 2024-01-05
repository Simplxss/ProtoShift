// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ArenaChallengeChildChallengeInfo.proto

package emu.protoshift.net.oldproto;

public final class ArenaChallengeChildChallengeInfoOuterClass {
  private ArenaChallengeChildChallengeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ArenaChallengeChildChallengeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ArenaChallengeChildChallengeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_settled = 15;</code>
     * @return The isSettled.
     */
    boolean getIsSettled();

    /**
     * <code>uint32 challenge_index = 1;</code>
     * @return The challengeIndex.
     */
    int getChallengeIndex();

    /**
     * <code>bool is_success = 14;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 challenge_type = 8;</code>
     * @return The challengeType.
     */
    int getChallengeType();
  }
  /**
   * Protobuf type {@code ArenaChallengeChildChallengeInfo}
   */
  public static final class ArenaChallengeChildChallengeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ArenaChallengeChildChallengeInfo)
      ArenaChallengeChildChallengeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ArenaChallengeChildChallengeInfo.newBuilder() to construct.
    private ArenaChallengeChildChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ArenaChallengeChildChallengeInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ArenaChallengeChildChallengeInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.internal_static_ArenaChallengeChildChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.internal_static_ArenaChallengeChildChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.class, emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.Builder.class);
    }

    public static final int IS_SETTLED_FIELD_NUMBER = 15;
    private boolean isSettled_ = false;
    /**
     * <code>bool is_settled = 15;</code>
     * @return The isSettled.
     */
    @java.lang.Override
    public boolean getIsSettled() {
      return isSettled_;
    }

    public static final int CHALLENGE_INDEX_FIELD_NUMBER = 1;
    private int challengeIndex_ = 0;
    /**
     * <code>uint32 challenge_index = 1;</code>
     * @return The challengeIndex.
     */
    @java.lang.Override
    public int getChallengeIndex() {
      return challengeIndex_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 14;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 14;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int CHALLENGE_ID_FIELD_NUMBER = 10;
    private int challengeId_ = 0;
    /**
     * <code>uint32 challenge_id = 10;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public static final int CHALLENGE_TYPE_FIELD_NUMBER = 8;
    private int challengeType_ = 0;
    /**
     * <code>uint32 challenge_type = 8;</code>
     * @return The challengeType.
     */
    @java.lang.Override
    public int getChallengeType() {
      return challengeType_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (challengeIndex_ != 0) {
        output.writeUInt32(1, challengeIndex_);
      }
      if (challengeType_ != 0) {
        output.writeUInt32(8, challengeType_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(10, challengeId_);
      }
      if (isSuccess_ != false) {
        output.writeBool(14, isSuccess_);
      }
      if (isSettled_ != false) {
        output.writeBool(15, isSettled_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeIndex_);
      }
      if (challengeType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, challengeType_);
      }
      if (challengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, challengeId_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isSuccess_);
      }
      if (isSettled_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isSettled_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo other = (emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo) obj;

      if (getIsSettled()
          != other.getIsSettled()) return false;
      if (getChallengeIndex()
          != other.getChallengeIndex()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getChallengeId()
          != other.getChallengeId()) return false;
      if (getChallengeType()
          != other.getChallengeType()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + IS_SETTLED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSettled());
      hash = (37 * hash) + CHALLENGE_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeIndex();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + CHALLENGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ArenaChallengeChildChallengeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ArenaChallengeChildChallengeInfo)
        emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.internal_static_ArenaChallengeChildChallengeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.internal_static_ArenaChallengeChildChallengeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.class, emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        isSettled_ = false;
        challengeIndex_ = 0;
        isSuccess_ = false;
        challengeId_ = 0;
        challengeType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.internal_static_ArenaChallengeChildChallengeInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo build() {
        emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo buildPartial() {
        emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo result = new emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isSettled_ = isSettled_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.challengeIndex_ = challengeIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isSuccess_ = isSuccess_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.challengeId_ = challengeId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.challengeType_ = challengeType_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo other) {
        if (other == emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo.getDefaultInstance()) return this;
        if (other.getIsSettled() != false) {
          setIsSettled(other.getIsSettled());
        }
        if (other.getChallengeIndex() != 0) {
          setChallengeIndex(other.getChallengeIndex());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getChallengeType() != 0) {
          setChallengeType(other.getChallengeType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                challengeIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 64: {
                challengeType_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 64
              case 80: {
                challengeId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 112: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
              case 120: {
                isSettled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private boolean isSettled_ ;
      /**
       * <code>bool is_settled = 15;</code>
       * @return The isSettled.
       */
      @java.lang.Override
      public boolean getIsSettled() {
        return isSettled_;
      }
      /**
       * <code>bool is_settled = 15;</code>
       * @param value The isSettled to set.
       * @return This builder for chaining.
       */
      public Builder setIsSettled(boolean value) {

        isSettled_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_settled = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSettled() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isSettled_ = false;
        onChanged();
        return this;
      }

      private int challengeIndex_ ;
      /**
       * <code>uint32 challenge_index = 1;</code>
       * @return The challengeIndex.
       */
      @java.lang.Override
      public int getChallengeIndex() {
        return challengeIndex_;
      }
      /**
       * <code>uint32 challenge_index = 1;</code>
       * @param value The challengeIndex to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeIndex(int value) {

        challengeIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        challengeIndex_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 14;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 14;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int challengeId_ ;
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
        return challengeId_;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @param value The challengeId to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeId(int value) {

        challengeId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int challengeType_ ;
      /**
       * <code>uint32 challenge_type = 8;</code>
       * @return The challengeType.
       */
      @java.lang.Override
      public int getChallengeType() {
        return challengeType_;
      }
      /**
       * <code>uint32 challenge_type = 8;</code>
       * @param value The challengeType to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeType(int value) {

        challengeType_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        challengeType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ArenaChallengeChildChallengeInfo)
    }

    // @@protoc_insertion_point(class_scope:ArenaChallengeChildChallengeInfo)
    private static final emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo();
    }

    public static emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ArenaChallengeChildChallengeInfo>
        PARSER = new com.google.protobuf.AbstractParser<ArenaChallengeChildChallengeInfo>() {
      @java.lang.Override
      public ArenaChallengeChildChallengeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ArenaChallengeChildChallengeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ArenaChallengeChildChallengeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ArenaChallengeChildChallengeInfoOuterClass.ArenaChallengeChildChallengeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ArenaChallengeChildChallengeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ArenaChallengeChildChallengeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&ArenaChallengeChildChallengeInfo.proto" +
      "\"\221\001\n ArenaChallengeChildChallengeInfo\022\022\n" +
      "\nis_settled\030\017 \001(\010\022\027\n\017challenge_index\030\001 \001" +
      "(\r\022\022\n\nis_success\030\016 \001(\010\022\024\n\014challenge_id\030\n" +
      " \001(\r\022\026\n\016challenge_type\030\010 \001(\rB\035\n\033emu.prot" +
      "oshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ArenaChallengeChildChallengeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ArenaChallengeChildChallengeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ArenaChallengeChildChallengeInfo_descriptor,
        new java.lang.String[] { "IsSettled", "ChallengeIndex", "IsSuccess", "ChallengeId", "ChallengeType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
