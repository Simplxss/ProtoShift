// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RefreshRoguelikeDungeonCardReq.proto

package emu.protoshift.net.oldproto;

public final class RefreshRoguelikeDungeonCardReqOuterClass {
  private RefreshRoguelikeDungeonCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RefreshRoguelikeDungeonCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RefreshRoguelikeDungeonCardReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Obf: LFACOBOMPMG
   * </pre>
   *
   * Protobuf type {@code RefreshRoguelikeDungeonCardReq}
   */
  public static final class RefreshRoguelikeDungeonCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RefreshRoguelikeDungeonCardReq)
      RefreshRoguelikeDungeonCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RefreshRoguelikeDungeonCardReq.newBuilder() to construct.
    private RefreshRoguelikeDungeonCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RefreshRoguelikeDungeonCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RefreshRoguelikeDungeonCardReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.internal_static_RefreshRoguelikeDungeonCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.internal_static_RefreshRoguelikeDungeonCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.class, emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.Builder.class);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq other = (emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq) obj;

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

    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq prototype) {
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
     * Obf: LFACOBOMPMG
     * </pre>
     *
     * Protobuf type {@code RefreshRoguelikeDungeonCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RefreshRoguelikeDungeonCardReq)
        emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.internal_static_RefreshRoguelikeDungeonCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.internal_static_RefreshRoguelikeDungeonCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.class, emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.newBuilder()
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
        return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.internal_static_RefreshRoguelikeDungeonCardReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq build() {
        emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq buildPartial() {
        emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq result = new emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq(this);
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
        if (other instanceof emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq) {
          return mergeFrom((emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq other) {
        if (other == emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:RefreshRoguelikeDungeonCardReq)
    }

    // @@protoc_insertion_point(class_scope:RefreshRoguelikeDungeonCardReq)
    private static final emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq();
    }

    public static emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RefreshRoguelikeDungeonCardReq>
        PARSER = new com.google.protobuf.AbstractParser<RefreshRoguelikeDungeonCardReq>() {
      @java.lang.Override
      public RefreshRoguelikeDungeonCardReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<RefreshRoguelikeDungeonCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RefreshRoguelikeDungeonCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RefreshRoguelikeDungeonCardReqOuterClass.RefreshRoguelikeDungeonCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RefreshRoguelikeDungeonCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RefreshRoguelikeDungeonCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$RefreshRoguelikeDungeonCardReq.proto\" " +
      "\n\036RefreshRoguelikeDungeonCardReqB\035\n\033emu." +
      "protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RefreshRoguelikeDungeonCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RefreshRoguelikeDungeonCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RefreshRoguelikeDungeonCardReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
