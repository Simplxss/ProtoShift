// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExclusiveRuleInfo.proto

package emu.protoshift.net.oldproto;

public final class ExclusiveRuleInfoOuterClass {
  private ExclusiveRuleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExclusiveRuleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExclusiveRuleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 rule_type = 9;</code>
     * @return The ruleType.
     */
    int getRuleType();

    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @return A list containing the objectIdList.
     */
    java.util.List<java.lang.Integer> getObjectIdListList();
    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @return The count of objectIdList.
     */
    int getObjectIdListCount();
    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The objectIdList at the given index.
     */
    int getObjectIdList(int index);
  }
  /**
   * Protobuf type {@code ExclusiveRuleInfo}
   */
  public static final class ExclusiveRuleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExclusiveRuleInfo)
      ExclusiveRuleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExclusiveRuleInfo.newBuilder() to construct.
    private ExclusiveRuleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExclusiveRuleInfo() {
      objectIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExclusiveRuleInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.internal_static_ExclusiveRuleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.internal_static_ExclusiveRuleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.class, emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.Builder.class);
    }

    public static final int RULE_TYPE_FIELD_NUMBER = 9;
    private int ruleType_ = 0;
    /**
     * <code>uint32 rule_type = 9;</code>
     * @return The ruleType.
     */
    @java.lang.Override
    public int getRuleType() {
      return ruleType_;
    }

    public static final int OBJECT_ID_LIST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList objectIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @return A list containing the objectIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getObjectIdListList() {
      return objectIdList_;
    }
    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @return The count of objectIdList.
     */
    public int getObjectIdListCount() {
      return objectIdList_.size();
    }
    /**
     * <code>repeated uint32 object_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The objectIdList at the given index.
     */
    public int getObjectIdList(int index) {
      return objectIdList_.getInt(index);
    }
    private int objectIdListMemoizedSerializedSize = -1;

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
      if (getObjectIdListList().size() > 0) {
        output.writeUInt32NoTag(34);
        output.writeUInt32NoTag(objectIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < objectIdList_.size(); i++) {
        output.writeUInt32NoTag(objectIdList_.getInt(i));
      }
      if (ruleType_ != 0) {
        output.writeUInt32(9, ruleType_);
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
        for (int i = 0; i < objectIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(objectIdList_.getInt(i));
        }
        size += dataSize;
        if (!getObjectIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        objectIdListMemoizedSerializedSize = dataSize;
      }
      if (ruleType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, ruleType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo other = (emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo) obj;

      if (getRuleType()
          != other.getRuleType()) return false;
      if (!getObjectIdListList()
          .equals(other.getObjectIdListList())) return false;
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
      hash = (37 * hash) + RULE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRuleType();
      if (getObjectIdListCount() > 0) {
        hash = (37 * hash) + OBJECT_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getObjectIdListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo prototype) {
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
     * Protobuf type {@code ExclusiveRuleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExclusiveRuleInfo)
        emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.internal_static_ExclusiveRuleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.internal_static_ExclusiveRuleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.class, emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.newBuilder()
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
        ruleType_ = 0;
        objectIdList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.internal_static_ExclusiveRuleInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo build() {
        emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo buildPartial() {
        emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo result = new emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ruleType_ = ruleType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          objectIdList_.makeImmutable();
          result.objectIdList_ = objectIdList_;
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
        if (other instanceof emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo other) {
        if (other == emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo.getDefaultInstance()) return this;
        if (other.getRuleType() != 0) {
          setRuleType(other.getRuleType());
        }
        if (!other.objectIdList_.isEmpty()) {
          if (objectIdList_.isEmpty()) {
            objectIdList_ = other.objectIdList_;
            objectIdList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureObjectIdListIsMutable();
            objectIdList_.addAll(other.objectIdList_);
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
              case 32: {
                int v = input.readUInt32();
                ensureObjectIdListIsMutable();
                objectIdList_.addInt(v);
                break;
              } // case 32
              case 34: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureObjectIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  objectIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 34
              case 72: {
                ruleType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
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

      private int ruleType_ ;
      /**
       * <code>uint32 rule_type = 9;</code>
       * @return The ruleType.
       */
      @java.lang.Override
      public int getRuleType() {
        return ruleType_;
      }
      /**
       * <code>uint32 rule_type = 9;</code>
       * @param value The ruleType to set.
       * @return This builder for chaining.
       */
      public Builder setRuleType(int value) {

        ruleType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rule_type = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuleType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ruleType_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList objectIdList_ = emptyIntList();
      private void ensureObjectIdListIsMutable() {
        if (!objectIdList_.isModifiable()) {
          objectIdList_ = makeMutableCopy(objectIdList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @return A list containing the objectIdList.
       */
      public java.util.List<java.lang.Integer>
          getObjectIdListList() {
        objectIdList_.makeImmutable();
        return objectIdList_;
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @return The count of objectIdList.
       */
      public int getObjectIdListCount() {
        return objectIdList_.size();
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The objectIdList at the given index.
       */
      public int getObjectIdList(int index) {
        return objectIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @param index The index to set the value at.
       * @param value The objectIdList to set.
       * @return This builder for chaining.
       */
      public Builder setObjectIdList(
          int index, int value) {

        ensureObjectIdListIsMutable();
        objectIdList_.setInt(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @param value The objectIdList to add.
       * @return This builder for chaining.
       */
      public Builder addObjectIdList(int value) {

        ensureObjectIdListIsMutable();
        objectIdList_.addInt(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @param values The objectIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllObjectIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureObjectIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, objectIdList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 object_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearObjectIdList() {
        objectIdList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:ExclusiveRuleInfo)
    }

    // @@protoc_insertion_point(class_scope:ExclusiveRuleInfo)
    private static final emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo();
    }

    public static emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExclusiveRuleInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExclusiveRuleInfo>() {
      @java.lang.Override
      public ExclusiveRuleInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExclusiveRuleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExclusiveRuleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ExclusiveRuleInfoOuterClass.ExclusiveRuleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExclusiveRuleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExclusiveRuleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ExclusiveRuleInfo.proto\">\n\021ExclusiveRu" +
      "leInfo\022\021\n\trule_type\030\t \001(\r\022\026\n\016object_id_l" +
      "ist\030\004 \003(\rB\035\n\033emu.protoshift.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExclusiveRuleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExclusiveRuleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExclusiveRuleInfo_descriptor,
        new java.lang.String[] { "RuleType", "ObjectIdList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
