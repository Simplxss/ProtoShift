// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MNNNLMGHOFG.proto

package emu.protoshift.net.oldproto;

public final class MNNNLMGHOFGOuterClass {
  private MNNNLMGHOFGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MNNNLMGHOFGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MNNNLMGHOFG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>uint32 hit_count = 10;</code>
     * @return The hitCount.
     */
    int getHitCount();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * Protobuf type {@code MNNNLMGHOFG}
   */
  public static final class MNNNLMGHOFG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MNNNLMGHOFG)
      MNNNLMGHOFGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MNNNLMGHOFG.newBuilder() to construct.
    private MNNNLMGHOFG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MNNNLMGHOFG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MNNNLMGHOFG();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.internal_static_MNNNLMGHOFG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.internal_static_MNNNLMGHOFG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.class, emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 11;
    private int galleryId_ = 0;
    /**
     * <code>uint32 gallery_id = 11;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int HIT_COUNT_FIELD_NUMBER = 10;
    private int hitCount_ = 0;
    /**
     * <code>uint32 hit_count = 10;</code>
     * @return The hitCount.
     */
    @java.lang.Override
    public int getHitCount() {
      return hitCount_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
      if (hitCount_ != 0) {
        output.writeUInt32(10, hitCount_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(11, galleryId_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, hitCount_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, galleryId_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG other = (emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getHitCount()
          != other.getHitCount()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + HIT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getHitCount();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG prototype) {
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
     * Protobuf type {@code MNNNLMGHOFG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MNNNLMGHOFG)
        emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.internal_static_MNNNLMGHOFG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.internal_static_MNNNLMGHOFG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.class, emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.newBuilder()
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
        galleryId_ = 0;
        hitCount_ = 0;
        isSuccess_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.internal_static_MNNNLMGHOFG_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG build() {
        emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG buildPartial() {
        emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG result = new emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.galleryId_ = galleryId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hitCount_ = hitCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isSuccess_ = isSuccess_;
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
        if (other instanceof emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG) {
          return mergeFrom((emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG other) {
        if (other == emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG.getDefaultInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getHitCount() != 0) {
          setHitCount(other.getHitCount());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
              case 80: {
                hitCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 88: {
                galleryId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 96: {
                isSuccess_ = input.readBool();
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

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {

        galleryId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private int hitCount_ ;
      /**
       * <code>uint32 hit_count = 10;</code>
       * @return The hitCount.
       */
      @java.lang.Override
      public int getHitCount() {
        return hitCount_;
      }
      /**
       * <code>uint32 hit_count = 10;</code>
       * @param value The hitCount to set.
       * @return This builder for chaining.
       */
      public Builder setHitCount(int value) {

        hitCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hit_count = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hitCount_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:MNNNLMGHOFG)
    }

    // @@protoc_insertion_point(class_scope:MNNNLMGHOFG)
    private static final emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG();
    }

    public static emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MNNNLMGHOFG>
        PARSER = new com.google.protobuf.AbstractParser<MNNNLMGHOFG>() {
      @java.lang.Override
      public MNNNLMGHOFG parsePartialFrom(
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

    public static com.google.protobuf.Parser<MNNNLMGHOFG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MNNNLMGHOFG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.MNNNLMGHOFGOuterClass.MNNNLMGHOFG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MNNNLMGHOFG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MNNNLMGHOFG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MNNNLMGHOFG.proto\"H\n\013MNNNLMGHOFG\022\022\n\nga" +
      "llery_id\030\013 \001(\r\022\021\n\thit_count\030\n \001(\r\022\022\n\nis_" +
      "success\030\014 \001(\010B\035\n\033emu.protoshift.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MNNNLMGHOFG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MNNNLMGHOFG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MNNNLMGHOFG_descriptor,
        new java.lang.String[] { "GalleryId", "HitCount", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
