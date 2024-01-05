// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OFLNJDIILBI.proto

package emu.protoshift.net.oldproto;

public final class OFLNJDIILBIOuterClass {
  private OFLNJDIILBIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OFLNJDIILBIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OFLNJDIILBI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 cur_avatar_guid = 1;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvatarGuid();

    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return A list containing the fIDDAAGKFDH.
     */
    java.util.List<java.lang.Long> getFIDDAAGKFDHList();
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return The count of fIDDAAGKFDH.
     */
    int getFIDDAAGKFDHCount();
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @param index The index of the element to return.
     * @return The fIDDAAGKFDH at the given index.
     */
    long getFIDDAAGKFDH(int index);
  }
  /**
   * Protobuf type {@code OFLNJDIILBI}
   */
  public static final class OFLNJDIILBI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OFLNJDIILBI)
      OFLNJDIILBIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OFLNJDIILBI.newBuilder() to construct.
    private OFLNJDIILBI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OFLNJDIILBI() {
      fIDDAAGKFDH_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OFLNJDIILBI();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.class, emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.Builder.class);
    }

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 1;
    private long curAvatarGuid_ = 0L;
    /**
     * <code>uint64 cur_avatar_guid = 1;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {
      return curAvatarGuid_;
    }

    public static final int FIDDAAGKFDH_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList fIDDAAGKFDH_ =
        emptyLongList();
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return A list containing the fIDDAAGKFDH.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getFIDDAAGKFDHList() {
      return fIDDAAGKFDH_;
    }
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @return The count of fIDDAAGKFDH.
     */
    public int getFIDDAAGKFDHCount() {
      return fIDDAAGKFDH_.size();
    }
    /**
     * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
     * @param index The index of the element to return.
     * @return The fIDDAAGKFDH at the given index.
     */
    public long getFIDDAAGKFDH(int index) {
      return fIDDAAGKFDH_.getLong(index);
    }
    private int fIDDAAGKFDHMemoizedSerializedSize = -1;

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
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(1, curAvatarGuid_);
      }
      if (getFIDDAAGKFDHList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(fIDDAAGKFDHMemoizedSerializedSize);
      }
      for (int i = 0; i < fIDDAAGKFDH_.size(); i++) {
        output.writeUInt64NoTag(fIDDAAGKFDH_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, curAvatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fIDDAAGKFDH_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(fIDDAAGKFDH_.getLong(i));
        }
        size += dataSize;
        if (!getFIDDAAGKFDHList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        fIDDAAGKFDHMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI other = (emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI) obj;

      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return false;
      if (!getFIDDAAGKFDHList()
          .equals(other.getFIDDAAGKFDHList())) return false;
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
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCurAvatarGuid());
      if (getFIDDAAGKFDHCount() > 0) {
        hash = (37 * hash) + FIDDAAGKFDH_FIELD_NUMBER;
        hash = (53 * hash) + getFIDDAAGKFDHList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI prototype) {
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
     * Protobuf type {@code OFLNJDIILBI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OFLNJDIILBI)
        emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.class, emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.newBuilder()
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
        curAvatarGuid_ = 0L;
        fIDDAAGKFDH_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.internal_static_OFLNJDIILBI_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI build() {
        emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI buildPartial() {
        emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI result = new emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curAvatarGuid_ = curAvatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          fIDDAAGKFDH_.makeImmutable();
          result.fIDDAAGKFDH_ = fIDDAAGKFDH_;
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
        if (other instanceof emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI) {
          return mergeFrom((emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI other) {
        if (other == emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI.getDefaultInstance()) return this;
        if (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
        }
        if (!other.fIDDAAGKFDH_.isEmpty()) {
          if (fIDDAAGKFDH_.isEmpty()) {
            fIDDAAGKFDH_ = other.fIDDAAGKFDH_;
            fIDDAAGKFDH_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureFIDDAAGKFDHIsMutable();
            fIDDAAGKFDH_.addAll(other.fIDDAAGKFDH_);
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
              case 8: {
                curAvatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 40: {
                long v = input.readUInt64();
                ensureFIDDAAGKFDHIsMutable();
                fIDDAAGKFDH_.addLong(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureFIDDAAGKFDHIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  fIDDAAGKFDH_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 42
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

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long getCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @param value The curAvatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCurAvatarGuid(long value) {

        curAvatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 cur_avatar_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curAvatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList fIDDAAGKFDH_ = emptyLongList();
      private void ensureFIDDAAGKFDHIsMutable() {
        if (!fIDDAAGKFDH_.isModifiable()) {
          fIDDAAGKFDH_ = makeMutableCopy(fIDDAAGKFDH_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return A list containing the fIDDAAGKFDH.
       */
      public java.util.List<java.lang.Long>
          getFIDDAAGKFDHList() {
        fIDDAAGKFDH_.makeImmutable();
        return fIDDAAGKFDH_;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return The count of fIDDAAGKFDH.
       */
      public int getFIDDAAGKFDHCount() {
        return fIDDAAGKFDH_.size();
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param index The index of the element to return.
       * @return The fIDDAAGKFDH at the given index.
       */
      public long getFIDDAAGKFDH(int index) {
        return fIDDAAGKFDH_.getLong(index);
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param index The index to set the value at.
       * @param value The fIDDAAGKFDH to set.
       * @return This builder for chaining.
       */
      public Builder setFIDDAAGKFDH(
          int index, long value) {

        ensureFIDDAAGKFDHIsMutable();
        fIDDAAGKFDH_.setLong(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param value The fIDDAAGKFDH to add.
       * @return This builder for chaining.
       */
      public Builder addFIDDAAGKFDH(long value) {

        ensureFIDDAAGKFDHIsMutable();
        fIDDAAGKFDH_.addLong(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @param values The fIDDAAGKFDH to add.
       * @return This builder for chaining.
       */
      public Builder addAllFIDDAAGKFDH(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureFIDDAAGKFDHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fIDDAAGKFDH_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 FIDDAAGKFDH = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFIDDAAGKFDH() {
        fIDDAAGKFDH_ = emptyLongList();
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


      // @@protoc_insertion_point(builder_scope:OFLNJDIILBI)
    }

    // @@protoc_insertion_point(class_scope:OFLNJDIILBI)
    private static final emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI();
    }

    public static emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OFLNJDIILBI>
        PARSER = new com.google.protobuf.AbstractParser<OFLNJDIILBI>() {
      @java.lang.Override
      public OFLNJDIILBI parsePartialFrom(
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

    public static com.google.protobuf.Parser<OFLNJDIILBI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OFLNJDIILBI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.OFLNJDIILBIOuterClass.OFLNJDIILBI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OFLNJDIILBI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OFLNJDIILBI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OFLNJDIILBI.proto\";\n\013OFLNJDIILBI\022\027\n\017cu" +
      "r_avatar_guid\030\001 \001(\004\022\023\n\013FIDDAAGKFDH\030\005 \003(\004" +
      "B\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OFLNJDIILBI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OFLNJDIILBI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OFLNJDIILBI_descriptor,
        new java.lang.String[] { "CurAvatarGuid", "FIDDAAGKFDH", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
