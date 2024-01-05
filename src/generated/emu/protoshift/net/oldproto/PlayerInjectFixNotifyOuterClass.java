// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerInjectFixNotify.proto

package emu.protoshift.net.oldproto;

public final class PlayerInjectFixNotifyOuterClass {
  private PlayerInjectFixNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerInjectFixNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerInjectFixNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes inject_fix = 3;</code>
     * @return The injectFix.
     */
    com.google.protobuf.ByteString getInjectFix();

    /**
     * <code>uint32 id = 7;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * Obf: JAGPJBOAGGK
   * </pre>
   *
   * Protobuf type {@code PlayerInjectFixNotify}
   */
  public static final class PlayerInjectFixNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerInjectFixNotify)
      PlayerInjectFixNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerInjectFixNotify.newBuilder() to construct.
    private PlayerInjectFixNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerInjectFixNotify() {
      injectFix_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerInjectFixNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.internal_static_PlayerInjectFixNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.internal_static_PlayerInjectFixNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.class, emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.Builder.class);
    }

    public static final int INJECT_FIX_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString injectFix_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes inject_fix = 3;</code>
     * @return The injectFix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getInjectFix() {
      return injectFix_;
    }

    public static final int ID_FIELD_NUMBER = 7;
    private int id_ = 0;
    /**
     * <code>uint32 id = 7;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (!injectFix_.isEmpty()) {
        output.writeBytes(3, injectFix_);
      }
      if (id_ != 0) {
        output.writeUInt32(7, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!injectFix_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, injectFix_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, id_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify other = (emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify) obj;

      if (!getInjectFix()
          .equals(other.getInjectFix())) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + INJECT_FIX_FIELD_NUMBER;
      hash = (53 * hash) + getInjectFix().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify prototype) {
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
     * Obf: JAGPJBOAGGK
     * </pre>
     *
     * Protobuf type {@code PlayerInjectFixNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerInjectFixNotify)
        emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.internal_static_PlayerInjectFixNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.internal_static_PlayerInjectFixNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.class, emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.newBuilder()
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
        injectFix_ = com.google.protobuf.ByteString.EMPTY;
        id_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.internal_static_PlayerInjectFixNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify build() {
        emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify buildPartial() {
        emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify result = new emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.injectFix_ = injectFix_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
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
        if (other instanceof emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify other) {
        if (other == emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify.getDefaultInstance()) return this;
        if (other.getInjectFix() != com.google.protobuf.ByteString.EMPTY) {
          setInjectFix(other.getInjectFix());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
              case 26: {
                injectFix_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 26
              case 56: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private com.google.protobuf.ByteString injectFix_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes inject_fix = 3;</code>
       * @return The injectFix.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getInjectFix() {
        return injectFix_;
      }
      /**
       * <code>bytes inject_fix = 3;</code>
       * @param value The injectFix to set.
       * @return This builder for chaining.
       */
      public Builder setInjectFix(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        injectFix_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes inject_fix = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearInjectFix() {
        bitField0_ = (bitField0_ & ~0x00000001);
        injectFix_ = getDefaultInstance().getInjectFix();
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 7;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 7;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerInjectFixNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerInjectFixNotify)
    private static final emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify();
    }

    public static emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerInjectFixNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerInjectFixNotify>() {
      @java.lang.Override
      public PlayerInjectFixNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerInjectFixNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerInjectFixNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PlayerInjectFixNotifyOuterClass.PlayerInjectFixNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerInjectFixNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerInjectFixNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerInjectFixNotify.proto\"7\n\025PlayerI" +
      "njectFixNotify\022\022\n\ninject_fix\030\003 \001(\014\022\n\n\002id" +
      "\030\007 \001(\rB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerInjectFixNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerInjectFixNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerInjectFixNotify_descriptor,
        new java.lang.String[] { "InjectFix", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
