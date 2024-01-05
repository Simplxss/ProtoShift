// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KNFDGBHHPDD.proto

package emu.protoshift.net.oldproto;

public final class KNFDGBHHPDDOuterClass {
  private KNFDGBHHPDDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KNFDGBHHPDDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KNFDGBHHPDD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 reason = 5;</code>
     * @return The reason.
     */
    int getReason();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * Protobuf type {@code KNFDGBHHPDD}
   */
  public static final class KNFDGBHHPDD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KNFDGBHHPDD)
      KNFDGBHHPDDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KNFDGBHHPDD.newBuilder() to construct.
    private KNFDGBHHPDD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KNFDGBHHPDD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KNFDGBHHPDD();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.class, emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_ = 0;
    /**
     * <code>int32 reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override
    public int getReason() {
      return reason_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
      if (reason_ != 0) {
        output.writeInt32(5, reason_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, reason_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD other = (emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD) obj;

      if (getReason()
          != other.getReason()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD prototype) {
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
     * Protobuf type {@code KNFDGBHHPDD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KNFDGBHHPDD)
        emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.class, emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.newBuilder()
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
        reason_ = 0;
        isSuccess_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.internal_static_KNFDGBHHPDD_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD build() {
        emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD buildPartial() {
        emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD result = new emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.reason_ = reason_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isSuccess_ = isSuccess_;
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
        if (other instanceof emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD) {
          return mergeFrom((emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD other) {
        if (other == emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD.getDefaultInstance()) return this;
        if (other.getReason() != 0) {
          setReason(other.getReason());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
              case 40: {
                reason_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 96: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private int reason_ ;
      /**
       * <code>int32 reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public int getReason() {
        return reason_;
      }
      /**
       * <code>int32 reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(int value) {

        reason_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000001);
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:KNFDGBHHPDD)
    }

    // @@protoc_insertion_point(class_scope:KNFDGBHHPDD)
    private static final emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD();
    }

    public static emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KNFDGBHHPDD>
        PARSER = new com.google.protobuf.AbstractParser<KNFDGBHHPDD>() {
      @java.lang.Override
      public KNFDGBHHPDD parsePartialFrom(
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

    public static com.google.protobuf.Parser<KNFDGBHHPDD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KNFDGBHHPDD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.KNFDGBHHPDDOuterClass.KNFDGBHHPDD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KNFDGBHHPDD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KNFDGBHHPDD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KNFDGBHHPDD.proto\"1\n\013KNFDGBHHPDD\022\016\n\006re" +
      "ason\030\005 \001(\005\022\022\n\nis_success\030\014 \001(\010B\035\n\033emu.pr" +
      "otoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KNFDGBHHPDD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KNFDGBHHPDD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KNFDGBHHPDD_descriptor,
        new java.lang.String[] { "Reason", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
