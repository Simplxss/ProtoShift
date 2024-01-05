// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryHandballInfo.proto

package emu.protoshift.net.oldproto;

public final class SceneGalleryHandballInfoOuterClass {
  private SceneGalleryHandballInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryHandballInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryHandballInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     * @return Whether the ballPlaceInfo field is set.
     */
    boolean hasBallPlaceInfo();
    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     * @return The ballPlaceInfo.
     */
    emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo getBallPlaceInfo();
    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     */
    emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder getBallPlaceInfoOrBuilder();

    /**
     * <code>bool is_have_ball = 11;</code>
     * @return The isHaveBall.
     */
    boolean getIsHaveBall();
  }
  /**
   * <pre>
   * Obf: MOPFLELCLBI
   * </pre>
   *
   * Protobuf type {@code SceneGalleryHandballInfo}
   */
  public static final class SceneGalleryHandballInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryHandballInfo)
      SceneGalleryHandballInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryHandballInfo.newBuilder() to construct.
    private SceneGalleryHandballInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryHandballInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryHandballInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.internal_static_SceneGalleryHandballInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.internal_static_SceneGalleryHandballInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.class, emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.Builder.class);
    }

    private int bitField0_;
    public static final int BALL_PLACE_INFO_FIELD_NUMBER = 9;
    private emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo ballPlaceInfo_;
    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     * @return Whether the ballPlaceInfo field is set.
     */
    @java.lang.Override
    public boolean hasBallPlaceInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     * @return The ballPlaceInfo.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo getBallPlaceInfo() {
      return ballPlaceInfo_ == null ? emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.getDefaultInstance() : ballPlaceInfo_;
    }
    /**
     * <code>.PlaceInfo ball_place_info = 9;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder getBallPlaceInfoOrBuilder() {
      return ballPlaceInfo_ == null ? emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.getDefaultInstance() : ballPlaceInfo_;
    }

    public static final int IS_HAVE_BALL_FIELD_NUMBER = 11;
    private boolean isHaveBall_ = false;
    /**
     * <code>bool is_have_ball = 11;</code>
     * @return The isHaveBall.
     */
    @java.lang.Override
    public boolean getIsHaveBall() {
      return isHaveBall_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(9, getBallPlaceInfo());
      }
      if (isHaveBall_ != false) {
        output.writeBool(11, isHaveBall_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getBallPlaceInfo());
      }
      if (isHaveBall_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isHaveBall_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo other = (emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo) obj;

      if (hasBallPlaceInfo() != other.hasBallPlaceInfo()) return false;
      if (hasBallPlaceInfo()) {
        if (!getBallPlaceInfo()
            .equals(other.getBallPlaceInfo())) return false;
      }
      if (getIsHaveBall()
          != other.getIsHaveBall()) return false;
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
      if (hasBallPlaceInfo()) {
        hash = (37 * hash) + BALL_PLACE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBallPlaceInfo().hashCode();
      }
      hash = (37 * hash) + IS_HAVE_BALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveBall());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo prototype) {
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
     * Obf: MOPFLELCLBI
     * </pre>
     *
     * Protobuf type {@code SceneGalleryHandballInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryHandballInfo)
        emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.internal_static_SceneGalleryHandballInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.internal_static_SceneGalleryHandballInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.class, emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getBallPlaceInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        ballPlaceInfo_ = null;
        if (ballPlaceInfoBuilder_ != null) {
          ballPlaceInfoBuilder_.dispose();
          ballPlaceInfoBuilder_ = null;
        }
        isHaveBall_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.internal_static_SceneGalleryHandballInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo build() {
        emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo buildPartial() {
        emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo result = new emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ballPlaceInfo_ = ballPlaceInfoBuilder_ == null
              ? ballPlaceInfo_
              : ballPlaceInfoBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isHaveBall_ = isHaveBall_;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo other) {
        if (other == emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo.getDefaultInstance()) return this;
        if (other.hasBallPlaceInfo()) {
          mergeBallPlaceInfo(other.getBallPlaceInfo());
        }
        if (other.getIsHaveBall() != false) {
          setIsHaveBall(other.getIsHaveBall());
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
              case 74: {
                input.readMessage(
                    getBallPlaceInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 74
              case 88: {
                isHaveBall_ = input.readBool();
                bitField0_ |= 0x00000002;
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

      private emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo ballPlaceInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.Builder, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder> ballPlaceInfoBuilder_;
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       * @return Whether the ballPlaceInfo field is set.
       */
      public boolean hasBallPlaceInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       * @return The ballPlaceInfo.
       */
      public emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo getBallPlaceInfo() {
        if (ballPlaceInfoBuilder_ == null) {
          return ballPlaceInfo_ == null ? emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.getDefaultInstance() : ballPlaceInfo_;
        } else {
          return ballPlaceInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public Builder setBallPlaceInfo(emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo value) {
        if (ballPlaceInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ballPlaceInfo_ = value;
        } else {
          ballPlaceInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public Builder setBallPlaceInfo(
          emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.Builder builderForValue) {
        if (ballPlaceInfoBuilder_ == null) {
          ballPlaceInfo_ = builderForValue.build();
        } else {
          ballPlaceInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public Builder mergeBallPlaceInfo(emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo value) {
        if (ballPlaceInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            ballPlaceInfo_ != null &&
            ballPlaceInfo_ != emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.getDefaultInstance()) {
            getBallPlaceInfoBuilder().mergeFrom(value);
          } else {
            ballPlaceInfo_ = value;
          }
        } else {
          ballPlaceInfoBuilder_.mergeFrom(value);
        }
        if (ballPlaceInfo_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public Builder clearBallPlaceInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ballPlaceInfo_ = null;
        if (ballPlaceInfoBuilder_ != null) {
          ballPlaceInfoBuilder_.dispose();
          ballPlaceInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.Builder getBallPlaceInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBallPlaceInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      public emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder getBallPlaceInfoOrBuilder() {
        if (ballPlaceInfoBuilder_ != null) {
          return ballPlaceInfoBuilder_.getMessageOrBuilder();
        } else {
          return ballPlaceInfo_ == null ?
              emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.getDefaultInstance() : ballPlaceInfo_;
        }
      }
      /**
       * <code>.PlaceInfo ball_place_info = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.Builder, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder> 
          getBallPlaceInfoFieldBuilder() {
        if (ballPlaceInfoBuilder_ == null) {
          ballPlaceInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfo.Builder, emu.protoshift.net.oldproto.PlaceInfoOuterClass.PlaceInfoOrBuilder>(
                  getBallPlaceInfo(),
                  getParentForChildren(),
                  isClean());
          ballPlaceInfo_ = null;
        }
        return ballPlaceInfoBuilder_;
      }

      private boolean isHaveBall_ ;
      /**
       * <code>bool is_have_ball = 11;</code>
       * @return The isHaveBall.
       */
      @java.lang.Override
      public boolean getIsHaveBall() {
        return isHaveBall_;
      }
      /**
       * <code>bool is_have_ball = 11;</code>
       * @param value The isHaveBall to set.
       * @return This builder for chaining.
       */
      public Builder setIsHaveBall(boolean value) {

        isHaveBall_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_have_ball = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveBall() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isHaveBall_ = false;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryHandballInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryHandballInfo)
    private static final emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo();
    }

    public static emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryHandballInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryHandballInfo>() {
      @java.lang.Override
      public SceneGalleryHandballInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryHandballInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryHandballInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SceneGalleryHandballInfoOuterClass.SceneGalleryHandballInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryHandballInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryHandballInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SceneGalleryHandballInfo.proto\032\017PlaceI" +
      "nfo.proto\"U\n\030SceneGalleryHandballInfo\022#\n" +
      "\017ball_place_info\030\t \001(\0132\n.PlaceInfo\022\024\n\014is" +
      "_have_ball\030\013 \001(\010B\035\n\033emu.protoshift.net.o" +
      "ldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.PlaceInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryHandballInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryHandballInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryHandballInfo_descriptor,
        new java.lang.String[] { "BallPlaceInfo", "IsHaveBall", });
    emu.protoshift.net.oldproto.PlaceInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
