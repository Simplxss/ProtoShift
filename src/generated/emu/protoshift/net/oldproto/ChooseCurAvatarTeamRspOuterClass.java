// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChooseCurAvatarTeamRsp.proto

package emu.protoshift.net.oldproto;

public final class ChooseCurAvatarTeamRspOuterClass {
  private ChooseCurAvatarTeamRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChooseCurAvatarTeamRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChooseCurAvatarTeamRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_team_id = 10;</code>
     * @return The curTeamId.
     */
    int getCurTeamId();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: GCKFCHMIFPD
   * </pre>
   *
   * Protobuf type {@code ChooseCurAvatarTeamRsp}
   */
  public static final class ChooseCurAvatarTeamRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChooseCurAvatarTeamRsp)
      ChooseCurAvatarTeamRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChooseCurAvatarTeamRsp.newBuilder() to construct.
    private ChooseCurAvatarTeamRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChooseCurAvatarTeamRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChooseCurAvatarTeamRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.internal_static_ChooseCurAvatarTeamRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.internal_static_ChooseCurAvatarTeamRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.class, emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.Builder.class);
    }

    public static final int CUR_TEAM_ID_FIELD_NUMBER = 10;
    private int curTeamId_ = 0;
    /**
     * <code>uint32 cur_team_id = 10;</code>
     * @return The curTeamId.
     */
    @java.lang.Override
    public int getCurTeamId() {
      return curTeamId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (curTeamId_ != 0) {
        output.writeUInt32(10, curTeamId_);
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
          .computeInt32Size(2, retcode_);
      }
      if (curTeamId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, curTeamId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp other = (emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp) obj;

      if (getCurTeamId()
          != other.getCurTeamId()) return false;
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
      hash = (37 * hash) + CUR_TEAM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCurTeamId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp prototype) {
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
     * Obf: GCKFCHMIFPD
     * </pre>
     *
     * Protobuf type {@code ChooseCurAvatarTeamRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChooseCurAvatarTeamRsp)
        emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.internal_static_ChooseCurAvatarTeamRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.internal_static_ChooseCurAvatarTeamRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.class, emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.newBuilder()
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
        curTeamId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.internal_static_ChooseCurAvatarTeamRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp build() {
        emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp buildPartial() {
        emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp result = new emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curTeamId_ = curTeamId_;
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
        if (other instanceof emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp other) {
        if (other == emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp.getDefaultInstance()) return this;
        if (other.getCurTeamId() != 0) {
          setCurTeamId(other.getCurTeamId());
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
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 80: {
                curTeamId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
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

      private int curTeamId_ ;
      /**
       * <code>uint32 cur_team_id = 10;</code>
       * @return The curTeamId.
       */
      @java.lang.Override
      public int getCurTeamId() {
        return curTeamId_;
      }
      /**
       * <code>uint32 cur_team_id = 10;</code>
       * @param value The curTeamId to set.
       * @return This builder for chaining.
       */
      public Builder setCurTeamId(int value) {

        curTeamId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_team_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurTeamId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curTeamId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
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
       * <code>int32 retcode = 2;</code>
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


      // @@protoc_insertion_point(builder_scope:ChooseCurAvatarTeamRsp)
    }

    // @@protoc_insertion_point(class_scope:ChooseCurAvatarTeamRsp)
    private static final emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp();
    }

    public static emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChooseCurAvatarTeamRsp>
        PARSER = new com.google.protobuf.AbstractParser<ChooseCurAvatarTeamRsp>() {
      @java.lang.Override
      public ChooseCurAvatarTeamRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChooseCurAvatarTeamRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChooseCurAvatarTeamRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ChooseCurAvatarTeamRspOuterClass.ChooseCurAvatarTeamRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChooseCurAvatarTeamRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChooseCurAvatarTeamRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ChooseCurAvatarTeamRsp.proto\">\n\026Choose" +
      "CurAvatarTeamRsp\022\023\n\013cur_team_id\030\n \001(\r\022\017\n" +
      "\007retcode\030\002 \001(\005B\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChooseCurAvatarTeamRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChooseCurAvatarTeamRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChooseCurAvatarTeamRsp_descriptor,
        new java.lang.String[] { "CurTeamId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
