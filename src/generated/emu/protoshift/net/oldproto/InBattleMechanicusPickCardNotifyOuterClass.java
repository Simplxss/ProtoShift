// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusPickCardNotify.proto

package emu.protoshift.net.oldproto;

public final class InBattleMechanicusPickCardNotifyOuterClass {
  private InBattleMechanicusPickCardNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusPickCardNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusPickCardNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 4;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 play_index = 1;</code>
     * @return The playIndex.
     */
    int getPlayIndex();

    /**
     * <code>uint32 player_uid = 8;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    int getGroupId();
  }
  /**
   * <pre>
   * Obf: LIPPPMECKLO
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusPickCardNotify}
   */
  public static final class InBattleMechanicusPickCardNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusPickCardNotify)
      InBattleMechanicusPickCardNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusPickCardNotify.newBuilder() to construct.
    private InBattleMechanicusPickCardNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusPickCardNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusPickCardNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.internal_static_InBattleMechanicusPickCardNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.internal_static_InBattleMechanicusPickCardNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.class, emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 4;
    private int cardId_ = 0;
    /**
     * <code>uint32 card_id = 4;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 1;
    private int playIndex_ = 0;
    /**
     * <code>uint32 play_index = 1;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 8;
    private int playerUid_ = 0;
    /**
     * <code>uint32 player_uid = 8;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 7;
    private int groupId_ = 0;
    /**
     * <code>uint32 group_id = 7;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
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
      if (playIndex_ != 0) {
        output.writeUInt32(1, playIndex_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(4, cardId_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(7, groupId_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(8, playerUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, playIndex_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, cardId_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, groupId_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, playerUid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify other = (emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify prototype) {
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
     * Obf: LIPPPMECKLO
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusPickCardNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusPickCardNotify)
        emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.internal_static_InBattleMechanicusPickCardNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.internal_static_InBattleMechanicusPickCardNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.class, emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.newBuilder()
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
        cardId_ = 0;
        playIndex_ = 0;
        playerUid_ = 0;
        groupId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.internal_static_InBattleMechanicusPickCardNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify build() {
        emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify buildPartial() {
        emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify result = new emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cardId_ = cardId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.playIndex_ = playIndex_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.playerUid_ = playerUid_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.groupId_ = groupId_;
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
        if (other instanceof emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify other) {
        if (other == emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
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
                playIndex_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 32: {
                cardId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 56: {
                groupId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 56
              case 64: {
                playerUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
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

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 4;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 4;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {

        cardId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 1;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 1;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {

        playIndex_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playIndex_ = 0;
        onChanged();
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 8;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 8;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {

        playerUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 7;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {

        groupId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        groupId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusPickCardNotify)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusPickCardNotify)
    private static final emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify();
    }

    public static emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusPickCardNotify>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusPickCardNotify>() {
      @java.lang.Override
      public InBattleMechanicusPickCardNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<InBattleMechanicusPickCardNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusPickCardNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.InBattleMechanicusPickCardNotifyOuterClass.InBattleMechanicusPickCardNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusPickCardNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusPickCardNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&InBattleMechanicusPickCardNotify.proto" +
      "\"m\n InBattleMechanicusPickCardNotify\022\017\n\007" +
      "card_id\030\004 \001(\r\022\022\n\nplay_index\030\001 \001(\r\022\022\n\npla" +
      "yer_uid\030\010 \001(\r\022\020\n\010group_id\030\007 \001(\rB\035\n\033emu.p" +
      "rotoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusPickCardNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusPickCardNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusPickCardNotify_descriptor,
        new java.lang.String[] { "CardId", "PlayIndex", "PlayerUid", "GroupId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
