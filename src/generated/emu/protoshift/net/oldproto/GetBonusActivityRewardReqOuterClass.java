// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetBonusActivityRewardReq.proto

package emu.protoshift.net.oldproto;

public final class GetBonusActivityRewardReqOuterClass {
  private GetBonusActivityRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetBonusActivityRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetBonusActivityRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bonus_activity_id = 5;</code>
     * @return The bonusActivityId.
     */
    int getBonusActivityId();
  }
  /**
   * <pre>
   * Obf: NIKAOPNGPPH
   * </pre>
   *
   * Protobuf type {@code GetBonusActivityRewardReq}
   */
  public static final class GetBonusActivityRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetBonusActivityRewardReq)
      GetBonusActivityRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetBonusActivityRewardReq.newBuilder() to construct.
    private GetBonusActivityRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetBonusActivityRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetBonusActivityRewardReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.internal_static_GetBonusActivityRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.internal_static_GetBonusActivityRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.class, emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.Builder.class);
    }

    public static final int BONUS_ACTIVITY_ID_FIELD_NUMBER = 5;
    private int bonusActivityId_ = 0;
    /**
     * <code>uint32 bonus_activity_id = 5;</code>
     * @return The bonusActivityId.
     */
    @java.lang.Override
    public int getBonusActivityId() {
      return bonusActivityId_;
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
      if (bonusActivityId_ != 0) {
        output.writeUInt32(5, bonusActivityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bonusActivityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, bonusActivityId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq other = (emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq) obj;

      if (getBonusActivityId()
          != other.getBonusActivityId()) return false;
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
      hash = (37 * hash) + BONUS_ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBonusActivityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq prototype) {
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
     * Obf: NIKAOPNGPPH
     * </pre>
     *
     * Protobuf type {@code GetBonusActivityRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetBonusActivityRewardReq)
        emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.internal_static_GetBonusActivityRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.internal_static_GetBonusActivityRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.class, emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.newBuilder()
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
        bonusActivityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.internal_static_GetBonusActivityRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq build() {
        emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq buildPartial() {
        emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq result = new emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.bonusActivityId_ = bonusActivityId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq) {
          return mergeFrom((emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq other) {
        if (other == emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq.getDefaultInstance()) return this;
        if (other.getBonusActivityId() != 0) {
          setBonusActivityId(other.getBonusActivityId());
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
                bonusActivityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
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

      private int bonusActivityId_ ;
      /**
       * <code>uint32 bonus_activity_id = 5;</code>
       * @return The bonusActivityId.
       */
      @java.lang.Override
      public int getBonusActivityId() {
        return bonusActivityId_;
      }
      /**
       * <code>uint32 bonus_activity_id = 5;</code>
       * @param value The bonusActivityId to set.
       * @return This builder for chaining.
       */
      public Builder setBonusActivityId(int value) {

        bonusActivityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bonus_activity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBonusActivityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bonusActivityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetBonusActivityRewardReq)
    }

    // @@protoc_insertion_point(class_scope:GetBonusActivityRewardReq)
    private static final emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq();
    }

    public static emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetBonusActivityRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<GetBonusActivityRewardReq>() {
      @java.lang.Override
      public GetBonusActivityRewardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetBonusActivityRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetBonusActivityRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetBonusActivityRewardReqOuterClass.GetBonusActivityRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBonusActivityRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBonusActivityRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GetBonusActivityRewardReq.proto\"6\n\031Get" +
      "BonusActivityRewardReq\022\031\n\021bonus_activity" +
      "_id\030\005 \001(\rB\035\n\033emu.protoshift.net.oldproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetBonusActivityRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetBonusActivityRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBonusActivityRewardReq_descriptor,
        new java.lang.String[] { "BonusActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
