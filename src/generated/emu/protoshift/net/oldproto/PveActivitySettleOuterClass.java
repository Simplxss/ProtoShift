// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PveActivitySettle.proto

package emu.protoshift.net.oldproto;

public final class PveActivitySettleOuterClass {
  private PveActivitySettleOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PveActivitySettleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PveActivitySettle)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @return A list containing the scoreList.
     */
    java.util.List<java.lang.Integer> getScoreListList();
    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @return The count of scoreList.
     */
    int getScoreListCount();
    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    int getScoreList(int index);

    /**
     * <code>uint32 level_id = 9;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_new_record = 14;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();
  }
  /**
   * Protobuf type {@code PveActivitySettle}
   */
  public static final class PveActivitySettle extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PveActivitySettle)
      PveActivitySettleOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PveActivitySettle.newBuilder() to construct.
    private PveActivitySettle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PveActivitySettle() {
      scoreList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PveActivitySettle();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.internal_static_PveActivitySettle_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.internal_static_PveActivitySettle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.class, emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.Builder.class);
    }

    public static final int SCORE_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList scoreList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @return A list containing the scoreList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getScoreListList() {
      return scoreList_;
    }
    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @return The count of scoreList.
     */
    public int getScoreListCount() {
      return scoreList_.size();
    }
    /**
     * <code>repeated uint32 score_list = 6;</code>
     * @param index The index of the element to return.
     * @return The scoreList at the given index.
     */
    public int getScoreList(int index) {
      return scoreList_.getInt(index);
    }
    private int scoreListMemoizedSerializedSize = -1;

    public static final int LEVEL_ID_FIELD_NUMBER = 9;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 9;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 14;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 14;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
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
      getSerializedSize();
      if (getScoreListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(scoreListMemoizedSerializedSize);
      }
      for (int i = 0; i < scoreList_.size(); i++) {
        output.writeUInt32NoTag(scoreList_.getInt(i));
      }
      if (levelId_ != 0) {
        output.writeUInt32(9, levelId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(14, isNewRecord_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < scoreList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(scoreList_.getInt(i));
        }
        size += dataSize;
        if (!getScoreListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        scoreListMemoizedSerializedSize = dataSize;
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, levelId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isNewRecord_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle other = (emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle) obj;

      if (!getScoreListList()
          .equals(other.getScoreListList())) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
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
      if (getScoreListCount() > 0) {
        hash = (37 * hash) + SCORE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getScoreListList().hashCode();
      }
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle prototype) {
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
     * Protobuf type {@code PveActivitySettle}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PveActivitySettle)
        emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.internal_static_PveActivitySettle_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.internal_static_PveActivitySettle_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.class, emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.newBuilder()
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
        scoreList_ = emptyIntList();
        levelId_ = 0;
        isNewRecord_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.internal_static_PveActivitySettle_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle build() {
        emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle buildPartial() {
        emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle result = new emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          scoreList_.makeImmutable();
          result.scoreList_ = scoreList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isNewRecord_ = isNewRecord_;
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
        if (other instanceof emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle) {
          return mergeFrom((emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle other) {
        if (other == emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle.getDefaultInstance()) return this;
        if (!other.scoreList_.isEmpty()) {
          if (scoreList_.isEmpty()) {
            scoreList_ = other.scoreList_;
            scoreList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureScoreListIsMutable();
            scoreList_.addAll(other.scoreList_);
          }
          onChanged();
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
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
                int v = input.readUInt32();
                ensureScoreListIsMutable();
                scoreList_.addInt(v);
                break;
              } // case 48
              case 50: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureScoreListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  scoreList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 50
              case 72: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 112: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
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

      private com.google.protobuf.Internal.IntList scoreList_ = emptyIntList();
      private void ensureScoreListIsMutable() {
        if (!scoreList_.isModifiable()) {
          scoreList_ = makeMutableCopy(scoreList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @return A list containing the scoreList.
       */
      public java.util.List<java.lang.Integer>
          getScoreListList() {
        scoreList_.makeImmutable();
        return scoreList_;
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @return The count of scoreList.
       */
      public int getScoreListCount() {
        return scoreList_.size();
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @param index The index of the element to return.
       * @return The scoreList at the given index.
       */
      public int getScoreList(int index) {
        return scoreList_.getInt(index);
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The scoreList to set.
       * @return This builder for chaining.
       */
      public Builder setScoreList(
          int index, int value) {

        ensureScoreListIsMutable();
        scoreList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @param value The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addScoreList(int value) {

        ensureScoreListIsMutable();
        scoreList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @param values The scoreList to add.
       * @return This builder for chaining.
       */
      public Builder addAllScoreList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureScoreListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, scoreList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 score_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearScoreList() {
        scoreList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 9;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 9;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 14;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 14;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {

        isNewRecord_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isNewRecord_ = false;
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


      // @@protoc_insertion_point(builder_scope:PveActivitySettle)
    }

    // @@protoc_insertion_point(class_scope:PveActivitySettle)
    private static final emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle();
    }

    public static emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PveActivitySettle>
        PARSER = new com.google.protobuf.AbstractParser<PveActivitySettle>() {
      @java.lang.Override
      public PveActivitySettle parsePartialFrom(
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

    public static com.google.protobuf.Parser<PveActivitySettle> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PveActivitySettle> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PveActivitySettleOuterClass.PveActivitySettle getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PveActivitySettle_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PveActivitySettle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PveActivitySettle.proto\"P\n\021PveActivity" +
      "Settle\022\022\n\nscore_list\030\006 \003(\r\022\020\n\010level_id\030\t" +
      " \001(\r\022\025\n\ris_new_record\030\016 \001(\010B\035\n\033emu.proto" +
      "shift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PveActivitySettle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PveActivitySettle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PveActivitySettle_descriptor,
        new java.lang.String[] { "ScoreList", "LevelId", "IsNewRecord", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
