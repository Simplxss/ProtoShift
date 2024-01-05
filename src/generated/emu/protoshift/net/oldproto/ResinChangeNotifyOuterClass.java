// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinChangeNotify.proto

package emu.protoshift.net.oldproto;

public final class ResinChangeNotifyOuterClass {
  private ResinChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResinChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResinChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cur_buy_count = 3;</code>
     * @return The curBuyCount.
     */
    int getCurBuyCount();

    /**
     * <code>uint32 next_add_timestamp = 6;</code>
     * @return The nextAddTimestamp.
     */
    int getNextAddTimestamp();

    /**
     * <code>uint32 cur_value = 7;</code>
     * @return The curValue.
     */
    int getCurValue();
  }
  /**
   * <pre>
   * Obf: POKGPJBGPLM
   * </pre>
   *
   * Protobuf type {@code ResinChangeNotify}
   */
  public static final class ResinChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ResinChangeNotify)
      ResinChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResinChangeNotify.newBuilder() to construct.
    private ResinChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResinChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ResinChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.class, emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.Builder.class);
    }

    public static final int CUR_BUY_COUNT_FIELD_NUMBER = 3;
    private int curBuyCount_ = 0;
    /**
     * <code>uint32 cur_buy_count = 3;</code>
     * @return The curBuyCount.
     */
    @java.lang.Override
    public int getCurBuyCount() {
      return curBuyCount_;
    }

    public static final int NEXT_ADD_TIMESTAMP_FIELD_NUMBER = 6;
    private int nextAddTimestamp_ = 0;
    /**
     * <code>uint32 next_add_timestamp = 6;</code>
     * @return The nextAddTimestamp.
     */
    @java.lang.Override
    public int getNextAddTimestamp() {
      return nextAddTimestamp_;
    }

    public static final int CUR_VALUE_FIELD_NUMBER = 7;
    private int curValue_ = 0;
    /**
     * <code>uint32 cur_value = 7;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public int getCurValue() {
      return curValue_;
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
      if (curBuyCount_ != 0) {
        output.writeUInt32(3, curBuyCount_);
      }
      if (nextAddTimestamp_ != 0) {
        output.writeUInt32(6, nextAddTimestamp_);
      }
      if (curValue_ != 0) {
        output.writeUInt32(7, curValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curBuyCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, curBuyCount_);
      }
      if (nextAddTimestamp_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, nextAddTimestamp_);
      }
      if (curValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, curValue_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify other = (emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify) obj;

      if (getCurBuyCount()
          != other.getCurBuyCount()) return false;
      if (getNextAddTimestamp()
          != other.getNextAddTimestamp()) return false;
      if (getCurValue()
          != other.getCurValue()) return false;
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
      hash = (37 * hash) + CUR_BUY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getCurBuyCount();
      hash = (37 * hash) + NEXT_ADD_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getNextAddTimestamp();
      hash = (37 * hash) + CUR_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getCurValue();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify prototype) {
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
     * Obf: POKGPJBGPLM
     * </pre>
     *
     * Protobuf type {@code ResinChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResinChangeNotify)
        emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.class, emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.newBuilder()
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
        curBuyCount_ = 0;
        nextAddTimestamp_ = 0;
        curValue_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.internal_static_ResinChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify build() {
        emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify buildPartial() {
        emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify result = new emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curBuyCount_ = curBuyCount_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nextAddTimestamp_ = nextAddTimestamp_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curValue_ = curValue_;
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
        if (other instanceof emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify other) {
        if (other == emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify.getDefaultInstance()) return this;
        if (other.getCurBuyCount() != 0) {
          setCurBuyCount(other.getCurBuyCount());
        }
        if (other.getNextAddTimestamp() != 0) {
          setNextAddTimestamp(other.getNextAddTimestamp());
        }
        if (other.getCurValue() != 0) {
          setCurValue(other.getCurValue());
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
              case 24: {
                curBuyCount_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 48: {
                nextAddTimestamp_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 56: {
                curValue_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private int curBuyCount_ ;
      /**
       * <code>uint32 cur_buy_count = 3;</code>
       * @return The curBuyCount.
       */
      @java.lang.Override
      public int getCurBuyCount() {
        return curBuyCount_;
      }
      /**
       * <code>uint32 cur_buy_count = 3;</code>
       * @param value The curBuyCount to set.
       * @return This builder for chaining.
       */
      public Builder setCurBuyCount(int value) {

        curBuyCount_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_buy_count = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurBuyCount() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curBuyCount_ = 0;
        onChanged();
        return this;
      }

      private int nextAddTimestamp_ ;
      /**
       * <code>uint32 next_add_timestamp = 6;</code>
       * @return The nextAddTimestamp.
       */
      @java.lang.Override
      public int getNextAddTimestamp() {
        return nextAddTimestamp_;
      }
      /**
       * <code>uint32 next_add_timestamp = 6;</code>
       * @param value The nextAddTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setNextAddTimestamp(int value) {

        nextAddTimestamp_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_add_timestamp = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextAddTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        nextAddTimestamp_ = 0;
        onChanged();
        return this;
      }

      private int curValue_ ;
      /**
       * <code>uint32 cur_value = 7;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public int getCurValue() {
        return curValue_;
      }
      /**
       * <code>uint32 cur_value = 7;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(int value) {

        curValue_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_value = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curValue_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ResinChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:ResinChangeNotify)
    private static final emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify();
    }

    public static emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResinChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<ResinChangeNotify>() {
      @java.lang.Override
      public ResinChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<ResinChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResinChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ResinChangeNotifyOuterClass.ResinChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResinChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResinChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ResinChangeNotify.proto\"Y\n\021ResinChange" +
      "Notify\022\025\n\rcur_buy_count\030\003 \001(\r\022\032\n\022next_ad" +
      "d_timestamp\030\006 \001(\r\022\021\n\tcur_value\030\007 \001(\rB\035\n\033" +
      "emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ResinChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResinChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResinChangeNotify_descriptor,
        new java.lang.String[] { "CurBuyCount", "NextAddTimestamp", "CurValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
