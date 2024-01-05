// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeModuleSeenReq.proto

package emu.protoshift.net.oldproto;

public final class HomeModuleSeenReqOuterClass {
  private HomeModuleSeenReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeModuleSeenReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeModuleSeenReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @return A list containing the seenModuleIdList.
     */
    java.util.List<java.lang.Integer> getSeenModuleIdListList();
    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @return The count of seenModuleIdList.
     */
    int getSeenModuleIdListCount();
    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    int getSeenModuleIdList(int index);
  }
  /**
   * <pre>
   * Obf: KNOGFPMPFGK
   * </pre>
   *
   * Protobuf type {@code HomeModuleSeenReq}
   */
  public static final class HomeModuleSeenReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeModuleSeenReq)
      HomeModuleSeenReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeModuleSeenReq.newBuilder() to construct.
    private HomeModuleSeenReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeModuleSeenReq() {
      seenModuleIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeModuleSeenReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class, emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder.class);
    }

    public static final int SEEN_MODULE_ID_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList seenModuleIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @return A list containing the seenModuleIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSeenModuleIdListList() {
      return seenModuleIdList_;
    }
    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @return The count of seenModuleIdList.
     */
    public int getSeenModuleIdListCount() {
      return seenModuleIdList_.size();
    }
    /**
     * <code>repeated uint32 seen_module_id_list = 8;</code>
     * @param index The index of the element to return.
     * @return The seenModuleIdList at the given index.
     */
    public int getSeenModuleIdList(int index) {
      return seenModuleIdList_.getInt(index);
    }
    private int seenModuleIdListMemoizedSerializedSize = -1;

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
      if (getSeenModuleIdListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(seenModuleIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < seenModuleIdList_.size(); i++) {
        output.writeUInt32NoTag(seenModuleIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < seenModuleIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(seenModuleIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSeenModuleIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        seenModuleIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq other = (emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq) obj;

      if (!getSeenModuleIdListList()
          .equals(other.getSeenModuleIdListList())) return false;
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
      if (getSeenModuleIdListCount() > 0) {
        hash = (37 * hash) + SEEN_MODULE_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSeenModuleIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq prototype) {
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
     * Obf: KNOGFPMPFGK
     * </pre>
     *
     * Protobuf type {@code HomeModuleSeenReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeModuleSeenReq)
        emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.class, emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.newBuilder()
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
        seenModuleIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.internal_static_HomeModuleSeenReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq build() {
        emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq buildPartial() {
        emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq result = new emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          seenModuleIdList_.makeImmutable();
          result.seenModuleIdList_ = seenModuleIdList_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq other) {
        if (other == emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq.getDefaultInstance()) return this;
        if (!other.seenModuleIdList_.isEmpty()) {
          if (seenModuleIdList_.isEmpty()) {
            seenModuleIdList_ = other.seenModuleIdList_;
            seenModuleIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureSeenModuleIdListIsMutable();
            seenModuleIdList_.addAll(other.seenModuleIdList_);
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
              case 64: {
                int v = input.readUInt32();
                ensureSeenModuleIdListIsMutable();
                seenModuleIdList_.addInt(v);
                break;
              } // case 64
              case 66: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSeenModuleIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  seenModuleIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 66
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

      private com.google.protobuf.Internal.IntList seenModuleIdList_ = emptyIntList();
      private void ensureSeenModuleIdListIsMutable() {
        if (!seenModuleIdList_.isModifiable()) {
          seenModuleIdList_ = makeMutableCopy(seenModuleIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @return A list containing the seenModuleIdList.
       */
      public java.util.List<java.lang.Integer>
          getSeenModuleIdListList() {
        seenModuleIdList_.makeImmutable();
        return seenModuleIdList_;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @return The count of seenModuleIdList.
       */
      public int getSeenModuleIdListCount() {
        return seenModuleIdList_.size();
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @param index The index of the element to return.
       * @return The seenModuleIdList at the given index.
       */
      public int getSeenModuleIdList(int index) {
        return seenModuleIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The seenModuleIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSeenModuleIdList(
          int index, int value) {

        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @param value The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSeenModuleIdList(int value) {

        ensureSeenModuleIdListIsMutable();
        seenModuleIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @param values The seenModuleIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSeenModuleIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSeenModuleIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, seenModuleIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 seen_module_id_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSeenModuleIdList() {
        seenModuleIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:HomeModuleSeenReq)
    }

    // @@protoc_insertion_point(class_scope:HomeModuleSeenReq)
    private static final emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq();
    }

    public static emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeModuleSeenReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeModuleSeenReq>() {
      @java.lang.Override
      public HomeModuleSeenReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeModuleSeenReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeModuleSeenReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeModuleSeenReqOuterClass.HomeModuleSeenReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeModuleSeenReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeModuleSeenReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027HomeModuleSeenReq.proto\"0\n\021HomeModuleS" +
      "eenReq\022\033\n\023seen_module_id_list\030\010 \003(\rB\035\n\033e" +
      "mu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeModuleSeenReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeModuleSeenReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeModuleSeenReq_descriptor,
        new java.lang.String[] { "SeenModuleIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
