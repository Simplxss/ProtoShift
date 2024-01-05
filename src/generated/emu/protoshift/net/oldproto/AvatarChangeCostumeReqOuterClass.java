// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarChangeCostumeReq.proto

package emu.protoshift.net.oldproto;

public final class AvatarChangeCostumeReqOuterClass {
  private AvatarChangeCostumeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarChangeCostumeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarChangeCostumeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 costume_id = 5;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * <pre>
   * Obf: IMDCBJNFILE
   * </pre>
   *
   * Protobuf type {@code AvatarChangeCostumeReq}
   */
  public static final class AvatarChangeCostumeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarChangeCostumeReq)
      AvatarChangeCostumeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarChangeCostumeReq.newBuilder() to construct.
    private AvatarChangeCostumeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarChangeCostumeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarChangeCostumeReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.internal_static_AvatarChangeCostumeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.internal_static_AvatarChangeCostumeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.class, emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 13;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 13;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 5;
    private int costumeId_ = 0;
    /**
     * <code>uint32 costume_id = 5;</code>
     * @return The costumeId.
     */
    @java.lang.Override
    public int getCostumeId() {
      return costumeId_;
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
      if (costumeId_ != 0) {
        output.writeUInt32(5, costumeId_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(13, avatarGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, costumeId_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(13, avatarGuid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq other = (emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getCostumeId()
          != other.getCostumeId()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq prototype) {
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
     * Obf: IMDCBJNFILE
     * </pre>
     *
     * Protobuf type {@code AvatarChangeCostumeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarChangeCostumeReq)
        emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.internal_static_AvatarChangeCostumeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.internal_static_AvatarChangeCostumeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.class, emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.newBuilder()
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
        avatarGuid_ = 0L;
        costumeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.internal_static_AvatarChangeCostumeReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq build() {
        emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq buildPartial() {
        emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq result = new emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.costumeId_ = costumeId_;
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
        if (other instanceof emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq) {
          return mergeFrom((emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq other) {
        if (other == emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getCostumeId() != 0) {
          setCostumeId(other.getCostumeId());
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
                costumeId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 104: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 5;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 5;</code>
       * @param value The costumeId to set.
       * @return This builder for chaining.
       */
      public Builder setCostumeId(int value) {

        costumeId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costume_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostumeId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        costumeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarChangeCostumeReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarChangeCostumeReq)
    private static final emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq();
    }

    public static emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarChangeCostumeReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarChangeCostumeReq>() {
      @java.lang.Override
      public AvatarChangeCostumeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarChangeCostumeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarChangeCostumeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarChangeCostumeReqOuterClass.AvatarChangeCostumeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarChangeCostumeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarChangeCostumeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarChangeCostumeReq.proto\"A\n\026Avatar" +
      "ChangeCostumeReq\022\023\n\013avatar_guid\030\r \001(\004\022\022\n" +
      "\ncostume_id\030\005 \001(\rB\035\n\033emu.protoshift.net." +
      "oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarChangeCostumeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarChangeCostumeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarChangeCostumeReq_descriptor,
        new java.lang.String[] { "AvatarGuid", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
