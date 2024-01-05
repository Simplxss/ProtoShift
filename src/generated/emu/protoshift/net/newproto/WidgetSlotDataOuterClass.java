// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSlotData.proto

package emu.protoshift.net.newproto;

public final class WidgetSlotDataOuterClass {
  private WidgetSlotDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetSlotDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetSlotData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetSlotTag tag = 5;</code>
     * @return The enum numeric value on the wire for tag.
     */
    int getTagValue();
    /**
     * <code>.WidgetSlotTag tag = 5;</code>
     * @return The tag.
     */
    emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag getTag();

    /**
     * <code>uint32 material_id = 9;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool is_active = 12;</code>
     * @return The isActive.
     */
    boolean getIsActive();

    /**
     * <code>uint32 cd_over_time = 2;</code>
     * @return The cdOverTime.
     */
    int getCdOverTime();
  }
  /**
   * Protobuf type {@code WidgetSlotData}
   */
  public static final class WidgetSlotData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetSlotData)
      WidgetSlotDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetSlotData.newBuilder() to construct.
    private WidgetSlotData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetSlotData() {
      tag_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetSlotData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.class, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder.class);
    }

    public static final int TAG_FIELD_NUMBER = 5;
    private int tag_ = 0;
    /**
     * <code>.WidgetSlotTag tag = 5;</code>
     * @return The enum numeric value on the wire for tag.
     */
    @java.lang.Override public int getTagValue() {
      return tag_;
    }
    /**
     * <code>.WidgetSlotTag tag = 5;</code>
     * @return The tag.
     */
    @java.lang.Override public emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
      emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.forNumber(tag_);
      return result == null ? emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 9;
    private int materialId_ = 0;
    /**
     * <code>uint32 material_id = 9;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int IS_ACTIVE_FIELD_NUMBER = 12;
    private boolean isActive_ = false;
    /**
     * <code>bool is_active = 12;</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
    }

    public static final int CD_OVER_TIME_FIELD_NUMBER = 2;
    private int cdOverTime_ = 0;
    /**
     * <code>uint32 cd_over_time = 2;</code>
     * @return The cdOverTime.
     */
    @java.lang.Override
    public int getCdOverTime() {
      return cdOverTime_;
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
      if (cdOverTime_ != 0) {
        output.writeUInt32(2, cdOverTime_);
      }
      if (tag_ != emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
        output.writeEnum(5, tag_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(9, materialId_);
      }
      if (isActive_ != false) {
        output.writeBool(12, isActive_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cdOverTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cdOverTime_);
      }
      if (tag_ != emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, tag_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, materialId_);
      }
      if (isActive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isActive_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData other = (emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData) obj;

      if (tag_ != other.tag_) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getIsActive()
          != other.getIsActive()) return false;
      if (getCdOverTime()
          != other.getCdOverTime()) return false;
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
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + tag_;
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActive());
      hash = (37 * hash) + CD_OVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCdOverTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData prototype) {
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
     * Protobuf type {@code WidgetSlotData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetSlotData)
        emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.class, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
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
        tag_ = 0;
        materialId_ = 0;
        isActive_ = false;
        cdOverTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData build() {
        emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData buildPartial() {
        emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData result = new emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.tag_ = tag_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.materialId_ = materialId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isActive_ = isActive_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.cdOverTime_ = cdOverTime_;
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
        if (other instanceof emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData) {
          return mergeFrom((emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData other) {
        if (other == emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance()) return this;
        if (other.tag_ != 0) {
          setTagValue(other.getTagValue());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getIsActive() != false) {
          setIsActive(other.getIsActive());
        }
        if (other.getCdOverTime() != 0) {
          setCdOverTime(other.getCdOverTime());
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
                cdOverTime_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 40: {
                tag_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 72: {
                materialId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 96: {
                isActive_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
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

      private int tag_ = 0;
      /**
       * <code>.WidgetSlotTag tag = 5;</code>
       * @return The enum numeric value on the wire for tag.
       */
      @java.lang.Override public int getTagValue() {
        return tag_;
      }
      /**
       * <code>.WidgetSlotTag tag = 5;</code>
       * @param value The enum numeric value on the wire for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagValue(int value) {
        tag_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotTag tag = 5;</code>
       * @return The tag.
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
        emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.forNumber(tag_);
        return result == null ? emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetSlotTag tag = 5;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(emu.protoshift.net.newproto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        tag_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotTag tag = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tag_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 9;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 9;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {

        materialId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean isActive_ ;
      /**
       * <code>bool is_active = 12;</code>
       * @return The isActive.
       */
      @java.lang.Override
      public boolean getIsActive() {
        return isActive_;
      }
      /**
       * <code>bool is_active = 12;</code>
       * @param value The isActive to set.
       * @return This builder for chaining.
       */
      public Builder setIsActive(boolean value) {

        isActive_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_active = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActive() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isActive_ = false;
        onChanged();
        return this;
      }

      private int cdOverTime_ ;
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @return The cdOverTime.
       */
      @java.lang.Override
      public int getCdOverTime() {
        return cdOverTime_;
      }
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @param value The cdOverTime to set.
       * @return This builder for chaining.
       */
      public Builder setCdOverTime(int value) {

        cdOverTime_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdOverTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        cdOverTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetSlotData)
    }

    // @@protoc_insertion_point(class_scope:WidgetSlotData)
    private static final emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData();
    }

    public static emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetSlotData>
        PARSER = new com.google.protobuf.AbstractParser<WidgetSlotData>() {
      @java.lang.Override
      public WidgetSlotData parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetSlotData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetSlotData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetSlotData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetSlotData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024WidgetSlotData.proto\032\023WidgetSlotTag.pr" +
      "oto\"k\n\016WidgetSlotData\022\033\n\003tag\030\005 \001(\0162\016.Wid" +
      "getSlotTag\022\023\n\013material_id\030\t \001(\r\022\021\n\tis_ac" +
      "tive\030\014 \001(\010\022\024\n\014cd_over_time\030\002 \001(\rB\035\n\033emu." +
      "protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.newproto.WidgetSlotTagOuterClass.getDescriptor(),
        });
    internal_static_WidgetSlotData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetSlotData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetSlotData_descriptor,
        new java.lang.String[] { "Tag", "MaterialId", "IsActive", "CdOverTime", });
    emu.protoshift.net.newproto.WidgetSlotTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
