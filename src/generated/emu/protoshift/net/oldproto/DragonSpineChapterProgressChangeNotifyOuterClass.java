// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DragonSpineChapterProgressChangeNotify.proto

package emu.protoshift.net.oldproto;

public final class DragonSpineChapterProgressChangeNotifyOuterClass {
  private DragonSpineChapterProgressChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DragonSpineChapterProgressChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DragonSpineChapterProgressChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_progress = 11;</code>
     * @return The curProgress.
     */
    int getCurProgress();

    /**
     * <code>uint32 chapter_id = 4;</code>
     * @return The chapterId.
     */
    int getChapterId();

    /**
     * <code>uint32 schedule_id = 7;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * Obf: HKPBLKONDCK
   * </pre>
   *
   * Protobuf type {@code DragonSpineChapterProgressChangeNotify}
   */
  public static final class DragonSpineChapterProgressChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DragonSpineChapterProgressChangeNotify)
      DragonSpineChapterProgressChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DragonSpineChapterProgressChangeNotify.newBuilder() to construct.
    private DragonSpineChapterProgressChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DragonSpineChapterProgressChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DragonSpineChapterProgressChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.class, emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.Builder.class);
    }

    public static final int CUR_PROGRESS_FIELD_NUMBER = 11;
    private int curProgress_ = 0;
    /**
     * <code>uint32 cur_progress = 11;</code>
     * @return The curProgress.
     */
    @java.lang.Override
    public int getCurProgress() {
      return curProgress_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 4;
    private int chapterId_ = 0;
    /**
     * <code>uint32 chapter_id = 4;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapterId_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 7;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 7;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      if (chapterId_ != 0) {
        output.writeUInt32(4, chapterId_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(7, scheduleId_);
      }
      if (curProgress_ != 0) {
        output.writeUInt32(11, curProgress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, chapterId_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, scheduleId_);
      }
      if (curProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, curProgress_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify other = (emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify) obj;

      if (getCurProgress()
          != other.getCurProgress()) return false;
      if (getChapterId()
          != other.getChapterId()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      hash = (37 * hash) + CUR_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getCurProgress();
      hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChapterId();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify prototype) {
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
     * Obf: HKPBLKONDCK
     * </pre>
     *
     * Protobuf type {@code DragonSpineChapterProgressChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DragonSpineChapterProgressChangeNotify)
        emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.class, emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.newBuilder()
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
        curProgress_ = 0;
        chapterId_ = 0;
        scheduleId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify build() {
        emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify buildPartial() {
        emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify result = new emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curProgress_ = curProgress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.chapterId_ = chapterId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify other) {
        if (other == emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify.getDefaultInstance()) return this;
        if (other.getCurProgress() != 0) {
          setCurProgress(other.getCurProgress());
        }
        if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
              case 32: {
                chapterId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 56: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 88: {
                curProgress_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int curProgress_ ;
      /**
       * <code>uint32 cur_progress = 11;</code>
       * @return The curProgress.
       */
      @java.lang.Override
      public int getCurProgress() {
        return curProgress_;
      }
      /**
       * <code>uint32 cur_progress = 11;</code>
       * @param value The curProgress to set.
       * @return This builder for chaining.
       */
      public Builder setCurProgress(int value) {

        curProgress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_progress = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurProgress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curProgress_ = 0;
        onChanged();
        return this;
      }

      private int chapterId_ ;
      /**
       * <code>uint32 chapter_id = 4;</code>
       * @return The chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       * <code>uint32 chapter_id = 4;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {

        chapterId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        chapterId_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {

        scheduleId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DragonSpineChapterProgressChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:DragonSpineChapterProgressChangeNotify)
    private static final emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify();
    }

    public static emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<DragonSpineChapterProgressChangeNotify>() {
      @java.lang.Override
      public DragonSpineChapterProgressChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DragonSpineChapterProgressChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.DragonSpineChapterProgressChangeNotifyOuterClass.DragonSpineChapterProgressChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DragonSpineChapterProgressChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,DragonSpineChapterProgressChangeNotify" +
      ".proto\"g\n&DragonSpineChapterProgressChan" +
      "geNotify\022\024\n\014cur_progress\030\013 \001(\r\022\022\n\nchapte" +
      "r_id\030\004 \001(\r\022\023\n\013schedule_id\030\007 \001(\rB\035\n\033emu.p" +
      "rotoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DragonSpineChapterProgressChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DragonSpineChapterProgressChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DragonSpineChapterProgressChangeNotify_descriptor,
        new java.lang.String[] { "CurProgress", "ChapterId", "ScheduleId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
