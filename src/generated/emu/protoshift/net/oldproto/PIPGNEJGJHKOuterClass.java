// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PIPGNEJGJHK.proto

package emu.protoshift.net.oldproto;

public final class PIPGNEJGJHKOuterClass {
  private PIPGNEJGJHKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PIPGNEJGJHKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PIPGNEJGJHK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector hint_center_pos = 5;</code>
     * @return Whether the hintCenterPos field is set.
     */
    boolean hasHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 5;</code>
     * @return The hintCenterPos.
     */
    emu.protoshift.net.oldproto.VectorOuterClass.Vector getHintCenterPos();
    /**
     * <code>.Vector hint_center_pos = 5;</code>
     */
    emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder();

    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 offering_id = 13;</code>
     * @return The offeringId.
     */
    int getOfferingId();

    /**
     * <code>uint32 group_id = 6;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 hint_radius = 1;</code>
     * @return The hintRadius.
     */
    int getHintRadius();
  }
  /**
   * <pre>
   * CmdId: 8729
   * </pre>
   *
   * Protobuf type {@code PIPGNEJGJHK}
   */
  public static final class PIPGNEJGJHK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PIPGNEJGJHK)
      PIPGNEJGJHKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PIPGNEJGJHK.newBuilder() to construct.
    private PIPGNEJGJHK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PIPGNEJGJHK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PIPGNEJGJHK();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.internal_static_PIPGNEJGJHK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.internal_static_PIPGNEJGJHK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.class, emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.Builder.class);
    }

    private int bitField0_;
    public static final int HINT_CENTER_POS_FIELD_NUMBER = 5;
    private emu.protoshift.net.oldproto.VectorOuterClass.Vector hintCenterPos_;
    /**
     * <code>.Vector hint_center_pos = 5;</code>
     * @return Whether the hintCenterPos field is set.
     */
    @java.lang.Override
    public boolean hasHintCenterPos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Vector hint_center_pos = 5;</code>
     * @return The hintCenterPos.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.Vector getHintCenterPos() {
      return hintCenterPos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }
    /**
     * <code>.Vector hint_center_pos = 5;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
      return hintCenterPos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 7;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 7;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int OFFERING_ID_FIELD_NUMBER = 13;
    private int offeringId_ = 0;
    /**
     * <code>uint32 offering_id = 13;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 6;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 6;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int HINT_RADIUS_FIELD_NUMBER = 1;
    private int hintRadius_ = 0;
    /**
     * <code>uint32 hint_radius = 1;</code>
     * @return The hintRadius.
     */
    @java.lang.Override
    public int getHintRadius() {
      return hintRadius_;
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
      if (hintRadius_ != 0) {
        output.writeUInt32(1, hintRadius_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(5, getHintCenterPos());
      }
      if (groupId_ != 0) {
        output.writeUInt32(6, groupId_);
      }
      if (configId_ != 0) {
        output.writeUInt32(7, configId_);
      }
      if (offeringId_ != 0) {
        output.writeUInt32(13, offeringId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hintRadius_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, hintRadius_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getHintCenterPos());
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, groupId_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, configId_);
      }
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, offeringId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK other = (emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK) obj;

      if (hasHintCenterPos() != other.hasHintCenterPos()) return false;
      if (hasHintCenterPos()) {
        if (!getHintCenterPos()
            .equals(other.getHintCenterPos())) return false;
      }
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getOfferingId()
          != other.getOfferingId()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getHintRadius()
          != other.getHintRadius()) return false;
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
      if (hasHintCenterPos()) {
        hash = (37 * hash) + HINT_CENTER_POS_FIELD_NUMBER;
        hash = (53 * hash) + getHintCenterPos().hashCode();
      }
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + OFFERING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + HINT_RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getHintRadius();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK prototype) {
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
     * CmdId: 8729
     * </pre>
     *
     * Protobuf type {@code PIPGNEJGJHK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PIPGNEJGJHK)
        emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.internal_static_PIPGNEJGJHK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.internal_static_PIPGNEJGJHK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.class, emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.newBuilder()
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
          getHintCenterPosFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        configId_ = 0;
        offeringId_ = 0;
        groupId_ = 0;
        hintRadius_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.internal_static_PIPGNEJGJHK_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK build() {
        emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK buildPartial() {
        emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK result = new emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.hintCenterPos_ = hintCenterPosBuilder_ == null
              ? hintCenterPos_
              : hintCenterPosBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.configId_ = configId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.offeringId_ = offeringId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.groupId_ = groupId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.hintRadius_ = hintRadius_;
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
        if (other instanceof emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK) {
          return mergeFrom((emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK other) {
        if (other == emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK.getDefaultInstance()) return this;
        if (other.hasHintCenterPos()) {
          mergeHintCenterPos(other.getHintCenterPos());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getHintRadius() != 0) {
          setHintRadius(other.getHintRadius());
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
              case 8: {
                hintRadius_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 8
              case 42: {
                input.readMessage(
                    getHintCenterPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 42
              case 48: {
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
              case 56: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 104: {
                offeringId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private emu.protoshift.net.oldproto.VectorOuterClass.Vector hintCenterPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> hintCenterPosBuilder_;
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       * @return Whether the hintCenterPos field is set.
       */
      public boolean hasHintCenterPos() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       * @return The hintCenterPos.
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector getHintCenterPos() {
        if (hintCenterPosBuilder_ == null) {
          return hintCenterPos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        } else {
          return hintCenterPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public Builder setHintCenterPos(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          hintCenterPos_ = value;
        } else {
          hintCenterPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public Builder setHintCenterPos(
          emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPos_ = builderForValue.build();
        } else {
          hintCenterPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public Builder mergeHintCenterPos(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (hintCenterPosBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            hintCenterPos_ != null &&
            hintCenterPos_ != emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance()) {
            getHintCenterPosBuilder().mergeFrom(value);
          } else {
            hintCenterPos_ = value;
          }
        } else {
          hintCenterPosBuilder_.mergeFrom(value);
        }
        if (hintCenterPos_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public Builder clearHintCenterPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        hintCenterPos_ = null;
        if (hintCenterPosBuilder_ != null) {
          hintCenterPosBuilder_.dispose();
          hintCenterPosBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder getHintCenterPosBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHintCenterPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getHintCenterPosOrBuilder() {
        if (hintCenterPosBuilder_ != null) {
          return hintCenterPosBuilder_.getMessageOrBuilder();
        } else {
          return hintCenterPos_ == null ?
              emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : hintCenterPos_;
        }
      }
      /**
       * <code>.Vector hint_center_pos = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getHintCenterPosFieldBuilder() {
        if (hintCenterPosBuilder_ == null) {
          hintCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getHintCenterPos(),
                  getParentForChildren(),
                  isClean());
          hintCenterPos_ = null;
        }
        return hintCenterPosBuilder_;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 7;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {

        configId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        configId_ = 0;
        onChanged();
        return this;
      }

      private int offeringId_ ;
      /**
       * <code>uint32 offering_id = 13;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offering_id = 13;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {

        offeringId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offering_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        offeringId_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 6;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 6;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int hintRadius_ ;
      /**
       * <code>uint32 hint_radius = 1;</code>
       * @return The hintRadius.
       */
      @java.lang.Override
      public int getHintRadius() {
        return hintRadius_;
      }
      /**
       * <code>uint32 hint_radius = 1;</code>
       * @param value The hintRadius to set.
       * @return This builder for chaining.
       */
      public Builder setHintRadius(int value) {

        hintRadius_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hint_radius = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintRadius() {
        bitField0_ = (bitField0_ & ~0x00000010);
        hintRadius_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PIPGNEJGJHK)
    }

    // @@protoc_insertion_point(class_scope:PIPGNEJGJHK)
    private static final emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK();
    }

    public static emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PIPGNEJGJHK>
        PARSER = new com.google.protobuf.AbstractParser<PIPGNEJGJHK>() {
      @java.lang.Override
      public PIPGNEJGJHK parsePartialFrom(
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

    public static com.google.protobuf.Parser<PIPGNEJGJHK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PIPGNEJGJHK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PIPGNEJGJHKOuterClass.PIPGNEJGJHK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PIPGNEJGJHK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PIPGNEJGJHK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PIPGNEJGJHK.proto\032\014Vector.proto\"~\n\013PIP" +
      "GNEJGJHK\022 \n\017hint_center_pos\030\005 \001(\0132\007.Vect" +
      "or\022\021\n\tconfig_id\030\007 \001(\r\022\023\n\013offering_id\030\r \001" +
      "(\r\022\020\n\010group_id\030\006 \001(\r\022\023\n\013hint_radius\030\001 \001(" +
      "\rB\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_PIPGNEJGJHK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PIPGNEJGJHK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PIPGNEJGJHK_descriptor,
        new java.lang.String[] { "HintCenterPos", "ConfigId", "OfferingId", "GroupId", "HintRadius", });
    emu.protoshift.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
