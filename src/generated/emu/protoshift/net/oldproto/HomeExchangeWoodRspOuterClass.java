// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeExchangeWoodRsp.proto

package emu.protoshift.net.oldproto;

public final class HomeExchangeWoodRspOuterClass {
  private HomeExchangeWoodRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeExchangeWoodRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeExchangeWoodRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 wood_count = 1;</code>
     * @return The woodCount.
     */
    int getWoodCount();

    /**
     * <code>uint32 wood_id = 8;</code>
     * @return The woodId.
     */
    int getWoodId();

    /**
     * <code>uint32 exchangedCount = 11;</code>
     * @return The exchangedCount.
     */
    int getExchangedCount();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: EIPIMMDNAAI
   * </pre>
   *
   * Protobuf type {@code HomeExchangeWoodRsp}
   */
  public static final class HomeExchangeWoodRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeExchangeWoodRsp)
      HomeExchangeWoodRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeExchangeWoodRsp.newBuilder() to construct.
    private HomeExchangeWoodRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeExchangeWoodRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeExchangeWoodRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.class, emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.Builder.class);
    }

    public static final int WOOD_COUNT_FIELD_NUMBER = 1;
    private int woodCount_ = 0;
    /**
     * <code>uint32 wood_count = 1;</code>
     * @return The woodCount.
     */
    @java.lang.Override
    public int getWoodCount() {
      return woodCount_;
    }

    public static final int WOOD_ID_FIELD_NUMBER = 8;
    private int woodId_ = 0;
    /**
     * <code>uint32 wood_id = 8;</code>
     * @return The woodId.
     */
    @java.lang.Override
    public int getWoodId() {
      return woodId_;
    }

    public static final int EXCHANGEDCOUNT_FIELD_NUMBER = 11;
    private int exchangedCount_ = 0;
    /**
     * <code>uint32 exchangedCount = 11;</code>
     * @return The exchangedCount.
     */
    @java.lang.Override
    public int getExchangedCount() {
      return exchangedCount_;
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 3;</code>
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
      if (woodCount_ != 0) {
        output.writeUInt32(1, woodCount_);
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      if (woodId_ != 0) {
        output.writeUInt32(8, woodId_);
      }
      if (exchangedCount_ != 0) {
        output.writeUInt32(11, exchangedCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (woodCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, woodCount_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      if (woodId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, woodId_);
      }
      if (exchangedCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, exchangedCount_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp other = (emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp) obj;

      if (getWoodCount()
          != other.getWoodCount()) return false;
      if (getWoodId()
          != other.getWoodId()) return false;
      if (getExchangedCount()
          != other.getExchangedCount()) return false;
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
      hash = (37 * hash) + WOOD_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getWoodCount();
      hash = (37 * hash) + WOOD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWoodId();
      hash = (37 * hash) + EXCHANGEDCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getExchangedCount();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp prototype) {
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
     * Obf: EIPIMMDNAAI
     * </pre>
     *
     * Protobuf type {@code HomeExchangeWoodRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeExchangeWoodRsp)
        emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.class, emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.newBuilder()
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
        woodCount_ = 0;
        woodId_ = 0;
        exchangedCount_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.internal_static_HomeExchangeWoodRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp build() {
        emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp buildPartial() {
        emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp result = new emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.woodCount_ = woodCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.woodId_ = woodId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.exchangedCount_ = exchangedCount_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp other) {
        if (other == emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp.getDefaultInstance()) return this;
        if (other.getWoodCount() != 0) {
          setWoodCount(other.getWoodCount());
        }
        if (other.getWoodId() != 0) {
          setWoodId(other.getWoodId());
        }
        if (other.getExchangedCount() != 0) {
          setExchangedCount(other.getExchangedCount());
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
              case 8: {
                woodCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 24: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 24
              case 64: {
                woodId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 88: {
                exchangedCount_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
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

      private int woodCount_ ;
      /**
       * <code>uint32 wood_count = 1;</code>
       * @return The woodCount.
       */
      @java.lang.Override
      public int getWoodCount() {
        return woodCount_;
      }
      /**
       * <code>uint32 wood_count = 1;</code>
       * @param value The woodCount to set.
       * @return This builder for chaining.
       */
      public Builder setWoodCount(int value) {

        woodCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wood_count = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearWoodCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        woodCount_ = 0;
        onChanged();
        return this;
      }

      private int woodId_ ;
      /**
       * <code>uint32 wood_id = 8;</code>
       * @return The woodId.
       */
      @java.lang.Override
      public int getWoodId() {
        return woodId_;
      }
      /**
       * <code>uint32 wood_id = 8;</code>
       * @param value The woodId to set.
       * @return This builder for chaining.
       */
      public Builder setWoodId(int value) {

        woodId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wood_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearWoodId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        woodId_ = 0;
        onChanged();
        return this;
      }

      private int exchangedCount_ ;
      /**
       * <code>uint32 exchangedCount = 11;</code>
       * @return The exchangedCount.
       */
      @java.lang.Override
      public int getExchangedCount() {
        return exchangedCount_;
      }
      /**
       * <code>uint32 exchangedCount = 11;</code>
       * @param value The exchangedCount to set.
       * @return This builder for chaining.
       */
      public Builder setExchangedCount(int value) {

        exchangedCount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 exchangedCount = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearExchangedCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        exchangedCount_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
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
       * <code>int32 retcode = 3;</code>
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


      // @@protoc_insertion_point(builder_scope:HomeExchangeWoodRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeExchangeWoodRsp)
    private static final emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp();
    }

    public static emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeExchangeWoodRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeExchangeWoodRsp>() {
      @java.lang.Override
      public HomeExchangeWoodRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeExchangeWoodRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeExchangeWoodRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeExchangeWoodRspOuterClass.HomeExchangeWoodRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeExchangeWoodRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeExchangeWoodRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomeExchangeWoodRsp.proto\"c\n\023HomeExcha" +
      "ngeWoodRsp\022\022\n\nwood_count\030\001 \001(\r\022\017\n\007wood_i" +
      "d\030\010 \001(\r\022\026\n\016exchangedCount\030\013 \001(\r\022\017\n\007retco" +
      "de\030\003 \001(\005B\035\n\033emu.protoshift.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeExchangeWoodRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeExchangeWoodRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeExchangeWoodRsp_descriptor,
        new java.lang.String[] { "WoodCount", "WoodId", "ExchangedCount", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
