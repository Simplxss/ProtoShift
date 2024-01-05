// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnchorPointOpRsp.proto

package emu.protoshift.net.oldproto;

public final class AnchorPointOpRspOuterClass {
  private AnchorPointOpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnchorPointOpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnchorPointOpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 anchor_point_id = 2;</code>
     * @return The anchorPointId.
     */
    int getAnchorPointId();

    /**
     * <code>uint32 anchor_point_op_type = 7;</code>
     * @return The anchorPointOpType.
     */
    int getAnchorPointOpType();
  }
  /**
   * <pre>
   * Obf: DELBDBAHPJJ
   * </pre>
   *
   * Protobuf type {@code AnchorPointOpRsp}
   */
  public static final class AnchorPointOpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnchorPointOpRsp)
      AnchorPointOpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnchorPointOpRsp.newBuilder() to construct.
    private AnchorPointOpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnchorPointOpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnchorPointOpRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.class, emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.Builder.class);
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

    public static final int ANCHOR_POINT_ID_FIELD_NUMBER = 2;
    private int anchorPointId_ = 0;
    /**
     * <code>uint32 anchor_point_id = 2;</code>
     * @return The anchorPointId.
     */
    @java.lang.Override
    public int getAnchorPointId() {
      return anchorPointId_;
    }

    public static final int ANCHOR_POINT_OP_TYPE_FIELD_NUMBER = 7;
    private int anchorPointOpType_ = 0;
    /**
     * <code>uint32 anchor_point_op_type = 7;</code>
     * @return The anchorPointOpType.
     */
    @java.lang.Override
    public int getAnchorPointOpType() {
      return anchorPointOpType_;
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
      if (anchorPointId_ != 0) {
        output.writeUInt32(2, anchorPointId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (anchorPointOpType_ != 0) {
        output.writeUInt32(7, anchorPointOpType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (anchorPointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, anchorPointId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (anchorPointOpType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, anchorPointOpType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp other = (emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getAnchorPointId()
          != other.getAnchorPointId()) return false;
      if (getAnchorPointOpType()
          != other.getAnchorPointOpType()) return false;
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
      hash = (37 * hash) + ANCHOR_POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointId();
      hash = (37 * hash) + ANCHOR_POINT_OP_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorPointOpType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp prototype) {
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
     * Obf: DELBDBAHPJJ
     * </pre>
     *
     * Protobuf type {@code AnchorPointOpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnchorPointOpRsp)
        emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.class, emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.newBuilder()
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
        anchorPointId_ = 0;
        anchorPointOpType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.internal_static_AnchorPointOpRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp build() {
        emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp buildPartial() {
        emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp result = new emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.anchorPointId_ = anchorPointId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.anchorPointOpType_ = anchorPointOpType_;
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
        if (other instanceof emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp other) {
        if (other == emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getAnchorPointId() != 0) {
          setAnchorPointId(other.getAnchorPointId());
        }
        if (other.getAnchorPointOpType() != 0) {
          setAnchorPointOpType(other.getAnchorPointOpType());
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
                anchorPointId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 48: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 56: {
                anchorPointOpType_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointId_ ;
      /**
       * <code>uint32 anchor_point_id = 2;</code>
       * @return The anchorPointId.
       */
      @java.lang.Override
      public int getAnchorPointId() {
        return anchorPointId_;
      }
      /**
       * <code>uint32 anchor_point_id = 2;</code>
       * @param value The anchorPointId to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointId(int value) {

        anchorPointId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        anchorPointId_ = 0;
        onChanged();
        return this;
      }

      private int anchorPointOpType_ ;
      /**
       * <code>uint32 anchor_point_op_type = 7;</code>
       * @return The anchorPointOpType.
       */
      @java.lang.Override
      public int getAnchorPointOpType() {
        return anchorPointOpType_;
      }
      /**
       * <code>uint32 anchor_point_op_type = 7;</code>
       * @param value The anchorPointOpType to set.
       * @return This builder for chaining.
       */
      public Builder setAnchorPointOpType(int value) {

        anchorPointOpType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 anchor_point_op_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAnchorPointOpType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        anchorPointOpType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AnchorPointOpRsp)
    }

    // @@protoc_insertion_point(class_scope:AnchorPointOpRsp)
    private static final emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp();
    }

    public static emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnchorPointOpRsp>
        PARSER = new com.google.protobuf.AbstractParser<AnchorPointOpRsp>() {
      @java.lang.Override
      public AnchorPointOpRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AnchorPointOpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnchorPointOpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AnchorPointOpRspOuterClass.AnchorPointOpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnchorPointOpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnchorPointOpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AnchorPointOpRsp.proto\"Z\n\020AnchorPointO" +
      "pRsp\022\017\n\007retcode\030\006 \001(\005\022\027\n\017anchor_point_id" +
      "\030\002 \001(\r\022\034\n\024anchor_point_op_type\030\007 \001(\rB\035\n\033" +
      "emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnchorPointOpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnchorPointOpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnchorPointOpRsp_descriptor,
        new java.lang.String[] { "Retcode", "AnchorPointId", "AnchorPointOpType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
