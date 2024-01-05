// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgCostRevise.proto

package emu.protoshift.net.oldproto;

public final class GCGMsgCostReviseOuterClass {
  private GCGMsgCostReviseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgCostReviseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgCostRevise)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     * @return Whether the costRevise field is set.
     */
    boolean hasCostRevise();
    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     * @return The costRevise.
     */
    emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise();
    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     */
    emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder();

    /**
     * <code>uint32 controller_id = 12;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * <pre>
   * Obf: PNMMBIJFGHP
   * </pre>
   *
   * Protobuf type {@code GCGMsgCostRevise}
   */
  public static final class GCGMsgCostRevise extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgCostRevise)
      GCGMsgCostReviseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgCostRevise.newBuilder() to construct.
    private GCGMsgCostRevise(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgCostRevise() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgCostRevise();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.class, emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.Builder.class);
    }

    private int bitField0_;
    public static final int COST_REVISE_FIELD_NUMBER = 8;
    private emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo costRevise_;
    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     * @return Whether the costRevise field is set.
     */
    @java.lang.Override
    public boolean hasCostRevise() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     * @return The costRevise.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise() {
      return costRevise_ == null ? emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
    }
    /**
     * <code>.GCGCostReviseInfo cost_revise = 8;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder() {
      return costRevise_ == null ? emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 12;
    private int controllerId_ = 0;
    /**
     * <code>uint32 controller_id = 12;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
        output.writeMessage(8, getCostRevise());
      }
      if (controllerId_ != 0) {
        output.writeUInt32(12, controllerId_);
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
          .computeMessageSize(8, getCostRevise());
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, controllerId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise other = (emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise) obj;

      if (hasCostRevise() != other.hasCostRevise()) return false;
      if (hasCostRevise()) {
        if (!getCostRevise()
            .equals(other.getCostRevise())) return false;
      }
      if (getControllerId()
          != other.getControllerId()) return false;
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
      if (hasCostRevise()) {
        hash = (37 * hash) + COST_REVISE_FIELD_NUMBER;
        hash = (53 * hash) + getCostRevise().hashCode();
      }
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise prototype) {
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
     * Obf: PNMMBIJFGHP
     * </pre>
     *
     * Protobuf type {@code GCGMsgCostRevise}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgCostRevise)
        emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostReviseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.class, emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.newBuilder()
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
          getCostReviseFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        costRevise_ = null;
        if (costReviseBuilder_ != null) {
          costReviseBuilder_.dispose();
          costReviseBuilder_ = null;
        }
        controllerId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.internal_static_GCGMsgCostRevise_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise build() {
        emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise buildPartial() {
        emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise result = new emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.costRevise_ = costReviseBuilder_ == null
              ? costRevise_
              : costReviseBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.controllerId_ = controllerId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise) {
          return mergeFrom((emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise other) {
        if (other == emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise.getDefaultInstance()) return this;
        if (other.hasCostRevise()) {
          mergeCostRevise(other.getCostRevise());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
              case 66: {
                input.readMessage(
                    getCostReviseFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 66
              case 96: {
                controllerId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo costRevise_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder> costReviseBuilder_;
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       * @return Whether the costRevise field is set.
       */
      public boolean hasCostRevise() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       * @return The costRevise.
       */
      public emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo getCostRevise() {
        if (costReviseBuilder_ == null) {
          return costRevise_ == null ? emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
        } else {
          return costReviseBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public Builder setCostRevise(emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo value) {
        if (costReviseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          costRevise_ = value;
        } else {
          costReviseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public Builder setCostRevise(
          emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder builderForValue) {
        if (costReviseBuilder_ == null) {
          costRevise_ = builderForValue.build();
        } else {
          costReviseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public Builder mergeCostRevise(emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo value) {
        if (costReviseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            costRevise_ != null &&
            costRevise_ != emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance()) {
            getCostReviseBuilder().mergeFrom(value);
          } else {
            costRevise_ = value;
          }
        } else {
          costReviseBuilder_.mergeFrom(value);
        }
        if (costRevise_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public Builder clearCostRevise() {
        bitField0_ = (bitField0_ & ~0x00000001);
        costRevise_ = null;
        if (costReviseBuilder_ != null) {
          costReviseBuilder_.dispose();
          costReviseBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder getCostReviseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCostReviseFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      public emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder getCostReviseOrBuilder() {
        if (costReviseBuilder_ != null) {
          return costReviseBuilder_.getMessageOrBuilder();
        } else {
          return costRevise_ == null ?
              emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.getDefaultInstance() : costRevise_;
        }
      }
      /**
       * <code>.GCGCostReviseInfo cost_revise = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder> 
          getCostReviseFieldBuilder() {
        if (costReviseBuilder_ == null) {
          costReviseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfo.Builder, emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.GCGCostReviseInfoOrBuilder>(
                  getCostRevise(),
                  getParentForChildren(),
                  isClean());
          costRevise_ = null;
        }
        return costReviseBuilder_;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 12;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 12;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {

        controllerId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGMsgCostRevise)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgCostRevise)
    private static final emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise();
    }

    public static emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgCostRevise>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgCostRevise>() {
      @java.lang.Override
      public GCGMsgCostRevise parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgCostRevise> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgCostRevise> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGMsgCostReviseOuterClass.GCGMsgCostRevise getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgCostRevise_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgCostRevise_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GCGMsgCostRevise.proto\032\027GCGCostReviseI" +
      "nfo.proto\"R\n\020GCGMsgCostRevise\022\'\n\013cost_re" +
      "vise\030\010 \001(\0132\022.GCGCostReviseInfo\022\025\n\rcontro" +
      "ller_id\030\014 \001(\rB\035\n\033emu.protoshift.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgCostRevise_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgCostRevise_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgCostRevise_descriptor,
        new java.lang.String[] { "CostRevise", "ControllerId", });
    emu.protoshift.net.oldproto.GCGCostReviseInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
