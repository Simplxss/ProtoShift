// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGZone.proto

package emu.protoshift.net.oldproto;

public final class GCGZoneOuterClass {
  private GCGZoneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGZoneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGZone)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @return A list containing the cardList.
     */
    java.util.List<java.lang.Integer> getCardListList();
    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @return The count of cardList.
     */
    int getCardListCount();
    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    int getCardList(int index);
  }
  /**
   * Protobuf type {@code GCGZone}
   */
  public static final class GCGZone extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGZone)
      GCGZoneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGZone.newBuilder() to construct.
    private GCGZone(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGZone() {
      cardList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGZone();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GCGZoneOuterClass.internal_static_GCGZone_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GCGZoneOuterClass.internal_static_GCGZone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.class, emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.Builder.class);
    }

    public static final int CARD_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList cardList_ =
        emptyIntList();
    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @return A list containing the cardList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCardListList() {
      return cardList_;
    }
    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @return The count of cardList.
     */
    public int getCardListCount() {
      return cardList_.size();
    }
    /**
     * <code>repeated uint32 card_list = 1;</code>
     * @param index The index of the element to return.
     * @return The cardList at the given index.
     */
    public int getCardList(int index) {
      return cardList_.getInt(index);
    }
    private int cardListMemoizedSerializedSize = -1;

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
      if (getCardListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(cardListMemoizedSerializedSize);
      }
      for (int i = 0; i < cardList_.size(); i++) {
        output.writeUInt32NoTag(cardList_.getInt(i));
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
        for (int i = 0; i < cardList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cardList_.getInt(i));
        }
        size += dataSize;
        if (!getCardListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cardListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone other = (emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone) obj;

      if (!getCardListList()
          .equals(other.getCardListList())) return false;
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
      if (getCardListCount() > 0) {
        hash = (37 * hash) + CARD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getCardListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone prototype) {
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
     * Protobuf type {@code GCGZone}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGZone)
        emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZoneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GCGZoneOuterClass.internal_static_GCGZone_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GCGZoneOuterClass.internal_static_GCGZone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.class, emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.newBuilder()
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
        cardList_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GCGZoneOuterClass.internal_static_GCGZone_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone build() {
        emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone buildPartial() {
        emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone result = new emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          cardList_.makeImmutable();
          result.cardList_ = cardList_;
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
        if (other instanceof emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone) {
          return mergeFrom((emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone other) {
        if (other == emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone.getDefaultInstance()) return this;
        if (!other.cardList_.isEmpty()) {
          if (cardList_.isEmpty()) {
            cardList_ = other.cardList_;
            cardList_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensureCardListIsMutable();
            cardList_.addAll(other.cardList_);
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
                int v = input.readUInt32();
                ensureCardListIsMutable();
                cardList_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureCardListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  cardList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
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

      private com.google.protobuf.Internal.IntList cardList_ = emptyIntList();
      private void ensureCardListIsMutable() {
        if (!cardList_.isModifiable()) {
          cardList_ = makeMutableCopy(cardList_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @return A list containing the cardList.
       */
      public java.util.List<java.lang.Integer>
          getCardListList() {
        cardList_.makeImmutable();
        return cardList_;
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @return The count of cardList.
       */
      public int getCardListCount() {
        return cardList_.size();
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @param index The index of the element to return.
       * @return The cardList at the given index.
       */
      public int getCardList(int index) {
        return cardList_.getInt(index);
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The cardList to set.
       * @return This builder for chaining.
       */
      public Builder setCardList(
          int index, int value) {

        ensureCardListIsMutable();
        cardList_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @param value The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addCardList(int value) {

        ensureCardListIsMutable();
        cardList_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @param values The cardList to add.
       * @return This builder for chaining.
       */
      public Builder addAllCardList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCardListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cardList_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 card_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardList() {
        cardList_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:GCGZone)
    }

    // @@protoc_insertion_point(class_scope:GCGZone)
    private static final emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone();
    }

    public static emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGZone>
        PARSER = new com.google.protobuf.AbstractParser<GCGZone>() {
      @java.lang.Override
      public GCGZone parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGZone> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGZone> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGZoneOuterClass.GCGZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGZone_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGZone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rGCGZone.proto\"\034\n\007GCGZone\022\021\n\tcard_list\030" +
      "\001 \003(\rB\035\n\033emu.protoshift.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGZone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGZone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGZone_descriptor,
        new java.lang.String[] { "CardList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
