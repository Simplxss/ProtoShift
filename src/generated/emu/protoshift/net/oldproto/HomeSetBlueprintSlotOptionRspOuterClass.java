// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSetBlueprintSlotOptionRsp.proto

package emu.protoshift.net.oldproto;

public final class HomeSetBlueprintSlotOptionRspOuterClass {
  private HomeSetBlueprintSlotOptionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSetBlueprintSlotOptionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSetBlueprintSlotOptionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>bool is_allow_copy = 13;</code>
     * @return The isAllowCopy.
     */
    boolean getIsAllowCopy();

    /**
     * <code>uint32 slot_id = 9;</code>
     * @return The slotId.
     */
    int getSlotId();
  }
  /**
   * <pre>
   * Obf: KKBNLPKCAOD
   * </pre>
   *
   * Protobuf type {@code HomeSetBlueprintSlotOptionRsp}
   */
  public static final class HomeSetBlueprintSlotOptionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSetBlueprintSlotOptionRsp)
      HomeSetBlueprintSlotOptionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSetBlueprintSlotOptionRsp.newBuilder() to construct.
    private HomeSetBlueprintSlotOptionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSetBlueprintSlotOptionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSetBlueprintSlotOptionRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.class, emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int IS_ALLOW_COPY_FIELD_NUMBER = 13;
    private boolean isAllowCopy_ = false;
    /**
     * <code>bool is_allow_copy = 13;</code>
     * @return The isAllowCopy.
     */
    @java.lang.Override
    public boolean getIsAllowCopy() {
      return isAllowCopy_;
    }

    public static final int SLOT_ID_FIELD_NUMBER = 9;
    private int slotId_ = 0;
    /**
     * <code>uint32 slot_id = 9;</code>
     * @return The slotId.
     */
    @java.lang.Override
    public int getSlotId() {
      return slotId_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (slotId_ != 0) {
        output.writeUInt32(9, slotId_);
      }
      if (isAllowCopy_ != false) {
        output.writeBool(13, isAllowCopy_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (slotId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, slotId_);
      }
      if (isAllowCopy_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isAllowCopy_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp other = (emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getIsAllowCopy()
          != other.getIsAllowCopy()) return false;
      if (getSlotId()
          != other.getSlotId()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + IS_ALLOW_COPY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAllowCopy());
      hash = (37 * hash) + SLOT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSlotId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp prototype) {
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
     * Obf: KKBNLPKCAOD
     * </pre>
     *
     * Protobuf type {@code HomeSetBlueprintSlotOptionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSetBlueprintSlotOptionRsp)
        emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.class, emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.newBuilder()
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
        retcode_ = 0;
        isAllowCopy_ = false;
        slotId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp build() {
        emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp buildPartial() {
        emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp result = new emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isAllowCopy_ = isAllowCopy_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.slotId_ = slotId_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp other) {
        if (other == emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getIsAllowCopy() != false) {
          setIsAllowCopy(other.getIsAllowCopy());
        }
        if (other.getSlotId() != 0) {
          setSlotId(other.getSlotId());
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
              case 64: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 72: {
                slotId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
              case 104: {
                isAllowCopy_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 104
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private boolean isAllowCopy_ ;
      /**
       * <code>bool is_allow_copy = 13;</code>
       * @return The isAllowCopy.
       */
      @java.lang.Override
      public boolean getIsAllowCopy() {
        return isAllowCopy_;
      }
      /**
       * <code>bool is_allow_copy = 13;</code>
       * @param value The isAllowCopy to set.
       * @return This builder for chaining.
       */
      public Builder setIsAllowCopy(boolean value) {

        isAllowCopy_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_allow_copy = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAllowCopy() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAllowCopy_ = false;
        onChanged();
        return this;
      }

      private int slotId_ ;
      /**
       * <code>uint32 slot_id = 9;</code>
       * @return The slotId.
       */
      @java.lang.Override
      public int getSlotId() {
        return slotId_;
      }
      /**
       * <code>uint32 slot_id = 9;</code>
       * @param value The slotId to set.
       * @return This builder for chaining.
       */
      public Builder setSlotId(int value) {

        slotId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        slotId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeSetBlueprintSlotOptionRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSetBlueprintSlotOptionRsp)
    private static final emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp();
    }

    public static emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSetBlueprintSlotOptionRsp>() {
      @java.lang.Override
      public HomeSetBlueprintSlotOptionRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSetBlueprintSlotOptionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeSetBlueprintSlotOptionRspOuterClass.HomeSetBlueprintSlotOptionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSetBlueprintSlotOptionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#HomeSetBlueprintSlotOptionRsp.proto\"X\n" +
      "\035HomeSetBlueprintSlotOptionRsp\022\017\n\007retcod" +
      "e\030\010 \001(\005\022\025\n\ris_allow_copy\030\r \001(\010\022\017\n\007slot_i" +
      "d\030\t \001(\rB\035\n\033emu.protoshift.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSetBlueprintSlotOptionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSetBlueprintSlotOptionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSetBlueprintSlotOptionRsp_descriptor,
        new java.lang.String[] { "Retcode", "IsAllowCopy", "SlotId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
