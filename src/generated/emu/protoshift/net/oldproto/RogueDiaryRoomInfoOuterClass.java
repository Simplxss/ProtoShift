// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDiaryRoomInfo.proto

package emu.protoshift.net.oldproto;

public final class RogueDiaryRoomInfoOuterClass {
  private RogueDiaryRoomInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDiaryRoomInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDiaryRoomInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_boss = 9;</code>
     * @return The isBoss.
     */
    boolean getIsBoss();

    /**
     * <code>uint32 config_id = 15;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> 
        getMonsterListList();
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair getMonsterList(int index);
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    int getMonsterListCount();
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getMonsterListOrBuilderList();
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getMonsterListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: KOLIJBLPOLE
   * </pre>
   *
   * Protobuf type {@code RogueDiaryRoomInfo}
   */
  public static final class RogueDiaryRoomInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDiaryRoomInfo)
      RogueDiaryRoomInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDiaryRoomInfo.newBuilder() to construct.
    private RogueDiaryRoomInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDiaryRoomInfo() {
      monsterList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDiaryRoomInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.internal_static_RogueDiaryRoomInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.internal_static_RogueDiaryRoomInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.class, emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.Builder.class);
    }

    public static final int IS_BOSS_FIELD_NUMBER = 9;
    private boolean isBoss_ = false;
    /**
     * <code>bool is_boss = 9;</code>
     * @return The isBoss.
     */
    @java.lang.Override
    public boolean getIsBoss() {
      return isBoss_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 15;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 15;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int MONSTER_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> monsterList_;
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> getMonsterListList() {
      return monsterList_;
    }
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
        getMonsterListOrBuilderList() {
      return monsterList_;
    }
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    @java.lang.Override
    public int getMonsterListCount() {
      return monsterList_.size();
    }
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair getMonsterList(int index) {
      return monsterList_.get(index);
    }
    /**
     * <code>repeated .Uint32Pair monster_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getMonsterListOrBuilder(
        int index) {
      return monsterList_.get(index);
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
      for (int i = 0; i < monsterList_.size(); i++) {
        output.writeMessage(3, monsterList_.get(i));
      }
      if (isBoss_ != false) {
        output.writeBool(9, isBoss_);
      }
      if (configId_ != 0) {
        output.writeUInt32(15, configId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < monsterList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, monsterList_.get(i));
      }
      if (isBoss_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isBoss_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, configId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo other = (emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo) obj;

      if (getIsBoss()
          != other.getIsBoss()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (!getMonsterListList()
          .equals(other.getMonsterListList())) return false;
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
      hash = (37 * hash) + IS_BOSS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBoss());
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      if (getMonsterListCount() > 0) {
        hash = (37 * hash) + MONSTER_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getMonsterListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo prototype) {
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
     * Obf: KOLIJBLPOLE
     * </pre>
     *
     * Protobuf type {@code RogueDiaryRoomInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDiaryRoomInfo)
        emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.internal_static_RogueDiaryRoomInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.internal_static_RogueDiaryRoomInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.class, emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.newBuilder()
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
        isBoss_ = false;
        configId_ = 0;
        if (monsterListBuilder_ == null) {
          monsterList_ = java.util.Collections.emptyList();
        } else {
          monsterList_ = null;
          monsterListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.internal_static_RogueDiaryRoomInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo build() {
        emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo buildPartial() {
        emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo result = new emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo result) {
        if (monsterListBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            monsterList_ = java.util.Collections.unmodifiableList(monsterList_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.monsterList_ = monsterList_;
        } else {
          result.monsterList_ = monsterListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isBoss_ = isBoss_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.configId_ = configId_;
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
        if (other instanceof emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo other) {
        if (other == emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo.getDefaultInstance()) return this;
        if (other.getIsBoss() != false) {
          setIsBoss(other.getIsBoss());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (monsterListBuilder_ == null) {
          if (!other.monsterList_.isEmpty()) {
            if (monsterList_.isEmpty()) {
              monsterList_ = other.monsterList_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMonsterListIsMutable();
              monsterList_.addAll(other.monsterList_);
            }
            onChanged();
          }
        } else {
          if (!other.monsterList_.isEmpty()) {
            if (monsterListBuilder_.isEmpty()) {
              monsterListBuilder_.dispose();
              monsterListBuilder_ = null;
              monsterList_ = other.monsterList_;
              bitField0_ = (bitField0_ & ~0x00000004);
              monsterListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMonsterListFieldBuilder() : null;
            } else {
              monsterListBuilder_.addAllMessages(other.monsterList_);
            }
          }
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
              case 26: {
                emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.parser(),
                        extensionRegistry);
                if (monsterListBuilder_ == null) {
                  ensureMonsterListIsMutable();
                  monsterList_.add(m);
                } else {
                  monsterListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 72: {
                isBoss_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 72
              case 120: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private boolean isBoss_ ;
      /**
       * <code>bool is_boss = 9;</code>
       * @return The isBoss.
       */
      @java.lang.Override
      public boolean getIsBoss() {
        return isBoss_;
      }
      /**
       * <code>bool is_boss = 9;</code>
       * @param value The isBoss to set.
       * @return This builder for chaining.
       */
      public Builder setIsBoss(boolean value) {

        isBoss_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_boss = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsBoss() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isBoss_ = false;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 15;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 15;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {

        configId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        configId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> monsterList_ =
        java.util.Collections.emptyList();
      private void ensureMonsterListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          monsterList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair>(monsterList_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> monsterListBuilder_;

      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> getMonsterListList() {
        if (monsterListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(monsterList_);
        } else {
          return monsterListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public int getMonsterListCount() {
        if (monsterListBuilder_ == null) {
          return monsterList_.size();
        } else {
          return monsterListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair getMonsterList(int index) {
        if (monsterListBuilder_ == null) {
          return monsterList_.get(index);
        } else {
          return monsterListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder setMonsterList(
          int index, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.set(index, value);
          onChanged();
        } else {
          monsterListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder setMonsterList(
          int index, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.set(index, builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder addMonsterList(emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.add(value);
          onChanged();
        } else {
          monsterListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder addMonsterList(
          int index, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair value) {
        if (monsterListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMonsterListIsMutable();
          monsterList_.add(index, value);
          onChanged();
        } else {
          monsterListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder addMonsterList(
          emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.add(builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder addMonsterList(
          int index, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.add(index, builderForValue.build());
          onChanged();
        } else {
          monsterListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder addAllMonsterList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair> values) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, monsterList_);
          onChanged();
        } else {
          monsterListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder clearMonsterList() {
        if (monsterListBuilder_ == null) {
          monsterList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          monsterListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public Builder removeMonsterList(int index) {
        if (monsterListBuilder_ == null) {
          ensureMonsterListIsMutable();
          monsterList_.remove(index);
          onChanged();
        } else {
          monsterListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder getMonsterListBuilder(
          int index) {
        return getMonsterListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder getMonsterListOrBuilder(
          int index) {
        if (monsterListBuilder_ == null) {
          return monsterList_.get(index);  } else {
          return monsterListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
           getMonsterListOrBuilderList() {
        if (monsterListBuilder_ != null) {
          return monsterListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(monsterList_);
        }
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder addMonsterListBuilder() {
        return getMonsterListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder addMonsterListBuilder(
          int index) {
        return getMonsterListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance());
      }
      /**
       * <code>repeated .Uint32Pair monster_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder> 
           getMonsterListBuilderList() {
        return getMonsterListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder> 
          getMonsterListFieldBuilder() {
        if (monsterListBuilder_ == null) {
          monsterListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32Pair.Builder, emu.protoshift.net.oldproto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                  monsterList_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          monsterList_ = null;
        }
        return monsterListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:RogueDiaryRoomInfo)
    }

    // @@protoc_insertion_point(class_scope:RogueDiaryRoomInfo)
    private static final emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo();
    }

    public static emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDiaryRoomInfo>
        PARSER = new com.google.protobuf.AbstractParser<RogueDiaryRoomInfo>() {
      @java.lang.Override
      public RogueDiaryRoomInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDiaryRoomInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDiaryRoomInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RogueDiaryRoomInfoOuterClass.RogueDiaryRoomInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDiaryRoomInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDiaryRoomInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030RogueDiaryRoomInfo.proto\032\020Uint32Pair.p" +
      "roto\"[\n\022RogueDiaryRoomInfo\022\017\n\007is_boss\030\t " +
      "\001(\010\022\021\n\tconfig_id\030\017 \001(\r\022!\n\014monster_list\030\003" +
      " \003(\0132\013.Uint32PairB\035\n\033emu.protoshift.net." +
      "oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.Uint32PairOuterClass.getDescriptor(),
        });
    internal_static_RogueDiaryRoomInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDiaryRoomInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDiaryRoomInfo_descriptor,
        new java.lang.String[] { "IsBoss", "ConfigId", "MonsterList", });
    emu.protoshift.net.oldproto.Uint32PairOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
