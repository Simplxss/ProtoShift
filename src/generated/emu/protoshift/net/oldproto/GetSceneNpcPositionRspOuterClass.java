// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetSceneNpcPositionRsp.proto

package emu.protoshift.net.oldproto;

public final class GetSceneNpcPositionRspOuterClass {
  private GetSceneNpcPositionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetSceneNpcPositionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetSceneNpcPositionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> 
        getNpcInfoListList();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index);
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    int getNpcInfoListCount();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
        getNpcInfoListOrBuilderList();
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 412
   * Obf: BDFEJLKPOGK
   * </pre>
   *
   * Protobuf type {@code GetSceneNpcPositionRsp}
   */
  public static final class GetSceneNpcPositionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetSceneNpcPositionRsp)
      GetSceneNpcPositionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetSceneNpcPositionRsp.newBuilder() to construct.
    private GetSceneNpcPositionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetSceneNpcPositionRsp() {
      npcInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetSceneNpcPositionRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.class, emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.Builder.class);
    }

    public static final int NPC_INFO_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> npcInfoList_;
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> getNpcInfoListList() {
      return npcInfoList_;
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
        getNpcInfoListOrBuilderList() {
      return npcInfoList_;
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    @java.lang.Override
    public int getNpcInfoListCount() {
      return npcInfoList_.size();
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index) {
      return npcInfoList_.get(index);
    }
    /**
     * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
        int index) {
      return npcInfoList_.get(index);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 11;
    private int sceneId_ = 0;
    /**
     * <code>uint32 scene_id = 11;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 1;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 1;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (retcode_ != 0) {
        output.writeInt32(1, retcode_);
      }
      for (int i = 0; i < npcInfoList_.size(); i++) {
        output.writeMessage(3, npcInfoList_.get(i));
      }
      if (sceneId_ != 0) {
        output.writeUInt32(11, sceneId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, retcode_);
      }
      for (int i = 0; i < npcInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, npcInfoList_.get(i));
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, sceneId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp other = (emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp) obj;

      if (!getNpcInfoListList()
          .equals(other.getNpcInfoListList())) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      if (getNpcInfoListCount() > 0) {
        hash = (37 * hash) + NPC_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getNpcInfoListList().hashCode();
      }
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp prototype) {
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
     * CmdId: 412
     * Obf: BDFEJLKPOGK
     * </pre>
     *
     * Protobuf type {@code GetSceneNpcPositionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetSceneNpcPositionRsp)
        emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.class, emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.newBuilder()
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
        if (npcInfoListBuilder_ == null) {
          npcInfoList_ = java.util.Collections.emptyList();
        } else {
          npcInfoList_ = null;
          npcInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        sceneId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.internal_static_GetSceneNpcPositionRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp build() {
        emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp buildPartial() {
        emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result = new emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result) {
        if (npcInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            npcInfoList_ = java.util.Collections.unmodifiableList(npcInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.npcInfoList_ = npcInfoList_;
        } else {
          result.npcInfoList_ = npcInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.sceneId_ = sceneId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp other) {
        if (other == emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp.getDefaultInstance()) return this;
        if (npcInfoListBuilder_ == null) {
          if (!other.npcInfoList_.isEmpty()) {
            if (npcInfoList_.isEmpty()) {
              npcInfoList_ = other.npcInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNpcInfoListIsMutable();
              npcInfoList_.addAll(other.npcInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.npcInfoList_.isEmpty()) {
            if (npcInfoListBuilder_.isEmpty()) {
              npcInfoListBuilder_.dispose();
              npcInfoListBuilder_ = null;
              npcInfoList_ = other.npcInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              npcInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNpcInfoListFieldBuilder() : null;
            } else {
              npcInfoListBuilder_.addAllMessages(other.npcInfoList_);
            }
          }
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 26: {
                emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.parser(),
                        extensionRegistry);
                if (npcInfoListBuilder_ == null) {
                  ensureNpcInfoListIsMutable();
                  npcInfoList_.add(m);
                } else {
                  npcInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 88: {
                sceneId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
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

      private java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> npcInfoList_ =
        java.util.Collections.emptyList();
      private void ensureNpcInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          npcInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo>(npcInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> npcInfoListBuilder_;

      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> getNpcInfoListList() {
        if (npcInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(npcInfoList_);
        } else {
          return npcInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public int getNpcInfoListCount() {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.size();
        } else {
          return npcInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo getNpcInfoList(int index) {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.get(index);
        } else {
          return npcInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder setNpcInfoList(
          int index, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.set(index, value);
          onChanged();
        } else {
          npcInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder setNpcInfoList(
          int index, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder addNpcInfoList(emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(value);
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder addNpcInfoList(
          int index, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo value) {
        if (npcInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(index, value);
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder addNpcInfoList(
          emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder addNpcInfoList(
          int index, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder builderForValue) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          npcInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder addAllNpcInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo> values) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, npcInfoList_);
          onChanged();
        } else {
          npcInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder clearNpcInfoList() {
        if (npcInfoListBuilder_ == null) {
          npcInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          npcInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public Builder removeNpcInfoList(int index) {
        if (npcInfoListBuilder_ == null) {
          ensureNpcInfoListIsMutable();
          npcInfoList_.remove(index);
          onChanged();
        } else {
          npcInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder getNpcInfoListBuilder(
          int index) {
        return getNpcInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder getNpcInfoListOrBuilder(
          int index) {
        if (npcInfoListBuilder_ == null) {
          return npcInfoList_.get(index);  } else {
          return npcInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
           getNpcInfoListOrBuilderList() {
        if (npcInfoListBuilder_ != null) {
          return npcInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(npcInfoList_);
        }
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder addNpcInfoListBuilder() {
        return getNpcInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder addNpcInfoListBuilder(
          int index) {
        return getNpcInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .NpcPositionInfo npc_info_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder> 
           getNpcInfoListBuilderList() {
        return getNpcInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder> 
          getNpcInfoListFieldBuilder() {
        if (npcInfoListBuilder_ == null) {
          npcInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfo.Builder, emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.NpcPositionInfoOrBuilder>(
                  npcInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          npcInfoList_ = null;
        }
        return npcInfoListBuilder_;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 11;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 11;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {

        sceneId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 1;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetSceneNpcPositionRsp)
    }

    // @@protoc_insertion_point(class_scope:GetSceneNpcPositionRsp)
    private static final emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp();
    }

    public static emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetSceneNpcPositionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetSceneNpcPositionRsp>() {
      @java.lang.Override
      public GetSceneNpcPositionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetSceneNpcPositionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetSceneNpcPositionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetSceneNpcPositionRspOuterClass.GetSceneNpcPositionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetSceneNpcPositionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetSceneNpcPositionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetSceneNpcPositionRsp.proto\032\025NpcPosit" +
      "ionInfo.proto\"d\n\026GetSceneNpcPositionRsp\022" +
      "\'\n\rnpc_info_list\030\003 \003(\0132\020.NpcPositionInfo" +
      "\022\020\n\010scene_id\030\013 \001(\r\022\017\n\007retcode\030\001 \001(\005B\035\n\033e" +
      "mu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.getDescriptor(),
        });
    internal_static_GetSceneNpcPositionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetSceneNpcPositionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetSceneNpcPositionRsp_descriptor,
        new java.lang.String[] { "NpcInfoList", "SceneId", "Retcode", });
    emu.protoshift.net.oldproto.NpcPositionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
