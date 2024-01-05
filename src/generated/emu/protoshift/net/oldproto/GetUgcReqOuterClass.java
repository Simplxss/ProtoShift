// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcReq.proto

package emu.protoshift.net.oldproto;

public final class GetUgcReqOuterClass {
  private GetUgcReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GetUgcType get_ugc_type = 6;</code>
     * @return The enum numeric value on the wire for getUgcType.
     */
    int getGetUgcTypeValue();
    /**
     * <code>.GetUgcType get_ugc_type = 6;</code>
     * @return The getUgcType.
     */
    emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType getGetUgcType();

    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>bool is_require_brief = 15;</code>
     * @return The isRequireBrief.
     */
    boolean getIsRequireBrief();

    /**
     * <code>uint64 ugc_guid = 2;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>.RecordUsage ugc_record_usage = 5;</code>
     * @return The enum numeric value on the wire for ugcRecordUsage.
     */
    int getUgcRecordUsageValue();
    /**
     * <code>.RecordUsage ugc_record_usage = 5;</code>
     * @return The ugcRecordUsage.
     */
    emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage();

    /**
     * <code>uint32 schedule_id = 14;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 3704
   * Obf: EOBJGJNBKLG
   * </pre>
   *
   * Protobuf type {@code GetUgcReq}
   */
  public static final class GetUgcReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcReq)
      GetUgcReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcReq.newBuilder() to construct.
    private GetUgcReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcReq() {
      getUgcType_ = 0;
      ugcType_ = 0;
      ugcRecordUsage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetUgcReqOuterClass.internal_static_GetUgcReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.class, emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.Builder.class);
    }

    public static final int GET_UGC_TYPE_FIELD_NUMBER = 6;
    private int getUgcType_ = 0;
    /**
     * <code>.GetUgcType get_ugc_type = 6;</code>
     * @return The enum numeric value on the wire for getUgcType.
     */
    @java.lang.Override public int getGetUgcTypeValue() {
      return getUgcType_;
    }
    /**
     * <code>.GetUgcType get_ugc_type = 6;</code>
     * @return The getUgcType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType getGetUgcType() {
      emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType result = emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.forNumber(getUgcType_);
      return result == null ? emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.UNRECOGNIZED : result;
    }

    public static final int UGC_TYPE_FIELD_NUMBER = 13;
    private int ugcType_ = 0;
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
      emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType result = emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.forNumber(ugcType_);
      return result == null ? emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int IS_REQUIRE_BRIEF_FIELD_NUMBER = 15;
    private boolean isRequireBrief_ = false;
    /**
     * <code>bool is_require_brief = 15;</code>
     * @return The isRequireBrief.
     */
    @java.lang.Override
    public boolean getIsRequireBrief() {
      return isRequireBrief_;
    }

    public static final int UGC_GUID_FIELD_NUMBER = 2;
    private long ugcGuid_ = 0L;
    /**
     * <code>uint64 ugc_guid = 2;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int UGC_RECORD_USAGE_FIELD_NUMBER = 5;
    private int ugcRecordUsage_ = 0;
    /**
     * <code>.RecordUsage ugc_record_usage = 5;</code>
     * @return The enum numeric value on the wire for ugcRecordUsage.
     */
    @java.lang.Override public int getUgcRecordUsageValue() {
      return ugcRecordUsage_;
    }
    /**
     * <code>.RecordUsage ugc_record_usage = 5;</code>
     * @return The ugcRecordUsage.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage() {
      emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage result = emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.forNumber(ugcRecordUsage_);
      return result == null ? emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.UNRECOGNIZED : result;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 14;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 14;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (ugcGuid_ != 0L) {
        output.writeUInt64(2, ugcGuid_);
      }
      if (ugcRecordUsage_ != emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.UGC_RECORD_USAGE_NONE.getNumber()) {
        output.writeEnum(5, ugcRecordUsage_);
      }
      if (getUgcType_ != emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.GET_UGC_NONE.getNumber()) {
        output.writeEnum(6, getUgcType_);
      }
      if (ugcType_ != emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(13, ugcType_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(14, scheduleId_);
      }
      if (isRequireBrief_ != false) {
        output.writeBool(15, isRequireBrief_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, ugcGuid_);
      }
      if (ugcRecordUsage_ != emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.UGC_RECORD_USAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, ugcRecordUsage_);
      }
      if (getUgcType_ != emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.GET_UGC_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, getUgcType_);
      }
      if (ugcType_ != emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, ugcType_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, scheduleId_);
      }
      if (isRequireBrief_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isRequireBrief_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq other = (emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq) obj;

      if (getUgcType_ != other.getUgcType_) return false;
      if (ugcType_ != other.ugcType_) return false;
      if (getIsRequireBrief()
          != other.getIsRequireBrief()) return false;
      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (ugcRecordUsage_ != other.ugcRecordUsage_) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + GET_UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getUgcType_;
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (37 * hash) + IS_REQUIRE_BRIEF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRequireBrief());
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + UGC_RECORD_USAGE_FIELD_NUMBER;
      hash = (53 * hash) + ugcRecordUsage_;
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq prototype) {
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
     * CmdId: 3704
     * Obf: EOBJGJNBKLG
     * </pre>
     *
     * Protobuf type {@code GetUgcReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcReq)
        emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetUgcReqOuterClass.internal_static_GetUgcReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.class, emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.newBuilder()
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
        getUgcType_ = 0;
        ugcType_ = 0;
        isRequireBrief_ = false;
        ugcGuid_ = 0L;
        ugcRecordUsage_ = 0;
        scheduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetUgcReqOuterClass.internal_static_GetUgcReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq build() {
        emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq buildPartial() {
        emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq result = new emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.getUgcType_ = getUgcType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ugcType_ = ugcType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isRequireBrief_ = isRequireBrief_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.ugcGuid_ = ugcGuid_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.ugcRecordUsage_ = ugcRecordUsage_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq) {
          return mergeFrom((emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq other) {
        if (other == emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq.getDefaultInstance()) return this;
        if (other.getUgcType_ != 0) {
          setGetUgcTypeValue(other.getGetUgcTypeValue());
        }
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        if (other.getIsRequireBrief() != false) {
          setIsRequireBrief(other.getIsRequireBrief());
        }
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.ugcRecordUsage_ != 0) {
          setUgcRecordUsageValue(other.getUgcRecordUsageValue());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
                ugcGuid_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 40: {
                ugcRecordUsage_ = input.readEnum();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 48: {
                getUgcType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 104: {
                ugcType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
              case 112: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 112
              case 120: {
                isRequireBrief_ = input.readBool();
                bitField0_ |= 0x00000004;
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

      private int getUgcType_ = 0;
      /**
       * <code>.GetUgcType get_ugc_type = 6;</code>
       * @return The enum numeric value on the wire for getUgcType.
       */
      @java.lang.Override public int getGetUgcTypeValue() {
        return getUgcType_;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 6;</code>
       * @param value The enum numeric value on the wire for getUgcType to set.
       * @return This builder for chaining.
       */
      public Builder setGetUgcTypeValue(int value) {
        getUgcType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 6;</code>
       * @return The getUgcType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType getGetUgcType() {
        emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType result = emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.forNumber(getUgcType_);
        return result == null ? emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 6;</code>
       * @param value The getUgcType to set.
       * @return This builder for chaining.
       */
      public Builder setGetUgcType(emu.protoshift.net.oldproto.GetUgcTypeOuterClass.GetUgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        getUgcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GetUgcType get_ugc_type = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGetUgcType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        getUgcType_ = 0;
        onChanged();
        return this;
      }

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        ugcType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
        emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType result = emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.forNumber(ugcType_);
        return result == null ? emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private boolean isRequireBrief_ ;
      /**
       * <code>bool is_require_brief = 15;</code>
       * @return The isRequireBrief.
       */
      @java.lang.Override
      public boolean getIsRequireBrief() {
        return isRequireBrief_;
      }
      /**
       * <code>bool is_require_brief = 15;</code>
       * @param value The isRequireBrief to set.
       * @return This builder for chaining.
       */
      public Builder setIsRequireBrief(boolean value) {

        isRequireBrief_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_require_brief = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRequireBrief() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isRequireBrief_ = false;
        onChanged();
        return this;
      }

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 2;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 2;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {

        ugcGuid_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        bitField0_ = (bitField0_ & ~0x00000008);
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int ugcRecordUsage_ = 0;
      /**
       * <code>.RecordUsage ugc_record_usage = 5;</code>
       * @return The enum numeric value on the wire for ugcRecordUsage.
       */
      @java.lang.Override public int getUgcRecordUsageValue() {
        return ugcRecordUsage_;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 5;</code>
       * @param value The enum numeric value on the wire for ugcRecordUsage to set.
       * @return This builder for chaining.
       */
      public Builder setUgcRecordUsageValue(int value) {
        ugcRecordUsage_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 5;</code>
       * @return The ugcRecordUsage.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage getUgcRecordUsage() {
        emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage result = emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.forNumber(ugcRecordUsage_);
        return result == null ? emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage.UNRECOGNIZED : result;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 5;</code>
       * @param value The ugcRecordUsage to set.
       * @return This builder for chaining.
       */
      public Builder setUgcRecordUsage(emu.protoshift.net.oldproto.RecordUsageOuterClass.RecordUsage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        ugcRecordUsage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RecordUsage ugc_record_usage = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcRecordUsage() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ugcRecordUsage_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {

        scheduleId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetUgcReq)
    }

    // @@protoc_insertion_point(class_scope:GetUgcReq)
    private static final emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq();
    }

    public static emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcReq>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcReq>() {
      @java.lang.Override
      public GetUgcReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetUgcReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetUgcReqOuterClass.GetUgcReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017GetUgcReq.proto\032\020GetUgcType.proto\032\rUgc" +
      "Type.proto\032\021RecordUsage.proto\"\263\001\n\tGetUgc" +
      "Req\022!\n\014get_ugc_type\030\006 \001(\0162\013.GetUgcType\022\032" +
      "\n\010ugc_type\030\r \001(\0162\010.UgcType\022\030\n\020is_require" +
      "_brief\030\017 \001(\010\022\020\n\010ugc_guid\030\002 \001(\004\022&\n\020ugc_re" +
      "cord_usage\030\005 \001(\0162\014.RecordUsage\022\023\n\013schedu" +
      "le_id\030\016 \001(\rB\035\n\033emu.protoshift.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.GetUgcTypeOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.UgcTypeOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.RecordUsageOuterClass.getDescriptor(),
        });
    internal_static_GetUgcReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcReq_descriptor,
        new java.lang.String[] { "GetUgcType", "UgcType", "IsRequireBrief", "UgcGuid", "UgcRecordUsage", "ScheduleId", });
    emu.protoshift.net.oldproto.GetUgcTypeOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.UgcTypeOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.RecordUsageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
