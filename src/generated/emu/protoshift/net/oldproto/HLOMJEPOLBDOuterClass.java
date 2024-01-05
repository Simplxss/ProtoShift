// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HLOMJEPOLBD.proto

package emu.protoshift.net.oldproto;

public final class HLOMJEPOLBDOuterClass {
  private HLOMJEPOLBDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HLOMJEPOLBDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HLOMJEPOLBD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code HLOMJEPOLBD}
   */
  public static final class HLOMJEPOLBD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HLOMJEPOLBD)
      HLOMJEPOLBDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HLOMJEPOLBD.newBuilder() to construct.
    private HLOMJEPOLBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HLOMJEPOLBD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HLOMJEPOLBD();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.internal_static_HLOMJEPOLBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.internal_static_HLOMJEPOLBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.class, emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 5;
    private int levelId_ = 0;
    /**
     * <code>uint32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (levelId_ != 0) {
        output.writeUInt32(5, levelId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, levelId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD other = (emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD prototype) {
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
     * Protobuf type {@code HLOMJEPOLBD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HLOMJEPOLBD)
        emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.internal_static_HLOMJEPOLBD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.internal_static_HLOMJEPOLBD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.class, emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.newBuilder()
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
        levelId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.internal_static_HLOMJEPOLBD_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD build() {
        emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD buildPartial() {
        emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD result = new emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.levelId_ = levelId_;
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
        if (other instanceof emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD) {
          return mergeFrom((emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD other) {
        if (other == emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
                levelId_ = input.readUInt32();
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

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 5;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {

        levelId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HLOMJEPOLBD)
    }

    // @@protoc_insertion_point(class_scope:HLOMJEPOLBD)
    private static final emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD();
    }

    public static emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HLOMJEPOLBD>
        PARSER = new com.google.protobuf.AbstractParser<HLOMJEPOLBD>() {
      @java.lang.Override
      public HLOMJEPOLBD parsePartialFrom(
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

    public static com.google.protobuf.Parser<HLOMJEPOLBD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HLOMJEPOLBD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HLOMJEPOLBDOuterClass.HLOMJEPOLBD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HLOMJEPOLBD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HLOMJEPOLBD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HLOMJEPOLBD.proto\"\037\n\013HLOMJEPOLBD\022\020\n\010le" +
      "vel_id\030\005 \001(\rB\035\n\033emu.protoshift.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HLOMJEPOLBD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HLOMJEPOLBD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HLOMJEPOLBD_descriptor,
        new java.lang.String[] { "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
