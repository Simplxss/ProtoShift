// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicGameStartReq.proto

package emu.protoshift.net.oldproto;

public final class FleurFairMusicGameStartReqOuterClass {
  private FleurFairMusicGameStartReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairMusicGameStartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairMusicGameStartReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 music_basic_id = 15;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();
  }
  /**
   * <pre>
   * Obf: NPLCMDAPCHP
   * </pre>
   *
   * Protobuf type {@code FleurFairMusicGameStartReq}
   */
  public static final class FleurFairMusicGameStartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairMusicGameStartReq)
      FleurFairMusicGameStartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairMusicGameStartReq.newBuilder() to construct.
    private FleurFairMusicGameStartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairMusicGameStartReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairMusicGameStartReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.class, emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.Builder.class);
    }

    public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 15;
    private int musicBasicId_ = 0;
    /**
     * <code>uint32 music_basic_id = 15;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
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
      if (musicBasicId_ != 0) {
        output.writeUInt32(15, musicBasicId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, musicBasicId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq other = (emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq) obj;

      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
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
      hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq prototype) {
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
     * Obf: NPLCMDAPCHP
     * </pre>
     *
     * Protobuf type {@code FleurFairMusicGameStartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairMusicGameStartReq)
        emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.class, emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.newBuilder()
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
        musicBasicId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.internal_static_FleurFairMusicGameStartReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq build() {
        emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq buildPartial() {
        emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq result = new emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.musicBasicId_ = musicBasicId_;
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
        if (other instanceof emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq) {
          return mergeFrom((emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq other) {
        if (other == emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq.getDefaultInstance()) return this;
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
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
              case 120: {
                musicBasicId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int musicBasicId_ ;
      /**
       * <code>uint32 music_basic_id = 15;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 music_basic_id = 15;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {

        musicBasicId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_basic_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        musicBasicId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FleurFairMusicGameStartReq)
    }

    // @@protoc_insertion_point(class_scope:FleurFairMusicGameStartReq)
    private static final emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq();
    }

    public static emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairMusicGameStartReq>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairMusicGameStartReq>() {
      @java.lang.Override
      public FleurFairMusicGameStartReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FleurFairMusicGameStartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairMusicGameStartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FleurFairMusicGameStartReqOuterClass.FleurFairMusicGameStartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameStartReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameStartReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n FleurFairMusicGameStartReq.proto\"4\n\032Fl" +
      "eurFairMusicGameStartReq\022\026\n\016music_basic_" +
      "id\030\017 \001(\rB\035\n\033emu.protoshift.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairMusicGameStartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairMusicGameStartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameStartReq_descriptor,
        new java.lang.String[] { "MusicBasicId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
