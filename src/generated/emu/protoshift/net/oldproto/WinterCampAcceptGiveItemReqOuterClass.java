// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampAcceptGiveItemReq.proto

package emu.protoshift.net.oldproto;

public final class WinterCampAcceptGiveItemReqOuterClass {
  private WinterCampAcceptGiveItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampAcceptGiveItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampAcceptGiveItemReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Obf: CCNKNDEFNKO
   * </pre>
   *
   * Protobuf type {@code WinterCampAcceptGiveItemReq}
   */
  public static final class WinterCampAcceptGiveItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampAcceptGiveItemReq)
      WinterCampAcceptGiveItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampAcceptGiveItemReq.newBuilder() to construct.
    private WinterCampAcceptGiveItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampAcceptGiveItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampAcceptGiveItemReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.class, emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 4;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 4;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      if (uid_ != 0) {
        output.writeUInt32(4, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, uid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq other = (emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq) obj;

      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq prototype) {
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
     * Obf: CCNKNDEFNKO
     * </pre>
     *
     * Protobuf type {@code WinterCampAcceptGiveItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampAcceptGiveItemReq)
        emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.class, emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.newBuilder()
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
        uid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.internal_static_WinterCampAcceptGiveItemReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq build() {
        emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq buildPartial() {
        emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq result = new emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
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
        if (other instanceof emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq) {
          return mergeFrom((emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq other) {
        if (other == emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
              case 32: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 4;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WinterCampAcceptGiveItemReq)
    }

    // @@protoc_insertion_point(class_scope:WinterCampAcceptGiveItemReq)
    private static final emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq();
    }

    public static emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampAcceptGiveItemReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampAcceptGiveItemReq>() {
      @java.lang.Override
      public WinterCampAcceptGiveItemReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampAcceptGiveItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampAcceptGiveItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WinterCampAcceptGiveItemReqOuterClass.WinterCampAcceptGiveItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampAcceptGiveItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!WinterCampAcceptGiveItemReq.proto\"*\n\033W" +
      "interCampAcceptGiveItemReq\022\013\n\003uid\030\004 \001(\rB" +
      "\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampAcceptGiveItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampAcceptGiveItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampAcceptGiveItemReq_descriptor,
        new java.lang.String[] { "Uid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
