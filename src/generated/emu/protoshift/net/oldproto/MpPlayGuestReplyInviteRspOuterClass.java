// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayGuestReplyInviteRsp.proto

package emu.protoshift.net.oldproto;

public final class MpPlayGuestReplyInviteRspOuterClass {
  private MpPlayGuestReplyInviteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayGuestReplyInviteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayGuestReplyInviteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>int32 retcode = 13;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: BFKDNDBMCMO
   * </pre>
   *
   * Protobuf type {@code MpPlayGuestReplyInviteRsp}
   */
  public static final class MpPlayGuestReplyInviteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayGuestReplyInviteRsp)
      MpPlayGuestReplyInviteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayGuestReplyInviteRsp.newBuilder() to construct.
    private MpPlayGuestReplyInviteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayGuestReplyInviteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayGuestReplyInviteRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.internal_static_MpPlayGuestReplyInviteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.internal_static_MpPlayGuestReplyInviteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.class, emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.Builder.class);
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 10;
    private int mpPlayId_ = 0;
    /**
     * <code>uint32 mp_play_id = 10;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 13;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 13;</code>
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
      if (mpPlayId_ != 0) {
        output.writeUInt32(10, mpPlayId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(13, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, mpPlayId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(13, retcode_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp other = (emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp) obj;

      if (getMpPlayId()
          != other.getMpPlayId()) return false;
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
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp prototype) {
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
     * Obf: BFKDNDBMCMO
     * </pre>
     *
     * Protobuf type {@code MpPlayGuestReplyInviteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayGuestReplyInviteRsp)
        emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.internal_static_MpPlayGuestReplyInviteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.internal_static_MpPlayGuestReplyInviteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.class, emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.newBuilder()
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
        mpPlayId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.internal_static_MpPlayGuestReplyInviteRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp build() {
        emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp buildPartial() {
        emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp result = new emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.mpPlayId_ = mpPlayId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp other) {
        if (other == emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp.getDefaultInstance()) return this;
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
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
              case 80: {
                mpPlayId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 104: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
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

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {

        mpPlayId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 13;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 13;</code>
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
       * <code>int32 retcode = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:MpPlayGuestReplyInviteRsp)
    }

    // @@protoc_insertion_point(class_scope:MpPlayGuestReplyInviteRsp)
    private static final emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp();
    }

    public static emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayGuestReplyInviteRsp>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayGuestReplyInviteRsp>() {
      @java.lang.Override
      public MpPlayGuestReplyInviteRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<MpPlayGuestReplyInviteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayGuestReplyInviteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.MpPlayGuestReplyInviteRspOuterClass.MpPlayGuestReplyInviteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayGuestReplyInviteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayGuestReplyInviteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MpPlayGuestReplyInviteRsp.proto\"@\n\031MpP" +
      "layGuestReplyInviteRsp\022\022\n\nmp_play_id\030\n \001" +
      "(\r\022\017\n\007retcode\030\r \001(\005B\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayGuestReplyInviteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayGuestReplyInviteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayGuestReplyInviteRsp_descriptor,
        new java.lang.String[] { "MpPlayId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
