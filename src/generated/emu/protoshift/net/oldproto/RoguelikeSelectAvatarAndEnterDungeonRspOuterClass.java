// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeSelectAvatarAndEnterDungeonRsp.proto

package emu.protoshift.net.oldproto;

public final class RoguelikeSelectAvatarAndEnterDungeonRspOuterClass {
  private RoguelikeSelectAvatarAndEnterDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeSelectAvatarAndEnterDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeSelectAvatarAndEnterDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * Obf: PONFJAPIHJJ
   * </pre>
   *
   * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonRsp}
   */
  public static final class RoguelikeSelectAvatarAndEnterDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeSelectAvatarAndEnterDungeonRsp)
      RoguelikeSelectAvatarAndEnterDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeSelectAvatarAndEnterDungeonRsp.newBuilder() to construct.
    private RoguelikeSelectAvatarAndEnterDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeSelectAvatarAndEnterDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeSelectAvatarAndEnterDungeonRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.class, emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 15;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
        output.writeInt32(7, retcode_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(15, stageId_);
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
          .computeInt32Size(7, retcode_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, stageId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp other = (emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp prototype) {
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
     * Obf: PONFJAPIHJJ
     * </pre>
     *
     * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeSelectAvatarAndEnterDungeonRsp)
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.class, emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.newBuilder()
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
        stageId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp build() {
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp buildPartial() {
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp result = new emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.stageId_ = stageId_;
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
        if (other instanceof emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp other) {
        if (other == emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
              case 56: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 120: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
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
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeSelectAvatarAndEnterDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeSelectAvatarAndEnterDungeonRsp)
    private static final emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp();
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeSelectAvatarAndEnterDungeonRsp>() {
      @java.lang.Override
      public RoguelikeSelectAvatarAndEnterDungeonRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonRspOuterClass.RoguelikeSelectAvatarAndEnterDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-RoguelikeSelectAvatarAndEnterDungeonRs" +
      "p.proto\"L\n\'RoguelikeSelectAvatarAndEnter" +
      "DungeonRsp\022\017\n\007retcode\030\007 \001(\005\022\020\n\010stage_id\030" +
      "\017 \001(\rB\035\n\033emu.protoshift.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeSelectAvatarAndEnterDungeonRsp_descriptor,
        new java.lang.String[] { "Retcode", "StageId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
