// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JLMCCGGHDLM.proto

package emu.protoshift.net.oldproto;

public final class JLMCCGGHDLMOuterClass {
  private JLMCCGGHDLMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JLMCCGGHDLMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JLMCCGGHDLM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 start_time = 7;</code>
     * @return The startTime.
     */
    int getStartTime();

    /**
     * <code>int32 HHJJOFIKEBD = 6;</code>
     * @return The hHJJOFIKEBD.
     */
    int getHHJJOFIKEBD();

    /**
     * <code>bool is_paused = 8;</code>
     * @return The isPaused.
     */
    boolean getIsPaused();
  }
  /**
   * Protobuf type {@code JLMCCGGHDLM}
   */
  public static final class JLMCCGGHDLM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JLMCCGGHDLM)
      JLMCCGGHDLMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JLMCCGGHDLM.newBuilder() to construct.
    private JLMCCGGHDLM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JLMCCGGHDLM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JLMCCGGHDLM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.internal_static_JLMCCGGHDLM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.internal_static_JLMCCGGHDLM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.class, emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.Builder.class);
    }

    public static final int START_TIME_FIELD_NUMBER = 7;
    private int startTime_ = 0;
    /**
     * <code>uint32 start_time = 7;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }

    public static final int HHJJOFIKEBD_FIELD_NUMBER = 6;
    private int hHJJOFIKEBD_ = 0;
    /**
     * <code>int32 HHJJOFIKEBD = 6;</code>
     * @return The hHJJOFIKEBD.
     */
    @java.lang.Override
    public int getHHJJOFIKEBD() {
      return hHJJOFIKEBD_;
    }

    public static final int IS_PAUSED_FIELD_NUMBER = 8;
    private boolean isPaused_ = false;
    /**
     * <code>bool is_paused = 8;</code>
     * @return The isPaused.
     */
    @java.lang.Override
    public boolean getIsPaused() {
      return isPaused_;
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
      if (hHJJOFIKEBD_ != 0) {
        output.writeInt32(6, hHJJOFIKEBD_);
      }
      if (startTime_ != 0) {
        output.writeUInt32(7, startTime_);
      }
      if (isPaused_ != false) {
        output.writeBool(8, isPaused_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hHJJOFIKEBD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, hHJJOFIKEBD_);
      }
      if (startTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, startTime_);
      }
      if (isPaused_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, isPaused_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM other = (emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM) obj;

      if (getStartTime()
          != other.getStartTime()) return false;
      if (getHHJJOFIKEBD()
          != other.getHHJJOFIKEBD()) return false;
      if (getIsPaused()
          != other.getIsPaused()) return false;
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
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime();
      hash = (37 * hash) + HHJJOFIKEBD_FIELD_NUMBER;
      hash = (53 * hash) + getHHJJOFIKEBD();
      hash = (37 * hash) + IS_PAUSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsPaused());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM prototype) {
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
     * Protobuf type {@code JLMCCGGHDLM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JLMCCGGHDLM)
        emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.internal_static_JLMCCGGHDLM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.internal_static_JLMCCGGHDLM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.class, emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.newBuilder()
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
        startTime_ = 0;
        hHJJOFIKEBD_ = 0;
        isPaused_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.internal_static_JLMCCGGHDLM_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM build() {
        emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM buildPartial() {
        emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM result = new emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.startTime_ = startTime_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.hHJJOFIKEBD_ = hHJJOFIKEBD_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isPaused_ = isPaused_;
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
        if (other instanceof emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM) {
          return mergeFrom((emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM other) {
        if (other == emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM.getDefaultInstance()) return this;
        if (other.getStartTime() != 0) {
          setStartTime(other.getStartTime());
        }
        if (other.getHHJJOFIKEBD() != 0) {
          setHHJJOFIKEBD(other.getHHJJOFIKEBD());
        }
        if (other.getIsPaused() != false) {
          setIsPaused(other.getIsPaused());
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
                hHJJOFIKEBD_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 56: {
                startTime_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 64: {
                isPaused_ = input.readBool();
                bitField0_ |= 0x00000004;
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

      private int startTime_ ;
      /**
       * <code>uint32 start_time = 7;</code>
       * @return The startTime.
       */
      @java.lang.Override
      public int getStartTime() {
        return startTime_;
      }
      /**
       * <code>uint32 start_time = 7;</code>
       * @param value The startTime to set.
       * @return This builder for chaining.
       */
      public Builder setStartTime(int value) {

        startTime_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 start_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000001);
        startTime_ = 0;
        onChanged();
        return this;
      }

      private int hHJJOFIKEBD_ ;
      /**
       * <code>int32 HHJJOFIKEBD = 6;</code>
       * @return The hHJJOFIKEBD.
       */
      @java.lang.Override
      public int getHHJJOFIKEBD() {
        return hHJJOFIKEBD_;
      }
      /**
       * <code>int32 HHJJOFIKEBD = 6;</code>
       * @param value The hHJJOFIKEBD to set.
       * @return This builder for chaining.
       */
      public Builder setHHJJOFIKEBD(int value) {

        hHJJOFIKEBD_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 HHJJOFIKEBD = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHHJJOFIKEBD() {
        bitField0_ = (bitField0_ & ~0x00000002);
        hHJJOFIKEBD_ = 0;
        onChanged();
        return this;
      }

      private boolean isPaused_ ;
      /**
       * <code>bool is_paused = 8;</code>
       * @return The isPaused.
       */
      @java.lang.Override
      public boolean getIsPaused() {
        return isPaused_;
      }
      /**
       * <code>bool is_paused = 8;</code>
       * @param value The isPaused to set.
       * @return This builder for chaining.
       */
      public Builder setIsPaused(boolean value) {

        isPaused_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_paused = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsPaused() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isPaused_ = false;
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


      // @@protoc_insertion_point(builder_scope:JLMCCGGHDLM)
    }

    // @@protoc_insertion_point(class_scope:JLMCCGGHDLM)
    private static final emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM();
    }

    public static emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JLMCCGGHDLM>
        PARSER = new com.google.protobuf.AbstractParser<JLMCCGGHDLM>() {
      @java.lang.Override
      public JLMCCGGHDLM parsePartialFrom(
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

    public static com.google.protobuf.Parser<JLMCCGGHDLM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JLMCCGGHDLM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.JLMCCGGHDLMOuterClass.JLMCCGGHDLM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JLMCCGGHDLM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JLMCCGGHDLM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JLMCCGGHDLM.proto\"I\n\013JLMCCGGHDLM\022\022\n\nst" +
      "art_time\030\007 \001(\r\022\023\n\013HHJJOFIKEBD\030\006 \001(\005\022\021\n\ti" +
      "s_paused\030\010 \001(\010B\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JLMCCGGHDLM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JLMCCGGHDLM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JLMCCGGHDLM_descriptor,
        new java.lang.String[] { "StartTime", "HHJJOFIKEBD", "IsPaused", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
