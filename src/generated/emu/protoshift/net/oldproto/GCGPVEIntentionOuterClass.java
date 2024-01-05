// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGPVEIntention.proto

package emu.protoshift.net.oldproto;

public final class GCGPVEIntentionOuterClass {
  private GCGPVEIntentionOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGPVEIntentionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGPVEIntention)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @return A list containing the skillIdList.
     */
    java.util.List<java.lang.Integer> getSkillIdListList();
    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @return The count of skillIdList.
     */
    int getSkillIdListCount();
    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    int getSkillIdList(int index);

    /**
     * <code>uint32 card_guid = 10;</code>
     * @return The cardGuid.
     */
    int getCardGuid();
  }
  /**
   * Protobuf type {@code GCGPVEIntention}
   */
  public static final class GCGPVEIntention extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGPVEIntention)
      GCGPVEIntentionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGPVEIntention.newBuilder() to construct.
    private GCGPVEIntention(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGPVEIntention() {
      skillIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGPVEIntention();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.internal_static_GCGPVEIntention_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.internal_static_GCGPVEIntention_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.class, emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.Builder.class);
    }

    public static final int SKILL_ID_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList skillIdList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @return A list containing the skillIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSkillIdListList() {
      return skillIdList_;
    }
    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @return The count of skillIdList.
     */
    public int getSkillIdListCount() {
      return skillIdList_.size();
    }
    /**
     * <code>repeated uint32 skill_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    public int getSkillIdList(int index) {
      return skillIdList_.getInt(index);
    }
    private int skillIdListMemoizedSerializedSize = -1;

    public static final int CARD_GUID_FIELD_NUMBER = 10;
    private int cardGuid_ = 0;
    /**
     * <code>uint32 card_guid = 10;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
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
      getSerializedSize();
      if (getSkillIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(skillIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillIdList_.size(); i++) {
        output.writeUInt32NoTag(skillIdList_.getInt(i));
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(10, cardGuid_);
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
        for (int i = 0; i < skillIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillIdListMemoizedSerializedSize = dataSize;
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cardGuid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention other = (emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention) obj;

      if (!getSkillIdListList()
          .equals(other.getSkillIdListList())) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
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
      if (getSkillIdListCount() > 0) {
        hash = (37 * hash) + SKILL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillIdListList().hashCode();
      }
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention prototype) {
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
     * Protobuf type {@code GCGPVEIntention}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGPVEIntention)
        emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntentionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.internal_static_GCGPVEIntention_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.internal_static_GCGPVEIntention_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.class, emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.newBuilder()
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
        skillIdList_ = emptyIntList();
        cardGuid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.internal_static_GCGPVEIntention_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention build() {
        emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention buildPartial() {
        emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention result = new emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          skillIdList_.makeImmutable();
          result.skillIdList_ = skillIdList_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cardGuid_ = cardGuid_;
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
        if (other instanceof emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention) {
          return mergeFrom((emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention other) {
        if (other == emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention.getDefaultInstance()) return this;
        if (!other.skillIdList_.isEmpty()) {
          if (skillIdList_.isEmpty()) {
            skillIdList_ = other.skillIdList_;
            skillIdList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureSkillIdListIsMutable();
            skillIdList_.addAll(other.skillIdList_);
          }
          onChanged();
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
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
                int v = input.readUInt32();
                ensureSkillIdListIsMutable();
                skillIdList_.addInt(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureSkillIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  skillIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 80: {
                cardGuid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private com.google.protobuf.Internal.IntList skillIdList_ = emptyIntList();
      private void ensureSkillIdListIsMutable() {
        if (!skillIdList_.isModifiable()) {
          skillIdList_ = makeMutableCopy(skillIdList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @return A list containing the skillIdList.
       */
      public java.util.List<java.lang.Integer>
          getSkillIdListList() {
        skillIdList_.makeImmutable();
        return skillIdList_;
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @return The count of skillIdList.
       */
      public int getSkillIdListCount() {
        return skillIdList_.size();
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @param index The index of the element to return.
       * @return The skillIdList at the given index.
       */
      public int getSkillIdList(int index) {
        return skillIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The skillIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillIdList(
          int index, int value) {

        ensureSkillIdListIsMutable();
        skillIdList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @param value The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addSkillIdList(int value) {

        ensureSkillIdListIsMutable();
        skillIdList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @param values The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillIdList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillIdList() {
        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 10;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 10;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {

        cardGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_guid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cardGuid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGPVEIntention)
    }

    // @@protoc_insertion_point(class_scope:GCGPVEIntention)
    private static final emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention();
    }

    public static emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGPVEIntention>
        PARSER = new com.google.protobuf.AbstractParser<GCGPVEIntention>() {
      @java.lang.Override
      public GCGPVEIntention parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGPVEIntention> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGPVEIntention> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGPVEIntentionOuterClass.GCGPVEIntention getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGPVEIntention_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGPVEIntention_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GCGPVEIntention.proto\";\n\017GCGPVEIntenti" +
      "on\022\025\n\rskill_id_list\030\005 \003(\r\022\021\n\tcard_guid\030\n" +
      " \001(\rB\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGPVEIntention_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGPVEIntention_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGPVEIntention_descriptor,
        new java.lang.String[] { "SkillIdList", "CardGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
