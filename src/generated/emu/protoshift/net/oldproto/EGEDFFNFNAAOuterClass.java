// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EGEDFFNFNAA.proto

package emu.protoshift.net.oldproto;

public final class EGEDFFNFNAAOuterClass {
  private EGEDFFNFNAAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EGEDFFNFNAAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EGEDFFNFNAA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector pos = 11;</code>
     * @return Whether the pos field is set.
     */
    boolean hasPos();
    /**
     * <code>.Vector pos = 11;</code>
     * @return The pos.
     */
    emu.protoshift.net.oldproto.VectorOuterClass.Vector getPos();
    /**
     * <code>.Vector pos = 11;</code>
     */
    emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder();

    /**
     * <code>uint32 guid = 10;</code>
     * @return The guid.
     */
    int getGuid();

    /**
     * <code>uint32 block_id = 8;</code>
     * @return The blockId.
     */
    int getBlockId();

    /**
     * <code>.Vector rot = 6;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.Vector rot = 6;</code>
     * @return The rot.
     */
    emu.protoshift.net.oldproto.VectorOuterClass.Vector getRot();
    /**
     * <code>.Vector rot = 6;</code>
     */
    emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder();
  }
  /**
   * Protobuf type {@code EGEDFFNFNAA}
   */
  public static final class EGEDFFNFNAA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EGEDFFNFNAA)
      EGEDFFNFNAAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EGEDFFNFNAA.newBuilder() to construct.
    private EGEDFFNFNAA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EGEDFFNFNAA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EGEDFFNFNAA();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.internal_static_EGEDFFNFNAA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.internal_static_EGEDFFNFNAA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.class, emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder.class);
    }

    private int bitField0_;
    public static final int POS_FIELD_NUMBER = 11;
    private emu.protoshift.net.oldproto.VectorOuterClass.Vector pos_;
    /**
     * <code>.Vector pos = 11;</code>
     * @return Whether the pos field is set.
     */
    @java.lang.Override
    public boolean hasPos() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Vector pos = 11;</code>
     * @return The pos.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.Vector getPos() {
      return pos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }
    /**
     * <code>.Vector pos = 11;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
      return pos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
    }

    public static final int GUID_FIELD_NUMBER = 10;
    private int guid_ = 0;
    /**
     * <code>uint32 guid = 10;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    public static final int BLOCK_ID_FIELD_NUMBER = 8;
    private int blockId_ = 0;
    /**
     * <code>uint32 block_id = 8;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }

    public static final int ROT_FIELD_NUMBER = 6;
    private emu.protoshift.net.oldproto.VectorOuterClass.Vector rot_;
    /**
     * <code>.Vector rot = 6;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.Vector rot = 6;</code>
     * @return The rot.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.Vector getRot() {
      return rot_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
    }
    /**
     * <code>.Vector rot = 6;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
      return rot_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
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
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(6, getRot());
      }
      if (blockId_ != 0) {
        output.writeUInt32(8, blockId_);
      }
      if (guid_ != 0) {
        output.writeUInt32(10, guid_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(11, getPos());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getRot());
      }
      if (blockId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, blockId_);
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, guid_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getPos());
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
      if (!(obj instanceof emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA other = (emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA) obj;

      if (hasPos() != other.hasPos()) return false;
      if (hasPos()) {
        if (!getPos()
            .equals(other.getPos())) return false;
      }
      if (getGuid()
          != other.getGuid()) return false;
      if (getBlockId()
          != other.getBlockId()) return false;
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
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
      if (hasPos()) {
        hash = (37 * hash) + POS_FIELD_NUMBER;
        hash = (53 * hash) + getPos().hashCode();
      }
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + getGuid();
      hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBlockId();
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA prototype) {
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
     * Protobuf type {@code EGEDFFNFNAA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EGEDFFNFNAA)
        emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.internal_static_EGEDFFNFNAA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.internal_static_EGEDFFNFNAA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.class, emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.newBuilder()
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
          getPosFieldBuilder();
          getRotFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        guid_ = 0;
        blockId_ = 0;
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.internal_static_EGEDFFNFNAA_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA build() {
        emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA buildPartial() {
        emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA result = new emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.pos_ = posBuilder_ == null
              ? pos_
              : posBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guid_ = guid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.blockId_ = blockId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.rot_ = rotBuilder_ == null
              ? rot_
              : rotBuilder_.build();
          to_bitField0_ |= 0x00000002;
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
        if (other instanceof emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA) {
          return mergeFrom((emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA other) {
        if (other == emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA.getDefaultInstance()) return this;
        if (other.hasPos()) {
          mergePos(other.getPos());
        }
        if (other.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        if (other.getBlockId() != 0) {
          setBlockId(other.getBlockId());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
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
              case 50: {
                input.readMessage(
                    getRotFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 50
              case 64: {
                blockId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 80: {
                guid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 90: {
                input.readMessage(
                    getPosFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 90
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

      private emu.protoshift.net.oldproto.VectorOuterClass.Vector pos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> posBuilder_;
      /**
       * <code>.Vector pos = 11;</code>
       * @return Whether the pos field is set.
       */
      public boolean hasPos() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector pos = 11;</code>
       * @return The pos.
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector getPos() {
        if (posBuilder_ == null) {
          return pos_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        } else {
          return posBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public Builder setPos(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pos_ = value;
        } else {
          posBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public Builder setPos(
          emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (posBuilder_ == null) {
          pos_ = builderForValue.build();
        } else {
          posBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public Builder mergePos(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (posBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            pos_ != null &&
            pos_ != emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPosBuilder().mergeFrom(value);
          } else {
            pos_ = value;
          }
        } else {
          posBuilder_.mergeFrom(value);
        }
        if (pos_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public Builder clearPos() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pos_ = null;
        if (posBuilder_ != null) {
          posBuilder_.dispose();
          posBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder getPosBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getPosOrBuilder() {
        if (posBuilder_ != null) {
          return posBuilder_.getMessageOrBuilder();
        } else {
          return pos_ == null ?
              emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : pos_;
        }
      }
      /**
       * <code>.Vector pos = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getPosFieldBuilder() {
        if (posBuilder_ == null) {
          posBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getPos(),
                  getParentForChildren(),
                  isClean());
          pos_ = null;
        }
        return posBuilder_;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 10;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
      /**
       * <code>uint32 guid = 10;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(int value) {

        guid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guid_ = 0;
        onChanged();
        return this;
      }

      private int blockId_ ;
      /**
       * <code>uint32 block_id = 8;</code>
       * @return The blockId.
       */
      @java.lang.Override
      public int getBlockId() {
        return blockId_;
      }
      /**
       * <code>uint32 block_id = 8;</code>
       * @param value The blockId to set.
       * @return This builder for chaining.
       */
      public Builder setBlockId(int value) {

        blockId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 block_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearBlockId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        blockId_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.VectorOuterClass.Vector rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> rotBuilder_;
      /**
       * <code>.Vector rot = 6;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>.Vector rot = 6;</code>
       * @return The rot.
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder setRot(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
        } else {
          rotBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder setRot(
          emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder mergeRot(emu.protoshift.net.oldproto.VectorOuterClass.Vector value) {
        if (rotBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            rot_ != null &&
            rot_ != emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance()) {
            getRotBuilder().mergeFrom(value);
          } else {
            rot_ = value;
          }
        } else {
          rotBuilder_.mergeFrom(value);
        }
        if (rot_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public Builder clearRot() {
        bitField0_ = (bitField0_ & ~0x00000008);
        rot_ = null;
        if (rotBuilder_ != null) {
          rotBuilder_.dispose();
          rotBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder getRotBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      public emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              emu.protoshift.net.oldproto.VectorOuterClass.Vector.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.Vector rot = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.VectorOuterClass.Vector, emu.protoshift.net.oldproto.VectorOuterClass.Vector.Builder, emu.protoshift.net.oldproto.VectorOuterClass.VectorOrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EGEDFFNFNAA)
    }

    // @@protoc_insertion_point(class_scope:EGEDFFNFNAA)
    private static final emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA();
    }

    public static emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EGEDFFNFNAA>
        PARSER = new com.google.protobuf.AbstractParser<EGEDFFNFNAA>() {
      @java.lang.Override
      public EGEDFFNFNAA parsePartialFrom(
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

    public static com.google.protobuf.Parser<EGEDFFNFNAA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EGEDFFNFNAA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.EGEDFFNFNAAOuterClass.EGEDFFNFNAA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EGEDFFNFNAA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EGEDFFNFNAA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EGEDFFNFNAA.proto\032\014Vector.proto\"Y\n\013EGE" +
      "DFFNFNAA\022\024\n\003pos\030\013 \001(\0132\007.Vector\022\014\n\004guid\030\n" +
      " \001(\r\022\020\n\010block_id\030\010 \001(\r\022\024\n\003rot\030\006 \001(\0132\007.Ve" +
      "ctorB\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EGEDFFNFNAA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EGEDFFNFNAA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EGEDFFNFNAA_descriptor,
        new java.lang.String[] { "Pos", "Guid", "BlockId", "Rot", });
    emu.protoshift.net.oldproto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
