// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamInviteNotify.proto

package emu.protoshift.net.oldproto;

public final class DungeonCandidateTeamInviteNotifyOuterClass {
  private DungeonCandidateTeamInviteNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonCandidateTeamInviteNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamInviteNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 13;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 player_uid = 14;</code>
     * @return The playerUid.
     */
    int getPlayerUid();

    /**
     * <code>uint32 vaild_deadline_time_sec = 5;</code>
     * @return The vaildDeadlineTimeSec.
     */
    int getVaildDeadlineTimeSec();
  }
  /**
   * <pre>
   * Obf: EKFFOLPOFOG
   * </pre>
   *
   * Protobuf type {@code DungeonCandidateTeamInviteNotify}
   */
  public static final class DungeonCandidateTeamInviteNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonCandidateTeamInviteNotify)
      DungeonCandidateTeamInviteNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonCandidateTeamInviteNotify.newBuilder() to construct.
    private DungeonCandidateTeamInviteNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonCandidateTeamInviteNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonCandidateTeamInviteNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.internal_static_DungeonCandidateTeamInviteNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.internal_static_DungeonCandidateTeamInviteNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.class, emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 13;
    private int dungeonId_ = 0;
    /**
     * <code>uint32 dungeon_id = 13;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int PLAYER_UID_FIELD_NUMBER = 14;
    private int playerUid_ = 0;
    /**
     * <code>uint32 player_uid = 14;</code>
     * @return The playerUid.
     */
    @java.lang.Override
    public int getPlayerUid() {
      return playerUid_;
    }

    public static final int VAILD_DEADLINE_TIME_SEC_FIELD_NUMBER = 5;
    private int vaildDeadlineTimeSec_ = 0;
    /**
     * <code>uint32 vaild_deadline_time_sec = 5;</code>
     * @return The vaildDeadlineTimeSec.
     */
    @java.lang.Override
    public int getVaildDeadlineTimeSec() {
      return vaildDeadlineTimeSec_;
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
      if (vaildDeadlineTimeSec_ != 0) {
        output.writeUInt32(5, vaildDeadlineTimeSec_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(13, dungeonId_);
      }
      if (playerUid_ != 0) {
        output.writeUInt32(14, playerUid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (vaildDeadlineTimeSec_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, vaildDeadlineTimeSec_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dungeonId_);
      }
      if (playerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, playerUid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify other = (emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getPlayerUid()
          != other.getPlayerUid()) return false;
      if (getVaildDeadlineTimeSec()
          != other.getVaildDeadlineTimeSec()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerUid();
      hash = (37 * hash) + VAILD_DEADLINE_TIME_SEC_FIELD_NUMBER;
      hash = (53 * hash) + getVaildDeadlineTimeSec();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify prototype) {
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
     * Obf: EKFFOLPOFOG
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamInviteNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamInviteNotify)
        emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.internal_static_DungeonCandidateTeamInviteNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.internal_static_DungeonCandidateTeamInviteNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.class, emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.newBuilder()
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
        dungeonId_ = 0;
        playerUid_ = 0;
        vaildDeadlineTimeSec_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.internal_static_DungeonCandidateTeamInviteNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify build() {
        emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify buildPartial() {
        emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify result = new emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonId_ = dungeonId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.playerUid_ = playerUid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.vaildDeadlineTimeSec_ = vaildDeadlineTimeSec_;
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
        if (other instanceof emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify other) {
        if (other == emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getPlayerUid() != 0) {
          setPlayerUid(other.getPlayerUid());
        }
        if (other.getVaildDeadlineTimeSec() != 0) {
          setVaildDeadlineTimeSec(other.getVaildDeadlineTimeSec());
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
                vaildDeadlineTimeSec_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 104: {
                dungeonId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 112: {
                playerUid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {

        dungeonId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int playerUid_ ;
      /**
       * <code>uint32 player_uid = 14;</code>
       * @return The playerUid.
       */
      @java.lang.Override
      public int getPlayerUid() {
        return playerUid_;
      }
      /**
       * <code>uint32 player_uid = 14;</code>
       * @param value The playerUid to set.
       * @return This builder for chaining.
       */
      public Builder setPlayerUid(int value) {

        playerUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 player_uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayerUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        playerUid_ = 0;
        onChanged();
        return this;
      }

      private int vaildDeadlineTimeSec_ ;
      /**
       * <code>uint32 vaild_deadline_time_sec = 5;</code>
       * @return The vaildDeadlineTimeSec.
       */
      @java.lang.Override
      public int getVaildDeadlineTimeSec() {
        return vaildDeadlineTimeSec_;
      }
      /**
       * <code>uint32 vaild_deadline_time_sec = 5;</code>
       * @param value The vaildDeadlineTimeSec to set.
       * @return This builder for chaining.
       */
      public Builder setVaildDeadlineTimeSec(int value) {

        vaildDeadlineTimeSec_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 vaild_deadline_time_sec = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearVaildDeadlineTimeSec() {
        bitField0_ = (bitField0_ & ~0x00000004);
        vaildDeadlineTimeSec_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamInviteNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonCandidateTeamInviteNotify)
    private static final emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify();
    }

    public static emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonCandidateTeamInviteNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonCandidateTeamInviteNotify>() {
      @java.lang.Override
      public DungeonCandidateTeamInviteNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonCandidateTeamInviteNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonCandidateTeamInviteNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.DungeonCandidateTeamInviteNotifyOuterClass.DungeonCandidateTeamInviteNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonCandidateTeamInviteNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonCandidateTeamInviteNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&DungeonCandidateTeamInviteNotify.proto" +
      "\"k\n DungeonCandidateTeamInviteNotify\022\022\n\n" +
      "dungeon_id\030\r \001(\r\022\022\n\nplayer_uid\030\016 \001(\r\022\037\n\027" +
      "vaild_deadline_time_sec\030\005 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonCandidateTeamInviteNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonCandidateTeamInviteNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonCandidateTeamInviteNotify_descriptor,
        new java.lang.String[] { "DungeonId", "PlayerUid", "VaildDeadlineTimeSec", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
