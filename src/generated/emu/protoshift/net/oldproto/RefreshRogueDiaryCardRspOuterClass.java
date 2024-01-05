// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshRogueDiaryCardRsp.proto

package emu.protoshift.net.oldproto;

public final class RefreshRogueDiaryCardRspOuterClass {
  private RefreshRogueDiaryCardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshRogueDiaryCardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshRogueDiaryCardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @return A list containing the randCardList.
     */
    java.util.List<java.lang.Integer> getRandCardListList();
    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @return The count of randCardList.
     */
    int getRandCardListCount();
    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The randCardList at the given index.
     */
    int getRandCardList(int index);
  }
  /**
   * <pre>
   * Obf: HODLMPCEKJL
   * </pre>
   *
   * Protobuf type {@code RefreshRogueDiaryCardRsp}
   */
  public static final class RefreshRogueDiaryCardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshRogueDiaryCardRsp)
      RefreshRogueDiaryCardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshRogueDiaryCardRsp.newBuilder() to construct.
    private RefreshRogueDiaryCardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshRogueDiaryCardRsp() {
      randCardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshRogueDiaryCardRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.class, emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RAND_CARD_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList randCardList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @return A list containing the randCardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRandCardListList() {
      return randCardList_;
    }
    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @return The count of randCardList.
     */
    public int getRandCardListCount() {
      return randCardList_.size();
    }
    /**
     * <code>repeated uint32 rand_card_list = 5;</code>
     * @param index The index of the element to return.
     * @return The randCardList at the given index.
     */
    public int getRandCardList(int index) {
      return randCardList_.getInt(index);
    }
    private int randCardListMemoizedSerializedSize = -1;

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
      if (getRandCardListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(randCardListMemoizedSerializedSize);
      }
      for (int i = 0; i < randCardList_.size(); i++) {
        output.writeUInt32NoTag(randCardList_.getInt(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
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
        for (int i = 0; i < randCardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(randCardList_.getInt(i));
        }
        size += dataSize;
        if (!getRandCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        randCardListMemoizedSerializedSize = dataSize;
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp other = (emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getRandCardListList()
          .equals(other.getRandCardListList())) return false;
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
      if (getRandCardListCount() > 0) {
        hash = (37 * hash) + RAND_CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRandCardListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp prototype) {
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
     * Obf: HODLMPCEKJL
     * </pre>
     *
     * Protobuf type {@code RefreshRogueDiaryCardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshRogueDiaryCardRsp)
        emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.class, emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.newBuilder()
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
        randCardList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.internal_static_RefreshRogueDiaryCardRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp build() {
        emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp buildPartial() {
        emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp result = new emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          randCardList_.makeImmutable();
          result.randCardList_ = randCardList_;
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
        if (other instanceof emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp other) {
        if (other == emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (!other.randCardList_.isEmpty()) {
          if (randCardList_.isEmpty()) {
            randCardList_ = other.randCardList_;
            randCardList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureRandCardListIsMutable();
            randCardList_.addAll(other.randCardList_);
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
              case 40: {
                int v = input.readUInt32();
                ensureRandCardListIsMutable();
                randCardList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureRandCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  randCardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 88: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
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
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList randCardList_ = emptyIntList();
      private void ensureRandCardListIsMutable() {
        if (!randCardList_.isModifiable()) {
          randCardList_ = makeMutableCopy(randCardList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @return A list containing the randCardList.
       */
      public java.util.List<java.lang.Integer>
          getRandCardListList() {
        randCardList_.makeImmutable();
        return randCardList_;
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @return The count of randCardList.
       */
      public int getRandCardListCount() {
        return randCardList_.size();
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @param index The index of the element to return.
       * @return The randCardList at the given index.
       */
      public int getRandCardList(int index) {
        return randCardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The randCardList to set.
       * @return This builder for chaining.
       */
      public Builder setRandCardList(
          int index, int value) {

        ensureRandCardListIsMutable();
        randCardList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @param value The randCardList to add.
       * @return This builder for chaining.
       */
      public Builder addRandCardList(int value) {

        ensureRandCardListIsMutable();
        randCardList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @param values The randCardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRandCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRandCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, randCardList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 rand_card_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRandCardList() {
        randCardList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:RefreshRogueDiaryCardRsp)
    }

    // @@protoc_insertion_point(class_scope:RefreshRogueDiaryCardRsp)
    private static final emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp();
    }

    public static emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshRogueDiaryCardRsp>
        PARSER = new com.google.protobuf.AbstractParser<RefreshRogueDiaryCardRsp>() {
      @java.lang.Override
      public RefreshRogueDiaryCardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<RefreshRogueDiaryCardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshRogueDiaryCardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RefreshRogueDiaryCardRspOuterClass.RefreshRogueDiaryCardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshRogueDiaryCardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036RefreshRogueDiaryCardRsp.proto\"C\n\030Refr" +
      "eshRogueDiaryCardRsp\022\017\n\007retcode\030\013 \001(\005\022\026\n" +
      "\016rand_card_list\030\005 \003(\rB\035\n\033emu.protoshift." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshRogueDiaryCardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshRogueDiaryCardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshRogueDiaryCardRsp_descriptor,
        new java.lang.String[] { "Retcode", "RandCardList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
