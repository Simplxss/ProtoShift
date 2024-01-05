// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TreasureMapCurrencyNotify.proto

package emu.protoshift.net.oldproto;

public final class TreasureMapCurrencyNotifyOuterClass {
  private TreasureMapCurrencyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TreasureMapCurrencyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TreasureMapCurrencyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 currency_num = 2;</code>
     * @return The currencyNum.
     */
    int getCurrencyNum();
  }
  /**
   * <pre>
   * Obf: HIBMEJAIMMJ
   * </pre>
   *
   * Protobuf type {@code TreasureMapCurrencyNotify}
   */
  public static final class TreasureMapCurrencyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TreasureMapCurrencyNotify)
      TreasureMapCurrencyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TreasureMapCurrencyNotify.newBuilder() to construct.
    private TreasureMapCurrencyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TreasureMapCurrencyNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TreasureMapCurrencyNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.internal_static_TreasureMapCurrencyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.internal_static_TreasureMapCurrencyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.class, emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.Builder.class);
    }

    public static final int CURRENCY_NUM_FIELD_NUMBER = 2;
    private int currencyNum_ = 0;
    /**
     * <code>uint32 currency_num = 2;</code>
     * @return The currencyNum.
     */
    @java.lang.Override
    public int getCurrencyNum() {
      return currencyNum_;
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
      if (currencyNum_ != 0) {
        output.writeUInt32(2, currencyNum_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (currencyNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, currencyNum_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify other = (emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify) obj;

      if (getCurrencyNum()
          != other.getCurrencyNum()) return false;
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
      hash = (37 * hash) + CURRENCY_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyNum();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify prototype) {
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
     * Obf: HIBMEJAIMMJ
     * </pre>
     *
     * Protobuf type {@code TreasureMapCurrencyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TreasureMapCurrencyNotify)
        emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.internal_static_TreasureMapCurrencyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.internal_static_TreasureMapCurrencyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.class, emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.newBuilder()
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
        currencyNum_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.internal_static_TreasureMapCurrencyNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify build() {
        emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify buildPartial() {
        emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify result = new emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.currencyNum_ = currencyNum_;
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
        if (other instanceof emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify other) {
        if (other == emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify.getDefaultInstance()) return this;
        if (other.getCurrencyNum() != 0) {
          setCurrencyNum(other.getCurrencyNum());
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
                currencyNum_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
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

      private int currencyNum_ ;
      /**
       * <code>uint32 currency_num = 2;</code>
       * @return The currencyNum.
       */
      @java.lang.Override
      public int getCurrencyNum() {
        return currencyNum_;
      }
      /**
       * <code>uint32 currency_num = 2;</code>
       * @param value The currencyNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurrencyNum(int value) {

        currencyNum_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 currency_num = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurrencyNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        currencyNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TreasureMapCurrencyNotify)
    }

    // @@protoc_insertion_point(class_scope:TreasureMapCurrencyNotify)
    private static final emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify();
    }

    public static emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TreasureMapCurrencyNotify>
        PARSER = new com.google.protobuf.AbstractParser<TreasureMapCurrencyNotify>() {
      @java.lang.Override
      public TreasureMapCurrencyNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<TreasureMapCurrencyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TreasureMapCurrencyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.TreasureMapCurrencyNotifyOuterClass.TreasureMapCurrencyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TreasureMapCurrencyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TreasureMapCurrencyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037TreasureMapCurrencyNotify.proto\"1\n\031Tre" +
      "asureMapCurrencyNotify\022\024\n\014currency_num\030\002" +
      " \001(\rB\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TreasureMapCurrencyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TreasureMapCurrencyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TreasureMapCurrencyNotify_descriptor,
        new java.lang.String[] { "CurrencyNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
