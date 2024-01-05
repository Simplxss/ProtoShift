// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameRecord.proto

package emu.protoshift.net.oldproto;

public final class MusicGameRecordOuterClass {
  private MusicGameRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicGameRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicGameRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 max_combo = 5;</code>
     * @return The maxCombo.
     */
    int getMaxCombo();

    /**
     * <code>bool is_unlock = 8;</code>
     * @return The isUnlock.
     */
    boolean getIsUnlock();

    /**
     * <code>uint32 max_score = 1;</code>
     * @return The maxScore.
     */
    int getMaxScore();
  }
  /**
   * Protobuf type {@code MusicGameRecord}
   */
  public static final class MusicGameRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicGameRecord)
      MusicGameRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicGameRecord.newBuilder() to construct.
    private MusicGameRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicGameRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicGameRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.internal_static_MusicGameRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.class, emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.Builder.class);
    }

    public static final int MAX_COMBO_FIELD_NUMBER = 5;
    private int maxCombo_ = 0;
    /**
     * <code>uint32 max_combo = 5;</code>
     * @return The maxCombo.
     */
    @java.lang.Override
    public int getMaxCombo() {
      return maxCombo_;
    }

    public static final int IS_UNLOCK_FIELD_NUMBER = 8;
    private boolean isUnlock_ = false;
    /**
     * <code>bool is_unlock = 8;</code>
     * @return The isUnlock.
     */
    @java.lang.Override
    public boolean getIsUnlock() {
      return isUnlock_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 1;
    private int maxScore_ = 0;
    /**
     * <code>uint32 max_score = 1;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
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
      if (maxScore_ != 0) {
        output.writeUInt32(1, maxScore_);
      }
      if (maxCombo_ != 0) {
        output.writeUInt32(5, maxCombo_);
      }
      if (isUnlock_ != false) {
        output.writeBool(8, isUnlock_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, maxScore_);
      }
      if (maxCombo_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, maxCombo_);
      }
      if (isUnlock_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isUnlock_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord other = (emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord) obj;

      if (getMaxCombo()
          != other.getMaxCombo()) return false;
      if (getIsUnlock()
          != other.getIsUnlock()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
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
      hash = (37 * hash) + MAX_COMBO_FIELD_NUMBER;
      hash = (53 * hash) + getMaxCombo();
      hash = (37 * hash) + IS_UNLOCK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlock());
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord prototype) {
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
     * Protobuf type {@code MusicGameRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicGameRecord)
        emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.internal_static_MusicGameRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.class, emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.newBuilder()
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
        maxCombo_ = 0;
        isUnlock_ = false;
        maxScore_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.internal_static_MusicGameRecord_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord build() {
        emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord buildPartial() {
        emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord result = new emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.maxCombo_ = maxCombo_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isUnlock_ = isUnlock_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.maxScore_ = maxScore_;
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
        if (other instanceof emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord) {
          return mergeFrom((emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord other) {
        if (other == emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord.getDefaultInstance()) return this;
        if (other.getMaxCombo() != 0) {
          setMaxCombo(other.getMaxCombo());
        }
        if (other.getIsUnlock() != false) {
          setIsUnlock(other.getIsUnlock());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
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
                maxScore_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 40: {
                maxCombo_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 64: {
                isUnlock_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
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

      private int maxCombo_ ;
      /**
       * <code>uint32 max_combo = 5;</code>
       * @return The maxCombo.
       */
      @java.lang.Override
      public int getMaxCombo() {
        return maxCombo_;
      }
      /**
       * <code>uint32 max_combo = 5;</code>
       * @param value The maxCombo to set.
       * @return This builder for chaining.
       */
      public Builder setMaxCombo(int value) {

        maxCombo_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_combo = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxCombo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        maxCombo_ = 0;
        onChanged();
        return this;
      }

      private boolean isUnlock_ ;
      /**
       * <code>bool is_unlock = 8;</code>
       * @return The isUnlock.
       */
      @java.lang.Override
      public boolean getIsUnlock() {
        return isUnlock_;
      }
      /**
       * <code>bool is_unlock = 8;</code>
       * @param value The isUnlock to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlock(boolean value) {

        isUnlock_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlock() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isUnlock_ = false;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 1;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 1;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {

        maxScore_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        bitField0_ = (bitField0_ & ~0x00000004);
        maxScore_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MusicGameRecord)
    }

    // @@protoc_insertion_point(class_scope:MusicGameRecord)
    private static final emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord();
    }

    public static emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicGameRecord>
        PARSER = new com.google.protobuf.AbstractParser<MusicGameRecord>() {
      @java.lang.Override
      public MusicGameRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<MusicGameRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicGameRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.MusicGameRecordOuterClass.MusicGameRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicGameRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicGameRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025MusicGameRecord.proto\"J\n\017MusicGameReco" +
      "rd\022\021\n\tmax_combo\030\005 \001(\r\022\021\n\tis_unlock\030\010 \001(\010" +
      "\022\021\n\tmax_score\030\001 \001(\rB\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MusicGameRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicGameRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicGameRecord_descriptor,
        new java.lang.String[] { "MaxCombo", "IsUnlock", "MaxScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
