// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayBattleInfoListNotify.proto

package emu.protoshift.net.oldproto;

public final class ScenePlayBattleInfoListNotifyOuterClass {
  private ScenePlayBattleInfoListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayBattleInfoListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayBattleInfoListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> 
        getBattleInfoListList();
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfoList(int index);
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    int getBattleInfoListCount();
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> 
        getBattleInfoListOrBuilderList();
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 20081
   * Obf: APELDOKLLFH
   * </pre>
   *
   * Protobuf type {@code ScenePlayBattleInfoListNotify}
   */
  public static final class ScenePlayBattleInfoListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayBattleInfoListNotify)
      ScenePlayBattleInfoListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayBattleInfoListNotify.newBuilder() to construct.
    private ScenePlayBattleInfoListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayBattleInfoListNotify() {
      battleInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayBattleInfoListNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.internal_static_ScenePlayBattleInfoListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.internal_static_ScenePlayBattleInfoListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.class, emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.Builder.class);
    }

    public static final int BATTLE_INFO_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> battleInfoList_;
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> getBattleInfoListList() {
      return battleInfoList_;
    }
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> 
        getBattleInfoListOrBuilderList() {
      return battleInfoList_;
    }
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    @java.lang.Override
    public int getBattleInfoListCount() {
      return battleInfoList_.size();
    }
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfoList(int index) {
      return battleInfoList_.get(index);
    }
    /**
     * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoListOrBuilder(
        int index) {
      return battleInfoList_.get(index);
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
      for (int i = 0; i < battleInfoList_.size(); i++) {
        output.writeMessage(11, battleInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < battleInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, battleInfoList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify other = (emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify) obj;

      if (!getBattleInfoListList()
          .equals(other.getBattleInfoListList())) return false;
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
      if (getBattleInfoListCount() > 0) {
        hash = (37 * hash) + BATTLE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBattleInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify prototype) {
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
     * CmdId: 20081
     * Obf: APELDOKLLFH
     * </pre>
     *
     * Protobuf type {@code ScenePlayBattleInfoListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayBattleInfoListNotify)
        emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.internal_static_ScenePlayBattleInfoListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.internal_static_ScenePlayBattleInfoListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.class, emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.newBuilder()
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
        if (battleInfoListBuilder_ == null) {
          battleInfoList_ = java.util.Collections.emptyList();
        } else {
          battleInfoList_ = null;
          battleInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.internal_static_ScenePlayBattleInfoListNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify build() {
        emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify buildPartial() {
        emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify result = new emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify result) {
        if (battleInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            battleInfoList_ = java.util.Collections.unmodifiableList(battleInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.battleInfoList_ = battleInfoList_;
        } else {
          result.battleInfoList_ = battleInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify other) {
        if (other == emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify.getDefaultInstance()) return this;
        if (battleInfoListBuilder_ == null) {
          if (!other.battleInfoList_.isEmpty()) {
            if (battleInfoList_.isEmpty()) {
              battleInfoList_ = other.battleInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBattleInfoListIsMutable();
              battleInfoList_.addAll(other.battleInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.battleInfoList_.isEmpty()) {
            if (battleInfoListBuilder_.isEmpty()) {
              battleInfoListBuilder_.dispose();
              battleInfoListBuilder_ = null;
              battleInfoList_ = other.battleInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              battleInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBattleInfoListFieldBuilder() : null;
            } else {
              battleInfoListBuilder_.addAllMessages(other.battleInfoList_);
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
              case 90: {
                emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.parser(),
                        extensionRegistry);
                if (battleInfoListBuilder_ == null) {
                  ensureBattleInfoListIsMutable();
                  battleInfoList_.add(m);
                } else {
                  battleInfoListBuilder_.addMessage(m);
                }
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

      private java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> battleInfoList_ =
        java.util.Collections.emptyList();
      private void ensureBattleInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          battleInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo>(battleInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> battleInfoListBuilder_;

      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> getBattleInfoListList() {
        if (battleInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(battleInfoList_);
        } else {
          return battleInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public int getBattleInfoListCount() {
        if (battleInfoListBuilder_ == null) {
          return battleInfoList_.size();
        } else {
          return battleInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo getBattleInfoList(int index) {
        if (battleInfoListBuilder_ == null) {
          return battleInfoList_.get(index);
        } else {
          return battleInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder setBattleInfoList(
          int index, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo value) {
        if (battleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleInfoListIsMutable();
          battleInfoList_.set(index, value);
          onChanged();
        } else {
          battleInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder setBattleInfoList(
          int index, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder builderForValue) {
        if (battleInfoListBuilder_ == null) {
          ensureBattleInfoListIsMutable();
          battleInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          battleInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder addBattleInfoList(emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo value) {
        if (battleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleInfoListIsMutable();
          battleInfoList_.add(value);
          onChanged();
        } else {
          battleInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder addBattleInfoList(
          int index, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo value) {
        if (battleInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBattleInfoListIsMutable();
          battleInfoList_.add(index, value);
          onChanged();
        } else {
          battleInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder addBattleInfoList(
          emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder builderForValue) {
        if (battleInfoListBuilder_ == null) {
          ensureBattleInfoListIsMutable();
          battleInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          battleInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder addBattleInfoList(
          int index, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder builderForValue) {
        if (battleInfoListBuilder_ == null) {
          ensureBattleInfoListIsMutable();
          battleInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          battleInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder addAllBattleInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo> values) {
        if (battleInfoListBuilder_ == null) {
          ensureBattleInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, battleInfoList_);
          onChanged();
        } else {
          battleInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder clearBattleInfoList() {
        if (battleInfoListBuilder_ == null) {
          battleInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          battleInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public Builder removeBattleInfoList(int index) {
        if (battleInfoListBuilder_ == null) {
          ensureBattleInfoListIsMutable();
          battleInfoList_.remove(index);
          onChanged();
        } else {
          battleInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder getBattleInfoListBuilder(
          int index) {
        return getBattleInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder getBattleInfoListOrBuilder(
          int index) {
        if (battleInfoListBuilder_ == null) {
          return battleInfoList_.get(index);  } else {
          return battleInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> 
           getBattleInfoListOrBuilderList() {
        if (battleInfoListBuilder_ != null) {
          return battleInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(battleInfoList_);
        }
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder addBattleInfoListBuilder() {
        return getBattleInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder addBattleInfoListBuilder(
          int index) {
        return getBattleInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayBattleInfo battle_info_list = 11;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder> 
           getBattleInfoListBuilderList() {
        return getBattleInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder> 
          getBattleInfoListFieldBuilder() {
        if (battleInfoListBuilder_ == null) {
          battleInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfo.Builder, emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.ScenePlayBattleInfoOrBuilder>(
                  battleInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          battleInfoList_ = null;
        }
        return battleInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayBattleInfoListNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayBattleInfoListNotify)
    private static final emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify();
    }

    public static emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayBattleInfoListNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayBattleInfoListNotify>() {
      @java.lang.Override
      public ScenePlayBattleInfoListNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ScenePlayBattleInfoListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayBattleInfoListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ScenePlayBattleInfoListNotifyOuterClass.ScenePlayBattleInfoListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayBattleInfoListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayBattleInfoListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#ScenePlayBattleInfoListNotify.proto\032\031S" +
      "cenePlayBattleInfo.proto\"O\n\035ScenePlayBat" +
      "tleInfoListNotify\022.\n\020battle_info_list\030\013 " +
      "\003(\0132\024.ScenePlayBattleInfoB\035\n\033emu.protosh" +
      "ift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayBattleInfoListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayBattleInfoListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayBattleInfoListNotify_descriptor,
        new java.lang.String[] { "BattleInfoList", });
    emu.protoshift.net.oldproto.ScenePlayBattleInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
