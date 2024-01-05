// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldRoutineInfo.proto

package emu.protoshift.net.oldproto;

public final class WorldRoutineInfoOuterClass {
  private WorldRoutineInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldRoutineInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldRoutineInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 5;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 finish_progress = 10;</code>
     * @return The finishProgress.
     */
    int getFinishProgress();

    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 routine_id = 2;</code>
     * @return The routineId.
     */
    int getRoutineId();
  }
  /**
   * Protobuf type {@code WorldRoutineInfo}
   */
  public static final class WorldRoutineInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldRoutineInfo)
      WorldRoutineInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldRoutineInfo.newBuilder() to construct.
    private WorldRoutineInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldRoutineInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldRoutineInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.class, emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 5;
    private boolean isFinished_ = false;
    /**
     * <code>bool is_finished = 5;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int FINISH_PROGRESS_FIELD_NUMBER = 10;
    private int finishProgress_ = 0;
    /**
     * <code>uint32 finish_progress = 10;</code>
     * @return The finishProgress.
     */
    @java.lang.Override
    public int getFinishProgress() {
      return finishProgress_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 13;
    private int progress_ = 0;
    /**
     * <code>uint32 progress = 13;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int ROUTINE_ID_FIELD_NUMBER = 2;
    private int routineId_ = 0;
    /**
     * <code>uint32 routine_id = 2;</code>
     * @return The routineId.
     */
    @java.lang.Override
    public int getRoutineId() {
      return routineId_;
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
      if (routineId_ != 0) {
        output.writeUInt32(2, routineId_);
      }
      if (isFinished_ != false) {
        output.writeBool(5, isFinished_);
      }
      if (finishProgress_ != 0) {
        output.writeUInt32(10, finishProgress_);
      }
      if (progress_ != 0) {
        output.writeUInt32(13, progress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (routineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, routineId_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isFinished_);
      }
      if (finishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, finishProgress_);
      }
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, progress_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo other = (emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getFinishProgress()
          != other.getFinishProgress()) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (getRoutineId()
          != other.getRoutineId()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + FINISH_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getFinishProgress();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + ROUTINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoutineId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo prototype) {
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
     * Protobuf type {@code WorldRoutineInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldRoutineInfo)
        emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.class, emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.newBuilder()
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
        isFinished_ = false;
        finishProgress_ = 0;
        progress_ = 0;
        routineId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.internal_static_WorldRoutineInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo build() {
        emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo buildPartial() {
        emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo result = new emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFinished_ = isFinished_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.finishProgress_ = finishProgress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.progress_ = progress_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.routineId_ = routineId_;
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
        if (other instanceof emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo other) {
        if (other == emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getFinishProgress() != 0) {
          setFinishProgress(other.getFinishProgress());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getRoutineId() != 0) {
          setRoutineId(other.getRoutineId());
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
              case 16: {
                routineId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 40: {
                isFinished_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 80: {
                finishProgress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 104: {
                progress_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 104
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

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 5;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 5;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {

        isFinished_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int finishProgress_ ;
      /**
       * <code>uint32 finish_progress = 10;</code>
       * @return The finishProgress.
       */
      @java.lang.Override
      public int getFinishProgress() {
        return finishProgress_;
      }
      /**
       * <code>uint32 finish_progress = 10;</code>
       * @param value The finishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setFinishProgress(int value) {

        finishProgress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_progress = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        finishProgress_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 13;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {

        progress_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        progress_ = 0;
        onChanged();
        return this;
      }

      private int routineId_ ;
      /**
       * <code>uint32 routine_id = 2;</code>
       * @return The routineId.
       */
      @java.lang.Override
      public int getRoutineId() {
        return routineId_;
      }
      /**
       * <code>uint32 routine_id = 2;</code>
       * @param value The routineId to set.
       * @return This builder for chaining.
       */
      public Builder setRoutineId(int value) {

        routineId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 routine_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoutineId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        routineId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WorldRoutineInfo)
    }

    // @@protoc_insertion_point(class_scope:WorldRoutineInfo)
    private static final emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo();
    }

    public static emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldRoutineInfo>
        PARSER = new com.google.protobuf.AbstractParser<WorldRoutineInfo>() {
      @java.lang.Override
      public WorldRoutineInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<WorldRoutineInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldRoutineInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WorldRoutineInfoOuterClass.WorldRoutineInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldRoutineInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldRoutineInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WorldRoutineInfo.proto\"f\n\020WorldRoutine" +
      "Info\022\023\n\013is_finished\030\005 \001(\010\022\027\n\017finish_prog" +
      "ress\030\n \001(\r\022\020\n\010progress\030\r \001(\r\022\022\n\nroutine_" +
      "id\030\002 \001(\rB\035\n\033emu.protoshift.net.oldprotob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WorldRoutineInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldRoutineInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldRoutineInfo_descriptor,
        new java.lang.String[] { "IsFinished", "FinishProgress", "Progress", "RoutineId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
