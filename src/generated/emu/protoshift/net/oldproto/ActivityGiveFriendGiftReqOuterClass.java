// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityGiveFriendGiftReq.proto

package emu.protoshift.net.oldproto;

public final class ActivityGiveFriendGiftReqOuterClass {
  private ActivityGiveFriendGiftReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityGiveFriendGiftReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityGiveFriendGiftReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    int getGiftNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    boolean containsGiftNumMap(
        int key);
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getGiftNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    int getGiftNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    int getGiftNumMapOrThrow(
        int key);

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();
  }
  /**
   * <pre>
   * Obf: BNMIOPJNEMN
   * </pre>
   *
   * Protobuf type {@code ActivityGiveFriendGiftReq}
   */
  public static final class ActivityGiveFriendGiftReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityGiveFriendGiftReq)
      ActivityGiveFriendGiftReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityGiveFriendGiftReq.newBuilder() to construct.
    private ActivityGiveFriendGiftReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityGiveFriendGiftReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityGiveFriendGiftReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetGiftNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.class, emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 12;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int GIFT_NUM_MAP_FIELD_NUMBER = 10;
    private static final class GiftNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> giftNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetGiftNumMap() {
      if (giftNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            GiftNumMapDefaultEntryHolder.defaultEntry);
      }
      return giftNumMap_;
    }
    public int getGiftNumMapCount() {
      return internalGetGiftNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override
    public boolean containsGiftNumMap(
        int key) {

      return internalGetGiftNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getGiftNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
      return getGiftNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
      return internalGetGiftNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override
    public int getGiftNumMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
     */
    @java.lang.Override
    public int getGiftNumMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetGiftNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetGiftNumMap(),
          GiftNumMapDefaultEntryHolder.defaultEntry,
          10);
      if (scheduleId_ != 0) {
        output.writeUInt32(12, scheduleId_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetGiftNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        giftNumMap__ = GiftNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, giftNumMap__);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, scheduleId_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq other = (emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (!internalGetGiftNumMap().equals(
          other.internalGetGiftNumMap())) return false;
      if (getUid()
          != other.getUid()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (!internalGetGiftNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + GIFT_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetGiftNumMap().hashCode();
      }
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq prototype) {
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
     * Obf: BNMIOPJNEMN
     * </pre>
     *
     * Protobuf type {@code ActivityGiveFriendGiftReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityGiveFriendGiftReq)
        emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetGiftNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMutableGiftNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.class, emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.newBuilder()
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
        scheduleId_ = 0;
        internalGetMutableGiftNumMap().clear();
        uid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.internal_static_ActivityGiveFriendGiftReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq build() {
        emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq buildPartial() {
        emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq result = new emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.scheduleId_ = scheduleId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.giftNumMap_ = internalGetGiftNumMap();
          result.giftNumMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.uid_ = uid_;
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
        if (other instanceof emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq) {
          return mergeFrom((emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq other) {
        if (other == emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        internalGetMutableGiftNumMap().mergeFrom(
            other.internalGetGiftNumMap());
        bitField0_ |= 0x00000002;
        if (other.getUid() != 0) {
          setUid(other.getUid());
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
              case 82: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                giftNumMap__ = input.readMessage(
                    GiftNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableGiftNumMap().getMutableMap().put(
                    giftNumMap__.getKey(), giftNumMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 82
              case 96: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 112: {
                uid_ = input.readUInt32();
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

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {

        scheduleId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> giftNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetGiftNumMap() {
        if (giftNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        return giftNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableGiftNumMap() {
        if (giftNumMap_ == null) {
          giftNumMap_ = com.google.protobuf.MapField.newMapField(
              GiftNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!giftNumMap_.isMutable()) {
          giftNumMap_ = giftNumMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return giftNumMap_;
      }
      public int getGiftNumMapCount() {
        return internalGetGiftNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override
      public boolean containsGiftNumMap(
          int key) {

        return internalGetGiftNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getGiftNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMap() {
        return getGiftNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getGiftNumMapMap() {
        return internalGetGiftNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override
      public int getGiftNumMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      @java.lang.Override
      public int getGiftNumMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetGiftNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearGiftNumMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableGiftNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      public Builder removeGiftNumMap(
          int key) {

        internalGetMutableGiftNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableGiftNumMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutableGiftNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      public Builder putGiftNumMap(
          int key,
          int value) {


        internalGetMutableGiftNumMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; gift_num_map = 10;</code>
       */
      public Builder putAllGiftNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableGiftNumMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityGiveFriendGiftReq)
    }

    // @@protoc_insertion_point(class_scope:ActivityGiveFriendGiftReq)
    private static final emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq();
    }

    public static emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityGiveFriendGiftReq>
        PARSER = new com.google.protobuf.AbstractParser<ActivityGiveFriendGiftReq>() {
      @java.lang.Override
      public ActivityGiveFriendGiftReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ActivityGiveFriendGiftReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityGiveFriendGiftReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ActivityGiveFriendGiftReqOuterClass.ActivityGiveFriendGiftReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGiveFriendGiftReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ActivityGiveFriendGiftReq.proto\"\262\001\n\031Ac" +
      "tivityGiveFriendGiftReq\022\023\n\013schedule_id\030\014" +
      " \001(\r\022@\n\014gift_num_map\030\n \003(\0132*.ActivityGiv" +
      "eFriendGiftReq.GiftNumMapEntry\022\013\n\003uid\030\016 " +
      "\001(\r\0321\n\017GiftNumMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005v" +
      "alue\030\002 \001(\r:\0028\001B\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityGiveFriendGiftReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityGiveFriendGiftReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGiveFriendGiftReq_descriptor,
        new java.lang.String[] { "ScheduleId", "GiftNumMap", "Uid", });
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor =
      internal_static_ActivityGiveFriendGiftReq_descriptor.getNestedTypes().get(0);
    internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityGiveFriendGiftReq_GiftNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
