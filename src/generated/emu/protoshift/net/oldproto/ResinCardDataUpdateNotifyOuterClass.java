// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinCardDataUpdateNotify.proto

package emu.protoshift.net.oldproto;

public final class ResinCardDataUpdateNotifyOuterClass {
  private ResinCardDataUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResinCardDataUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResinCardDataUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 today_start_time = 10;</code>
     * @return The todayStartTime.
     */
    int getTodayStartTime();

    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> 
        getCardDataListList();
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index);
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    int getCardDataListCount();
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
        getCardDataListOrBuilderList();
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 6072
   * Obf: ILIKBAGAKKB
   * </pre>
   *
   * Protobuf type {@code ResinCardDataUpdateNotify}
   */
  public static final class ResinCardDataUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResinCardDataUpdateNotify)
      ResinCardDataUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResinCardDataUpdateNotify.newBuilder() to construct.
    private ResinCardDataUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResinCardDataUpdateNotify() {
      cardDataList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResinCardDataUpdateNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.class, emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.Builder.class);
    }

    public static final int TODAY_START_TIME_FIELD_NUMBER = 10;
    private int todayStartTime_ = 0;
    /**
     * <code>uint32 today_start_time = 10;</code>
     * @return The todayStartTime.
     */
    @java.lang.Override
    public int getTodayStartTime() {
      return todayStartTime_;
    }

    public static final int CARD_DATA_LIST_FIELD_NUMBER = 7;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> cardDataList_;
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> getCardDataListList() {
      return cardDataList_;
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
        getCardDataListOrBuilderList() {
      return cardDataList_;
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    @java.lang.Override
    public int getCardDataListCount() {
      return cardDataList_.size();
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index) {
      return cardDataList_.get(index);
    }
    /**
     * <code>repeated .ResinCardData card_data_list = 7;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
        int index) {
      return cardDataList_.get(index);
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
      for (int i = 0; i < cardDataList_.size(); i++) {
        output.writeMessage(7, cardDataList_.get(i));
      }
      if (todayStartTime_ != 0) {
        output.writeUInt32(10, todayStartTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < cardDataList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, cardDataList_.get(i));
      }
      if (todayStartTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, todayStartTime_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify other = (emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify) obj;

      if (getTodayStartTime()
          != other.getTodayStartTime()) return false;
      if (!getCardDataListList()
          .equals(other.getCardDataListList())) return false;
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
      hash = (37 * hash) + TODAY_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getTodayStartTime();
      if (getCardDataListCount() > 0) {
        hash = (37 * hash) + CARD_DATA_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardDataListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify prototype) {
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
     * CmdId: 6072
     * Obf: ILIKBAGAKKB
     * </pre>
     *
     * Protobuf type {@code ResinCardDataUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResinCardDataUpdateNotify)
        emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.class, emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.newBuilder()
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
        todayStartTime_ = 0;
        if (cardDataListBuilder_ == null) {
          cardDataList_ = java.util.Collections.emptyList();
        } else {
          cardDataList_ = null;
          cardDataListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.internal_static_ResinCardDataUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify build() {
        emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify buildPartial() {
        emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result = new emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result) {
        if (cardDataListBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            cardDataList_ = java.util.Collections.unmodifiableList(cardDataList_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.cardDataList_ = cardDataList_;
        } else {
          result.cardDataList_ = cardDataListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.todayStartTime_ = todayStartTime_;
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
        if (other instanceof emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify other) {
        if (other == emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify.getDefaultInstance()) return this;
        if (other.getTodayStartTime() != 0) {
          setTodayStartTime(other.getTodayStartTime());
        }
        if (cardDataListBuilder_ == null) {
          if (!other.cardDataList_.isEmpty()) {
            if (cardDataList_.isEmpty()) {
              cardDataList_ = other.cardDataList_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureCardDataListIsMutable();
              cardDataList_.addAll(other.cardDataList_);
            }
            onChanged();
          }
        } else {
          if (!other.cardDataList_.isEmpty()) {
            if (cardDataListBuilder_.isEmpty()) {
              cardDataListBuilder_.dispose();
              cardDataListBuilder_ = null;
              cardDataList_ = other.cardDataList_;
              bitField0_ = (bitField0_ & ~0x00000002);
              cardDataListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCardDataListFieldBuilder() : null;
            } else {
              cardDataListBuilder_.addAllMessages(other.cardDataList_);
            }
          }
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
              case 58: {
                emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.parser(),
                        extensionRegistry);
                if (cardDataListBuilder_ == null) {
                  ensureCardDataListIsMutable();
                  cardDataList_.add(m);
                } else {
                  cardDataListBuilder_.addMessage(m);
                }
                break;
              } // case 58
              case 80: {
                todayStartTime_ = input.readUInt32();
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

      private int todayStartTime_ ;
      /**
       * <code>uint32 today_start_time = 10;</code>
       * @return The todayStartTime.
       */
      @java.lang.Override
      public int getTodayStartTime() {
        return todayStartTime_;
      }
      /**
       * <code>uint32 today_start_time = 10;</code>
       * @param value The todayStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setTodayStartTime(int value) {

        todayStartTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 today_start_time = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearTodayStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        todayStartTime_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> cardDataList_ =
        java.util.Collections.emptyList();
      private void ensureCardDataListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          cardDataList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData>(cardDataList_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder> cardDataListBuilder_;

      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> getCardDataListList() {
        if (cardDataListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cardDataList_);
        } else {
          return cardDataListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public int getCardDataListCount() {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.size();
        } else {
          return cardDataListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData getCardDataList(int index) {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.get(index);
        } else {
          return cardDataListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder setCardDataList(
          int index, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.set(index, value);
          onChanged();
        } else {
          cardDataListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder setCardDataList(
          int index, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.set(index, builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder addCardDataList(emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.add(value);
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder addCardDataList(
          int index, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData value) {
        if (cardDataListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardDataListIsMutable();
          cardDataList_.add(index, value);
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder addCardDataList(
          emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.add(builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder addCardDataList(
          int index, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder builderForValue) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.add(index, builderForValue.build());
          onChanged();
        } else {
          cardDataListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder addAllCardDataList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData> values) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cardDataList_);
          onChanged();
        } else {
          cardDataListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder clearCardDataList() {
        if (cardDataListBuilder_ == null) {
          cardDataList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          cardDataListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public Builder removeCardDataList(int index) {
        if (cardDataListBuilder_ == null) {
          ensureCardDataListIsMutable();
          cardDataList_.remove(index);
          onChanged();
        } else {
          cardDataListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder getCardDataListBuilder(
          int index) {
        return getCardDataListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder getCardDataListOrBuilder(
          int index) {
        if (cardDataListBuilder_ == null) {
          return cardDataList_.get(index);  } else {
          return cardDataListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
           getCardDataListOrBuilderList() {
        if (cardDataListBuilder_ != null) {
          return cardDataListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cardDataList_);
        }
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder addCardDataListBuilder() {
        return getCardDataListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance());
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder addCardDataListBuilder(
          int index) {
        return getCardDataListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.getDefaultInstance());
      }
      /**
       * <code>repeated .ResinCardData card_data_list = 7;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder> 
           getCardDataListBuilderList() {
        return getCardDataListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder> 
          getCardDataListFieldBuilder() {
        if (cardDataListBuilder_ == null) {
          cardDataListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardData.Builder, emu.protoshift.net.oldproto.ResinCardDataOuterClass.ResinCardDataOrBuilder>(
                  cardDataList_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          cardDataList_ = null;
        }
        return cardDataListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ResinCardDataUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:ResinCardDataUpdateNotify)
    private static final emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify();
    }

    public static emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResinCardDataUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<ResinCardDataUpdateNotify>() {
      @java.lang.Override
      public ResinCardDataUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResinCardDataUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResinCardDataUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ResinCardDataUpdateNotifyOuterClass.ResinCardDataUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResinCardDataUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResinCardDataUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ResinCardDataUpdateNotify.proto\032\023Resin" +
      "CardData.proto\"]\n\031ResinCardDataUpdateNot" +
      "ify\022\030\n\020today_start_time\030\n \001(\r\022&\n\016card_da" +
      "ta_list\030\007 \003(\0132\016.ResinCardDataB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.ResinCardDataOuterClass.getDescriptor(),
        });
    internal_static_ResinCardDataUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResinCardDataUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResinCardDataUpdateNotify_descriptor,
        new java.lang.String[] { "TodayStartTime", "CardDataList", });
    emu.protoshift.net.oldproto.ResinCardDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
