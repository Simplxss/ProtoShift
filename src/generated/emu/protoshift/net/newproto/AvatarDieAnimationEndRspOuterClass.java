// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarDieAnimationEndRsp.proto

package emu.protoshift.net.newproto;

public final class AvatarDieAnimationEndRspOuterClass {
  private AvatarDieAnimationEndRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarDieAnimationEndRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 die_guid = 6;</code>
     * @return The dieGuid.
     */
    long getDieGuid();
  }
  /**
   * <pre>
   * Obf: LPNGCMDGKEM
   * </pre>
   *
   * Protobuf type {@code AvatarDieAnimationEndRsp}
   */
  public static final class AvatarDieAnimationEndRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarDieAnimationEndRsp)
      AvatarDieAnimationEndRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarDieAnimationEndRsp.newBuilder() to construct.
    private AvatarDieAnimationEndRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarDieAnimationEndRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarDieAnimationEndRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.class, emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 9;
    private int skillId_ = 0;
    /**
     * <code>uint32 skill_id = 9;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
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

    public static final int DIE_GUID_FIELD_NUMBER = 6;
    private long dieGuid_ = 0L;
    /**
     * <code>uint64 die_guid = 6;</code>
     * @return The dieGuid.
     */
    @java.lang.Override
    public long getDieGuid() {
      return dieGuid_;
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
      if (dieGuid_ != 0L) {
        output.writeUInt64(6, dieGuid_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(9, skillId_);
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
      if (dieGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, dieGuid_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, skillId_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp other = (emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getDieGuid()
          != other.getDieGuid()) return false;
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
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + DIE_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDieGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp prototype) {
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
     * Obf: LPNGCMDGKEM
     * </pre>
     *
     * Protobuf type {@code AvatarDieAnimationEndRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarDieAnimationEndRsp)
        emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.class, emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.newBuilder()
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
        skillId_ = 0;
        retcode_ = 0;
        dieGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.internal_static_AvatarDieAnimationEndRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp build() {
        emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp buildPartial() {
        emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp result = new emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillId_ = skillId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.dieGuid_ = dieGuid_;
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
        if (other instanceof emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp) {
          return mergeFrom((emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp other) {
        if (other == emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getDieGuid() != 0L) {
          setDieGuid(other.getDieGuid());
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
              case 48: {
                dieGuid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 72: {
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {

        skillId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
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

      private long dieGuid_ ;
      /**
       * <code>uint64 die_guid = 6;</code>
       * @return The dieGuid.
       */
      @java.lang.Override
      public long getDieGuid() {
        return dieGuid_;
      }
      /**
       * <code>uint64 die_guid = 6;</code>
       * @param value The dieGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDieGuid(long value) {

        dieGuid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 die_guid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDieGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dieGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarDieAnimationEndRsp)
    }

    // @@protoc_insertion_point(class_scope:AvatarDieAnimationEndRsp)
    private static final emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp();
    }

    public static emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarDieAnimationEndRsp>
        PARSER = new com.google.protobuf.AbstractParser<AvatarDieAnimationEndRsp>() {
      @java.lang.Override
      public AvatarDieAnimationEndRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarDieAnimationEndRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarDieAnimationEndRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.AvatarDieAnimationEndRspOuterClass.AvatarDieAnimationEndRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarDieAnimationEndRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036AvatarDieAnimationEndRsp.proto\"O\n\030Avat" +
      "arDieAnimationEndRsp\022\020\n\010skill_id\030\t \001(\r\022\017" +
      "\n\007retcode\030\003 \001(\005\022\020\n\010die_guid\030\006 \001(\004B\035\n\033emu" +
      ".protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarDieAnimationEndRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarDieAnimationEndRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarDieAnimationEndRsp_descriptor,
        new java.lang.String[] { "SkillId", "Retcode", "DieGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
