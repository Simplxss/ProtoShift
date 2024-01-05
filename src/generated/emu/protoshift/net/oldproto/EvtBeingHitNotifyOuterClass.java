// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtBeingHitNotify.proto

package emu.protoshift.net.oldproto;

public final class EvtBeingHitNotifyOuterClass {
  private EvtBeingHitNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtBeingHitNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtBeingHitNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType();

    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     * @return Whether the beingHitInfo field is set.
     */
    boolean hasBeingHitInfo();
    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     * @return The beingHitInfo.
     */
    emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo();
    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     */
    emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8650
   * Obf: OPODPPOAPKP
   * </pre>
   *
   * Protobuf type {@code EvtBeingHitNotify}
   */
  public static final class EvtBeingHitNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtBeingHitNotify)
      EvtBeingHitNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtBeingHitNotify.newBuilder() to construct.
    private EvtBeingHitNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtBeingHitNotify() {
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtBeingHitNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.class, emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.Builder.class);
    }

    private int bitField0_;
    public static final int FORWARD_TYPE_FIELD_NUMBER = 9;
    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 9;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType() {
      emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType result = emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
      return result == null ? emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
    }

    public static final int BEING_HIT_INFO_FIELD_NUMBER = 4;
    private emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo beingHitInfo_;
    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     * @return Whether the beingHitInfo field is set.
     */
    @java.lang.Override
    public boolean hasBeingHitInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     * @return The beingHitInfo.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo() {
      return beingHitInfo_ == null ? emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : beingHitInfo_;
    }
    /**
     * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder() {
      return beingHitInfo_ == null ? emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : beingHitInfo_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(4, getBeingHitInfo());
      }
      if (forwardType_ != emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(9, forwardType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getBeingHitInfo());
      }
      if (forwardType_ != emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(9, forwardType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify other = (emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify) obj;

      if (forwardType_ != other.forwardType_) return false;
      if (hasBeingHitInfo() != other.hasBeingHitInfo()) return false;
      if (hasBeingHitInfo()) {
        if (!getBeingHitInfo()
            .equals(other.getBeingHitInfo())) return false;
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
      hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      if (hasBeingHitInfo()) {
        hash = (37 * hash) + BEING_HIT_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBeingHitInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify prototype) {
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
     * CmdId: 8650
     * Obf: OPODPPOAPKP
     * </pre>
     *
     * Protobuf type {@code EvtBeingHitNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtBeingHitNotify)
        emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.class, emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.newBuilder()
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
          getBeingHitInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        forwardType_ = 0;
        beingHitInfo_ = null;
        if (beingHitInfoBuilder_ != null) {
          beingHitInfoBuilder_.dispose();
          beingHitInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.internal_static_EvtBeingHitNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify build() {
        emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify buildPartial() {
        emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify result = new emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.forwardType_ = forwardType_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.beingHitInfo_ = beingHitInfoBuilder_ == null
              ? beingHitInfo_
              : beingHitInfoBuilder_.build();
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
        if (other instanceof emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify other) {
        if (other == emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify.getDefaultInstance()) return this;
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
        }
        if (other.hasBeingHitInfo()) {
          mergeBeingHitInfo(other.getBeingHitInfo());
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
              case 34: {
                input.readMessage(
                    getBeingHitInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 34
              case 72: {
                forwardType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        forwardType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType getForwardType() {
        emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType result = emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
        return result == null ? emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.protoshift.net.oldproto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forward_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        forwardType_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo beingHitInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> beingHitInfoBuilder_;
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       * @return Whether the beingHitInfo field is set.
       */
      public boolean hasBeingHitInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       * @return The beingHitInfo.
       */
      public emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo getBeingHitInfo() {
        if (beingHitInfoBuilder_ == null) {
          return beingHitInfo_ == null ? emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : beingHitInfo_;
        } else {
          return beingHitInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public Builder setBeingHitInfo(emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
        if (beingHitInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          beingHitInfo_ = value;
        } else {
          beingHitInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public Builder setBeingHitInfo(
          emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder builderForValue) {
        if (beingHitInfoBuilder_ == null) {
          beingHitInfo_ = builderForValue.build();
        } else {
          beingHitInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public Builder mergeBeingHitInfo(emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo value) {
        if (beingHitInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            beingHitInfo_ != null &&
            beingHitInfo_ != emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance()) {
            getBeingHitInfoBuilder().mergeFrom(value);
          } else {
            beingHitInfo_ = value;
          }
        } else {
          beingHitInfoBuilder_.mergeFrom(value);
        }
        if (beingHitInfo_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public Builder clearBeingHitInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        beingHitInfo_ = null;
        if (beingHitInfoBuilder_ != null) {
          beingHitInfoBuilder_.dispose();
          beingHitInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder getBeingHitInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getBeingHitInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      public emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder getBeingHitInfoOrBuilder() {
        if (beingHitInfoBuilder_ != null) {
          return beingHitInfoBuilder_.getMessageOrBuilder();
        } else {
          return beingHitInfo_ == null ?
              emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.getDefaultInstance() : beingHitInfo_;
        }
      }
      /**
       * <code>.EvtBeingHitInfo being_hit_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder> 
          getBeingHitInfoFieldBuilder() {
        if (beingHitInfoBuilder_ == null) {
          beingHitInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfo.Builder, emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.EvtBeingHitInfoOrBuilder>(
                  getBeingHitInfo(),
                  getParentForChildren(),
                  isClean());
          beingHitInfo_ = null;
        }
        return beingHitInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EvtBeingHitNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtBeingHitNotify)
    private static final emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify();
    }

    public static emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtBeingHitNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtBeingHitNotify>() {
      @java.lang.Override
      public EvtBeingHitNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtBeingHitNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtBeingHitNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.EvtBeingHitNotifyOuterClass.EvtBeingHitNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtBeingHitNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtBeingHitNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EvtBeingHitNotify.proto\032\021ForwardType.p" +
      "roto\032\025EvtBeingHitInfo.proto\"a\n\021EvtBeingH" +
      "itNotify\022\"\n\014forward_type\030\t \001(\0162\014.Forward" +
      "Type\022(\n\016being_hit_info\030\004 \001(\0132\020.EvtBeingH" +
      "itInfoB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.ForwardTypeOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.getDescriptor(),
        });
    internal_static_EvtBeingHitNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtBeingHitNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtBeingHitNotify_descriptor,
        new java.lang.String[] { "ForwardType", "BeingHitInfo", });
    emu.protoshift.net.oldproto.ForwardTypeOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.EvtBeingHitInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
