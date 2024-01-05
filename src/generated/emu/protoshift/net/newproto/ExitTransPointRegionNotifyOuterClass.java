// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExitTransPointRegionNotify.proto

package emu.protoshift.net.newproto;

public final class ExitTransPointRegionNotifyOuterClass {
  private ExitTransPointRegionNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExitTransPointRegionNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExitTransPointRegionNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 point_id = 7;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * Obf: BBGPGHPCHGN
   * </pre>
   *
   * Protobuf type {@code ExitTransPointRegionNotify}
   */
  public static final class ExitTransPointRegionNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExitTransPointRegionNotify)
      ExitTransPointRegionNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExitTransPointRegionNotify.newBuilder() to construct.
    private ExitTransPointRegionNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExitTransPointRegionNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExitTransPointRegionNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.internal_static_ExitTransPointRegionNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.internal_static_ExitTransPointRegionNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.class, emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.Builder.class);
    }

    public static final int POINT_ID_FIELD_NUMBER = 7;
    private int pointId_ = 0;
    /**
     * <code>uint32 point_id = 7;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 6;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 6;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(6, sceneId_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(7, pointId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sceneId_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, pointId_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify other = (emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify) obj;

      if (getPointId()
          != other.getPointId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify prototype) {
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
     * Obf: BBGPGHPCHGN
     * </pre>
     *
     * Protobuf type {@code ExitTransPointRegionNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExitTransPointRegionNotify)
        emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.internal_static_ExitTransPointRegionNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.internal_static_ExitTransPointRegionNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.class, emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.newBuilder()
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
        pointId_ = 0;
        sceneId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.internal_static_ExitTransPointRegionNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify build() {
        emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify buildPartial() {
        emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify result = new emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pointId_ = pointId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
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
        if (other instanceof emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify) {
          return mergeFrom((emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify other) {
        if (other == emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify.getDefaultInstance()) return this;
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
              case 48: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 56: {
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 7;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 7;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {

        pointId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExitTransPointRegionNotify)
    }

    // @@protoc_insertion_point(class_scope:ExitTransPointRegionNotify)
    private static final emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify();
    }

    public static emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExitTransPointRegionNotify>
        PARSER = new com.google.protobuf.AbstractParser<ExitTransPointRegionNotify>() {
      @java.lang.Override
      public ExitTransPointRegionNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExitTransPointRegionNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExitTransPointRegionNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.ExitTransPointRegionNotifyOuterClass.ExitTransPointRegionNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExitTransPointRegionNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExitTransPointRegionNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ExitTransPointRegionNotify.proto\"@\n\032Ex" +
      "itTransPointRegionNotify\022\020\n\010point_id\030\007 \001" +
      "(\r\022\020\n\010scene_id\030\006 \001(\rB\035\n\033emu.protoshift.n" +
      "et.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExitTransPointRegionNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExitTransPointRegionNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExitTransPointRegionNotify_descriptor,
        new java.lang.String[] { "PointId", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
