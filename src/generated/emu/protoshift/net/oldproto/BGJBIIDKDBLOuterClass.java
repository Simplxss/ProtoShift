// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BGJBIIDKDBL.proto

package emu.protoshift.net.oldproto;

public final class BGJBIIDKDBLOuterClass {
  private BGJBIIDKDBLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BGJBIIDKDBLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BGJBIIDKDBL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();
  }
  /**
   * Protobuf type {@code BGJBIIDKDBL}
   */
  public static final class BGJBIIDKDBL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BGJBIIDKDBL)
      BGJBIIDKDBLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BGJBIIDKDBL.newBuilder() to construct.
    private BGJBIIDKDBL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BGJBIIDKDBL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BGJBIIDKDBL();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.internal_static_BGJBIIDKDBL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.internal_static_BGJBIIDKDBL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.class, emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 7;
    private boolean isNewRecord_ = false;
    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private int score_ = 0;
    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int RETCODE_FIELD_NUMBER = 10;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 10;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 12;
    private boolean isSuccess_ = false;
    /**
     * <code>bool is_success = 12;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
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
        output.writeUInt32(5, score_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(7, isNewRecord_);
      }
      if (retcode_ != 0) {
        output.writeInt32(10, retcode_);
      }
      if (isSuccess_ != false) {
        output.writeBool(12, isSuccess_);
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
          .computeUInt32Size(5, score_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isNewRecord_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, retcode_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isSuccess_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL other = (emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL prototype) {
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
     * Protobuf type {@code BGJBIIDKDBL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BGJBIIDKDBL)
        emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.internal_static_BGJBIIDKDBL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.internal_static_BGJBIIDKDBL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.class, emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.newBuilder()
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
        isNewRecord_ = false;
        score_ = 0;
        retcode_ = 0;
        isSuccess_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.internal_static_BGJBIIDKDBL_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL build() {
        emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL buildPartial() {
        emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL result = new emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isNewRecord_ = isNewRecord_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.score_ = score_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.isSuccess_ = isSuccess_;
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
        if (other instanceof emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL) {
          return mergeFrom((emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL other) {
        if (other == emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
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
                score_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 56: {
                isNewRecord_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 80: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 96: {
                isSuccess_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 96
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

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 7;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {

        isNewRecord_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 5;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {

        score_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        score_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 10;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 10;</code>
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
       * <code>int32 retcode = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 12;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {

        isSuccess_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isSuccess_ = false;
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


      // @@protoc_insertion_point(builder_scope:BGJBIIDKDBL)
    }

    // @@protoc_insertion_point(class_scope:BGJBIIDKDBL)
    private static final emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL();
    }

    public static emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BGJBIIDKDBL>
        PARSER = new com.google.protobuf.AbstractParser<BGJBIIDKDBL>() {
      @java.lang.Override
      public BGJBIIDKDBL parsePartialFrom(
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

    public static com.google.protobuf.Parser<BGJBIIDKDBL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BGJBIIDKDBL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.BGJBIIDKDBLOuterClass.BGJBIIDKDBL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BGJBIIDKDBL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BGJBIIDKDBL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BGJBIIDKDBL.proto\"X\n\013BGJBIIDKDBL\022\025\n\ris" +
      "_new_record\030\007 \001(\010\022\r\n\005score\030\005 \001(\r\022\017\n\007retc" +
      "ode\030\n \001(\005\022\022\n\nis_success\030\014 \001(\010B\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BGJBIIDKDBL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BGJBIIDKDBL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BGJBIIDKDBL_descriptor,
        new java.lang.String[] { "IsNewRecord", "Score", "Retcode", "IsSuccess", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
