// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusTrainingMonsterPreviewDetail.proto

package emu.protoshift.net.oldproto;

public final class FungusTrainingMonsterPreviewDetailOuterClass {
  private FungusTrainingMonsterPreviewDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusTrainingMonsterPreviewDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusTrainingMonsterPreviewDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 monster_id = 15;</code>
     * @return The monsterId.
     */
    int getMonsterId();

    /**
     * <code>uint32 level = 6;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @return A list containing the affixList.
     */
    java.util.List<java.lang.Integer> getAffixListList();
    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @return The count of affixList.
     */
    int getAffixListCount();
    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    int getAffixList(int index);
  }
  /**
   * Protobuf type {@code FungusTrainingMonsterPreviewDetail}
   */
  public static final class FungusTrainingMonsterPreviewDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusTrainingMonsterPreviewDetail)
      FungusTrainingMonsterPreviewDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusTrainingMonsterPreviewDetail.newBuilder() to construct.
    private FungusTrainingMonsterPreviewDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusTrainingMonsterPreviewDetail() {
      affixList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusTrainingMonsterPreviewDetail();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.internal_static_FungusTrainingMonsterPreviewDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.internal_static_FungusTrainingMonsterPreviewDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.class, emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.Builder.class);
    }

    public static final int MONSTER_ID_FIELD_NUMBER = 15;
    private int monsterId_ = 0;
    /**
     * <code>uint32 monster_id = 15;</code>
     * @return The monsterId.
     */
    @java.lang.Override
    public int getMonsterId() {
      return monsterId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 6;
    private int level_ = 0;
    /**
     * <code>uint32 level = 6;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int AFFIX_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList affixList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @return A list containing the affixList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAffixListList() {
      return affixList_;
    }
    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @return The count of affixList.
     */
    public int getAffixListCount() {
      return affixList_.size();
    }
    /**
     * <code>repeated uint32 affix_list = 11;</code>
     * @param index The index of the element to return.
     * @return The affixList at the given index.
     */
    public int getAffixList(int index) {
      return affixList_.getInt(index);
    }
    private int affixListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (level_ != 0) {
        output.writeUInt32(6, level_);
      }
      if (getAffixListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(affixListMemoizedSerializedSize);
      }
      for (int i = 0; i < affixList_.size(); i++) {
        output.writeUInt32NoTag(affixList_.getInt(i));
      }
      if (monsterId_ != 0) {
        output.writeUInt32(15, monsterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, level_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < affixList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(affixList_.getInt(i));
        }
        size += dataSize;
        if (!getAffixListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        affixListMemoizedSerializedSize = dataSize;
      }
      if (monsterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, monsterId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail other = (emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail) obj;

      if (getMonsterId()
          != other.getMonsterId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (!getAffixListList()
          .equals(other.getAffixListList())) return false;
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
      hash = (37 * hash) + MONSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMonsterId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      if (getAffixListCount() > 0) {
        hash = (37 * hash) + AFFIX_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAffixListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail prototype) {
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
     * Protobuf type {@code FungusTrainingMonsterPreviewDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusTrainingMonsterPreviewDetail)
        emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.internal_static_FungusTrainingMonsterPreviewDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.internal_static_FungusTrainingMonsterPreviewDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.class, emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.newBuilder()
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
        monsterId_ = 0;
        level_ = 0;
        affixList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.internal_static_FungusTrainingMonsterPreviewDetail_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail build() {
        emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail buildPartial() {
        emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail result = new emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.monsterId_ = monsterId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.level_ = level_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          affixList_.makeImmutable();
          result.affixList_ = affixList_;
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
        if (other instanceof emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail) {
          return mergeFrom((emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail other) {
        if (other == emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail.getDefaultInstance()) return this;
        if (other.getMonsterId() != 0) {
          setMonsterId(other.getMonsterId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (!other.affixList_.isEmpty()) {
          if (affixList_.isEmpty()) {
            affixList_ = other.affixList_;
            affixList_.makeImmutable();
            bitField0_ |= 0x00000004;
          } else {
            ensureAffixListIsMutable();
            affixList_.addAll(other.affixList_);
          }
          onChanged();
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
                level_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 88: {
                int v = input.readUInt32();
                ensureAffixListIsMutable();
                affixList_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAffixListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  affixList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 90
              case 120: {
                monsterId_ = input.readUInt32();
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

      private int monsterId_ ;
      /**
       * <code>uint32 monster_id = 15;</code>
       * @return The monsterId.
       */
      @java.lang.Override
      public int getMonsterId() {
        return monsterId_;
      }
      /**
       * <code>uint32 monster_id = 15;</code>
       * @param value The monsterId to set.
       * @return This builder for chaining.
       */
      public Builder setMonsterId(int value) {

        monsterId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 monster_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMonsterId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        monsterId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 6;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 6;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {

        level_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList affixList_ = emptyIntList();
      private void ensureAffixListIsMutable() {
        if (!affixList_.isModifiable()) {
          affixList_ = makeMutableCopy(affixList_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @return A list containing the affixList.
       */
      public java.util.List<java.lang.Integer>
          getAffixListList() {
        affixList_.makeImmutable();
        return affixList_;
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @return The count of affixList.
       */
      public int getAffixListCount() {
        return affixList_.size();
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @param index The index of the element to return.
       * @return The affixList at the given index.
       */
      public int getAffixList(int index) {
        return affixList_.getInt(index);
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The affixList to set.
       * @return This builder for chaining.
       */
      public Builder setAffixList(
          int index, int value) {

        ensureAffixListIsMutable();
        affixList_.setInt(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @param value The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAffixList(int value) {

        ensureAffixListIsMutable();
        affixList_.addInt(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @param values The affixList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAffixList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAffixListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, affixList_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 affix_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAffixList() {
        affixList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:FungusTrainingMonsterPreviewDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusTrainingMonsterPreviewDetail)
    private static final emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail();
    }

    public static emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusTrainingMonsterPreviewDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusTrainingMonsterPreviewDetail>() {
      @java.lang.Override
      public FungusTrainingMonsterPreviewDetail parsePartialFrom(
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

    public static com.google.protobuf.Parser<FungusTrainingMonsterPreviewDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusTrainingMonsterPreviewDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FungusTrainingMonsterPreviewDetailOuterClass.FungusTrainingMonsterPreviewDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusTrainingMonsterPreviewDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusTrainingMonsterPreviewDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(FungusTrainingMonsterPreviewDetail.pro" +
      "to\"[\n\"FungusTrainingMonsterPreviewDetail" +
      "\022\022\n\nmonster_id\030\017 \001(\r\022\r\n\005level\030\006 \001(\r\022\022\n\na" +
      "ffix_list\030\013 \003(\rB\035\n\033emu.protoshift.net.ol" +
      "dprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusTrainingMonsterPreviewDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusTrainingMonsterPreviewDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusTrainingMonsterPreviewDetail_descriptor,
        new java.lang.String[] { "MonsterId", "Level", "AffixList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
