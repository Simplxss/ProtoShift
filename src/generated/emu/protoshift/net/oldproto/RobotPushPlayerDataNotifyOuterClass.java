// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotPushPlayerDataNotify.proto

package emu.protoshift.net.oldproto;

public final class RobotPushPlayerDataNotifyOuterClass {
  private RobotPushPlayerDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RobotPushPlayerDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RobotPushPlayerDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes bin = 15;</code>
     * @return The bin.
     */
    com.google.protobuf.ByteString getBin();
  }
  /**
   * <pre>
   * Obf: HCMPFHKCCGE
   * </pre>
   *
   * Protobuf type {@code RobotPushPlayerDataNotify}
   */
  public static final class RobotPushPlayerDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RobotPushPlayerDataNotify)
      RobotPushPlayerDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RobotPushPlayerDataNotify.newBuilder() to construct.
    private RobotPushPlayerDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RobotPushPlayerDataNotify() {
      bin_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RobotPushPlayerDataNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.class, emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.Builder.class);
    }

    public static final int BIN_FIELD_NUMBER = 15;
    private com.google.protobuf.ByteString bin_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bin = 15;</code>
     * @return The bin.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBin() {
      return bin_;
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
      if (!bin_.isEmpty()) {
        output.writeBytes(15, bin_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!bin_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(15, bin_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify other = (emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify) obj;

      if (!getBin()
          .equals(other.getBin())) return false;
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
      hash = (37 * hash) + BIN_FIELD_NUMBER;
      hash = (53 * hash) + getBin().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify prototype) {
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
     * Obf: HCMPFHKCCGE
     * </pre>
     *
     * Protobuf type {@code RobotPushPlayerDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RobotPushPlayerDataNotify)
        emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.class, emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.newBuilder()
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
        bin_ = com.google.protobuf.ByteString.EMPTY;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.internal_static_RobotPushPlayerDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify build() {
        emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify buildPartial() {
        emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify result = new emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.bin_ = bin_;
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
        if (other instanceof emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify other) {
        if (other == emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify.getDefaultInstance()) return this;
        if (other.getBin() != com.google.protobuf.ByteString.EMPTY) {
          setBin(other.getBin());
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
              case 122: {
                bin_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 122
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

      private com.google.protobuf.ByteString bin_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes bin = 15;</code>
       * @return The bin.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBin() {
        return bin_;
      }
      /**
       * <code>bytes bin = 15;</code>
       * @param value The bin to set.
       * @return This builder for chaining.
       */
      public Builder setBin(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        bin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes bin = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bin_ = getDefaultInstance().getBin();
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


      // @@protoc_insertion_point(builder_scope:RobotPushPlayerDataNotify)
    }

    // @@protoc_insertion_point(class_scope:RobotPushPlayerDataNotify)
    private static final emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify();
    }

    public static emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RobotPushPlayerDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<RobotPushPlayerDataNotify>() {
      @java.lang.Override
      public RobotPushPlayerDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RobotPushPlayerDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RobotPushPlayerDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RobotPushPlayerDataNotifyOuterClass.RobotPushPlayerDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RobotPushPlayerDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RobotPushPlayerDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037RobotPushPlayerDataNotify.proto\"(\n\031Rob" +
      "otPushPlayerDataNotify\022\013\n\003bin\030\017 \001(\014B\035\n\033e" +
      "mu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RobotPushPlayerDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RobotPushPlayerDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RobotPushPlayerDataNotify_descriptor,
        new java.lang.String[] { "Bin", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
