// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlightActivityDetailInfo.proto

package emu.protoshift.net.oldproto;

public final class FlightActivityDetailInfoOuterClass {
  private FlightActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FlightActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FlightActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LNGOLLDBIEC = 11;</code>
     * @return The lNGOLLDBIEC.
     */
    int getLNGOLLDBIEC();

    /**
     * <code>uint32 MPJCDHBBHMM = 4;</code>
     * @return The mPJCDHBBHMM.
     */
    int getMPJCDHBBHMM();

    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> 
        getDailyRecordListList();
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDailyRecordList(int index);
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    int getDailyRecordListCount();
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder> 
        getDailyRecordListOrBuilderList();
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder getDailyRecordListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: PDOHHNCBKGB
   * </pre>
   *
   * Protobuf type {@code FlightActivityDetailInfo}
   */
  public static final class FlightActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FlightActivityDetailInfo)
      FlightActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FlightActivityDetailInfo.newBuilder() to construct.
    private FlightActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FlightActivityDetailInfo() {
      dailyRecordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FlightActivityDetailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.internal_static_FlightActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.internal_static_FlightActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.class, emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.Builder.class);
    }

    public static final int LNGOLLDBIEC_FIELD_NUMBER = 11;
    private int lNGOLLDBIEC_ = 0;
    /**
     * <code>uint32 LNGOLLDBIEC = 11;</code>
     * @return The lNGOLLDBIEC.
     */
    @java.lang.Override
    public int getLNGOLLDBIEC() {
      return lNGOLLDBIEC_;
    }

    public static final int MPJCDHBBHMM_FIELD_NUMBER = 4;
    private int mPJCDHBBHMM_ = 0;
    /**
     * <code>uint32 MPJCDHBBHMM = 4;</code>
     * @return The mPJCDHBBHMM.
     */
    @java.lang.Override
    public int getMPJCDHBBHMM() {
      return mPJCDHBBHMM_;
    }

    public static final int DAILY_RECORD_LIST_FIELD_NUMBER = 10;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> dailyRecordList_;
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> getDailyRecordListList() {
      return dailyRecordList_;
    }
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder> 
        getDailyRecordListOrBuilderList() {
      return dailyRecordList_;
    }
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    @java.lang.Override
    public int getDailyRecordListCount() {
      return dailyRecordList_.size();
    }
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDailyRecordList(int index) {
      return dailyRecordList_.get(index);
    }
    /**
     * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder getDailyRecordListOrBuilder(
        int index) {
      return dailyRecordList_.get(index);
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
      if (mPJCDHBBHMM_ != 0) {
        output.writeUInt32(4, mPJCDHBBHMM_);
      }
      for (int i = 0; i < dailyRecordList_.size(); i++) {
        output.writeMessage(10, dailyRecordList_.get(i));
      }
      if (lNGOLLDBIEC_ != 0) {
        output.writeUInt32(11, lNGOLLDBIEC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mPJCDHBBHMM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, mPJCDHBBHMM_);
      }
      for (int i = 0; i < dailyRecordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, dailyRecordList_.get(i));
      }
      if (lNGOLLDBIEC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, lNGOLLDBIEC_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo other = (emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo) obj;

      if (getLNGOLLDBIEC()
          != other.getLNGOLLDBIEC()) return false;
      if (getMPJCDHBBHMM()
          != other.getMPJCDHBBHMM()) return false;
      if (!getDailyRecordListList()
          .equals(other.getDailyRecordListList())) return false;
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
      hash = (37 * hash) + LNGOLLDBIEC_FIELD_NUMBER;
      hash = (53 * hash) + getLNGOLLDBIEC();
      hash = (37 * hash) + MPJCDHBBHMM_FIELD_NUMBER;
      hash = (53 * hash) + getMPJCDHBBHMM();
      if (getDailyRecordListCount() > 0) {
        hash = (37 * hash) + DAILY_RECORD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getDailyRecordListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo prototype) {
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
     * Obf: PDOHHNCBKGB
     * </pre>
     *
     * Protobuf type {@code FlightActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FlightActivityDetailInfo)
        emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.internal_static_FlightActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.internal_static_FlightActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.class, emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.newBuilder()
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
        lNGOLLDBIEC_ = 0;
        mPJCDHBBHMM_ = 0;
        if (dailyRecordListBuilder_ == null) {
          dailyRecordList_ = java.util.Collections.emptyList();
        } else {
          dailyRecordList_ = null;
          dailyRecordListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.internal_static_FlightActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo build() {
        emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo buildPartial() {
        emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo result = new emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo result) {
        if (dailyRecordListBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            dailyRecordList_ = java.util.Collections.unmodifiableList(dailyRecordList_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.dailyRecordList_ = dailyRecordList_;
        } else {
          result.dailyRecordList_ = dailyRecordListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.lNGOLLDBIEC_ = lNGOLLDBIEC_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.mPJCDHBBHMM_ = mPJCDHBBHMM_;
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
        if (other instanceof emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo other) {
        if (other == emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo.getDefaultInstance()) return this;
        if (other.getLNGOLLDBIEC() != 0) {
          setLNGOLLDBIEC(other.getLNGOLLDBIEC());
        }
        if (other.getMPJCDHBBHMM() != 0) {
          setMPJCDHBBHMM(other.getMPJCDHBBHMM());
        }
        if (dailyRecordListBuilder_ == null) {
          if (!other.dailyRecordList_.isEmpty()) {
            if (dailyRecordList_.isEmpty()) {
              dailyRecordList_ = other.dailyRecordList_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureDailyRecordListIsMutable();
              dailyRecordList_.addAll(other.dailyRecordList_);
            }
            onChanged();
          }
        } else {
          if (!other.dailyRecordList_.isEmpty()) {
            if (dailyRecordListBuilder_.isEmpty()) {
              dailyRecordListBuilder_.dispose();
              dailyRecordListBuilder_ = null;
              dailyRecordList_ = other.dailyRecordList_;
              bitField0_ = (bitField0_ & ~0x00000004);
              dailyRecordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDailyRecordListFieldBuilder() : null;
            } else {
              dailyRecordListBuilder_.addAllMessages(other.dailyRecordList_);
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
              case 32: {
                mPJCDHBBHMM_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 82: {
                emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.parser(),
                        extensionRegistry);
                if (dailyRecordListBuilder_ == null) {
                  ensureDailyRecordListIsMutable();
                  dailyRecordList_.add(m);
                } else {
                  dailyRecordListBuilder_.addMessage(m);
                }
                break;
              } // case 82
              case 88: {
                lNGOLLDBIEC_ = input.readUInt32();
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

      private int lNGOLLDBIEC_ ;
      /**
       * <code>uint32 LNGOLLDBIEC = 11;</code>
       * @return The lNGOLLDBIEC.
       */
      @java.lang.Override
      public int getLNGOLLDBIEC() {
        return lNGOLLDBIEC_;
      }
      /**
       * <code>uint32 LNGOLLDBIEC = 11;</code>
       * @param value The lNGOLLDBIEC to set.
       * @return This builder for chaining.
       */
      public Builder setLNGOLLDBIEC(int value) {

        lNGOLLDBIEC_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LNGOLLDBIEC = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLNGOLLDBIEC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lNGOLLDBIEC_ = 0;
        onChanged();
        return this;
      }

      private int mPJCDHBBHMM_ ;
      /**
       * <code>uint32 MPJCDHBBHMM = 4;</code>
       * @return The mPJCDHBBHMM.
       */
      @java.lang.Override
      public int getMPJCDHBBHMM() {
        return mPJCDHBBHMM_;
      }
      /**
       * <code>uint32 MPJCDHBBHMM = 4;</code>
       * @param value The mPJCDHBBHMM to set.
       * @return This builder for chaining.
       */
      public Builder setMPJCDHBBHMM(int value) {

        mPJCDHBBHMM_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MPJCDHBBHMM = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMPJCDHBBHMM() {
        bitField0_ = (bitField0_ & ~0x00000002);
        mPJCDHBBHMM_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> dailyRecordList_ =
        java.util.Collections.emptyList();
      private void ensureDailyRecordListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          dailyRecordList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord>(dailyRecordList_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder> dailyRecordListBuilder_;

      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> getDailyRecordListList() {
        if (dailyRecordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(dailyRecordList_);
        } else {
          return dailyRecordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public int getDailyRecordListCount() {
        if (dailyRecordListBuilder_ == null) {
          return dailyRecordList_.size();
        } else {
          return dailyRecordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord getDailyRecordList(int index) {
        if (dailyRecordListBuilder_ == null) {
          return dailyRecordList_.get(index);
        } else {
          return dailyRecordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder setDailyRecordList(
          int index, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord value) {
        if (dailyRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyRecordListIsMutable();
          dailyRecordList_.set(index, value);
          onChanged();
        } else {
          dailyRecordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder setDailyRecordList(
          int index, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder builderForValue) {
        if (dailyRecordListBuilder_ == null) {
          ensureDailyRecordListIsMutable();
          dailyRecordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          dailyRecordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder addDailyRecordList(emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord value) {
        if (dailyRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyRecordListIsMutable();
          dailyRecordList_.add(value);
          onChanged();
        } else {
          dailyRecordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder addDailyRecordList(
          int index, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord value) {
        if (dailyRecordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDailyRecordListIsMutable();
          dailyRecordList_.add(index, value);
          onChanged();
        } else {
          dailyRecordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder addDailyRecordList(
          emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder builderForValue) {
        if (dailyRecordListBuilder_ == null) {
          ensureDailyRecordListIsMutable();
          dailyRecordList_.add(builderForValue.build());
          onChanged();
        } else {
          dailyRecordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder addDailyRecordList(
          int index, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder builderForValue) {
        if (dailyRecordListBuilder_ == null) {
          ensureDailyRecordListIsMutable();
          dailyRecordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          dailyRecordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder addAllDailyRecordList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord> values) {
        if (dailyRecordListBuilder_ == null) {
          ensureDailyRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, dailyRecordList_);
          onChanged();
        } else {
          dailyRecordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder clearDailyRecordList() {
        if (dailyRecordListBuilder_ == null) {
          dailyRecordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          dailyRecordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public Builder removeDailyRecordList(int index) {
        if (dailyRecordListBuilder_ == null) {
          ensureDailyRecordListIsMutable();
          dailyRecordList_.remove(index);
          onChanged();
        } else {
          dailyRecordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder getDailyRecordListBuilder(
          int index) {
        return getDailyRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder getDailyRecordListOrBuilder(
          int index) {
        if (dailyRecordListBuilder_ == null) {
          return dailyRecordList_.get(index);  } else {
          return dailyRecordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder> 
           getDailyRecordListOrBuilderList() {
        if (dailyRecordListBuilder_ != null) {
          return dailyRecordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(dailyRecordList_);
        }
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder addDailyRecordListBuilder() {
        return getDailyRecordListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder addDailyRecordListBuilder(
          int index) {
        return getDailyRecordListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .FlightDailyRecord daily_record_list = 10;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder> 
           getDailyRecordListBuilderList() {
        return getDailyRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder> 
          getDailyRecordListFieldBuilder() {
        if (dailyRecordListBuilder_ == null) {
          dailyRecordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecord.Builder, emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.FlightDailyRecordOrBuilder>(
                  dailyRecordList_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          dailyRecordList_ = null;
        }
        return dailyRecordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FlightActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:FlightActivityDetailInfo)
    private static final emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo();
    }

    public static emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FlightActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<FlightActivityDetailInfo>() {
      @java.lang.Override
      public FlightActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<FlightActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FlightActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FlightActivityDetailInfoOuterClass.FlightActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FlightActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FlightActivityDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036FlightActivityDetailInfo.proto\032\027Flight" +
      "DailyRecord.proto\"s\n\030FlightActivityDetai" +
      "lInfo\022\023\n\013LNGOLLDBIEC\030\013 \001(\r\022\023\n\013MPJCDHBBHM" +
      "M\030\004 \001(\r\022-\n\021daily_record_list\030\n \003(\0132\022.Fli" +
      "ghtDailyRecordB\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.getDescriptor(),
        });
    internal_static_FlightActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FlightActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FlightActivityDetailInfo_descriptor,
        new java.lang.String[] { "LNGOLLDBIEC", "MPJCDHBBHMM", "DailyRecordList", });
    emu.protoshift.net.oldproto.FlightDailyRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
