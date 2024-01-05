// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PotionDungeonResultInfo.proto

package emu.protoshift.net.oldproto;

public final class PotionDungeonResultInfoOuterClass {
  private PotionDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PotionDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PotionDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 mode_id = 9;</code>
     * @return The modeId.
     */
    int getModeId();

    /**
     * <code>uint32 final_score = 1;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 difficulty_level = 15;</code>
     * @return The difficultyLevel.
     */
    int getDifficultyLevel();

    /**
     * <code>uint32 left_time = 11;</code>
     * @return The leftTime.
     */
    int getLeftTime();
  }
  /**
   * Protobuf type {@code PotionDungeonResultInfo}
   */
  public static final class PotionDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PotionDungeonResultInfo)
      PotionDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PotionDungeonResultInfo.newBuilder() to construct.
    private PotionDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PotionDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PotionDungeonResultInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.class, emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 2;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 2;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int MODE_ID_FIELD_NUMBER = 9;
    private int modeId_ = 0;
    /**
     * <code>uint32 mode_id = 9;</code>
     * @return The modeId.
     */
    @java.lang.Override
    public int getModeId() {
      return modeId_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 1;
    private int finalScore_ = 0;
    /**
     * <code>uint32 final_score = 1;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int DIFFICULTY_LEVEL_FIELD_NUMBER = 15;
    private int difficultyLevel_ = 0;
    /**
     * <code>uint32 difficulty_level = 15;</code>
     * @return The difficultyLevel.
     */
    @java.lang.Override
    public int getDifficultyLevel() {
      return difficultyLevel_;
    }

    public static final int LEFT_TIME_FIELD_NUMBER = 11;
    private int leftTime_ = 0;
    /**
     * <code>uint32 left_time = 11;</code>
     * @return The leftTime.
     */
    @java.lang.Override
    public int getLeftTime() {
      return leftTime_;
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
      if (finalScore_ != 0) {
        output.writeUInt32(1, finalScore_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(2, stageId_);
      }
      if (modeId_ != 0) {
        output.writeUInt32(9, modeId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(10, levelId_);
      }
      if (leftTime_ != 0) {
        output.writeUInt32(11, leftTime_);
      }
      if (difficultyLevel_ != 0) {
        output.writeUInt32(15, difficultyLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, finalScore_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, stageId_);
      }
      if (modeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, modeId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (leftTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, leftTime_);
      }
      if (difficultyLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, difficultyLevel_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo other = (emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getModeId()
          != other.getModeId()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getDifficultyLevel()
          != other.getDifficultyLevel()) return false;
      if (getLeftTime()
          != other.getLeftTime()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + MODE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModeId();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + DIFFICULTY_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyLevel();
      hash = (37 * hash) + LEFT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLeftTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo prototype) {
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
     * Protobuf type {@code PotionDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PotionDungeonResultInfo)
        emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.class, emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.newBuilder()
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
        levelId_ = 0;
        stageId_ = 0;
        modeId_ = 0;
        finalScore_ = 0;
        difficultyLevel_ = 0;
        leftTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.internal_static_PotionDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo build() {
        emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo buildPartial() {
        emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo result = new emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.modeId_ = modeId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.finalScore_ = finalScore_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.difficultyLevel_ = difficultyLevel_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.leftTime_ = leftTime_;
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
        if (other instanceof emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo other) {
        if (other == emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getModeId() != 0) {
          setModeId(other.getModeId());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getDifficultyLevel() != 0) {
          setDifficultyLevel(other.getDifficultyLevel());
        }
        if (other.getLeftTime() != 0) {
          setLeftTime(other.getLeftTime());
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
                finalScore_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 16: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 72: {
                modeId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 80: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 88: {
                leftTime_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 88
              case 120: {
                difficultyLevel_ = input.readUInt32();
                bitField0_ |= 0x00000010;
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 10;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int modeId_ ;
      /**
       * <code>uint32 mode_id = 9;</code>
       * @return The modeId.
       */
      @java.lang.Override
      public int getModeId() {
        return modeId_;
      }
      /**
       * <code>uint32 mode_id = 9;</code>
       * @param value The modeId to set.
       * @return This builder for chaining.
       */
      public Builder setModeId(int value) {

        modeId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mode_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearModeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        modeId_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 1;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 1;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {

        finalScore_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int difficultyLevel_ ;
      /**
       * <code>uint32 difficulty_level = 15;</code>
       * @return The difficultyLevel.
       */
      @java.lang.Override
      public int getDifficultyLevel() {
        return difficultyLevel_;
      }
      /**
       * <code>uint32 difficulty_level = 15;</code>
       * @param value The difficultyLevel to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyLevel(int value) {

        difficultyLevel_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_level = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyLevel() {
        bitField0_ = (bitField0_ & ~0x00000010);
        difficultyLevel_ = 0;
        onChanged();
        return this;
      }

      private int leftTime_ ;
      /**
       * <code>uint32 left_time = 11;</code>
       * @return The leftTime.
       */
      @java.lang.Override
      public int getLeftTime() {
        return leftTime_;
      }
      /**
       * <code>uint32 left_time = 11;</code>
       * @param value The leftTime to set.
       * @return This builder for chaining.
       */
      public Builder setLeftTime(int value) {

        leftTime_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 left_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLeftTime() {
        bitField0_ = (bitField0_ & ~0x00000020);
        leftTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PotionDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:PotionDungeonResultInfo)
    private static final emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo();
    }

    public static emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PotionDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<PotionDungeonResultInfo>() {
      @java.lang.Override
      public PotionDungeonResultInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<PotionDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PotionDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PotionDungeonResultInfoOuterClass.PotionDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PotionDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PotionDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035PotionDungeonResultInfo.proto\"\220\001\n\027Poti" +
      "onDungeonResultInfo\022\020\n\010level_id\030\n \001(\r\022\020\n" +
      "\010stage_id\030\002 \001(\r\022\017\n\007mode_id\030\t \001(\r\022\023\n\013fina" +
      "l_score\030\001 \001(\r\022\030\n\020difficulty_level\030\017 \001(\r\022" +
      "\021\n\tleft_time\030\013 \001(\rB\035\n\033emu.protoshift.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PotionDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PotionDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PotionDungeonResultInfo_descriptor,
        new java.lang.String[] { "LevelId", "StageId", "ModeId", "FinalScore", "DifficultyLevel", "LeftTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
