// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReadSignatureAuditReq.proto

package emu.protoshift.net.newproto;

public final class ReadSignatureAuditReqOuterClass {
  private ReadSignatureAuditReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReadSignatureAuditReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadSignatureAuditReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Obf: GCJILPOLMJP
   * </pre>
   *
   * Protobuf type {@code ReadSignatureAuditReq}
   */
  public static final class ReadSignatureAuditReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReadSignatureAuditReq)
      ReadSignatureAuditReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReadSignatureAuditReq.newBuilder() to construct.
    private ReadSignatureAuditReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReadSignatureAuditReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReadSignatureAuditReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.internal_static_ReadSignatureAuditReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.internal_static_ReadSignatureAuditReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.class, emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.Builder.class);
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
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq other = (emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq) obj;

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
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq prototype) {
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
     * Obf: GCJILPOLMJP
     * </pre>
     *
     * Protobuf type {@code ReadSignatureAuditReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadSignatureAuditReq)
        emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.internal_static_ReadSignatureAuditReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.internal_static_ReadSignatureAuditReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.class, emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.internal_static_ReadSignatureAuditReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq build() {
        emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq buildPartial() {
        emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq result = new emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq(this);
        onBuilt();
        return result;
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
        if (other instanceof emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq) {
          return mergeFrom((emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq other) {
        if (other == emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:ReadSignatureAuditReq)
    }

    // @@protoc_insertion_point(class_scope:ReadSignatureAuditReq)
    private static final emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq();
    }

    public static emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReadSignatureAuditReq>
        PARSER = new com.google.protobuf.AbstractParser<ReadSignatureAuditReq>() {
      @java.lang.Override
      public ReadSignatureAuditReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ReadSignatureAuditReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReadSignatureAuditReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.ReadSignatureAuditReqOuterClass.ReadSignatureAuditReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReadSignatureAuditReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReadSignatureAuditReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ReadSignatureAuditReq.proto\"\027\n\025ReadSig" +
      "natureAuditReqB\035\n\033emu.protoshift.net.new" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReadSignatureAuditReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReadSignatureAuditReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReadSignatureAuditReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
