// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryWillStartCountdownNotify.proto

package emu.protoshift.net.oldproto;

public final class GalleryWillStartCountdownNotifyOuterClass {
  private GalleryWillStartCountdownNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryWillStartCountdownNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryWillStartCountdownNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The startSource.
     */
    emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>bool is_end = 9;</code>
     * @return The isEnd.
     */
    boolean getIsEnd();

    /**
     * <code>uint32 end_time = 4;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 26134
   * Obf: KCENJJNMBDM
   * </pre>
   *
   * Protobuf type {@code GalleryWillStartCountdownNotify}
   */
  public static final class GalleryWillStartCountdownNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryWillStartCountdownNotify)
      GalleryWillStartCountdownNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryWillStartCountdownNotify.newBuilder() to construct.
    private GalleryWillStartCountdownNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryWillStartCountdownNotify() {
      startSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryWillStartCountdownNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
    }

    public static final int START_SOURCE_FIELD_NUMBER = 11;
    private int startSource_ = 0;
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.forNumber(startSource_);
      return result == null ? emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int IS_END_FIELD_NUMBER = 9;
    private boolean isEnd_ = false;
    /**
     * <code>bool is_end = 9;</code>
     * @return The isEnd.
     */
    @java.lang.Override
    public boolean getIsEnd() {
      return isEnd_;
    }

    public static final int END_TIME_FIELD_NUMBER = 4;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 4;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 6;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (endTime_ != 0) {
        output.writeUInt32(4, endTime_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(6, galleryId_);
      }
      if (isEnd_ != false) {
        output.writeBool(9, isEnd_);
      }
      if (startSource_ != emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        output.writeEnum(11, startSource_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, endTime_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, galleryId_);
      }
      if (isEnd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isEnd_);
      }
      if (startSource_ != emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, startSource_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other = (emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) obj;

      if (startSource_ != other.startSource_) return false;
      if (getIsEnd()
          != other.getIsEnd()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + IS_END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnd());
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify prototype) {
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
     * CmdId: 26134
     * Obf: KCENJJNMBDM
     * </pre>
     *
     * Protobuf type {@code GalleryWillStartCountdownNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryWillStartCountdownNotify)
        emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.newBuilder()
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
        startSource_ = 0;
        isEnd_ = false;
        endTime_ = 0;
        galleryId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify build() {
        emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify buildPartial() {
        emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = new emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startSource_ = startSource_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isEnd_ = isEnd_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.endTime_ = endTime_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.galleryId_ = galleryId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other) {
        if (other == emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance()) return this;
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getIsEnd() != false) {
          setIsEnd(other.getIsEnd());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
                endTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
              case 48: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 72: {
                isEnd_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 88: {
                startSource_ = input.readEnum();
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

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        startSource_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.forNumber(startSource_);
        return result == null ? emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startSource_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnd_ ;
      /**
       * <code>bool is_end = 9;</code>
       * @return The isEnd.
       */
      @java.lang.Override
      public boolean getIsEnd() {
        return isEnd_;
      }
      /**
       * <code>bool is_end = 9;</code>
       * @param value The isEnd to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnd(boolean value) {

        isEnd_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_end = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isEnd_ = false;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 4;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 4;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {

        endTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {

        galleryId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryWillStartCountdownNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryWillStartCountdownNotify)
    private static final emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify();
    }

    public static emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryWillStartCountdownNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryWillStartCountdownNotify>() {
      @java.lang.Override
      public GalleryWillStartCountdownNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GalleryWillStartCountdownNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryWillStartCountdownNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryWillStartCountdownNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%GalleryWillStartCountdownNotify.proto\032" +
      "\030GalleryStartSource.proto\"\202\001\n\037GalleryWil" +
      "lStartCountdownNotify\022)\n\014start_source\030\013 " +
      "\001(\0162\023.GalleryStartSource\022\016\n\006is_end\030\t \001(\010" +
      "\022\020\n\010end_time\030\004 \001(\r\022\022\n\ngallery_id\030\006 \001(\rB\035" +
      "\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.getDescriptor(),
        });
    internal_static_GalleryWillStartCountdownNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryWillStartCountdownNotify_descriptor,
        new java.lang.String[] { "StartSource", "IsEnd", "EndTime", "GalleryId", });
    emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
