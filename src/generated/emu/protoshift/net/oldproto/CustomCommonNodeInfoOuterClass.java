// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomCommonNodeInfo.proto

package emu.protoshift.net.oldproto;

public final class CustomCommonNodeInfoOuterClass {
  private CustomCommonNodeInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomCommonNodeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CustomCommonNodeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 parent_index = 1;</code>
     * @return The parentIndex.
     */
    int getParentIndex();

    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>string slot_identifier = 3;</code>
     * @return The slotIdentifier.
     */
    java.lang.String getSlotIdentifier();
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The bytes for slotIdentifier.
     */
    com.google.protobuf.ByteString
        getSlotIdentifierBytes();
  }
  /**
   * Protobuf type {@code CustomCommonNodeInfo}
   */
  public static final class CustomCommonNodeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CustomCommonNodeInfo)
      CustomCommonNodeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CustomCommonNodeInfo.newBuilder() to construct.
    private CustomCommonNodeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CustomCommonNodeInfo() {
      slotIdentifier_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CustomCommonNodeInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.class, emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder.class);
    }

    public static final int PARENT_INDEX_FIELD_NUMBER = 1;
    private int parentIndex_ = 0;
    /**
     * <code>int32 parent_index = 1;</code>
     * @return The parentIndex.
     */
    @java.lang.Override
    public int getParentIndex() {
      return parentIndex_;
    }

    public static final int CONFIG_ID_FIELD_NUMBER = 2;
    private int configId_ = 0;
    /**
     * <code>uint32 config_id = 2;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int SLOT_IDENTIFIER_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object slotIdentifier_ = "";
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The slotIdentifier.
     */
    @java.lang.Override
    public java.lang.String getSlotIdentifier() {
      java.lang.Object ref = slotIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        slotIdentifier_ = s;
        return s;
      }
    }
    /**
     * <code>string slot_identifier = 3;</code>
     * @return The bytes for slotIdentifier.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSlotIdentifierBytes() {
      java.lang.Object ref = slotIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        slotIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (parentIndex_ != 0) {
        output.writeInt32(1, parentIndex_);
      }
      if (configId_ != 0) {
        output.writeUInt32(2, configId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slotIdentifier_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, slotIdentifier_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, parentIndex_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, configId_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(slotIdentifier_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, slotIdentifier_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo other = (emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo) obj;

      if (getParentIndex()
          != other.getParentIndex()) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (!getSlotIdentifier()
          .equals(other.getSlotIdentifier())) return false;
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
      hash = (37 * hash) + PARENT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getParentIndex();
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + SLOT_IDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getSlotIdentifier().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo prototype) {
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
     * Protobuf type {@code CustomCommonNodeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CustomCommonNodeInfo)
        emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.class, emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.newBuilder()
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
        parentIndex_ = 0;
        configId_ = 0;
        slotIdentifier_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.internal_static_CustomCommonNodeInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo build() {
        emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo buildPartial() {
        emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo result = new emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentIndex_ = parentIndex_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.configId_ = configId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.slotIdentifier_ = slotIdentifier_;
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
        if (other instanceof emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo other) {
        if (other == emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo.getDefaultInstance()) return this;
        if (other.getParentIndex() != 0) {
          setParentIndex(other.getParentIndex());
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (!other.getSlotIdentifier().isEmpty()) {
          slotIdentifier_ = other.slotIdentifier_;
          bitField0_ |= 0x00000004;
          onChanged();
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
              case 8: {
                parentIndex_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                configId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                slotIdentifier_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

      private int parentIndex_ ;
      /**
       * <code>int32 parent_index = 1;</code>
       * @return The parentIndex.
       */
      @java.lang.Override
      public int getParentIndex() {
        return parentIndex_;
      }
      /**
       * <code>int32 parent_index = 1;</code>
       * @param value The parentIndex to set.
       * @return This builder for chaining.
       */
      public Builder setParentIndex(int value) {

        parentIndex_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 parent_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentIndex_ = 0;
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 2;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {

        configId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        configId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object slotIdentifier_ = "";
      /**
       * <code>string slot_identifier = 3;</code>
       * @return The slotIdentifier.
       */
      public java.lang.String getSlotIdentifier() {
        java.lang.Object ref = slotIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          slotIdentifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @return The bytes for slotIdentifier.
       */
      public com.google.protobuf.ByteString
          getSlotIdentifierBytes() {
        java.lang.Object ref = slotIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          slotIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @param value The slotIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setSlotIdentifier(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        slotIdentifier_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlotIdentifier() {
        slotIdentifier_ = getDefaultInstance().getSlotIdentifier();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string slot_identifier = 3;</code>
       * @param value The bytes for slotIdentifier to set.
       * @return This builder for chaining.
       */
      public Builder setSlotIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        slotIdentifier_ = value;
        bitField0_ |= 0x00000004;
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


      // @@protoc_insertion_point(builder_scope:CustomCommonNodeInfo)
    }

    // @@protoc_insertion_point(class_scope:CustomCommonNodeInfo)
    private static final emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo();
    }

    public static emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CustomCommonNodeInfo>
        PARSER = new com.google.protobuf.AbstractParser<CustomCommonNodeInfo>() {
      @java.lang.Override
      public CustomCommonNodeInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CustomCommonNodeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CustomCommonNodeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CustomCommonNodeInfoOuterClass.CustomCommonNodeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CustomCommonNodeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CustomCommonNodeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CustomCommonNodeInfo.proto\"X\n\024CustomCo" +
      "mmonNodeInfo\022\024\n\014parent_index\030\001 \001(\005\022\021\n\tco" +
      "nfig_id\030\002 \001(\r\022\027\n\017slot_identifier\030\003 \001(\tB\035" +
      "\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CustomCommonNodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CustomCommonNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CustomCommonNodeInfo_descriptor,
        new java.lang.String[] { "ParentIndex", "ConfigId", "SlotIdentifier", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
