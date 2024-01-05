// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindSeedType2Notify.proto

package emu.protoshift.net.oldproto;

public final class WindSeedType2NotifyOuterClass {
  private WindSeedType2NotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindSeedType2NotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindSeedType2Notify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    com.google.protobuf.ByteString getPayload();

    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    int getConfigId();
  }
  /**
   * <pre>
   * Obf: EFBEDIDADAM
   * </pre>
   *
   * Protobuf type {@code WindSeedType2Notify}
   */
  public static final class WindSeedType2Notify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindSeedType2Notify)
      WindSeedType2NotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindSeedType2Notify.newBuilder() to construct.
    private WindSeedType2Notify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindSeedType2Notify() {
      payload_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindSeedType2Notify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.internal_static_WindSeedType2Notify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.internal_static_WindSeedType2Notify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.class, emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 7;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
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
      if (!payload_.isEmpty()) {
        output.writeBytes(2, payload_);
      }
      if (configId_ != 0) {
        output.writeUInt32(7, configId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!payload_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, payload_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, configId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify other = (emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify) obj;

      if (!getPayload()
          .equals(other.getPayload())) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
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
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify prototype) {
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
     * Obf: EFBEDIDADAM
     * </pre>
     *
     * Protobuf type {@code WindSeedType2Notify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindSeedType2Notify)
        emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2NotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.internal_static_WindSeedType2Notify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.internal_static_WindSeedType2Notify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.class, emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.newBuilder()
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
        payload_ = com.google.protobuf.ByteString.EMPTY;
        configId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.internal_static_WindSeedType2Notify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify build() {
        emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify buildPartial() {
        emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify result = new emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.payload_ = payload_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.configId_ = configId_;
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
        if (other instanceof emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify) {
          return mergeFrom((emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify other) {
        if (other == emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify.getDefaultInstance()) return this;
        if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
          setPayload(other.getPayload());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
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
              case 18: {
                payload_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 56: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
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

      private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes payload = 2;</code>
       * @return The payload.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPayload() {
        return payload_;
      }
      /**
       * <code>bytes payload = 2;</code>
       * @param value The payload to set.
       * @return This builder for chaining.
       */
      public Builder setPayload(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        payload_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes payload = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPayload() {
        bitField0_ = (bitField0_ & ~0x00000001);
        payload_ = getDefaultInstance().getPayload();
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 7;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {

        configId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        configId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WindSeedType2Notify)
    }

    // @@protoc_insertion_point(class_scope:WindSeedType2Notify)
    private static final emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify();
    }

    public static emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindSeedType2Notify>
        PARSER = new com.google.protobuf.AbstractParser<WindSeedType2Notify>() {
      @java.lang.Override
      public WindSeedType2Notify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WindSeedType2Notify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindSeedType2Notify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WindSeedType2NotifyOuterClass.WindSeedType2Notify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindSeedType2Notify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindSeedType2Notify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WindSeedType2Notify.proto\"9\n\023WindSeedT" +
      "ype2Notify\022\017\n\007payload\030\002 \001(\014\022\021\n\tconfig_id" +
      "\030\007 \001(\rB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WindSeedType2Notify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindSeedType2Notify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindSeedType2Notify_descriptor,
        new java.lang.String[] { "Payload", "ConfigId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
