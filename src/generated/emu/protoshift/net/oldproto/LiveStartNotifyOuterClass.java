// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LiveStartNotify.proto

package emu.protoshift.net.oldproto;

public final class LiveStartNotifyOuterClass {
  private LiveStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LiveStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LiveStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 live_id = 3;</code>
     * @return The liveId.
     */
    int getLiveId();
  }
  /**
   * <pre>
   * Obf: HHADHIBOHBK
   * </pre>
   *
   * Protobuf type {@code LiveStartNotify}
   */
  public static final class LiveStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LiveStartNotify)
      LiveStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LiveStartNotify.newBuilder() to construct.
    private LiveStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LiveStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LiveStartNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.internal_static_LiveStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.internal_static_LiveStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.class, emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.Builder.class);
    }

    public static final int LIVE_ID_FIELD_NUMBER = 3;
    private int liveId_ = 0;
    /**
     * <code>uint32 live_id = 3;</code>
     * @return The liveId.
     */
    @java.lang.Override
    public int getLiveId() {
      return liveId_;
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
      if (liveId_ != 0) {
        output.writeUInt32(3, liveId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (liveId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, liveId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify other = (emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify) obj;

      if (getLiveId()
          != other.getLiveId()) return false;
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
      hash = (37 * hash) + LIVE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLiveId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify prototype) {
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
     * Obf: HHADHIBOHBK
     * </pre>
     *
     * Protobuf type {@code LiveStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LiveStartNotify)
        emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.internal_static_LiveStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.internal_static_LiveStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.class, emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.newBuilder()
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
        liveId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.internal_static_LiveStartNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify build() {
        emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify buildPartial() {
        emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify result = new emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.liveId_ = liveId_;
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
        if (other instanceof emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify other) {
        if (other == emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify.getDefaultInstance()) return this;
        if (other.getLiveId() != 0) {
          setLiveId(other.getLiveId());
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
                liveId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
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

      private int liveId_ ;
      /**
       * <code>uint32 live_id = 3;</code>
       * @return The liveId.
       */
      @java.lang.Override
      public int getLiveId() {
        return liveId_;
      }
      /**
       * <code>uint32 live_id = 3;</code>
       * @param value The liveId to set.
       * @return This builder for chaining.
       */
      public Builder setLiveId(int value) {

        liveId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 live_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLiveId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        liveId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LiveStartNotify)
    }

    // @@protoc_insertion_point(class_scope:LiveStartNotify)
    private static final emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify();
    }

    public static emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LiveStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<LiveStartNotify>() {
      @java.lang.Override
      public LiveStartNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<LiveStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LiveStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.LiveStartNotifyOuterClass.LiveStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LiveStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LiveStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025LiveStartNotify.proto\"\"\n\017LiveStartNoti" +
      "fy\022\017\n\007live_id\030\003 \001(\rB\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LiveStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LiveStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LiveStartNotify_descriptor,
        new java.lang.String[] { "LiveId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
