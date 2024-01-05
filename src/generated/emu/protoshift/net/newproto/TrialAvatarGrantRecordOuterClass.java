// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrialAvatarGrantRecord.proto

package emu.protoshift.net.newproto;

public final class TrialAvatarGrantRecordOuterClass {
  private TrialAvatarGrantRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarGrantRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarGrantRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 grant_reason = 1;</code>
     * @return The grantReason.
     */
    int getGrantReason();

    /**
     * <code>uint32 from_parent_quest_id = 2;</code>
     * @return The fromParentQuestId.
     */
    int getFromParentQuestId();
  }
  /**
   * Protobuf type {@code TrialAvatarGrantRecord}
   */
  public static final class TrialAvatarGrantRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrialAvatarGrantRecord)
      TrialAvatarGrantRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrialAvatarGrantRecord.newBuilder() to construct.
    private TrialAvatarGrantRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarGrantRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrialAvatarGrantRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.class, emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder.class);
    }

    /**
     * Protobuf enum {@code TrialAvatarGrantRecord.GrantReason}
     */
    public enum GrantReason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>GRANT_REASON_INVALID = 0;</code>
       */
      GRANT_REASON_INVALID(0),
      /**
       * <code>GRANT_REASON_BY_QUEST = 1;</code>
       */
      GRANT_REASON_BY_QUEST(1),
      /**
       * <code>GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY = 2;</code>
       */
      GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY(2),
      /**
       * <code>GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE = 3;</code>
       */
      GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE(3),
      /**
       * <code>GRANT_REASON_BY_MIST_TRIAL_ACTIVITY = 4;</code>
       */
      GRANT_REASON_BY_MIST_TRIAL_ACTIVITY(4),
      /**
       * <code>GRANT_REASON_BY_SUMO_ACTIVITY = 5;</code>
       */
      GRANT_REASON_BY_SUMO_ACTIVITY(5),
      /**
       * <code>GRANT_REASON_BY_POTION_ACTIVITY = 6;</code>
       */
      GRANT_REASON_BY_POTION_ACTIVITY(6),
      /**
       * <code>GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY = 7;</code>
       */
      GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY(7),
      /**
       * <code>GRANT_REASON_BY_IRODORI_MASTER = 8;</code>
       */
      GRANT_REASON_BY_IRODORI_MASTER(8),
      /**
       * <code>GRANT_REASON_BY_GM = 9;</code>
       */
      GRANT_REASON_BY_GM(9),
      /**
       * <code>GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY = 10;</code>
       */
      GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY(10),
      /**
       * <code>GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY = 11;</code>
       */
      GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY(11),
      /**
       * <code>GRANT_REASON_BY_VINTAGE_HUNTING = 12;</code>
       */
      GRANT_REASON_BY_VINTAGE_HUNTING(12),
      /**
       * <code>GRANT_REASON_BY_CHAR_AMUSEMENT = 13;</code>
       */
      GRANT_REASON_BY_CHAR_AMUSEMENT(13),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>GRANT_REASON_INVALID = 0;</code>
       */
      public static final int GRANT_REASON_INVALID_VALUE = 0;
      /**
       * <code>GRANT_REASON_BY_QUEST = 1;</code>
       */
      public static final int GRANT_REASON_BY_QUEST_VALUE = 1;
      /**
       * <code>GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY = 2;</code>
       */
      public static final int GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY_VALUE = 2;
      /**
       * <code>GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE = 3;</code>
       */
      public static final int GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE_VALUE = 3;
      /**
       * <code>GRANT_REASON_BY_MIST_TRIAL_ACTIVITY = 4;</code>
       */
      public static final int GRANT_REASON_BY_MIST_TRIAL_ACTIVITY_VALUE = 4;
      /**
       * <code>GRANT_REASON_BY_SUMO_ACTIVITY = 5;</code>
       */
      public static final int GRANT_REASON_BY_SUMO_ACTIVITY_VALUE = 5;
      /**
       * <code>GRANT_REASON_BY_POTION_ACTIVITY = 6;</code>
       */
      public static final int GRANT_REASON_BY_POTION_ACTIVITY_VALUE = 6;
      /**
       * <code>GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY = 7;</code>
       */
      public static final int GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY_VALUE = 7;
      /**
       * <code>GRANT_REASON_BY_IRODORI_MASTER = 8;</code>
       */
      public static final int GRANT_REASON_BY_IRODORI_MASTER_VALUE = 8;
      /**
       * <code>GRANT_REASON_BY_GM = 9;</code>
       */
      public static final int GRANT_REASON_BY_GM_VALUE = 9;
      /**
       * <code>GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY = 10;</code>
       */
      public static final int GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY_VALUE = 10;
      /**
       * <code>GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY = 11;</code>
       */
      public static final int GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY_VALUE = 11;
      /**
       * <code>GRANT_REASON_BY_VINTAGE_HUNTING = 12;</code>
       */
      public static final int GRANT_REASON_BY_VINTAGE_HUNTING_VALUE = 12;
      /**
       * <code>GRANT_REASON_BY_CHAR_AMUSEMENT = 13;</code>
       */
      public static final int GRANT_REASON_BY_CHAR_AMUSEMENT_VALUE = 13;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static GrantReason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GrantReason forNumber(int value) {
        switch (value) {
          case 0: return GRANT_REASON_INVALID;
          case 1: return GRANT_REASON_BY_QUEST;
          case 2: return GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY;
          case 3: return GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE;
          case 4: return GRANT_REASON_BY_MIST_TRIAL_ACTIVITY;
          case 5: return GRANT_REASON_BY_SUMO_ACTIVITY;
          case 6: return GRANT_REASON_BY_POTION_ACTIVITY;
          case 7: return GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY;
          case 8: return GRANT_REASON_BY_IRODORI_MASTER;
          case 9: return GRANT_REASON_BY_GM;
          case 10: return GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY;
          case 11: return GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY;
          case 12: return GRANT_REASON_BY_VINTAGE_HUNTING;
          case 13: return GRANT_REASON_BY_CHAR_AMUSEMENT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GrantReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GrantReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GrantReason>() {
              public GrantReason findValueByNumber(int number) {
                return GrantReason.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDescriptor().getEnumTypes().get(0);
      }

      private static final GrantReason[] VALUES = values();

      public static GrantReason valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private GrantReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TrialAvatarGrantRecord.GrantReason)
    }

    public static final int GRANT_REASON_FIELD_NUMBER = 1;
    private int grantReason_ = 0;
    /**
     * <code>uint32 grant_reason = 1;</code>
     * @return The grantReason.
     */
    @java.lang.Override
    public int getGrantReason() {
      return grantReason_;
    }

    public static final int FROM_PARENT_QUEST_ID_FIELD_NUMBER = 2;
    private int fromParentQuestId_ = 0;
    /**
     * <code>uint32 from_parent_quest_id = 2;</code>
     * @return The fromParentQuestId.
     */
    @java.lang.Override
    public int getFromParentQuestId() {
      return fromParentQuestId_;
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
      if (grantReason_ != 0) {
        output.writeUInt32(1, grantReason_);
      }
      if (fromParentQuestId_ != 0) {
        output.writeUInt32(2, fromParentQuestId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (grantReason_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, grantReason_);
      }
      if (fromParentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, fromParentQuestId_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord other = (emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord) obj;

      if (getGrantReason()
          != other.getGrantReason()) return false;
      if (getFromParentQuestId()
          != other.getFromParentQuestId()) return false;
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
      hash = (37 * hash) + GRANT_REASON_FIELD_NUMBER;
      hash = (53 * hash) + getGrantReason();
      hash = (37 * hash) + FROM_PARENT_QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFromParentQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord prototype) {
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
     * Protobuf type {@code TrialAvatarGrantRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarGrantRecord)
        emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.class, emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.newBuilder()
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
        grantReason_ = 0;
        fromParentQuestId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.internal_static_TrialAvatarGrantRecord_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord build() {
        emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord buildPartial() {
        emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord result = new emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.grantReason_ = grantReason_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fromParentQuestId_ = fromParentQuestId_;
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
        if (other instanceof emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord) {
          return mergeFrom((emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord other) {
        if (other == emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDefaultInstance()) return this;
        if (other.getGrantReason() != 0) {
          setGrantReason(other.getGrantReason());
        }
        if (other.getFromParentQuestId() != 0) {
          setFromParentQuestId(other.getFromParentQuestId());
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
                grantReason_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                fromParentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private int grantReason_ ;
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @return The grantReason.
       */
      @java.lang.Override
      public int getGrantReason() {
        return grantReason_;
      }
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @param value The grantReason to set.
       * @return This builder for chaining.
       */
      public Builder setGrantReason(int value) {

        grantReason_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 grant_reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGrantReason() {
        bitField0_ = (bitField0_ & ~0x00000001);
        grantReason_ = 0;
        onChanged();
        return this;
      }

      private int fromParentQuestId_ ;
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @return The fromParentQuestId.
       */
      @java.lang.Override
      public int getFromParentQuestId() {
        return fromParentQuestId_;
      }
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @param value The fromParentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setFromParentQuestId(int value) {

        fromParentQuestId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 from_parent_quest_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFromParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fromParentQuestId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TrialAvatarGrantRecord)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarGrantRecord)
    private static final emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord();
    }

    public static emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarGrantRecord>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarGrantRecord>() {
      @java.lang.Override
      public TrialAvatarGrantRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<TrialAvatarGrantRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrialAvatarGrantRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarGrantRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrialAvatarGrantRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034TrialAvatarGrantRecord.proto\"\346\004\n\026Trial" +
      "AvatarGrantRecord\022\024\n\014grant_reason\030\001 \001(\r\022" +
      "\034\n\024from_parent_quest_id\030\002 \001(\r\"\227\004\n\013GrantR" +
      "eason\022\030\n\024GRANT_REASON_INVALID\020\000\022\031\n\025GRANT" +
      "_REASON_BY_QUEST\020\001\022)\n%GRANT_REASON_BY_TR" +
      "IAL_AVATAR_ACTIVITY\020\002\022-\n)GRANT_REASON_BY" +
      "_DUNGEON_ELEMENT_CHALLENGE\020\003\022\'\n#GRANT_RE" +
      "ASON_BY_MIST_TRIAL_ACTIVITY\020\004\022!\n\035GRANT_R" +
      "EASON_BY_SUMO_ACTIVITY\020\005\022#\n\037GRANT_REASON" +
      "_BY_POTION_ACTIVITY\020\006\022)\n%GRANT_REASON_BY" +
      "_CRYSTAL_LINK_ACTIVITY\020\007\022\"\n\036GRANT_REASON" +
      "_BY_IRODORI_MASTER\020\010\022\026\n\022GRANT_REASON_BY_" +
      "GM\020\t\022+\n\'GRANT_REASON_BY_INSTABLE_SPRAY_A" +
      "CTIVITY\020\n\022+\n\'GRANT_REASON_BY_MUQADAS_POT" +
      "ION_ACTIVITY\020\013\022#\n\037GRANT_REASON_BY_VINTAG" +
      "E_HUNTING\020\014\022\"\n\036GRANT_REASON_BY_CHAR_AMUS" +
      "EMENT\020\rB\035\n\033emu.protoshift.net.newprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TrialAvatarGrantRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarGrantRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrialAvatarGrantRecord_descriptor,
        new java.lang.String[] { "GrantReason", "FromParentQuestId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
