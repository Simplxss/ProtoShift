// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartBuoyantCombatGalleryRsp.proto

package emu.protoshift.net.oldproto;

public final class StartBuoyantCombatGalleryRspOuterClass {
  private StartBuoyantCombatGalleryRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartBuoyantCombatGalleryRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartBuoyantCombatGalleryRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 gallery_level = 15;</code>
     * @return The galleryLevel.
     */
    int getGalleryLevel();
  }
  /**
   * <pre>
   * Obf: GAMICAFALCB
   * </pre>
   *
   * Protobuf type {@code StartBuoyantCombatGalleryRsp}
   */
  public static final class StartBuoyantCombatGalleryRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartBuoyantCombatGalleryRsp)
      StartBuoyantCombatGalleryRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartBuoyantCombatGalleryRsp.newBuilder() to construct.
    private StartBuoyantCombatGalleryRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartBuoyantCombatGalleryRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartBuoyantCombatGalleryRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.internal_static_StartBuoyantCombatGalleryRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.internal_static_StartBuoyantCombatGalleryRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.class, emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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

    public static final int GALLERY_LEVEL_FIELD_NUMBER = 15;
    private int galleryLevel_ = 0;
    /**
     * <code>uint32 gallery_level = 15;</code>
     * @return The galleryLevel.
     */
    @java.lang.Override
    public int getGalleryLevel() {
      return galleryLevel_;
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
        output.writeInt32(3, retcode_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (galleryLevel_ != 0) {
        output.writeUInt32(15, galleryLevel_);
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
          .computeInt32Size(3, retcode_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (galleryLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, galleryLevel_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp other = (emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGalleryLevel()
          != other.getGalleryLevel()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GALLERY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp prototype) {
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
     * Obf: GAMICAFALCB
     * </pre>
     *
     * Protobuf type {@code StartBuoyantCombatGalleryRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartBuoyantCombatGalleryRsp)
        emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.internal_static_StartBuoyantCombatGalleryRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.internal_static_StartBuoyantCombatGalleryRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.class, emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.newBuilder()
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
        galleryId_ = 0;
        retcode_ = 0;
        galleryLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.internal_static_StartBuoyantCombatGalleryRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp build() {
        emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp buildPartial() {
        emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp result = new emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.galleryId_ = galleryId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.galleryLevel_ = galleryLevel_;
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
        if (other instanceof emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp other) {
        if (other == emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGalleryLevel() != 0) {
          setGalleryLevel(other.getGalleryLevel());
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
              case 24: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 88: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 120: {
                galleryLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 120
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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {

        galleryId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        galleryId_ = 0;
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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int galleryLevel_ ;
      /**
       * <code>uint32 gallery_level = 15;</code>
       * @return The galleryLevel.
       */
      @java.lang.Override
      public int getGalleryLevel() {
        return galleryLevel_;
      }
      /**
       * <code>uint32 gallery_level = 15;</code>
       * @param value The galleryLevel to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryLevel(int value) {

        galleryLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_level = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        galleryLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartBuoyantCombatGalleryRsp)
    }

    // @@protoc_insertion_point(class_scope:StartBuoyantCombatGalleryRsp)
    private static final emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp();
    }

    public static emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartBuoyantCombatGalleryRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartBuoyantCombatGalleryRsp>() {
      @java.lang.Override
      public StartBuoyantCombatGalleryRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<StartBuoyantCombatGalleryRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartBuoyantCombatGalleryRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.StartBuoyantCombatGalleryRspOuterClass.StartBuoyantCombatGalleryRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartBuoyantCombatGalleryRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartBuoyantCombatGalleryRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"StartBuoyantCombatGalleryRsp.proto\"Z\n\034" +
      "StartBuoyantCombatGalleryRsp\022\022\n\ngallery_" +
      "id\030\013 \001(\r\022\017\n\007retcode\030\003 \001(\005\022\025\n\rgallery_lev" +
      "el\030\017 \001(\rB\035\n\033emu.protoshift.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartBuoyantCombatGalleryRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartBuoyantCombatGalleryRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartBuoyantCombatGalleryRsp_descriptor,
        new java.lang.String[] { "GalleryId", "Retcode", "GalleryLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
