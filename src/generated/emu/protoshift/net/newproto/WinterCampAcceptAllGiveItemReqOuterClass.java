// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WinterCampAcceptAllGiveItemReq.proto

package emu.protoshift.net.newproto;

public final class WinterCampAcceptAllGiveItemReqOuterClass {
  private WinterCampAcceptAllGiveItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampAcceptAllGiveItemReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WinterCampAcceptAllGiveItemReq)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Obf: HPLLPIMMLLJ
   * </pre>
   *
   * Protobuf type {@code WinterCampAcceptAllGiveItemReq}
   */
  public static final class WinterCampAcceptAllGiveItemReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampAcceptAllGiveItemReq)
      WinterCampAcceptAllGiveItemReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WinterCampAcceptAllGiveItemReq.newBuilder() to construct.
    private WinterCampAcceptAllGiveItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WinterCampAcceptAllGiveItemReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WinterCampAcceptAllGiveItemReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.internal_static_WinterCampAcceptAllGiveItemReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.internal_static_WinterCampAcceptAllGiveItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.class, emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.Builder.class);
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
      if (!(obj instanceof emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq other = (emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq) obj;

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

    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq prototype) {
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
     * Obf: HPLLPIMMLLJ
     * </pre>
     *
     * Protobuf type {@code WinterCampAcceptAllGiveItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WinterCampAcceptAllGiveItemReq)
        emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.internal_static_WinterCampAcceptAllGiveItemReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.internal_static_WinterCampAcceptAllGiveItemReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.class, emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.newBuilder()
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
        return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.internal_static_WinterCampAcceptAllGiveItemReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq build() {
        emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq buildPartial() {
        emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq result = new emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq(this);
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
        if (other instanceof emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq) {
          return mergeFrom((emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq other) {
        if (other == emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq.getDefaultInstance()) return this;
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


      // @@protoc_insertion_point(builder_scope:WinterCampAcceptAllGiveItemReq)
    }

    // @@protoc_insertion_point(class_scope:WinterCampAcceptAllGiveItemReq)
    private static final emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq();
    }

    public static emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WinterCampAcceptAllGiveItemReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampAcceptAllGiveItemReq>() {
      @java.lang.Override
      public WinterCampAcceptAllGiveItemReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WinterCampAcceptAllGiveItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampAcceptAllGiveItemReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.WinterCampAcceptAllGiveItemReqOuterClass.WinterCampAcceptAllGiveItemReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampAcceptAllGiveItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampAcceptAllGiveItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$WinterCampAcceptAllGiveItemReq.proto\" " +
      "\n\036WinterCampAcceptAllGiveItemReqB\035\n\033emu." +
      "protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampAcceptAllGiveItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampAcceptAllGiveItemReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WinterCampAcceptAllGiveItemReq_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
