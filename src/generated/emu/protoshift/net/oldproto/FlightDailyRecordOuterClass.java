// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlightDailyRecord.proto

package emu.protoshift.net.oldproto;

public final class FlightDailyRecordOuterClass {
  private FlightDailyRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FlightDailyRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FlightDailyRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_touched = 13;</code>
     * @return The isTouched.
     */
    boolean getIsTouched();

    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @return A list containing the watcherIdList.
     */
    java.util.List<java.lang.Integer> getWatcherIdListList();
    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @return The count of watcherIdList.
     */
    int getWatcherIdListCount();
    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    int getWatcherIdList(int index);

    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    int getBestScore();

    /**
     * <code>uint32 start_time = 6;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>uint32 group_id = 2;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * Protobuf type {@code FlightDailyRecord}
   */
  public static final class FlightDailyRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FlightDailyRecord)
      FlightDailyRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FlightDailyRecord.newBuilder() to construct.
    private FlightDailyRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FlightDailyRecord() {
      watcherIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FlightDailyRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.internal_static_FlightDailyRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.internal_static_FlightDailyRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.class, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder.class);
    }

    public static final int IS_TOUCHED_FIELD_NUMBER = 13;
    private boolean isTouched_ = false;
    /**
     * <code>bool is_touched = 13;</code>
     * @return The isTouched.
     */
    @java.lang.Override
    public boolean getIsTouched() {
      return isTouched_;
    }

    public static final int WATCHER_ID_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList watcherIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @return A list containing the watcherIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getWatcherIdListList() {
      return watcherIdList_;
    }
    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @return The count of watcherIdList.
     */
    public int getWatcherIdListCount() {
      return watcherIdList_.size();
    }
    /**
     * <code>repeated uint32 watcher_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The watcherIdList at the given index.
     */
    public int getWatcherIdList(int index) {
      return watcherIdList_.getInt(index);
    }
    private int watcherIdListMemoizedSerializedSize = -1;

    public static final int BEST_SCORE_FIELD_NUMBER = 12;
    private int bestScore_ = 0;
    /**
     * <code>uint32 best_score = 12;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }

    public static final int START_TIME_FIELD_NUMBER = 6;
    private int startTime_ = 0;
    /**
     * <code>uint32 start_time = 6;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 2;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (groupId_ != 0) {
        output.writeUInt32(2, groupId_);
      }
      if (getWatcherIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(watcherIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < watcherIdList_.size(); i++) {
        output.writeUInt32NoTag(watcherIdList_.getInt(i));
      }
      if (startTime_ != 0) {
        output.writeUInt32(6, startTime_);
      }
      if (bestScore_ != 0) {
        output.writeUInt32(12, bestScore_);
      }
      if (isTouched_ != false) {
        output.writeBool(13, isTouched_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, groupId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < watcherIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(watcherIdList_.getInt(i));
        }
        size += dataSize;
        if (!getWatcherIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        watcherIdListMemoizedSerializedSize = dataSize;
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, startTime_);
      }
      if (bestScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, bestScore_);
      }
      if (isTouched_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isTouched_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord other = (emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord) obj;

      if (getIsTouched()
          != other.getIsTouched()) return false;
      if (!getWatcherIdListList()
          .equals(other.getWatcherIdListList())) return false;
      if (getBestScore()
          != other.getBestScore()) return false;
      if (getStartTime()
          != other.getStartTime()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + IS_TOUCHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTouched());
      if (getWatcherIdListCount() > 0) {
        hash = (37 * hash) + WATCHER_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getWatcherIdListList().hashCode();
      }
      hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getBestScore();
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord prototype) {
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
     * Protobuf type {@code FlightDailyRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FlightDailyRecord)
        emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.internal_static_FlightDailyRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.internal_static_FlightDailyRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.class, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.newBuilder()
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
        isTouched_ = false;
        watcherIdList_ = emptyIntList();
        bestScore_ = 0;
        startTime_ = 0;
        groupId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.internal_static_FlightDailyRecord_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord build() {
        emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord buildPartial() {
        emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord result = new emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isTouched_ = isTouched_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          watcherIdList_.makeImmutable();
          result.watcherIdList_ = watcherIdList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bestScore_ = bestScore_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.startTime_ = startTime_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.groupId_ = groupId_;
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
        if (other instanceof emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord) {
          return mergeFrom((emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord other) {
        if (other == emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.getDefaultInstance()) return this;
        if (other.getIsTouched() != false) {
          setIsTouched(other.getIsTouched());
        }
        if (!other.watcherIdList_.isEmpty()) {
          if (watcherIdList_.isEmpty()) {
            watcherIdList_ = other.watcherIdList_;
            watcherIdList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureWatcherIdListIsMutable();
            watcherIdList_.addAll(other.watcherIdList_);
          }
          onChanged();
        }
        if (other.getBestScore() != 0) {
          setBestScore(other.getBestScore());
        }
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 16
              case 40: {
                int v = input.readUInt32();
                ensureWatcherIdListIsMutable();
                watcherIdList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureWatcherIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  watcherIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 48: {
                startTime_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 96: {
                bestScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 104: {
                isTouched_ = input.readBool();
                bitField0_ |= 0x00000001;
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

      private boolean isTouched_ ;
      /**
       * <code>bool is_touched = 13;</code>
       * @return The isTouched.
       */
      @java.lang.Override
      public boolean getIsTouched() {
        return isTouched_;
      }
      /**
       * <code>bool is_touched = 13;</code>
       * @param value The isTouched to set.
       * @return This builder for chaining.
       */
      public Builder setIsTouched(boolean value) {

        isTouched_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_touched = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTouched() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isTouched_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList watcherIdList_ = emptyIntList();
      private void ensureWatcherIdListIsMutable() {
        if (!watcherIdList_.isModifiable()) {
          watcherIdList_ = makeMutableCopy(watcherIdList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @return A list containing the watcherIdList.
       */
      public java.util.List<java.lang.Integer>
          getWatcherIdListList() {
        watcherIdList_.makeImmutable();
        return watcherIdList_;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @return The count of watcherIdList.
       */
      public int getWatcherIdListCount() {
        return watcherIdList_.size();
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The watcherIdList at the given index.
       */
      public int getWatcherIdList(int index) {
        return watcherIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The watcherIdList to set.
       * @return This builder for chaining.
       */
      public Builder setWatcherIdList(
          int index, int value) {

        ensureWatcherIdListIsMutable();
        watcherIdList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @param value The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addWatcherIdList(int value) {

        ensureWatcherIdListIsMutable();
        watcherIdList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @param values The watcherIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllWatcherIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWatcherIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, watcherIdList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 watcher_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearWatcherIdList() {
        watcherIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private int bestScore_ ;
      /**
       * <code>uint32 best_score = 12;</code>
       * @return The bestScore.
       */
      @java.lang.Override
      public int getBestScore() {
        return bestScore_;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @param value The bestScore to set.
       * @return This builder for chaining.
       */
      public Builder setBestScore(int value) {

        bestScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 best_score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearBestScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bestScore_ = 0;
        onChanged();
        return this;
      }

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 6;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 6;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {

        startTime_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startTime_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 2;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 2;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FlightDailyRecord)
    }

    // @@protoc_insertion_point(class_scope:FlightDailyRecord)
    private static final emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord();
    }

    public static emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FlightDailyRecord>
        PARSER = new com.google.protobuf.AbstractParser<FlightDailyRecord>() {
      @java.lang.Override
      public FlightDailyRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<FlightDailyRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FlightDailyRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FlightDailyRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FlightDailyRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FlightDailyRecord.proto\"z\n\021FlightDaily" +
      "Record\022\022\n\nis_touched\030\r \001(\010\022\027\n\017watcher_id" +
      "_list\030\005 \003(\r\022\022\n\nbest_score\030\014 \001(\r\022\022\n\nstart" +
      "_time\030\006 \001(\r\022\020\n\010group_id\030\002 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FlightDailyRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FlightDailyRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FlightDailyRecord_descriptor,
        new java.lang.String[] { "IsTouched", "WatcherIdList", "BestScore", "StartTime", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
