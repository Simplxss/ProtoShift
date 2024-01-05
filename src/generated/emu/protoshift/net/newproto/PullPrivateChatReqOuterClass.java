// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PullPrivateChatReq.proto

package emu.protoshift.net.newproto;

public final class PullPrivateChatReqOuterClass {
  private PullPrivateChatReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PullPrivateChatReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PullPrivateChatReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 from_sequence = 11;</code>
     * @return The fromSequence.
     */
    int getFromSequence();

    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>uint32 pull_num = 8;</code>
     * @return The pullNum.
     */
    int getPullNum();
  }
  /**
   * <pre>
   * Obf: CDBDGACCDJI
   * </pre>
   *
   * Protobuf type {@code PullPrivateChatReq}
   */
  public static final class PullPrivateChatReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PullPrivateChatReq)
      PullPrivateChatReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PullPrivateChatReq.newBuilder() to construct.
    private PullPrivateChatReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PullPrivateChatReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PullPrivateChatReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.class, emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.Builder.class);
    }

    public static final int FROM_SEQUENCE_FIELD_NUMBER = 11;
    private int fromSequence_ = 0;
    /**
     * <code>uint32 from_sequence = 11;</code>
     * @return The fromSequence.
     */
    @java.lang.Override
    public int getFromSequence() {
      return fromSequence_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 7;
    private int targetUid_ = 0;
    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int PULL_NUM_FIELD_NUMBER = 8;
    private int pullNum_ = 0;
    /**
     * <code>uint32 pull_num = 8;</code>
     * @return The pullNum.
     */
    @java.lang.Override
    public int getPullNum() {
      return pullNum_;
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
      if (targetUid_ != 0) {
        output.writeUInt32(7, targetUid_);
      }
      if (pullNum_ != 0) {
        output.writeUInt32(8, pullNum_);
      }
      if (fromSequence_ != 0) {
        output.writeUInt32(11, fromSequence_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, targetUid_);
      }
      if (pullNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, pullNum_);
      }
      if (fromSequence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, fromSequence_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq other = (emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq) obj;

      if (getFromSequence()
          != other.getFromSequence()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getPullNum()
          != other.getPullNum()) return false;
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
      hash = (37 * hash) + FROM_SEQUENCE_FIELD_NUMBER;
      hash = (53 * hash) + getFromSequence();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + PULL_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getPullNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq prototype) {
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
     * Obf: CDBDGACCDJI
     * </pre>
     *
     * Protobuf type {@code PullPrivateChatReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PullPrivateChatReq)
        emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.class, emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.newBuilder()
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
        fromSequence_ = 0;
        targetUid_ = 0;
        pullNum_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.internal_static_PullPrivateChatReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq build() {
        emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq buildPartial() {
        emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq result = new emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fromSequence_ = fromSequence_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetUid_ = targetUid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.pullNum_ = pullNum_;
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
        if (other instanceof emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq) {
          return mergeFrom((emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq other) {
        if (other == emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq.getDefaultInstance()) return this;
        if (other.getFromSequence() != 0) {
          setFromSequence(other.getFromSequence());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getPullNum() != 0) {
          setPullNum(other.getPullNum());
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
              case 56: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 64: {
                pullNum_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 88: {
                fromSequence_ = input.readUInt32();
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

      private int fromSequence_ ;
      /**
       * <code>uint32 from_sequence = 11;</code>
       * @return The fromSequence.
       */
      @java.lang.Override
      public int getFromSequence() {
        return fromSequence_;
      }
      /**
       * <code>uint32 from_sequence = 11;</code>
       * @param value The fromSequence to set.
       * @return This builder for chaining.
       */
      public Builder setFromSequence(int value) {

        fromSequence_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 from_sequence = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFromSequence() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fromSequence_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {

        targetUid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int pullNum_ ;
      /**
       * <code>uint32 pull_num = 8;</code>
       * @return The pullNum.
       */
      @java.lang.Override
      public int getPullNum() {
        return pullNum_;
      }
      /**
       * <code>uint32 pull_num = 8;</code>
       * @param value The pullNum to set.
       * @return This builder for chaining.
       */
      public Builder setPullNum(int value) {

        pullNum_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pull_num = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPullNum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        pullNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PullPrivateChatReq)
    }

    // @@protoc_insertion_point(class_scope:PullPrivateChatReq)
    private static final emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq();
    }

    public static emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PullPrivateChatReq>
        PARSER = new com.google.protobuf.AbstractParser<PullPrivateChatReq>() {
      @java.lang.Override
      public PullPrivateChatReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PullPrivateChatReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PullPrivateChatReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.PullPrivateChatReqOuterClass.PullPrivateChatReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PullPrivateChatReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PullPrivateChatReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PullPrivateChatReq.proto\"Q\n\022PullPrivat" +
      "eChatReq\022\025\n\rfrom_sequence\030\013 \001(\r\022\022\n\ntarge" +
      "t_uid\030\007 \001(\r\022\020\n\010pull_num\030\010 \001(\rB\035\n\033emu.pro" +
      "toshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PullPrivateChatReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PullPrivateChatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PullPrivateChatReq_descriptor,
        new java.lang.String[] { "FromSequence", "TargetUid", "PullNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
