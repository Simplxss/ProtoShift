// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CJCLCFNAGDO.proto

package emu.protoshift.net.oldproto;

public final class CJCLCFNAGDOOuterClass {
  private CJCLCFNAGDOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CJCLCFNAGDOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CJCLCFNAGDO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @return The lIDKBBLDDOK.
     */
    int getLIDKBBLDDOK();

    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code CJCLCFNAGDO}
   */
  public static final class CJCLCFNAGDO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CJCLCFNAGDO)
      CJCLCFNAGDOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CJCLCFNAGDO.newBuilder() to construct.
    private CJCLCFNAGDO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CJCLCFNAGDO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CJCLCFNAGDO();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.Builder.class);
    }

    public static final int LIDKBBLDDOK_FIELD_NUMBER = 6;
    private int lIDKBBLDDOK_ = 0;
    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @return The lIDKBBLDDOK.
     */
    @java.lang.Override
    public int getLIDKBBLDDOK() {
      return lIDKBBLDDOK_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 13;
    private int minFinishTime_ = 0;
    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 11;
    private boolean isOpen_ = false;
    /**
     * <code>bool is_open = 11;</code>
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
      if (lIDKBBLDDOK_ != 0) {
        output.writeUInt32(6, lIDKBBLDDOK_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(11, isOpen_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(13, minFinishTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lIDKBBLDDOK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, lIDKBBLDDOK_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isOpen_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, minFinishTime_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO other = (emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) obj;

      if (getLIDKBBLDDOK()
          != other.getLIDKBBLDDOK()) return false;
      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + LIDKBBLDDOK_FIELD_NUMBER;
      hash = (53 * hash) + getLIDKBBLDDOK();
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO prototype) {
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
     * Protobuf type {@code CJCLCFNAGDO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CJCLCFNAGDO)
        emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.newBuilder()
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
        lIDKBBLDDOK_ = 0;
        minFinishTime_ = 0;
        levelId_ = 0;
        isOpen_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO build() {
        emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO buildPartial() {
        emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result = new emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.lIDKBBLDDOK_ = lIDKBBLDDOK_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.minFinishTime_ = minFinishTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) {
          return mergeFrom((emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO other) {
        if (other == emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.getDefaultInstance()) return this;
        if (other.getLIDKBBLDDOK() != 0) {
          setLIDKBBLDDOK(other.getLIDKBBLDDOK());
        }
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
              case 48: {
                lIDKBBLDDOK_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 80: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 88: {
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
              case 104: {
                minFinishTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int lIDKBBLDDOK_ ;
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @return The lIDKBBLDDOK.
       */
      @java.lang.Override
      public int getLIDKBBLDDOK() {
        return lIDKBBLDDOK_;
      }
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @param value The lIDKBBLDDOK to set.
       * @return This builder for chaining.
       */
      public Builder setLIDKBBLDDOK(int value) {

        lIDKBBLDDOK_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearLIDKBBLDDOK() {
        bitField0_ = (bitField0_ & ~0x00000001);
        lIDKBBLDDOK_ = 0;
        onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {

        minFinishTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 11;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {

        isOpen_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000008);
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


      // @@protoc_insertion_point(builder_scope:CJCLCFNAGDO)
    }

    // @@protoc_insertion_point(class_scope:CJCLCFNAGDO)
    private static final emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO();
    }

    public static emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CJCLCFNAGDO>
        PARSER = new com.google.protobuf.AbstractParser<CJCLCFNAGDO>() {
      @java.lang.Override
      public CJCLCFNAGDO parsePartialFrom(
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

    public static com.google.protobuf.Parser<CJCLCFNAGDO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CJCLCFNAGDO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CJCLCFNAGDO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CJCLCFNAGDO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CJCLCFNAGDO.proto\"^\n\013CJCLCFNAGDO\022\023\n\013LI" +
      "DKBBLDDOK\030\006 \001(\r\022\027\n\017min_finish_time\030\r \001(\r" +
      "\022\020\n\010level_id\030\n \001(\r\022\017\n\007is_open\030\013 \001(\010B\035\n\033e" +
      "mu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CJCLCFNAGDO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CJCLCFNAGDO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CJCLCFNAGDO_descriptor,
        new java.lang.String[] { "LIDKBBLDDOK", "MinFinishTime", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
