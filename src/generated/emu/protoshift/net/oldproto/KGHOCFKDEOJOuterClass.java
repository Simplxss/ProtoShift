// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KGHOCFKDEOJ.proto

package emu.protoshift.net.oldproto;

public final class KGHOCFKDEOJOuterClass {
  private KGHOCFKDEOJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KGHOCFKDEOJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KGHOCFKDEOJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 10;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code KGHOCFKDEOJ}
   */
  public static final class KGHOCFKDEOJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KGHOCFKDEOJ)
      KGHOCFKDEOJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KGHOCFKDEOJ.newBuilder() to construct.
    private KGHOCFKDEOJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KGHOCFKDEOJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KGHOCFKDEOJ();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.internal_static_KGHOCFKDEOJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.internal_static_KGHOCFKDEOJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.class, emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 10;
    private int id_ = 0;
    /**
     * <code>uint32 id = 10;</code>
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
      if (id_ != 0) {
        output.writeUInt32(10, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, id_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ other = (emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ) obj;

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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ prototype) {
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
     * Protobuf type {@code KGHOCFKDEOJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KGHOCFKDEOJ)
        emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.internal_static_KGHOCFKDEOJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.internal_static_KGHOCFKDEOJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.class, emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.newBuilder()
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
        id_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.internal_static_KGHOCFKDEOJ_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ build() {
        emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ buildPartial() {
        emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ result = new emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ) {
          return mergeFrom((emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ other) {
        if (other == emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ.getDefaultInstance()) return this;
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
              case 80: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
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

      private int id_ ;
      /**
       * <code>uint32 id = 10;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 10;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:KGHOCFKDEOJ)
    }

    // @@protoc_insertion_point(class_scope:KGHOCFKDEOJ)
    private static final emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ();
    }

    public static emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KGHOCFKDEOJ>
        PARSER = new com.google.protobuf.AbstractParser<KGHOCFKDEOJ>() {
      @java.lang.Override
      public KGHOCFKDEOJ parsePartialFrom(
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

    public static com.google.protobuf.Parser<KGHOCFKDEOJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KGHOCFKDEOJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.KGHOCFKDEOJOuterClass.KGHOCFKDEOJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KGHOCFKDEOJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KGHOCFKDEOJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KGHOCFKDEOJ.proto\"\031\n\013KGHOCFKDEOJ\022\n\n\002id" +
      "\030\n \001(\rB\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KGHOCFKDEOJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KGHOCFKDEOJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KGHOCFKDEOJ_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
