// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetOnlinePlayerInfoRsp.proto

package emu.protoshift.net.oldproto;

public final class GetOnlinePlayerInfoRspOuterClass {
  private GetOnlinePlayerInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetOnlinePlayerInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetOnlinePlayerInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 2;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return Whether the targetPlayerInfo field is set.
     */
    boolean hasTargetPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return The targetPlayerInfo.
     */
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     */
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder();

    /**
     * <code>uint32 param = 5;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 8759
   * Obf: LDNOEIHGGKN
   * </pre>
   *
   * Protobuf type {@code GetOnlinePlayerInfoRsp}
   */
  public static final class GetOnlinePlayerInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetOnlinePlayerInfoRsp)
      GetOnlinePlayerInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetOnlinePlayerInfoRsp.newBuilder() to construct.
    private GetOnlinePlayerInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetOnlinePlayerInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetOnlinePlayerInfoRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.class, emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.Builder.class);
    }

    private int bitField0_;
    public static final int TARGET_UID_FIELD_NUMBER = 2;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 2;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int TARGET_PLAYER_INFO_FIELD_NUMBER = 14;
    private emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo targetPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return Whether the targetPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasTargetPlayerInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return The targetPlayerInfo.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo() {
      return targetPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder() {
      return targetPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
    }

    public static final int PARAM_FIELD_NUMBER = 5;
    private int param_ = 0;
    /**
     * <code>uint32 param = 5;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (targetUid_ != 0) {
        output.writeUInt32(2, targetUid_);
      }
      if (param_ != 0) {
        output.writeUInt32(5, param_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(14, getTargetPlayerInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, targetUid_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, param_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getTargetPlayerInfo());
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp other = (emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (hasTargetPlayerInfo() != other.hasTargetPlayerInfo()) return false;
      if (hasTargetPlayerInfo()) {
        if (!getTargetPlayerInfo()
            .equals(other.getTargetPlayerInfo())) return false;
      }
      if (getParam()
          != other.getParam()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      if (hasTargetPlayerInfo()) {
        hash = (37 * hash) + TARGET_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPlayerInfo().hashCode();
      }
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp prototype) {
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
     * <pre>
     * CmdId: 8759
     * Obf: LDNOEIHGGKN
     * </pre>
     *
     * Protobuf type {@code GetOnlinePlayerInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetOnlinePlayerInfoRsp)
        emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.class, emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTargetPlayerInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        targetUid_ = 0;
        targetPlayerInfo_ = null;
        if (targetPlayerInfoBuilder_ != null) {
          targetPlayerInfoBuilder_.dispose();
          targetPlayerInfoBuilder_ = null;
        }
        param_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp build() {
        emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp buildPartial() {
        emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp result = new emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetUid_ = targetUid_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetPlayerInfo_ = targetPlayerInfoBuilder_ == null
              ? targetPlayerInfo_
              : targetPlayerInfoBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.param_ = param_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.retcode_ = retcode_;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp other) {
        if (other == emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.hasTargetPlayerInfo()) {
          mergeTargetPlayerInfo(other.getTargetPlayerInfo());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 16: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 40: {
                param_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 48: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 114: {
                input.readMessage(
                    getTargetPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 114
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

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 2;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 2;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {

        targetUid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo targetPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> targetPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       * @return Whether the targetPlayerInfo field is set.
       */
      public boolean hasTargetPlayerInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       * @return The targetPlayerInfo.
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo() {
        if (targetPlayerInfoBuilder_ == null) {
          return targetPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
        } else {
          return targetPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder setTargetPlayerInfo(emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (targetPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPlayerInfo_ = value;
        } else {
          targetPlayerInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder setTargetPlayerInfo(
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfo_ = builderForValue.build();
        } else {
          targetPlayerInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder mergeTargetPlayerInfo(emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (targetPlayerInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            targetPlayerInfo_ != null &&
            targetPlayerInfo_ != emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance()) {
            getTargetPlayerInfoBuilder().mergeFrom(value);
          } else {
            targetPlayerInfo_ = value;
          }
        } else {
          targetPlayerInfoBuilder_.mergeFrom(value);
        }
        if (targetPlayerInfo_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder clearTargetPlayerInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetPlayerInfo_ = null;
        if (targetPlayerInfoBuilder_ != null) {
          targetPlayerInfoBuilder_.dispose();
          targetPlayerInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getTargetPlayerInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getTargetPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder() {
        if (targetPlayerInfoBuilder_ != null) {
          return targetPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return targetPlayerInfo_ == null ?
              emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getTargetPlayerInfoFieldBuilder() {
        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getTargetPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          targetPlayerInfo_ = null;
        }
        return targetPlayerInfoBuilder_;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 5;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 5;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {

        param_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000008);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetOnlinePlayerInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetOnlinePlayerInfoRsp)
    private static final emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp();
    }

    public static emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetOnlinePlayerInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetOnlinePlayerInfoRsp>() {
      @java.lang.Override
      public GetOnlinePlayerInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetOnlinePlayerInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetOnlinePlayerInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetOnlinePlayerInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetOnlinePlayerInfoRsp.proto\032\026OnlinePl" +
      "ayerInfo.proto\"{\n\026GetOnlinePlayerInfoRsp" +
      "\022\022\n\ntarget_uid\030\002 \001(\r\022-\n\022target_player_in" +
      "fo\030\016 \001(\0132\021.OnlinePlayerInfo\022\r\n\005param\030\005 \001" +
      "(\r\022\017\n\007retcode\030\006 \001(\005B\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_GetOnlinePlayerInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetOnlinePlayerInfoRsp_descriptor,
        new java.lang.String[] { "TargetUid", "TargetPlayerInfo", "Param", "Retcode", });
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
