// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetHuntingOfferRewardRsp.proto

package emu.protoshift.net.oldproto;

public final class GetHuntingOfferRewardRspOuterClass {
  private GetHuntingOfferRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetHuntingOfferRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetHuntingOfferRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 city_id = 9;</code>
     * @return The cityId.
     */
    int getCityId();

    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     * @return Whether the huntingPair field is set.
     */
    boolean hasHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     * @return The huntingPair.
     */
    emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     */
    emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 26705
   * Obf: BGHOFJJBJJI
   * </pre>
   *
   * Protobuf type {@code GetHuntingOfferRewardRsp}
   */
  public static final class GetHuntingOfferRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetHuntingOfferRewardRsp)
      GetHuntingOfferRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetHuntingOfferRewardRsp.newBuilder() to construct.
    private GetHuntingOfferRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetHuntingOfferRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetHuntingOfferRewardRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.internal_static_GetHuntingOfferRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.internal_static_GetHuntingOfferRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.class, emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.Builder.class);
    }

    private int bitField0_;
    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CITY_ID_FIELD_NUMBER = 9;
    private int cityId_ = 0;
    /**
     * <code>uint32 city_id = 9;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
    }

    public static final int HUNTING_PAIR_FIELD_NUMBER = 15;
    private emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair huntingPair_;
    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     * @return Whether the huntingPair field is set.
     */
    @java.lang.Override
    public boolean hasHuntingPair() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     * @return The huntingPair.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }
    /**
     * <code>.HuntingPair hunting_pair = 15;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
      return huntingPair_ == null ? emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (cityId_ != 0) {
        output.writeUInt32(9, cityId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(15, getHuntingPair());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, cityId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getHuntingPair());
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp other = (emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCityId()
          != other.getCityId()) return false;
      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHuntingPair())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      if (hasHuntingPair()) {
        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp prototype) {
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
     * CmdId: 26705
     * Obf: BGHOFJJBJJI
     * </pre>
     *
     * Protobuf type {@code GetHuntingOfferRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetHuntingOfferRewardRsp)
        emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.internal_static_GetHuntingOfferRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.internal_static_GetHuntingOfferRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.class, emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.newBuilder()
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
          getHuntingPairFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        retcode_ = 0;
        cityId_ = 0;
        huntingPair_ = null;
        if (huntingPairBuilder_ != null) {
          huntingPairBuilder_.dispose();
          huntingPairBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.internal_static_GetHuntingOfferRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp build() {
        emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp buildPartial() {
        emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp result = new emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cityId_ = cityId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.huntingPair_ = huntingPairBuilder_ == null
              ? huntingPair_
              : huntingPairBuilder_.build();
          to_bitField0_ |= 0x00000001;
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
        if (other instanceof emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp other) {
        if (other == emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
        }
        if (other.hasHuntingPair()) {
          mergeHuntingPair(other.getHuntingPair());
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 72: {
                cityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 122: {
                input.readMessage(
                    getHuntingPairFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 122
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 9;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 9;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {

        cityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cityId_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       * @return Whether the huntingPair field is set.
       */
      public boolean hasHuntingPair() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       * @return The huntingPair.
       */
      public emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntingPair_ == null ? emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntingPairBuilder_.getMessage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public Builder setHuntingPair(emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
        } else {
          huntingPairBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public Builder setHuntingPair(
          emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder builderForValue) {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = builderForValue.build();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public Builder mergeHuntingPair(emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            huntingPair_ != null &&
            huntingPair_ != emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance()) {
            getHuntingPairBuilder().mergeFrom(value);
          } else {
            huntingPair_ = value;
          }
        } else {
          huntingPairBuilder_.mergeFrom(value);
        }
        if (huntingPair_ != null) {
          bitField0_ |= 0x00000004;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public Builder clearHuntingPair() {
        bitField0_ = (bitField0_ & ~0x00000004);
        huntingPair_ = null;
        if (huntingPairBuilder_ != null) {
          huntingPairBuilder_.dispose();
          huntingPairBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      public emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
        if (huntingPairBuilder_ != null) {
          return huntingPairBuilder_.getMessageOrBuilder();
        } else {
          return huntingPair_ == null ?
              emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
      /**
       * <code>.HuntingPair hunting_pair = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder> 
          getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPair.Builder, emu.protoshift.net.oldproto.HuntingPairOuterClass.HuntingPairOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean());
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetHuntingOfferRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:GetHuntingOfferRewardRsp)
    private static final emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp();
    }

    public static emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetHuntingOfferRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetHuntingOfferRewardRsp>() {
      @java.lang.Override
      public GetHuntingOfferRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetHuntingOfferRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetHuntingOfferRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetHuntingOfferRewardRspOuterClass.GetHuntingOfferRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetHuntingOfferRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetHuntingOfferRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetHuntingOfferRewardRsp.proto\032\021Huntin" +
      "gPair.proto\"`\n\030GetHuntingOfferRewardRsp\022" +
      "\017\n\007retcode\030\002 \001(\005\022\017\n\007city_id\030\t \001(\r\022\"\n\014hun" +
      "ting_pair\030\017 \001(\0132\014.HuntingPairB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.HuntingPairOuterClass.getDescriptor(),
        });
    internal_static_GetHuntingOfferRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetHuntingOfferRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetHuntingOfferRewardRsp_descriptor,
        new java.lang.String[] { "Retcode", "CityId", "HuntingPair", });
    emu.protoshift.net.oldproto.HuntingPairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
