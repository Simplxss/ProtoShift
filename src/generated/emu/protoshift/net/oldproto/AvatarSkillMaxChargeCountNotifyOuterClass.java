// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillMaxChargeCountNotify.proto

package emu.protoshift.net.oldproto;

public final class AvatarSkillMaxChargeCountNotifyOuterClass {
  private AvatarSkillMaxChargeCountNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillMaxChargeCountNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillMaxChargeCountNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 15;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint32 max_charge_count = 4;</code>
     * @return The maxChargeCount.
     */
    int getMaxChargeCount();

    /**
     * <code>uint64 avatar_guid = 7;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * Obf: MIPDHBPHHBA
   * </pre>
   *
   * Protobuf type {@code AvatarSkillMaxChargeCountNotify}
   */
  public static final class AvatarSkillMaxChargeCountNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillMaxChargeCountNotify)
      AvatarSkillMaxChargeCountNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillMaxChargeCountNotify.newBuilder() to construct.
    private AvatarSkillMaxChargeCountNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillMaxChargeCountNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillMaxChargeCountNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.class, emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 15;
    private int skillId_ = 0;
    /**
     * <code>uint32 skill_id = 15;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int MAX_CHARGE_COUNT_FIELD_NUMBER = 4;
    private int maxChargeCount_ = 0;
    /**
     * <code>uint32 max_charge_count = 4;</code>
     * @return The maxChargeCount.
     */
    @java.lang.Override
    public int getMaxChargeCount() {
      return maxChargeCount_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 7;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 7;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (maxChargeCount_ != 0) {
        output.writeUInt32(4, maxChargeCount_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(7, avatarGuid_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(15, skillId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxChargeCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, maxChargeCount_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, avatarGuid_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, skillId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify other = (emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (getMaxChargeCount()
          != other.getMaxChargeCount()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + MAX_CHARGE_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getMaxChargeCount();
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify prototype) {
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
     * Obf: MIPDHBPHHBA
     * </pre>
     *
     * Protobuf type {@code AvatarSkillMaxChargeCountNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillMaxChargeCountNotify)
        emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.class, emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.newBuilder()
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
        maxChargeCount_ = 0;
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify build() {
        emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify buildPartial() {
        emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify result = new emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillId_ = skillId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.maxChargeCount_ = maxChargeCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify other) {
        if (other == emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getMaxChargeCount() != 0) {
          setMaxChargeCount(other.getMaxChargeCount());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
              case 32: {
                maxChargeCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 56: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 120: {
                skillId_ = input.readUInt32();
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

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 15;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 15;</code>
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
       * <code>uint32 skill_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int maxChargeCount_ ;
      /**
       * <code>uint32 max_charge_count = 4;</code>
       * @return The maxChargeCount.
       */
      @java.lang.Override
      public int getMaxChargeCount() {
        return maxChargeCount_;
      }
      /**
       * <code>uint32 max_charge_count = 4;</code>
       * @param value The maxChargeCount to set.
       * @return This builder for chaining.
       */
      public Builder setMaxChargeCount(int value) {

        maxChargeCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_charge_count = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxChargeCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        maxChargeCount_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 7;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 7;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:AvatarSkillMaxChargeCountNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillMaxChargeCountNotify)
    private static final emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify();
    }

    public static emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillMaxChargeCountNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillMaxChargeCountNotify>() {
      @java.lang.Override
      public AvatarSkillMaxChargeCountNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarSkillMaxChargeCountNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillMaxChargeCountNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarSkillMaxChargeCountNotifyOuterClass.AvatarSkillMaxChargeCountNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillMaxChargeCountNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%AvatarSkillMaxChargeCountNotify.proto\"" +
      "b\n\037AvatarSkillMaxChargeCountNotify\022\020\n\010sk" +
      "ill_id\030\017 \001(\r\022\030\n\020max_charge_count\030\004 \001(\r\022\023" +
      "\n\013avatar_guid\030\007 \001(\004B\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillMaxChargeCountNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillMaxChargeCountNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillMaxChargeCountNotify_descriptor,
        new java.lang.String[] { "SkillId", "MaxChargeCount", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
