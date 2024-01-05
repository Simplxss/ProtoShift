// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryBuoyantCombatInfo.proto

package emu.protoshift.net.oldproto;

public final class SceneGalleryBuoyantCombatInfoOuterClass {
  private SceneGalleryBuoyantCombatInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryBuoyantCombatInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryBuoyantCombatInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 kill_special_monster_count = 6;</code>
     * @return The killSpecialMonsterCount.
     */
    int getKillSpecialMonsterCount();

    /**
     * <code>uint32 kill_monster_count = 8;</code>
     * @return The killMonsterCount.
     */
    int getKillMonsterCount();

    /**
     * <code>uint32 score = 11;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * Protobuf type {@code SceneGalleryBuoyantCombatInfo}
   */
  public static final class SceneGalleryBuoyantCombatInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryBuoyantCombatInfo)
      SceneGalleryBuoyantCombatInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryBuoyantCombatInfo.newBuilder() to construct.
    private SceneGalleryBuoyantCombatInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryBuoyantCombatInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryBuoyantCombatInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.class, emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.Builder.class);
    }

    public static final int KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER = 6;
    private int killSpecialMonsterCount_ = 0;
    /**
     * <code>uint32 kill_special_monster_count = 6;</code>
     * @return The killSpecialMonsterCount.
     */
    @java.lang.Override
    public int getKillSpecialMonsterCount() {
      return killSpecialMonsterCount_;
    }

    public static final int KILL_MONSTER_COUNT_FIELD_NUMBER = 8;
    private int killMonsterCount_ = 0;
    /**
     * <code>uint32 kill_monster_count = 8;</code>
     * @return The killMonsterCount.
     */
    @java.lang.Override
    public int getKillMonsterCount() {
      return killMonsterCount_;
    }

    public static final int SCORE_FIELD_NUMBER = 11;
    private int score_ = 0;
    /**
     * <code>uint32 score = 11;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
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
      if (killSpecialMonsterCount_ != 0) {
        output.writeUInt32(6, killSpecialMonsterCount_);
      }
      if (killMonsterCount_ != 0) {
        output.writeUInt32(8, killMonsterCount_);
      }
      if (score_ != 0) {
        output.writeUInt32(11, score_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (killSpecialMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, killSpecialMonsterCount_);
      }
      if (killMonsterCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, killMonsterCount_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, score_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo other = (emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo) obj;

      if (getKillSpecialMonsterCount()
          != other.getKillSpecialMonsterCount()) return false;
      if (getKillMonsterCount()
          != other.getKillMonsterCount()) return false;
      if (getScore()
          != other.getScore()) return false;
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
      hash = (37 * hash) + KILL_SPECIAL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillSpecialMonsterCount();
      hash = (37 * hash) + KILL_MONSTER_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getKillMonsterCount();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo prototype) {
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
     * Protobuf type {@code SceneGalleryBuoyantCombatInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryBuoyantCombatInfo)
        emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.class, emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.newBuilder()
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
        killSpecialMonsterCount_ = 0;
        killMonsterCount_ = 0;
        score_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo build() {
        emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo buildPartial() {
        emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo result = new emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.killSpecialMonsterCount_ = killSpecialMonsterCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.killMonsterCount_ = killMonsterCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.score_ = score_;
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
        if (other instanceof emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo other) {
        if (other == emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo.getDefaultInstance()) return this;
        if (other.getKillSpecialMonsterCount() != 0) {
          setKillSpecialMonsterCount(other.getKillSpecialMonsterCount());
        }
        if (other.getKillMonsterCount() != 0) {
          setKillMonsterCount(other.getKillMonsterCount());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
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
              case 48: {
                killSpecialMonsterCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 64: {
                killMonsterCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 88: {
                score_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int killSpecialMonsterCount_ ;
      /**
       * <code>uint32 kill_special_monster_count = 6;</code>
       * @return The killSpecialMonsterCount.
       */
      @java.lang.Override
      public int getKillSpecialMonsterCount() {
        return killSpecialMonsterCount_;
      }
      /**
       * <code>uint32 kill_special_monster_count = 6;</code>
       * @param value The killSpecialMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillSpecialMonsterCount(int value) {

        killSpecialMonsterCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_special_monster_count = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillSpecialMonsterCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        killSpecialMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int killMonsterCount_ ;
      /**
       * <code>uint32 kill_monster_count = 8;</code>
       * @return The killMonsterCount.
       */
      @java.lang.Override
      public int getKillMonsterCount() {
        return killMonsterCount_;
      }
      /**
       * <code>uint32 kill_monster_count = 8;</code>
       * @param value The killMonsterCount to set.
       * @return This builder for chaining.
       */
      public Builder setKillMonsterCount(int value) {

        killMonsterCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 kill_monster_count = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearKillMonsterCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        killMonsterCount_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 11;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 11;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {

        score_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        score_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryBuoyantCombatInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryBuoyantCombatInfo)
    private static final emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo();
    }

    public static emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryBuoyantCombatInfo>() {
      @java.lang.Override
      public SceneGalleryBuoyantCombatInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryBuoyantCombatInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SceneGalleryBuoyantCombatInfoOuterClass.SceneGalleryBuoyantCombatInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryBuoyantCombatInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SceneGalleryBuoyantCombatInfo.proto\"n\n" +
      "\035SceneGalleryBuoyantCombatInfo\022\"\n\032kill_s" +
      "pecial_monster_count\030\006 \001(\r\022\032\n\022kill_monst" +
      "er_count\030\010 \001(\r\022\r\n\005score\030\013 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGalleryBuoyantCombatInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryBuoyantCombatInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryBuoyantCombatInfo_descriptor,
        new java.lang.String[] { "KillSpecialMonsterCount", "KillMonsterCount", "Score", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
