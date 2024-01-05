// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BrickBreakerSelectSkillReq.proto

package emu.protoshift.net.oldproto;

public final class BrickBreakerSelectSkillReqOuterClass {
  private BrickBreakerSelectSkillReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BrickBreakerSelectSkillReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BrickBreakerSelectSkillReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @return A list containing the skillId.
     */
    java.util.List<java.lang.Integer> getSkillIdList();
    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @return The count of skillId.
     */
    int getSkillIdCount();
    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @param index The index of the element to return.
     * @return The skillId at the given index.
     */
    int getSkillId(int index);
  }
  /**
   * <pre>
   * Obf: CJFFCEKLLOE
   * </pre>
   *
   * Protobuf type {@code BrickBreakerSelectSkillReq}
   */
  public static final class BrickBreakerSelectSkillReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BrickBreakerSelectSkillReq)
      BrickBreakerSelectSkillReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BrickBreakerSelectSkillReq.newBuilder() to construct.
    private BrickBreakerSelectSkillReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BrickBreakerSelectSkillReq() {
      skillId_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BrickBreakerSelectSkillReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.internal_static_BrickBreakerSelectSkillReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.internal_static_BrickBreakerSelectSkillReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.class, emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList skillId_ =
        emptyIntList();
    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @return A list containing the skillId.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillIdList() {
      return skillId_;
    }
    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @return The count of skillId.
     */
    public int getSkillIdCount() {
      return skillId_.size();
    }
    /**
     * <code>repeated uint32 skill_id = 11;</code>
     * @param index The index of the element to return.
     * @return The skillId at the given index.
     */
    public int getSkillId(int index) {
      return skillId_.getInt(index);
    }
    private int skillIdMemoizedSerializedSize = -1;

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
      if (getSkillIdList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(skillIdMemoizedSerializedSize);
      }
      for (int i = 0; i < skillId_.size(); i++) {
        output.writeUInt32NoTag(skillId_.getInt(i));
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
        for (int i = 0; i < skillId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillId_.getInt(i));
        }
        size += dataSize;
        if (!getSkillIdList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillIdMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq other = (emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq) obj;

      if (!getSkillIdList()
          .equals(other.getSkillIdList())) return false;
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
      if (getSkillIdCount() > 0) {
        hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSkillIdList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq prototype) {
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
     * Obf: CJFFCEKLLOE
     * </pre>
     *
     * Protobuf type {@code BrickBreakerSelectSkillReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BrickBreakerSelectSkillReq)
        emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.internal_static_BrickBreakerSelectSkillReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.internal_static_BrickBreakerSelectSkillReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.class, emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.newBuilder()
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
        skillId_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.internal_static_BrickBreakerSelectSkillReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq build() {
        emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq buildPartial() {
        emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq result = new emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          skillId_.makeImmutable();
          result.skillId_ = skillId_;
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
        if (other instanceof emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq) {
          return mergeFrom((emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq other) {
        if (other == emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq.getDefaultInstance()) return this;
        if (!other.skillId_.isEmpty()) {
          if (skillId_.isEmpty()) {
            skillId_ = other.skillId_;
            skillId_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureSkillIdIsMutable();
            skillId_.addAll(other.skillId_);
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
              case 88: {
                int v = input.readUInt32();
                ensureSkillIdIsMutable();
                skillId_.addInt(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSkillIdIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  skillId_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
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

      private com.google.protobuf.Internal.IntList skillId_ = emptyIntList();
      private void ensureSkillIdIsMutable() {
        if (!skillId_.isModifiable()) {
          skillId_ = makeMutableCopy(skillId_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @return A list containing the skillId.
       */
      public java.util.List<java.lang.Integer>
          getSkillIdList() {
        skillId_.makeImmutable();
        return skillId_;
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @return The count of skillId.
       */
      public int getSkillIdCount() {
        return skillId_.size();
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @param index The index of the element to return.
       * @return The skillId at the given index.
       */
      public int getSkillId(int index) {
        return skillId_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @param index The index to set the value at.
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(
          int index, int value) {

        ensureSkillIdIsMutable();
        skillId_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @param value The skillId to add.
       * @return This builder for chaining.
       */
      public Builder addSkillId(int value) {

        ensureSkillIdIsMutable();
        skillId_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @param values The skillId to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillId_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        skillId_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:BrickBreakerSelectSkillReq)
    }

    // @@protoc_insertion_point(class_scope:BrickBreakerSelectSkillReq)
    private static final emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq();
    }

    public static emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BrickBreakerSelectSkillReq>
        PARSER = new com.google.protobuf.AbstractParser<BrickBreakerSelectSkillReq>() {
      @java.lang.Override
      public BrickBreakerSelectSkillReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<BrickBreakerSelectSkillReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BrickBreakerSelectSkillReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.BrickBreakerSelectSkillReqOuterClass.BrickBreakerSelectSkillReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BrickBreakerSelectSkillReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BrickBreakerSelectSkillReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n BrickBreakerSelectSkillReq.proto\".\n\032Br" +
      "ickBreakerSelectSkillReq\022\020\n\010skill_id\030\013 \003" +
      "(\rB\035\n\033emu.protoshift.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BrickBreakerSelectSkillReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BrickBreakerSelectSkillReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BrickBreakerSelectSkillReq_descriptor,
        new java.lang.String[] { "SkillId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
