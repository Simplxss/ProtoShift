// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriMasterLevelDetailInfo.proto

package emu.protoshift.net.oldproto;

public final class IrodoriMasterLevelDetailInfoOuterClass {
  private IrodoriMasterLevelDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriMasterLevelDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriMasterLevelDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 min_finish_time = 15;</code>
     * @return The minFinishTime.
     */
    int getMinFinishTime();

    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 diffculty = 6;</code>
     * @return The diffculty.
     */
    int getDiffculty();

    /**
     * <code>bool is_have_try = 8;</code>
     * @return The isHaveTry.
     */
    boolean getIsHaveTry();
  }
  /**
   * Protobuf type {@code IrodoriMasterLevelDetailInfo}
   */
  public static final class IrodoriMasterLevelDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriMasterLevelDetailInfo)
      IrodoriMasterLevelDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriMasterLevelDetailInfo.newBuilder() to construct.
    private IrodoriMasterLevelDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriMasterLevelDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriMasterLevelDetailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBER = 15;
    private int minFinishTime_ = 0;
    /**
     * <code>uint32 min_finish_time = 15;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public int getMinFinishTime() {
      return minFinishTime_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 12;
    private boolean isFinish_ = false;
    /**
     * <code>bool is_finish = 12;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int DIFFCULTY_FIELD_NUMBER = 6;
    private int diffculty_ = 0;
    /**
     * <code>uint32 diffculty = 6;</code>
     * @return The diffculty.
     */
    @java.lang.Override
    public int getDiffculty() {
      return diffculty_;
    }

    public static final int IS_HAVE_TRY_FIELD_NUMBER = 8;
    private boolean isHaveTry_ = false;
    /**
     * <code>bool is_have_try = 8;</code>
     * @return The isHaveTry.
     */
    @java.lang.Override
    public boolean getIsHaveTry() {
      return isHaveTry_;
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
      if (diffculty_ != 0) {
        output.writeUInt32(6, diffculty_);
      }
      if (isHaveTry_ != false) {
        output.writeBool(8, isHaveTry_);
      }
      if (isFinish_ != false) {
        output.writeBool(12, isFinish_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(15, minFinishTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (diffculty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, diffculty_);
      }
      if (isHaveTry_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isHaveTry_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isFinish_);
      }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, minFinishTime_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other = (emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) obj;

      if (getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getDiffculty()
          != other.getDiffculty()) return false;
      if (getIsHaveTry()
          != other.getIsHaveTry()) return false;
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
      hash = (37 * hash) + MIN_FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMinFinishTime();
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + DIFFCULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDiffculty();
      hash = (37 * hash) + IS_HAVE_TRY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsHaveTry());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo prototype) {
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
     * Protobuf type {@code IrodoriMasterLevelDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriMasterLevelDetailInfo)
        emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.class, emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.newBuilder()
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
        minFinishTime_ = 0;
        isFinish_ = false;
        diffculty_ = 0;
        isHaveTry_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.internal_static_IrodoriMasterLevelDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo build() {
        emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo buildPartial() {
        emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result = new emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.minFinishTime_ = minFinishTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isFinish_ = isFinish_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.diffculty_ = diffculty_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isHaveTry_ = isHaveTry_;
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
        if (other instanceof emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo other) {
        if (other == emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo.getDefaultInstance()) return this;
        if (other.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getDiffculty() != 0) {
          setDiffculty(other.getDiffculty());
        }
        if (other.getIsHaveTry() != false) {
          setIsHaveTry(other.getIsHaveTry());
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
                diffculty_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 64: {
                isHaveTry_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 64
              case 96: {
                isFinish_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
              case 120: {
                minFinishTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int minFinishTime_ ;
      /**
       * <code>uint32 min_finish_time = 15;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_time = 15;</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {

        minFinishTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMinFinishTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 12;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {

        isFinish_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int diffculty_ ;
      /**
       * <code>uint32 diffculty = 6;</code>
       * @return The diffculty.
       */
      @java.lang.Override
      public int getDiffculty() {
        return diffculty_;
      }
      /**
       * <code>uint32 diffculty = 6;</code>
       * @param value The diffculty to set.
       * @return This builder for chaining.
       */
      public Builder setDiffculty(int value) {

        diffculty_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 diffculty = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiffculty() {
        bitField0_ = (bitField0_ & ~0x00000004);
        diffculty_ = 0;
        onChanged();
        return this;
      }

      private boolean isHaveTry_ ;
      /**
       * <code>bool is_have_try = 8;</code>
       * @return The isHaveTry.
       */
      @java.lang.Override
      public boolean getIsHaveTry() {
        return isHaveTry_;
      }
      /**
       * <code>bool is_have_try = 8;</code>
       * @param value The isHaveTry to set.
       * @return This builder for chaining.
       */
      public Builder setIsHaveTry(boolean value) {

        isHaveTry_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_have_try = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsHaveTry() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isHaveTry_ = false;
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


      // @@protoc_insertion_point(builder_scope:IrodoriMasterLevelDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:IrodoriMasterLevelDetailInfo)
    private static final emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo();
    }

    public static emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriMasterLevelDetailInfo>() {
      @java.lang.Override
      public IrodoriMasterLevelDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriMasterLevelDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.IrodoriMasterLevelDetailInfoOuterClass.IrodoriMasterLevelDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriMasterLevelDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"IrodoriMasterLevelDetailInfo.proto\"r\n\034" +
      "IrodoriMasterLevelDetailInfo\022\027\n\017min_fini" +
      "sh_time\030\017 \001(\r\022\021\n\tis_finish\030\014 \001(\010\022\021\n\tdiff" +
      "culty\030\006 \001(\r\022\023\n\013is_have_try\030\010 \001(\010B\035\n\033emu." +
      "protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_IrodoriMasterLevelDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriMasterLevelDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriMasterLevelDetailInfo_descriptor,
        new java.lang.String[] { "MinFinishTime", "IsFinish", "Diffculty", "IsHaveTry", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
