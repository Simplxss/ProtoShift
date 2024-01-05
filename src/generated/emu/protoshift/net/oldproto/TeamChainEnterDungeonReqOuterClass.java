// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamChainEnterDungeonReq.proto

package emu.protoshift.net.oldproto;

public final class TeamChainEnterDungeonReqOuterClass {
  private TeamChainEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TeamChainEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamChainEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> 
        getTeamInfoListList();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index);
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    int getTeamInfoListCount();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList();
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index);

    /**
     * <code>uint32 difficulty = 5;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    int getStageId();
  }
  /**
   * <pre>
   * CmdId: 6657
   * Obf: JCEODPFPNHF
   * </pre>
   *
   * Protobuf type {@code TeamChainEnterDungeonReq}
   */
  public static final class TeamChainEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TeamChainEnterDungeonReq)
      TeamChainEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TeamChainEnterDungeonReq.newBuilder() to construct.
    private TeamChainEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TeamChainEnterDungeonReq() {
      teamInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TeamChainEnterDungeonReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.class, emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.Builder.class);
    }

    public static final int TEAM_INFO_LIST_FIELD_NUMBER = 6;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> teamInfoList_;
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> getTeamInfoListList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
        getTeamInfoListOrBuilderList() {
      return teamInfoList_;
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    @java.lang.Override
    public int getTeamInfoListCount() {
      return teamInfoList_.size();
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index) {
      return teamInfoList_.get(index);
    }
    /**
     * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
        int index) {
      return teamInfoList_.get(index);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 5;
    private int difficulty_ = 0;
    /**
     * <code>uint32 difficulty = 5;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 7;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
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
      if (difficulty_ != 0) {
        output.writeUInt32(5, difficulty_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        output.writeMessage(6, teamInfoList_.get(i));
      }
      if (stageId_ != 0) {
        output.writeUInt32(7, stageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, difficulty_);
      }
      for (int i = 0; i < teamInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, teamInfoList_.get(i));
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, stageId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq other = (emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq) obj;

      if (!getTeamInfoListList()
          .equals(other.getTeamInfoListList())) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getStageId()
          != other.getStageId()) return false;
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
      if (getTeamInfoListCount() > 0) {
        hash = (37 * hash) + TEAM_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamInfoListList().hashCode();
      }
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq prototype) {
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
     * CmdId: 6657
     * Obf: JCEODPFPNHF
     * </pre>
     *
     * Protobuf type {@code TeamChainEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamChainEnterDungeonReq)
        emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.class, emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.newBuilder()
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
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
        } else {
          teamInfoList_ = null;
          teamInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        difficulty_ = 0;
        stageId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.internal_static_TeamChainEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq build() {
        emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq buildPartial() {
        emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result = new emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result) {
        if (teamInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamInfoList_ = java.util.Collections.unmodifiableList(teamInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamInfoList_ = teamInfoList_;
        } else {
          result.teamInfoList_ = teamInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.difficulty_ = difficulty_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.stageId_ = stageId_;
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
        if (other instanceof emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq) {
          return mergeFrom((emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq other) {
        if (other == emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq.getDefaultInstance()) return this;
        if (teamInfoListBuilder_ == null) {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoList_.isEmpty()) {
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamInfoListIsMutable();
              teamInfoList_.addAll(other.teamInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamInfoList_.isEmpty()) {
            if (teamInfoListBuilder_.isEmpty()) {
              teamInfoListBuilder_.dispose();
              teamInfoListBuilder_ = null;
              teamInfoList_ = other.teamInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamInfoListFieldBuilder() : null;
            } else {
              teamInfoListBuilder_.addAllMessages(other.teamInfoList_);
            }
          }
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
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
                difficulty_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 50: {
                emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.parser(),
                        extensionRegistry);
                if (teamInfoListBuilder_ == null) {
                  ensureTeamInfoListIsMutable();
                  teamInfoList_.add(m);
                } else {
                  teamInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 50
              case 56: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
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

      private java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> teamInfoList_ =
        java.util.Collections.emptyList();
      private void ensureTeamInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo>(teamInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> teamInfoListBuilder_;

      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> getTeamInfoListList() {
        if (teamInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        } else {
          return teamInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public int getTeamInfoListCount() {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.size();
        } else {
          return teamInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo getTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);
        } else {
          return teamInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder setTeamInfoList(
          int index, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder addTeamInfoList(emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo value) {
        if (teamInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, value);
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder addTeamInfoList(
          emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder addTeamInfoList(
          int index, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder builderForValue) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder addAllTeamInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo> values) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamInfoList_);
          onChanged();
        } else {
          teamInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder clearTeamInfoList() {
        if (teamInfoListBuilder_ == null) {
          teamInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public Builder removeTeamInfoList(int index) {
        if (teamInfoListBuilder_ == null) {
          ensureTeamInfoListIsMutable();
          teamInfoList_.remove(index);
          onChanged();
        } else {
          teamInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder getTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder getTeamInfoListOrBuilder(
          int index) {
        if (teamInfoListBuilder_ == null) {
          return teamInfoList_.get(index);  } else {
          return teamInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
           getTeamInfoListOrBuilderList() {
        if (teamInfoListBuilder_ != null) {
          return teamInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamInfoList_);
        }
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder addTeamInfoListBuilder() {
        return getTeamInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder addTeamInfoListBuilder(
          int index) {
        return getTeamInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .TeamChainChooseTeamInfo team_info_list = 6;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder> 
           getTeamInfoListBuilderList() {
        return getTeamInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder> 
          getTeamInfoListFieldBuilder() {
        if (teamInfoListBuilder_ == null) {
          teamInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfo.Builder, emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.TeamChainChooseTeamInfoOrBuilder>(
                  teamInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamInfoList_ = null;
        }
        return teamInfoListBuilder_;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 5;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 5;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {

        difficulty_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        bitField0_ = (bitField0_ & ~0x00000002);
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stageId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TeamChainEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:TeamChainEnterDungeonReq)
    private static final emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq();
    }

    public static emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TeamChainEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<TeamChainEnterDungeonReq>() {
      @java.lang.Override
      public TeamChainEnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TeamChainEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TeamChainEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.TeamChainEnterDungeonReqOuterClass.TeamChainEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamChainEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeamChainEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036TeamChainEnterDungeonReq.proto\032\035TeamCh" +
      "ainChooseTeamInfo.proto\"r\n\030TeamChainEnte" +
      "rDungeonReq\0220\n\016team_info_list\030\006 \003(\0132\030.Te" +
      "amChainChooseTeamInfo\022\022\n\ndifficulty\030\005 \001(" +
      "\r\022\020\n\010stage_id\030\007 \001(\rB\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.getDescriptor(),
        });
    internal_static_TeamChainEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamChainEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeamChainEnterDungeonReq_descriptor,
        new java.lang.String[] { "TeamInfoList", "Difficulty", "StageId", });
    emu.protoshift.net.oldproto.TeamChainChooseTeamInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
