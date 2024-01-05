// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSlotChangeNotify.proto

package emu.protoshift.net.newproto;

public final class WidgetSlotChangeNotifyOuterClass {
  private WidgetSlotChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetSlotChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetSlotChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetSlotData slot = 3;</code>
     * @return Whether the slot field is set.
     */
    boolean hasSlot();
    /**
     * <code>.WidgetSlotData slot = 3;</code>
     * @return The slot.
     */
    emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlot();
    /**
     * <code>.WidgetSlotData slot = 3;</code>
     */
    emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder();

    /**
     * <code>.WidgetSlotOp op = 8;</code>
     * @return The enum numeric value on the wire for op.
     */
    int getOpValue();
    /**
     * <code>.WidgetSlotOp op = 8;</code>
     * @return The op.
     */
    emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp getOp();
  }
  /**
   * Protobuf type {@code WidgetSlotChangeNotify}
   */
  public static final class WidgetSlotChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetSlotChangeNotify)
      WidgetSlotChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetSlotChangeNotify.newBuilder() to construct.
    private WidgetSlotChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetSlotChangeNotify() {
      op_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetSlotChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.class, emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.Builder.class);
    }

    private int bitField0_;
    public static final int SLOT_FIELD_NUMBER = 3;
    private emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData slot_;
    /**
     * <code>.WidgetSlotData slot = 3;</code>
     * @return Whether the slot field is set.
     */
    @java.lang.Override
    public boolean hasSlot() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.WidgetSlotData slot = 3;</code>
     * @return The slot.
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlot() {
      return slot_ == null ? emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : slot_;
    }
    /**
     * <code>.WidgetSlotData slot = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder() {
      return slot_ == null ? emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : slot_;
    }

    public static final int OP_FIELD_NUMBER = 8;
    private int op_ = 0;
    /**
     * <code>.WidgetSlotOp op = 8;</code>
     * @return The enum numeric value on the wire for op.
     */
    @java.lang.Override public int getOpValue() {
      return op_;
    }
    /**
     * <code>.WidgetSlotOp op = 8;</code>
     * @return The op.
     */
    @java.lang.Override public emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
      emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.forNumber(op_);
      return result == null ? emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
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
        output.writeMessage(3, getSlot());
      }
      if (op_ != emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        output.writeEnum(8, op_);
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
          .computeMessageSize(3, getSlot());
      }
      if (op_ != emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.WIDGET_SLOT_OP_ATTACH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, op_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify other = (emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify) obj;

      if (hasSlot() != other.hasSlot()) return false;
      if (hasSlot()) {
        if (!getSlot()
            .equals(other.getSlot())) return false;
      }
      if (op_ != other.op_) return false;
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
      if (hasSlot()) {
        hash = (37 * hash) + SLOT_FIELD_NUMBER;
        hash = (53 * hash) + getSlot().hashCode();
      }
      hash = (37 * hash) + OP_FIELD_NUMBER;
      hash = (53 * hash) + op_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify prototype) {
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
     * Protobuf type {@code WidgetSlotChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetSlotChangeNotify)
        emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.class, emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.newBuilder()
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
          getSlotFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        slot_ = null;
        if (slotBuilder_ != null) {
          slotBuilder_.dispose();
          slotBuilder_ = null;
        }
        op_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.internal_static_WidgetSlotChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify build() {
        emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify buildPartial() {
        emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify result = new emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.slot_ = slotBuilder_ == null
              ? slot_
              : slotBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.op_ = op_;
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
        if (other instanceof emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify) {
          return mergeFrom((emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify other) {
        if (other == emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify.getDefaultInstance()) return this;
        if (other.hasSlot()) {
          mergeSlot(other.getSlot());
        }
        if (other.op_ != 0) {
          setOpValue(other.getOpValue());
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
              case 26: {
                input.readMessage(
                    getSlotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 26
              case 64: {
                op_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
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

      private emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData slot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> slotBuilder_;
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       * @return Whether the slot field is set.
       */
      public boolean hasSlot() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       * @return The slot.
       */
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData getSlot() {
        if (slotBuilder_ == null) {
          return slot_ == null ? emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : slot_;
        } else {
          return slotBuilder_.getMessage();
        }
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public Builder setSlot(emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          slot_ = value;
        } else {
          slotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public Builder setSlot(
          emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder builderForValue) {
        if (slotBuilder_ == null) {
          slot_ = builderForValue.build();
        } else {
          slotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public Builder mergeSlot(emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData value) {
        if (slotBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            slot_ != null &&
            slot_ != emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance()) {
            getSlotBuilder().mergeFrom(value);
          } else {
            slot_ = value;
          }
        } else {
          slotBuilder_.mergeFrom(value);
        }
        if (slot_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public Builder clearSlot() {
        bitField0_ = (bitField0_ & ~0x00000001);
        slot_ = null;
        if (slotBuilder_ != null) {
          slotBuilder_.dispose();
          slotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder getSlotBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSlotFieldBuilder().getBuilder();
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      public emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder getSlotOrBuilder() {
        if (slotBuilder_ != null) {
          return slotBuilder_.getMessageOrBuilder();
        } else {
          return slot_ == null ?
              emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance() : slot_;
        }
      }
      /**
       * <code>.WidgetSlotData slot = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder> 
          getSlotFieldBuilder() {
        if (slotBuilder_ == null) {
          slotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotData.Builder, emu.protoshift.net.newproto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder>(
                  getSlot(),
                  getParentForChildren(),
                  isClean());
          slot_ = null;
        }
        return slotBuilder_;
      }

      private int op_ = 0;
      /**
       * <code>.WidgetSlotOp op = 8;</code>
       * @return The enum numeric value on the wire for op.
       */
      @java.lang.Override public int getOpValue() {
        return op_;
      }
      /**
       * <code>.WidgetSlotOp op = 8;</code>
       * @param value The enum numeric value on the wire for op to set.
       * @return This builder for chaining.
       */
      public Builder setOpValue(int value) {
        op_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 8;</code>
       * @return The op.
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp getOp() {
        emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp result = emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.forNumber(op_);
        return result == null ? emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetSlotOp op = 8;</code>
       * @param value The op to set.
       * @return This builder for chaining.
       */
      public Builder setOp(emu.protoshift.net.newproto.WidgetSlotOpOuterClass.WidgetSlotOp value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        op_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotOp op = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        op_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetSlotChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetSlotChangeNotify)
    private static final emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify();
    }

    public static emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetSlotChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetSlotChangeNotify>() {
      @java.lang.Override
      public WidgetSlotChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetSlotChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetSlotChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.WidgetSlotChangeNotifyOuterClass.WidgetSlotChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetSlotChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetSlotChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034WidgetSlotChangeNotify.proto\032\024WidgetSl" +
      "otData.proto\032\022WidgetSlotOp.proto\"R\n\026Widg" +
      "etSlotChangeNotify\022\035\n\004slot\030\003 \001(\0132\017.Widge" +
      "tSlotData\022\031\n\002op\030\010 \001(\0162\r.WidgetSlotOpB\035\n\033" +
      "emu.protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.newproto.WidgetSlotDataOuterClass.getDescriptor(),
          emu.protoshift.net.newproto.WidgetSlotOpOuterClass.getDescriptor(),
        });
    internal_static_WidgetSlotChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetSlotChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetSlotChangeNotify_descriptor,
        new java.lang.String[] { "Slot", "Op", });
    emu.protoshift.net.newproto.WidgetSlotDataOuterClass.getDescriptor();
    emu.protoshift.net.newproto.WidgetSlotOpOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
