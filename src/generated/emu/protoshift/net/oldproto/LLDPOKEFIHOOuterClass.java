// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LLDPOKEFIHO.proto

package emu.protoshift.net.oldproto;

public final class LLDPOKEFIHOOuterClass {
  private LLDPOKEFIHOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LLDPOKEFIHOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LLDPOKEFIHO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_entity_id = 8;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();
  }
  /**
   * Protobuf type {@code LLDPOKEFIHO}
   */
  public static final class LLDPOKEFIHO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LLDPOKEFIHO)
      LLDPOKEFIHOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LLDPOKEFIHO.newBuilder() to construct.
    private LLDPOKEFIHO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LLDPOKEFIHO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LLDPOKEFIHO();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.internal_static_LLDPOKEFIHO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.internal_static_LLDPOKEFIHO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.class, emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.Builder.class);
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 8;
    private int targetEntityId_ = 0;
    /**
     * <code>uint32 target_entity_id = 8;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
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
      if (targetEntityId_ != 0) {
        output.writeUInt32(8, targetEntityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, targetEntityId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO other = (emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO) obj;

      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
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
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO prototype) {
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
     * Protobuf type {@code LLDPOKEFIHO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LLDPOKEFIHO)
        emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.internal_static_LLDPOKEFIHO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.internal_static_LLDPOKEFIHO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.class, emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.newBuilder()
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
        targetEntityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.internal_static_LLDPOKEFIHO_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO build() {
        emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO buildPartial() {
        emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO result = new emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetEntityId_ = targetEntityId_;
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
        if (other instanceof emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO) {
          return mergeFrom((emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO other) {
        if (other == emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO.getDefaultInstance()) return this;
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
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
                targetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 8;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 8;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {

        targetEntityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LLDPOKEFIHO)
    }

    // @@protoc_insertion_point(class_scope:LLDPOKEFIHO)
    private static final emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO();
    }

    public static emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LLDPOKEFIHO>
        PARSER = new com.google.protobuf.AbstractParser<LLDPOKEFIHO>() {
      @java.lang.Override
      public LLDPOKEFIHO parsePartialFrom(
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

    public static com.google.protobuf.Parser<LLDPOKEFIHO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LLDPOKEFIHO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.LLDPOKEFIHOOuterClass.LLDPOKEFIHO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LLDPOKEFIHO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LLDPOKEFIHO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LLDPOKEFIHO.proto\"\'\n\013LLDPOKEFIHO\022\030\n\020ta" +
      "rget_entity_id\030\010 \001(\rB\035\n\033emu.protoshift.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LLDPOKEFIHO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LLDPOKEFIHO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LLDPOKEFIHO_descriptor,
        new java.lang.String[] { "TargetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
