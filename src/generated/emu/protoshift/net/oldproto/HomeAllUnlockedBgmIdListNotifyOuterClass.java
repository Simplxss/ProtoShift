// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAllUnlockedBgmIdListNotify.proto

package emu.protoshift.net.oldproto;

public final class HomeAllUnlockedBgmIdListNotifyOuterClass {
  private HomeAllUnlockedBgmIdListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeAllUnlockedBgmIdListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeAllUnlockedBgmIdListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @return A list containing the allUnlockedBgmIdList.
     */
    java.util.List<java.lang.Integer> getAllUnlockedBgmIdListList();
    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @return The count of allUnlockedBgmIdList.
     */
    int getAllUnlockedBgmIdListCount();
    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The allUnlockedBgmIdList at the given index.
     */
    int getAllUnlockedBgmIdList(int index);
  }
  /**
   * <pre>
   * Obf: OLKBNMDBLPN
   * </pre>
   *
   * Protobuf type {@code HomeAllUnlockedBgmIdListNotify}
   */
  public static final class HomeAllUnlockedBgmIdListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeAllUnlockedBgmIdListNotify)
      HomeAllUnlockedBgmIdListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeAllUnlockedBgmIdListNotify.newBuilder() to construct.
    private HomeAllUnlockedBgmIdListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeAllUnlockedBgmIdListNotify() {
      allUnlockedBgmIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeAllUnlockedBgmIdListNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.internal_static_HomeAllUnlockedBgmIdListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.internal_static_HomeAllUnlockedBgmIdListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.class, emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.Builder.class);
    }

    public static final int ALL_UNLOCKED_BGM_ID_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList allUnlockedBgmIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @return A list containing the allUnlockedBgmIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getAllUnlockedBgmIdListList() {
      return allUnlockedBgmIdList_;
    }
    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @return The count of allUnlockedBgmIdList.
     */
    public int getAllUnlockedBgmIdListCount() {
      return allUnlockedBgmIdList_.size();
    }
    /**
     * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
     * @param index The index of the element to return.
     * @return The allUnlockedBgmIdList at the given index.
     */
    public int getAllUnlockedBgmIdList(int index) {
      return allUnlockedBgmIdList_.getInt(index);
    }
    private int allUnlockedBgmIdListMemoizedSerializedSize = -1;

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
      if (getAllUnlockedBgmIdListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(allUnlockedBgmIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < allUnlockedBgmIdList_.size(); i++) {
        output.writeUInt32NoTag(allUnlockedBgmIdList_.getInt(i));
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
        for (int i = 0; i < allUnlockedBgmIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(allUnlockedBgmIdList_.getInt(i));
        }
        size += dataSize;
        if (!getAllUnlockedBgmIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        allUnlockedBgmIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify other = (emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify) obj;

      if (!getAllUnlockedBgmIdListList()
          .equals(other.getAllUnlockedBgmIdListList())) return false;
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
      if (getAllUnlockedBgmIdListCount() > 0) {
        hash = (37 * hash) + ALL_UNLOCKED_BGM_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAllUnlockedBgmIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify prototype) {
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
     * Obf: OLKBNMDBLPN
     * </pre>
     *
     * Protobuf type {@code HomeAllUnlockedBgmIdListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeAllUnlockedBgmIdListNotify)
        emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.internal_static_HomeAllUnlockedBgmIdListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.internal_static_HomeAllUnlockedBgmIdListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.class, emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.newBuilder()
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
        allUnlockedBgmIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.internal_static_HomeAllUnlockedBgmIdListNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify build() {
        emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify buildPartial() {
        emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify result = new emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          allUnlockedBgmIdList_.makeImmutable();
          result.allUnlockedBgmIdList_ = allUnlockedBgmIdList_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify other) {
        if (other == emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify.getDefaultInstance()) return this;
        if (!other.allUnlockedBgmIdList_.isEmpty()) {
          if (allUnlockedBgmIdList_.isEmpty()) {
            allUnlockedBgmIdList_ = other.allUnlockedBgmIdList_;
            allUnlockedBgmIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureAllUnlockedBgmIdListIsMutable();
            allUnlockedBgmIdList_.addAll(other.allUnlockedBgmIdList_);
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
              case 8: {
                int v = input.readUInt32();
                ensureAllUnlockedBgmIdListIsMutable();
                allUnlockedBgmIdList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAllUnlockedBgmIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  allUnlockedBgmIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
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

      private com.google.protobuf.Internal.IntList allUnlockedBgmIdList_ = emptyIntList();
      private void ensureAllUnlockedBgmIdListIsMutable() {
        if (!allUnlockedBgmIdList_.isModifiable()) {
          allUnlockedBgmIdList_ = makeMutableCopy(allUnlockedBgmIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @return A list containing the allUnlockedBgmIdList.
       */
      public java.util.List<java.lang.Integer>
          getAllUnlockedBgmIdListList() {
        allUnlockedBgmIdList_.makeImmutable();
        return allUnlockedBgmIdList_;
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @return The count of allUnlockedBgmIdList.
       */
      public int getAllUnlockedBgmIdListCount() {
        return allUnlockedBgmIdList_.size();
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @param index The index of the element to return.
       * @return The allUnlockedBgmIdList at the given index.
       */
      public int getAllUnlockedBgmIdList(int index) {
        return allUnlockedBgmIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The allUnlockedBgmIdList to set.
       * @return This builder for chaining.
       */
      public Builder setAllUnlockedBgmIdList(
          int index, int value) {

        ensureAllUnlockedBgmIdListIsMutable();
        allUnlockedBgmIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @param value The allUnlockedBgmIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnlockedBgmIdList(int value) {

        ensureAllUnlockedBgmIdListIsMutable();
        allUnlockedBgmIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @param values The allUnlockedBgmIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAllUnlockedBgmIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureAllUnlockedBgmIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allUnlockedBgmIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 all_unlocked_bgm_id_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAllUnlockedBgmIdList() {
        allUnlockedBgmIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:HomeAllUnlockedBgmIdListNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeAllUnlockedBgmIdListNotify)
    private static final emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify();
    }

    public static emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeAllUnlockedBgmIdListNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeAllUnlockedBgmIdListNotify>() {
      @java.lang.Override
      public HomeAllUnlockedBgmIdListNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeAllUnlockedBgmIdListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeAllUnlockedBgmIdListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeAllUnlockedBgmIdListNotifyOuterClass.HomeAllUnlockedBgmIdListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeAllUnlockedBgmIdListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeAllUnlockedBgmIdListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$HomeAllUnlockedBgmIdListNotify.proto\"B" +
      "\n\036HomeAllUnlockedBgmIdListNotify\022 \n\030all_" +
      "unlocked_bgm_id_list\030\001 \003(\rB\035\n\033emu.protos" +
      "hift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeAllUnlockedBgmIdListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeAllUnlockedBgmIdListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeAllUnlockedBgmIdListNotify_descriptor,
        new java.lang.String[] { "AllUnlockedBgmIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
