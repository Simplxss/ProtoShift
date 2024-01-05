// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingStageData.proto

package emu.protoshift.net.oldproto;

public final class VintageHuntingStageDataOuterClass {
  private VintageHuntingStageDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingStageDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingStageData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_finish = 4;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 open_time = 12;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 HKIIFCMCGCL = 9;</code>
     * @return The hKIIFCMCGCL.
     */
    int getHKIIFCMCGCL();

    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code VintageHuntingStageData}
   */
  public static final class VintageHuntingStageData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingStageData)
      VintageHuntingStageDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingStageData.newBuilder() to construct.
    private VintageHuntingStageData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingStageData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingStageData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.internal_static_VintageHuntingStageData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.internal_static_VintageHuntingStageData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.class, emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 2;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 4;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 4;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 12;
    private int openTime_ = 0;
    /**
     * <code>uint32 open_time = 12;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int HKIIFCMCGCL_FIELD_NUMBER = 9;
    private int hKIIFCMCGCL_ = 0;
    /**
     * <code>uint32 HKIIFCMCGCL = 9;</code>
     * @return The hKIIFCMCGCL.
     */
    @java.lang.Override
    public int getHKIIFCMCGCL() {
      return hKIIFCMCGCL_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 8;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 8;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
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
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      if (isFinish_ != false) {
        output.writeBool(4, isFinish_);
      }
      if (isOpen_ != false) {
        output.writeBool(8, isOpen_);
      }
      if (hKIIFCMCGCL_ != 0) {
        output.writeUInt32(9, hKIIFCMCGCL_);
      }
      if (openTime_ != 0) {
        output.writeUInt32(12, openTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isFinish_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isOpen_);
      }
      if (hKIIFCMCGCL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, hKIIFCMCGCL_);
      }
      if (openTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, openTime_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData other = (emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getHKIIFCMCGCL()
          != other.getHKIIFCMCGCL()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) + HKIIFCMCGCL_FIELD_NUMBER;
      hash = (53 * hash) + getHKIIFCMCGCL();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData prototype) {
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
     * Protobuf type {@code VintageHuntingStageData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingStageData)
        emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.internal_static_VintageHuntingStageData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.internal_static_VintageHuntingStageData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.class, emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.newBuilder()
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
        stageId_ = 0;
        isFinish_ = false;
        openTime_ = 0;
        hKIIFCMCGCL_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.internal_static_VintageHuntingStageData_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData build() {
        emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData buildPartial() {
        emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData result = new emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.openTime_ = openTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.hKIIFCMCGCL_ = hKIIFCMCGCL_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isOpen_ = isOpen_;
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
        if (other instanceof emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData) {
          return mergeFrom((emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData other) {
        if (other == emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
        if (other.getHKIIFCMCGCL() != 0) {
          setHKIIFCMCGCL(other.getHKIIFCMCGCL());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
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
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 32: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 64: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 64
              case 72: {
                hKIIFCMCGCL_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 72
              case 96: {
                openTime_ = input.readUInt32();
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 4;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 4;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int openTime_ ;
      /**
       * <code>uint32 open_time = 12;</code>
       * @return The openTime.
       */
      @java.lang.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint32 open_time = 12;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {

        openTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        openTime_ = 0;
        onChanged();
        return this;
      }

      private int hKIIFCMCGCL_ ;
      /**
       * <code>uint32 HKIIFCMCGCL = 9;</code>
       * @return The hKIIFCMCGCL.
       */
      @java.lang.Override
      public int getHKIIFCMCGCL() {
        return hKIIFCMCGCL_;
      }
      /**
       * <code>uint32 HKIIFCMCGCL = 9;</code>
       * @param value The hKIIFCMCGCL to set.
       * @return This builder for chaining.
       */
      public Builder setHKIIFCMCGCL(int value) {

        hKIIFCMCGCL_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HKIIFCMCGCL = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHKIIFCMCGCL() {
        bitField0_ = (bitField0_ & ~0x00000008);
        hKIIFCMCGCL_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 8;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isOpen_ = false;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingStageData)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingStageData)
    private static final emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData();
    }

    public static emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingStageData>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingStageData>() {
      @java.lang.Override
      public VintageHuntingStageData parsePartialFrom(
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

    public static com.google.protobuf.Parser<VintageHuntingStageData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingStageData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.VintageHuntingStageDataOuterClass.VintageHuntingStageData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingStageData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingStageData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035VintageHuntingStageData.proto\"w\n\027Vinta" +
      "geHuntingStageData\022\020\n\010stage_id\030\002 \001(\r\022\021\n\t" +
      "is_finish\030\004 \001(\010\022\021\n\topen_time\030\014 \001(\r\022\023\n\013HK" +
      "IIFCMCGCL\030\t \001(\r\022\017\n\007is_open\030\010 \001(\010B\035\n\033emu." +
      "protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingStageData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingStageData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingStageData_descriptor,
        new java.lang.String[] { "StageId", "IsFinish", "OpenTime", "HKIIFCMCGCL", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
