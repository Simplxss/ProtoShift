// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JEAPJLNHGDA.proto

package emu.protoshift.net.oldproto;

public final class JEAPJLNHGDAOuterClass {
  private JEAPJLNHGDAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JEAPJLNHGDAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JEAPJLNHGDA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @return A list containing the fDPHCKJMEBP.
     */
    java.util.List<java.lang.Integer> getFDPHCKJMEBPList();
    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @return The count of fDPHCKJMEBP.
     */
    int getFDPHCKJMEBPCount();
    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @param index The index of the element to return.
     * @return The fDPHCKJMEBP at the given index.
     */
    int getFDPHCKJMEBP(int index);
  }
  /**
   * Protobuf type {@code JEAPJLNHGDA}
   */
  public static final class JEAPJLNHGDA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JEAPJLNHGDA)
      JEAPJLNHGDAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JEAPJLNHGDA.newBuilder() to construct.
    private JEAPJLNHGDA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JEAPJLNHGDA() {
      fDPHCKJMEBP_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JEAPJLNHGDA();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.internal_static_JEAPJLNHGDA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.internal_static_JEAPJLNHGDA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.class, emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int FDPHCKJMEBP_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList fDPHCKJMEBP_ =
        emptyIntList();
    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @return A list containing the fDPHCKJMEBP.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getFDPHCKJMEBPList() {
      return fDPHCKJMEBP_;
    }
    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @return The count of fDPHCKJMEBP.
     */
    public int getFDPHCKJMEBPCount() {
      return fDPHCKJMEBP_.size();
    }
    /**
     * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
     * @param index The index of the element to return.
     * @return The fDPHCKJMEBP at the given index.
     */
    public int getFDPHCKJMEBP(int index) {
      return fDPHCKJMEBP_.getInt(index);
    }
    private int fDPHCKJMEBPMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      if (getFDPHCKJMEBPList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(fDPHCKJMEBPMemoizedSerializedSize);
      }
      for (int i = 0; i < fDPHCKJMEBP_.size(); i++) {
        output.writeUInt32NoTag(fDPHCKJMEBP_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fDPHCKJMEBP_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(fDPHCKJMEBP_.getInt(i));
        }
        size += dataSize;
        if (!getFDPHCKJMEBPList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fDPHCKJMEBPMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA other = (emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (!getFDPHCKJMEBPList()
          .equals(other.getFDPHCKJMEBPList())) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      if (getFDPHCKJMEBPCount() > 0) {
        hash = (37 * hash) + FDPHCKJMEBP_FIELD_NUMBER;
        hash = (53 * hash) + getFDPHCKJMEBPList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA prototype) {
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
     * Protobuf type {@code JEAPJLNHGDA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JEAPJLNHGDA)
        emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.internal_static_JEAPJLNHGDA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.internal_static_JEAPJLNHGDA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.class, emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.newBuilder()
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
        levelId_ = 0;
        fDPHCKJMEBP_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.internal_static_JEAPJLNHGDA_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA build() {
        emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA buildPartial() {
        emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA result = new emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          fDPHCKJMEBP_.makeImmutable();
          result.fDPHCKJMEBP_ = fDPHCKJMEBP_;
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
        if (other instanceof emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA) {
          return mergeFrom((emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA other) {
        if (other == emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (!other.fDPHCKJMEBP_.isEmpty()) {
          if (fDPHCKJMEBP_.isEmpty()) {
            fDPHCKJMEBP_ = other.fDPHCKJMEBP_;
            fDPHCKJMEBP_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureFDPHCKJMEBPIsMutable();
            fDPHCKJMEBP_.addAll(other.fDPHCKJMEBP_);
          }
          onChanged();
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
              case 104: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 112: {
                int v = input.readUInt32();
                ensureFDPHCKJMEBPIsMutable();
                fDPHCKJMEBP_.addInt(v);
                break;
              } // case 112
              case 114: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFDPHCKJMEBPIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fDPHCKJMEBP_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 114
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList fDPHCKJMEBP_ = emptyIntList();
      private void ensureFDPHCKJMEBPIsMutable() {
        if (!fDPHCKJMEBP_.isModifiable()) {
          fDPHCKJMEBP_ = makeMutableCopy(fDPHCKJMEBP_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @return A list containing the fDPHCKJMEBP.
       */
      public java.util.List<java.lang.Integer>
          getFDPHCKJMEBPList() {
        fDPHCKJMEBP_.makeImmutable();
        return fDPHCKJMEBP_;
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @return The count of fDPHCKJMEBP.
       */
      public int getFDPHCKJMEBPCount() {
        return fDPHCKJMEBP_.size();
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @param index The index of the element to return.
       * @return The fDPHCKJMEBP at the given index.
       */
      public int getFDPHCKJMEBP(int index) {
        return fDPHCKJMEBP_.getInt(index);
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @param index The index to set the value at.
       * @param value The fDPHCKJMEBP to set.
       * @return This builder for chaining.
       */
      public Builder setFDPHCKJMEBP(
          int index, int value) {

        ensureFDPHCKJMEBPIsMutable();
        fDPHCKJMEBP_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @param value The fDPHCKJMEBP to add.
       * @return This builder for chaining.
       */
      public Builder addFDPHCKJMEBP(int value) {

        ensureFDPHCKJMEBPIsMutable();
        fDPHCKJMEBP_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @param values The fDPHCKJMEBP to add.
       * @return This builder for chaining.
       */
      public Builder addAllFDPHCKJMEBP(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFDPHCKJMEBPIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fDPHCKJMEBP_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 FDPHCKJMEBP = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearFDPHCKJMEBP() {
        fDPHCKJMEBP_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:JEAPJLNHGDA)
    }

    // @@protoc_insertion_point(class_scope:JEAPJLNHGDA)
    private static final emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA();
    }

    public static emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JEAPJLNHGDA>
        PARSER = new com.google.protobuf.AbstractParser<JEAPJLNHGDA>() {
      @java.lang.Override
      public JEAPJLNHGDA parsePartialFrom(
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

    public static com.google.protobuf.Parser<JEAPJLNHGDA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JEAPJLNHGDA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.JEAPJLNHGDAOuterClass.JEAPJLNHGDA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JEAPJLNHGDA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JEAPJLNHGDA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JEAPJLNHGDA.proto\"4\n\013JEAPJLNHGDA\022\020\n\010le" +
      "vel_id\030\r \001(\r\022\023\n\013FDPHCKJMEBP\030\016 \003(\rB\035\n\033emu" +
      ".protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JEAPJLNHGDA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JEAPJLNHGDA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JEAPJLNHGDA_descriptor,
        new java.lang.String[] { "LevelId", "FDPHCKJMEBP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
