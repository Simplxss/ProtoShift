// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardBackUnlockNotify.proto

package emu.protoshift.net.oldproto;

public final class GCGDSCardBackUnlockNotifyOuterClass {
  private GCGDSCardBackUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardBackUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardBackUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_back_id = 7;</code>
     * @return The cardBackId.
     */
    int getCardBackId();
  }
  /**
   * <pre>
   * Obf: NECNIDOCACF
   * </pre>
   *
   * Protobuf type {@code GCGDSCardBackUnlockNotify}
   */
  public static final class GCGDSCardBackUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardBackUnlockNotify)
      GCGDSCardBackUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardBackUnlockNotify.newBuilder() to construct.
    private GCGDSCardBackUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardBackUnlockNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardBackUnlockNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.class, emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.Builder.class);
    }

    public static final int CARD_BACK_ID_FIELD_NUMBER = 7;
    private int cardBackId_ = 0;
    /**
     * <code>uint32 card_back_id = 7;</code>
     * @return The cardBackId.
     */
    @java.lang.Override
    public int getCardBackId() {
      return cardBackId_;
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
      if (cardBackId_ != 0) {
        output.writeUInt32(7, cardBackId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardBackId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cardBackId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify other = (emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify) obj;

      if (getCardBackId()
          != other.getCardBackId()) return false;
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
      hash = (37 * hash) + CARD_BACK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardBackId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify prototype) {
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
     * Obf: NECNIDOCACF
     * </pre>
     *
     * Protobuf type {@code GCGDSCardBackUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardBackUnlockNotify)
        emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.class, emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.newBuilder()
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
        cardBackId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify build() {
        emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify buildPartial() {
        emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify result = new emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cardBackId_ = cardBackId_;
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
        if (other instanceof emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify other) {
        if (other == emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.getDefaultInstance()) return this;
        if (other.getCardBackId() != 0) {
          setCardBackId(other.getCardBackId());
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
                cardBackId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int cardBackId_ ;
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @return The cardBackId.
       */
      @java.lang.Override
      public int getCardBackId() {
        return cardBackId_;
      }
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @param value The cardBackId to set.
       * @return This builder for chaining.
       */
      public Builder setCardBackId(int value) {

        cardBackId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardBackId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cardBackId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardBackUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardBackUnlockNotify)
    private static final emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify();
    }

    public static emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardBackUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardBackUnlockNotify>() {
      @java.lang.Override
      public GCGDSCardBackUnlockNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GCGDSCardBackUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardBackUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardBackUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GCGDSCardBackUnlockNotify.proto\"1\n\031GCG" +
      "DSCardBackUnlockNotify\022\024\n\014card_back_id\030\007" +
      " \001(\rB\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardBackUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardBackUnlockNotify_descriptor,
        new java.lang.String[] { "CardBackId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
