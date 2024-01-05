// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeMarkPointNPCData.proto

package emu.protoshift.net.oldproto;

public final class HomeMarkPointNPCDataOuterClass {
  private HomeMarkPointNPCDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeMarkPointNPCDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeMarkPointNPCData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>uint32 costume_id = 2;</code>
     * @return The costumeId.
     */
    int getCostumeId();
  }
  /**
   * Protobuf type {@code HomeMarkPointNPCData}
   */
  public static final class HomeMarkPointNPCData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeMarkPointNPCData)
      HomeMarkPointNPCDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeMarkPointNPCData.newBuilder() to construct.
    private HomeMarkPointNPCData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeMarkPointNPCData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeMarkPointNPCData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.internal_static_HomeMarkPointNPCData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.internal_static_HomeMarkPointNPCData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.class, emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder.class);
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 1;
    private int avatarId_ = 0;
    /**
     * <code>uint32 avatar_id = 1;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int COSTUME_ID_FIELD_NUMBER = 2;
    private int costumeId_ = 0;
    /**
     * <code>uint32 costume_id = 2;</code>
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
      if (avatarId_ != 0) {
        output.writeUInt32(1, avatarId_);
      }
      if (costumeId_ != 0) {
        output.writeUInt32(2, costumeId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, avatarId_);
      }
      if (costumeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, costumeId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData other = (emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData) obj;

      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + COSTUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCostumeId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData prototype) {
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
     * Protobuf type {@code HomeMarkPointNPCData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeMarkPointNPCData)
        emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.internal_static_HomeMarkPointNPCData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.internal_static_HomeMarkPointNPCData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.class, emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.newBuilder()
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
        avatarId_ = 0;
        costumeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.internal_static_HomeMarkPointNPCData_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData build() {
        emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData buildPartial() {
        emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData result = new emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarId_ = avatarId_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData other) {
        if (other == emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData.getDefaultInstance()) return this;
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
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
              case 8: {
                avatarId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                costumeId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {

        avatarId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private int costumeId_ ;
      /**
       * <code>uint32 costume_id = 2;</code>
       * @return The costumeId.
       */
      @java.lang.Override
      public int getCostumeId() {
        return costumeId_;
      }
      /**
       * <code>uint32 costume_id = 2;</code>
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
       * <code>uint32 costume_id = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeMarkPointNPCData)
    }

    // @@protoc_insertion_point(class_scope:HomeMarkPointNPCData)
    private static final emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData();
    }

    public static emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeMarkPointNPCData>
        PARSER = new com.google.protobuf.AbstractParser<HomeMarkPointNPCData>() {
      @java.lang.Override
      public HomeMarkPointNPCData parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeMarkPointNPCData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeMarkPointNPCData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeMarkPointNPCDataOuterClass.HomeMarkPointNPCData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeMarkPointNPCData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeMarkPointNPCData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032HomeMarkPointNPCData.proto\"=\n\024HomeMark" +
      "PointNPCData\022\021\n\tavatar_id\030\001 \001(\r\022\022\n\ncostu" +
      "me_id\030\002 \001(\rB\035\n\033emu.protoshift.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeMarkPointNPCData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeMarkPointNPCData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeMarkPointNPCData_descriptor,
        new java.lang.String[] { "AvatarId", "CostumeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
