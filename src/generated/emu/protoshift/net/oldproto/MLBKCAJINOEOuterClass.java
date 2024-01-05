// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MLBKCAJINOE.proto

package emu.protoshift.net.oldproto;

public final class MLBKCAJINOEOuterClass {
  private MLBKCAJINOEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MLBKCAJINOEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MLBKCAJINOE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>uint32 cost_time = 7;</code>
     * @return The costTime.
     */
    int getCostTime();

    /**
     * <code>uint32 HCEHMPKLKDH = 15;</code>
     * @return The hCEHMPKLKDH.
     */
    int getHCEHMPKLKDH();

    /**
     * <code>uint32 score = 1;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();
  }
  /**
   * Protobuf type {@code MLBKCAJINOE}
   */
  public static final class MLBKCAJINOE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MLBKCAJINOE)
      MLBKCAJINOEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MLBKCAJINOE.newBuilder() to construct.
    private MLBKCAJINOE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MLBKCAJINOE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MLBKCAJINOE();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.internal_static_MLBKCAJINOE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.internal_static_MLBKCAJINOE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.class, emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int COST_TIME_FIELD_NUMBER = 7;
    private int costTime_ = 0;
    /**
     * <code>uint32 cost_time = 7;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
    }

    public static final int HCEHMPKLKDH_FIELD_NUMBER = 15;
    private int hCEHMPKLKDH_ = 0;
    /**
     * <code>uint32 HCEHMPKLKDH = 15;</code>
     * @return The hCEHMPKLKDH.
     */
    @java.lang.Override
    public int getHCEHMPKLKDH() {
      return hCEHMPKLKDH_;
    }

    public static final int SCORE_FIELD_NUMBER = 1;
    private int score_ = 0;
    /**
     * <code>uint32 score = 1;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 14;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 14;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
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
      if (score_ != 0) {
        output.writeUInt32(1, score_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      if (costTime_ != 0) {
        output.writeUInt32(7, costTime_);
      }
      if (isFinish_ != false) {
        output.writeBool(14, isFinish_);
      }
      if (hCEHMPKLKDH_ != 0) {
        output.writeUInt32(15, hCEHMPKLKDH_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, score_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
      }
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, costTime_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isFinish_);
      }
      if (hCEHMPKLKDH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, hCEHMPKLKDH_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE other = (emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getCostTime()
          != other.getCostTime()) return false;
      if (getHCEHMPKLKDH()
          != other.getHCEHMPKLKDH()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
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
      hash = (37 * hash) + COST_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (37 * hash) + HCEHMPKLKDH_FIELD_NUMBER;
      hash = (53 * hash) + getHCEHMPKLKDH();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE prototype) {
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
     * Protobuf type {@code MLBKCAJINOE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MLBKCAJINOE)
        emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.internal_static_MLBKCAJINOE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.internal_static_MLBKCAJINOE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.class, emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.newBuilder()
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
        costTime_ = 0;
        hCEHMPKLKDH_ = 0;
        score_ = 0;
        isFinish_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.internal_static_MLBKCAJINOE_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE build() {
        emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE buildPartial() {
        emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE result = new emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.costTime_ = costTime_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.hCEHMPKLKDH_ = hCEHMPKLKDH_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.score_ = score_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.isFinish_ = isFinish_;
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
        if (other instanceof emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE) {
          return mergeFrom((emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE other) {
        if (other == emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
        }
        if (other.getHCEHMPKLKDH() != 0) {
          setHCEHMPKLKDH(other.getHCEHMPKLKDH());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
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
                score_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 40: {
                levelId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 56: {
                costTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 112: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 112
              case 120: {
                hCEHMPKLKDH_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
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
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
        onChanged();
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 cost_time = 7;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 cost_time = 7;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {

        costTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        costTime_ = 0;
        onChanged();
        return this;
      }

      private int hCEHMPKLKDH_ ;
      /**
       * <code>uint32 HCEHMPKLKDH = 15;</code>
       * @return The hCEHMPKLKDH.
       */
      @java.lang.Override
      public int getHCEHMPKLKDH() {
        return hCEHMPKLKDH_;
      }
      /**
       * <code>uint32 HCEHMPKLKDH = 15;</code>
       * @param value The hCEHMPKLKDH to set.
       * @return This builder for chaining.
       */
      public Builder setHCEHMPKLKDH(int value) {

        hCEHMPKLKDH_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HCEHMPKLKDH = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearHCEHMPKLKDH() {
        bitField0_ = (bitField0_ & ~0x00000004);
        hCEHMPKLKDH_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 1;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 1;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {

        score_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000008);
        score_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 14;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000010);
        isFinish_ = false;
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


      // @@protoc_insertion_point(builder_scope:MLBKCAJINOE)
    }

    // @@protoc_insertion_point(class_scope:MLBKCAJINOE)
    private static final emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE();
    }

    public static emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MLBKCAJINOE>
        PARSER = new com.google.protobuf.AbstractParser<MLBKCAJINOE>() {
      @java.lang.Override
      public MLBKCAJINOE parsePartialFrom(
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

    public static com.google.protobuf.Parser<MLBKCAJINOE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MLBKCAJINOE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.MLBKCAJINOEOuterClass.MLBKCAJINOE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MLBKCAJINOE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MLBKCAJINOE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MLBKCAJINOE.proto\"i\n\013MLBKCAJINOE\022\020\n\010le" +
      "vel_id\030\005 \001(\r\022\021\n\tcost_time\030\007 \001(\r\022\023\n\013HCEHM" +
      "PKLKDH\030\017 \001(\r\022\r\n\005score\030\001 \001(\r\022\021\n\tis_finish" +
      "\030\016 \001(\010B\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MLBKCAJINOE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MLBKCAJINOE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MLBKCAJINOE_descriptor,
        new java.lang.String[] { "LevelId", "CostTime", "HCEHMPKLKDH", "Score", "IsFinish", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
