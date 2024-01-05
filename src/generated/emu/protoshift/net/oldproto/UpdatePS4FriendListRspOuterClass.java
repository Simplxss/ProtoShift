// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UpdatePS4FriendListRsp.proto

package emu.protoshift.net.oldproto;

public final class UpdatePS4FriendListRspOuterClass {
  private UpdatePS4FriendListRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UpdatePS4FriendListRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UpdatePS4FriendListRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @return A list containing the psnIdList.
     */
    java.util.List<java.lang.String>
        getPsnIdListList();
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @return The count of psnIdList.
     */
    int getPsnIdListCount();
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    java.lang.String getPsnIdList(int index);
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    com.google.protobuf.ByteString
        getPsnIdListBytes(int index);

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: FLDCNEGDODM
   * </pre>
   *
   * Protobuf type {@code UpdatePS4FriendListRsp}
   */
  public static final class UpdatePS4FriendListRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UpdatePS4FriendListRsp)
      UpdatePS4FriendListRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UpdatePS4FriendListRsp.newBuilder() to construct.
    private UpdatePS4FriendListRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UpdatePS4FriendListRsp() {
      psnIdList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UpdatePS4FriendListRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.class, emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.Builder.class);
    }

    public static final int PSN_ID_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList psnIdList_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @return A list containing the psnIdList.
     */
    public com.google.protobuf.ProtocolStringList
        getPsnIdListList() {
      return psnIdList_;
    }
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @return The count of psnIdList.
     */
    public int getPsnIdListCount() {
      return psnIdList_.size();
    }
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @param index The index of the element to return.
     * @return The psnIdList at the given index.
     */
    public java.lang.String getPsnIdList(int index) {
      return psnIdList_.get(index);
    }
    /**
     * <code>repeated string psn_id_list = 6;</code>
     * @param index The index of the value to return.
     * @return The bytes of the psnIdList at the given index.
     */
    public com.google.protobuf.ByteString
        getPsnIdListBytes(int index) {
      return psnIdList_.getByteString(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      for (int i = 0; i < psnIdList_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, psnIdList_.getRaw(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < psnIdList_.size(); i++) {
          dataSize += computeStringSizeNoTag(psnIdList_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getPsnIdListList().size();
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
      if (!(obj instanceof emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp other = (emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp) obj;

      if (!getPsnIdListList()
          .equals(other.getPsnIdListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getPsnIdListCount() > 0) {
        hash = (37 * hash) + PSN_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPsnIdListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp prototype) {
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
     * Obf: FLDCNEGDODM
     * </pre>
     *
     * Protobuf type {@code UpdatePS4FriendListRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UpdatePS4FriendListRsp)
        emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.class, emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.newBuilder()
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
        psnIdList_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.internal_static_UpdatePS4FriendListRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp build() {
        emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp buildPartial() {
        emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp result = new emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          psnIdList_.makeImmutable();
          result.psnIdList_ = psnIdList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp other) {
        if (other == emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp.getDefaultInstance()) return this;
        if (!other.psnIdList_.isEmpty()) {
          if (psnIdList_.isEmpty()) {
            psnIdList_ = other.psnIdList_;
            bitField0_ |= 0x00000001;
          } else {
            ensurePsnIdListIsMutable();
            psnIdList_.addAll(other.psnIdList_);
          }
          onChanged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 50: {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePsnIdListIsMutable();
                psnIdList_.add(s);
                break;
              } // case 50
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

      private com.google.protobuf.LazyStringArrayList psnIdList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensurePsnIdListIsMutable() {
        if (!psnIdList_.isModifiable()) {
          psnIdList_ = new com.google.protobuf.LazyStringArrayList(psnIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @return A list containing the psnIdList.
       */
      public com.google.protobuf.ProtocolStringList
          getPsnIdListList() {
        psnIdList_.makeImmutable();
        return psnIdList_;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @return The count of psnIdList.
       */
      public int getPsnIdListCount() {
        return psnIdList_.size();
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param index The index of the element to return.
       * @return The psnIdList at the given index.
       */
      public java.lang.String getPsnIdList(int index) {
        return psnIdList_.get(index);
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param index The index of the value to return.
       * @return The bytes of the psnIdList at the given index.
       */
      public com.google.protobuf.ByteString
          getPsnIdListBytes(int index) {
        return psnIdList_.getByteString(index);
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param index The index to set the value at.
       * @param value The psnIdList to set.
       * @return This builder for chaining.
       */
      public Builder setPsnIdList(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensurePsnIdListIsMutable();
        psnIdList_.set(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param value The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdList(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensurePsnIdListIsMutable();
        psnIdList_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param values The psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllPsnIdList(
          java.lang.Iterable<java.lang.String> values) {
        ensurePsnIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, psnIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPsnIdList() {
        psnIdList_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string psn_id_list = 6;</code>
       * @param value The bytes of the psnIdList to add.
       * @return This builder for chaining.
       */
      public Builder addPsnIdListBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensurePsnIdListIsMutable();
        psnIdList_.add(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:UpdatePS4FriendListRsp)
    }

    // @@protoc_insertion_point(class_scope:UpdatePS4FriendListRsp)
    private static final emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp();
    }

    public static emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UpdatePS4FriendListRsp>
        PARSER = new com.google.protobuf.AbstractParser<UpdatePS4FriendListRsp>() {
      @java.lang.Override
      public UpdatePS4FriendListRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<UpdatePS4FriendListRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UpdatePS4FriendListRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.UpdatePS4FriendListRspOuterClass.UpdatePS4FriendListRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdatePS4FriendListRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdatePS4FriendListRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034UpdatePS4FriendListRsp.proto\">\n\026Update" +
      "PS4FriendListRsp\022\023\n\013psn_id_list\030\006 \003(\t\022\017\n" +
      "\007retcode\030\005 \001(\005B\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UpdatePS4FriendListRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UpdatePS4FriendListRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdatePS4FriendListRsp_descriptor,
        new java.lang.String[] { "PsnIdList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
