// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekPlayerReadyNotify.proto

package emu.protoshift.net.oldproto;

public final class HideAndSeekPlayerReadyNotifyOuterClass {
  private HideAndSeekPlayerReadyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HideAndSeekPlayerReadyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekPlayerReadyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @return A list containing the uidList.
     */
    java.util.List<java.lang.Integer> getUidListList();
    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @return The count of uidList.
     */
    int getUidListCount();
    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    int getUidList(int index);
  }
  /**
   * <pre>
   * Obf: CNALGDHEIDC
   * </pre>
   *
   * Protobuf type {@code HideAndSeekPlayerReadyNotify}
   */
  public static final class HideAndSeekPlayerReadyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekPlayerReadyNotify)
      HideAndSeekPlayerReadyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekPlayerReadyNotify.newBuilder() to construct.
    private HideAndSeekPlayerReadyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HideAndSeekPlayerReadyNotify() {
      uidList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekPlayerReadyNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.internal_static_HideAndSeekPlayerReadyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.internal_static_HideAndSeekPlayerReadyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.class, emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.Builder.class);
    }

    public static final int UID_LIST_FIELD_NUMBER = 13;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList uidList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @return A list containing the uidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUidListList() {
      return uidList_;
    }
    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @return The count of uidList.
     */
    public int getUidListCount() {
      return uidList_.size();
    }
    /**
     * <code>repeated uint32 uid_list = 13;</code>
     * @param index The index of the element to return.
     * @return The uidList at the given index.
     */
    public int getUidList(int index) {
      return uidList_.getInt(index);
    }
    private int uidListMemoizedSerializedSize = -1;

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
      if (getUidListList().size() > 0) {
        output.writeUInt32NoTag(106);
        output.writeUInt32NoTag(uidListMemoizedSerializedSize);
      }
      for (int i = 0; i < uidList_.size(); i++) {
        output.writeUInt32NoTag(uidList_.getInt(i));
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
        for (int i = 0; i < uidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(uidList_.getInt(i));
        }
        size += dataSize;
        if (!getUidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        uidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify other = (emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify) obj;

      if (!getUidListList()
          .equals(other.getUidListList())) return false;
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
      if (getUidListCount() > 0) {
        hash = (37 * hash) + UID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify prototype) {
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
     * Obf: CNALGDHEIDC
     * </pre>
     *
     * Protobuf type {@code HideAndSeekPlayerReadyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HideAndSeekPlayerReadyNotify)
        emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.internal_static_HideAndSeekPlayerReadyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.internal_static_HideAndSeekPlayerReadyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.class, emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.newBuilder()
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
        uidList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.internal_static_HideAndSeekPlayerReadyNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify build() {
        emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify buildPartial() {
        emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify result = new emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          uidList_.makeImmutable();
          result.uidList_ = uidList_;
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
        if (other instanceof emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify other) {
        if (other == emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify.getDefaultInstance()) return this;
        if (!other.uidList_.isEmpty()) {
          if (uidList_.isEmpty()) {
            uidList_ = other.uidList_;
            uidList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureUidListIsMutable();
            uidList_.addAll(other.uidList_);
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
                int v = input.readUInt32();
                ensureUidListIsMutable();
                uidList_.addInt(v);
                break;
              } // case 104
              case 106: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureUidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  uidList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 106
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

      private com.google.protobuf.Internal.IntList uidList_ = emptyIntList();
      private void ensureUidListIsMutable() {
        if (!uidList_.isModifiable()) {
          uidList_ = makeMutableCopy(uidList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @return A list containing the uidList.
       */
      public java.util.List<java.lang.Integer>
          getUidListList() {
        uidList_.makeImmutable();
        return uidList_;
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @return The count of uidList.
       */
      public int getUidListCount() {
        return uidList_.size();
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @param index The index of the element to return.
       * @return The uidList at the given index.
       */
      public int getUidList(int index) {
        return uidList_.getInt(index);
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @param index The index to set the value at.
       * @param value The uidList to set.
       * @return This builder for chaining.
       */
      public Builder setUidList(
          int index, int value) {

        ensureUidListIsMutable();
        uidList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @param value The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addUidList(int value) {

        ensureUidListIsMutable();
        uidList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @param values The uidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUidList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, uidList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 uid_list = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUidList() {
        uidList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:HideAndSeekPlayerReadyNotify)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekPlayerReadyNotify)
    private static final emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify();
    }

    public static emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HideAndSeekPlayerReadyNotify>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekPlayerReadyNotify>() {
      @java.lang.Override
      public HideAndSeekPlayerReadyNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HideAndSeekPlayerReadyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekPlayerReadyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HideAndSeekPlayerReadyNotifyOuterClass.HideAndSeekPlayerReadyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekPlayerReadyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekPlayerReadyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"HideAndSeekPlayerReadyNotify.proto\"0\n\034" +
      "HideAndSeekPlayerReadyNotify\022\020\n\010uid_list" +
      "\030\r \003(\rB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekPlayerReadyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekPlayerReadyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekPlayerReadyNotify_descriptor,
        new java.lang.String[] { "UidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
