// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProudSkillExtraLevelNotify.proto

package emu.protoshift.net.oldproto;

public final class ProudSkillExtraLevelNotifyOuterClass {
  private ProudSkillExtraLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProudSkillExtraLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ProudSkillExtraLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 4;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 talent_index = 9;</code>
     * @return The talentIndex.
     */
    int getTalentIndex();

    /**
     * <code>uint32 extra_level = 8;</code>
     * @return The extraLevel.
     */
    int getExtraLevel();

    /**
     * <code>uint32 talent_type = 2;</code>
     * @return The talentType.
     */
    int getTalentType();
  }
  /**
   * <pre>
   * Obf: CADAKBCNNHN
   * </pre>
   *
   * Protobuf type {@code ProudSkillExtraLevelNotify}
   */
  public static final class ProudSkillExtraLevelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ProudSkillExtraLevelNotify)
      ProudSkillExtraLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProudSkillExtraLevelNotify.newBuilder() to construct.
    private ProudSkillExtraLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProudSkillExtraLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ProudSkillExtraLevelNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.internal_static_ProudSkillExtraLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.internal_static_ProudSkillExtraLevelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.class, emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 4;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 4;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int TALENT_INDEX_FIELD_NUMBER = 9;
    private int talentIndex_ = 0;
    /**
     * <code>uint32 talent_index = 9;</code>
     * @return The talentIndex.
     */
    @java.lang.Override
    public int getTalentIndex() {
      return talentIndex_;
    }

    public static final int EXTRA_LEVEL_FIELD_NUMBER = 8;
    private int extraLevel_ = 0;
    /**
     * <code>uint32 extra_level = 8;</code>
     * @return The extraLevel.
     */
    @java.lang.Override
    public int getExtraLevel() {
      return extraLevel_;
    }

    public static final int TALENT_TYPE_FIELD_NUMBER = 2;
    private int talentType_ = 0;
    /**
     * <code>uint32 talent_type = 2;</code>
     * @return The talentType.
     */
    @java.lang.Override
    public int getTalentType() {
      return talentType_;
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
      if (talentType_ != 0) {
        output.writeUInt32(2, talentType_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(4, avatarGuid_);
      }
      if (extraLevel_ != 0) {
        output.writeUInt32(8, extraLevel_);
      }
      if (talentIndex_ != 0) {
        output.writeUInt32(9, talentIndex_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (talentType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, talentType_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, avatarGuid_);
      }
      if (extraLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, extraLevel_);
      }
      if (talentIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, talentIndex_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify other = (emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getTalentIndex()
          != other.getTalentIndex()) return false;
      if (getExtraLevel()
          != other.getExtraLevel()) return false;
      if (getTalentType()
          != other.getTalentType()) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + TALENT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getTalentIndex();
      hash = (37 * hash) + EXTRA_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getExtraLevel();
      hash = (37 * hash) + TALENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTalentType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify prototype) {
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
     * Obf: CADAKBCNNHN
     * </pre>
     *
     * Protobuf type {@code ProudSkillExtraLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ProudSkillExtraLevelNotify)
        emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.internal_static_ProudSkillExtraLevelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.internal_static_ProudSkillExtraLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.class, emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.newBuilder()
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
        avatarGuid_ = 0L;
        talentIndex_ = 0;
        extraLevel_ = 0;
        talentType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.internal_static_ProudSkillExtraLevelNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify build() {
        emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify buildPartial() {
        emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify result = new emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.talentIndex_ = talentIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.extraLevel_ = extraLevel_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.talentType_ = talentType_;
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
        if (other instanceof emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify other) {
        if (other == emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getTalentIndex() != 0) {
          setTalentIndex(other.getTalentIndex());
        }
        if (other.getExtraLevel() != 0) {
          setExtraLevel(other.getExtraLevel());
        }
        if (other.getTalentType() != 0) {
          setTalentType(other.getTalentType());
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
                talentType_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 32: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 64: {
                extraLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 72: {
                talentIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int talentIndex_ ;
      /**
       * <code>uint32 talent_index = 9;</code>
       * @return The talentIndex.
       */
      @java.lang.Override
      public int getTalentIndex() {
        return talentIndex_;
      }
      /**
       * <code>uint32 talent_index = 9;</code>
       * @param value The talentIndex to set.
       * @return This builder for chaining.
       */
      public Builder setTalentIndex(int value) {

        talentIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talent_index = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalentIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        talentIndex_ = 0;
        onChanged();
        return this;
      }

      private int extraLevel_ ;
      /**
       * <code>uint32 extra_level = 8;</code>
       * @return The extraLevel.
       */
      @java.lang.Override
      public int getExtraLevel() {
        return extraLevel_;
      }
      /**
       * <code>uint32 extra_level = 8;</code>
       * @param value The extraLevel to set.
       * @return This builder for chaining.
       */
      public Builder setExtraLevel(int value) {

        extraLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extra_level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        extraLevel_ = 0;
        onChanged();
        return this;
      }

      private int talentType_ ;
      /**
       * <code>uint32 talent_type = 2;</code>
       * @return The talentType.
       */
      @java.lang.Override
      public int getTalentType() {
        return talentType_;
      }
      /**
       * <code>uint32 talent_type = 2;</code>
       * @param value The talentType to set.
       * @return This builder for chaining.
       */
      public Builder setTalentType(int value) {

        talentType_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 talent_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTalentType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        talentType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ProudSkillExtraLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:ProudSkillExtraLevelNotify)
    private static final emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify();
    }

    public static emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProudSkillExtraLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<ProudSkillExtraLevelNotify>() {
      @java.lang.Override
      public ProudSkillExtraLevelNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ProudSkillExtraLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProudSkillExtraLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ProudSkillExtraLevelNotifyOuterClass.ProudSkillExtraLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProudSkillExtraLevelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProudSkillExtraLevelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ProudSkillExtraLevelNotify.proto\"q\n\032Pr" +
      "oudSkillExtraLevelNotify\022\023\n\013avatar_guid\030" +
      "\004 \001(\004\022\024\n\014talent_index\030\t \001(\r\022\023\n\013extra_lev" +
      "el\030\010 \001(\r\022\023\n\013talent_type\030\002 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ProudSkillExtraLevelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProudSkillExtraLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProudSkillExtraLevelNotify_descriptor,
        new java.lang.String[] { "AvatarGuid", "TalentIndex", "ExtraLevel", "TalentType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
