// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgReactionBegin.proto

package emu.protoshift.net.oldproto;

public final class GCGMsgReactionBeginOuterClass {
  private GCGMsgReactionBeginOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgReactionBeginOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgReactionBegin)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skill_id = 2;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint32 card_guid = 12;</code>
     * @return The cardGuid.
     */
    int getCardGuid();
  }
  /**
   * Protobuf type {@code GCGMsgReactionBegin}
   */
  public static final class GCGMsgReactionBegin extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgReactionBegin)
      GCGMsgReactionBeginOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgReactionBegin.newBuilder() to construct.
    private GCGMsgReactionBegin(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgReactionBegin() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgReactionBegin();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.internal_static_GCGMsgReactionBegin_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.internal_static_GCGMsgReactionBegin_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.class, emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.Builder.class);
    }

    public static final int SKILL_ID_FIELD_NUMBER = 2;
    private int skillId_ = 0;
    /**
     * <code>uint32 skill_id = 2;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int CARD_GUID_FIELD_NUMBER = 12;
    private int cardGuid_ = 0;
    /**
     * <code>uint32 card_guid = 12;</code>
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
      if (skillId_ != 0) {
        output.writeUInt32(2, skillId_);
      }
      if (cardGuid_ != 0) {
        output.writeUInt32(12, cardGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, skillId_);
      }
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cardGuid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin other = (emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
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
      hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + CARD_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin prototype) {
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
     * Protobuf type {@code GCGMsgReactionBegin}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgReactionBegin)
        emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBeginOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.internal_static_GCGMsgReactionBegin_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.internal_static_GCGMsgReactionBegin_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.class, emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.newBuilder()
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
        skillId_ = 0;
        cardGuid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.internal_static_GCGMsgReactionBegin_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin build() {
        emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin buildPartial() {
        emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin result = new emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.skillId_ = skillId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin) {
          return mergeFrom((emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin other) {
        if (other == emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
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
              case 16: {
                skillId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 96: {
                cardGuid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private int skillId_ ;
      /**
       * <code>uint32 skill_id = 2;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skill_id = 2;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {

        skillId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skill_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 card_guid = 12;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 card_guid = 12;</code>
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
       * <code>uint32 card_guid = 12;</code>
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


      // @@protoc_insertion_point(builder_scope:GCGMsgReactionBegin)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgReactionBegin)
    private static final emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin();
    }

    public static emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgReactionBegin>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgReactionBegin>() {
      @java.lang.Override
      public GCGMsgReactionBegin parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGMsgReactionBegin> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgReactionBegin> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGMsgReactionBeginOuterClass.GCGMsgReactionBegin getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgReactionBegin_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgReactionBegin_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGMsgReactionBegin.proto\":\n\023GCGMsgRea" +
      "ctionBegin\022\020\n\010skill_id\030\002 \001(\r\022\021\n\tcard_gui" +
      "d\030\014 \001(\rB\035\n\033emu.protoshift.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGMsgReactionBegin_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgReactionBegin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgReactionBegin_descriptor,
        new java.lang.String[] { "SkillId", "CardGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
