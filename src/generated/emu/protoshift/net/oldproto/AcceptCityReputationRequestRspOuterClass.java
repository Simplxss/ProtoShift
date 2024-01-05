// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AcceptCityReputationRequestRsp.proto

package emu.protoshift.net.oldproto;

public final class AcceptCityReputationRequestRspOuterClass {
  private AcceptCityReputationRequestRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AcceptCityReputationRequestRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AcceptCityReputationRequestRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 request_id = 1;</code>
     * @return The requestId.
     */
    int getRequestId();

    /**
     * <code>uint32 city_id = 5;</code>
     * @return The cityId.
     */
    int getCityId();
  }
  /**
   * <pre>
   * Obf: GLPNFBBJODP
   * </pre>
   *
   * Protobuf type {@code AcceptCityReputationRequestRsp}
   */
  public static final class AcceptCityReputationRequestRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AcceptCityReputationRequestRsp)
      AcceptCityReputationRequestRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AcceptCityReputationRequestRsp.newBuilder() to construct.
    private AcceptCityReputationRequestRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AcceptCityReputationRequestRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AcceptCityReputationRequestRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.internal_static_AcceptCityReputationRequestRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.internal_static_AcceptCityReputationRequestRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.class, emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.Builder.class);
    }

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

    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private int requestId_ = 0;
    /**
     * <code>uint32 request_id = 1;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
    }

    public static final int CITY_ID_FIELD_NUMBER = 5;
    private int cityId_ = 0;
    /**
     * <code>uint32 city_id = 5;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
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
      if (requestId_ != 0) {
        output.writeUInt32(1, requestId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (cityId_ != 0) {
        output.writeUInt32(5, cityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (requestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, requestId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, cityId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp other = (emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getRequestId()
          != other.getRequestId()) return false;
      if (getCityId()
          != other.getCityId()) return false;
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
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId();
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp prototype) {
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
     * Obf: GLPNFBBJODP
     * </pre>
     *
     * Protobuf type {@code AcceptCityReputationRequestRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AcceptCityReputationRequestRsp)
        emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.internal_static_AcceptCityReputationRequestRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.internal_static_AcceptCityReputationRequestRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.class, emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.newBuilder()
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
        retcode_ = 0;
        requestId_ = 0;
        cityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.internal_static_AcceptCityReputationRequestRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp build() {
        emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp buildPartial() {
        emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp result = new emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.requestId_ = requestId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.cityId_ = cityId_;
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
        if (other instanceof emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp other) {
        if (other == emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getRequestId() != 0) {
          setRequestId(other.getRequestId());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
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
                requestId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 40: {
                cityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
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

      private int requestId_ ;
      /**
       * <code>uint32 request_id = 1;</code>
       * @return The requestId.
       */
      @java.lang.Override
      public int getRequestId() {
        return requestId_;
      }
      /**
       * <code>uint32 request_id = 1;</code>
       * @param value The requestId to set.
       * @return This builder for chaining.
       */
      public Builder setRequestId(int value) {

        requestId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 request_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        requestId_ = 0;
        onChanged();
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 5;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 5;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {

        cityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AcceptCityReputationRequestRsp)
    }

    // @@protoc_insertion_point(class_scope:AcceptCityReputationRequestRsp)
    private static final emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp();
    }

    public static emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AcceptCityReputationRequestRsp>
        PARSER = new com.google.protobuf.AbstractParser<AcceptCityReputationRequestRsp>() {
      @java.lang.Override
      public AcceptCityReputationRequestRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AcceptCityReputationRequestRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AcceptCityReputationRequestRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AcceptCityReputationRequestRspOuterClass.AcceptCityReputationRequestRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AcceptCityReputationRequestRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AcceptCityReputationRequestRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$AcceptCityReputationRequestRsp.proto\"V" +
      "\n\036AcceptCityReputationRequestRsp\022\017\n\007retc" +
      "ode\030\002 \001(\005\022\022\n\nrequest_id\030\001 \001(\r\022\017\n\007city_id" +
      "\030\005 \001(\rB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AcceptCityReputationRequestRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AcceptCityReputationRequestRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AcceptCityReputationRequestRsp_descriptor,
        new java.lang.String[] { "Retcode", "RequestId", "CityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
