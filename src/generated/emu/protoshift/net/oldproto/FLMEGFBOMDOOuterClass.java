// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FLMEGFBOMDO.proto

package emu.protoshift.net.oldproto;

public final class FLMEGFBOMDOOuterClass {
  private FLMEGFBOMDOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FLMEGFBOMDOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FLMEGFBOMDO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JKBANIBHKEC = 12;</code>
     * @return The jKBANIBHKEC.
     */
    int getJKBANIBHKEC();

    /**
     * <code>uint32 GKNMICKJLHO = 5;</code>
     * @return The gKNMICKJLHO.
     */
    int getGKNMICKJLHO();
  }
  /**
   * Protobuf type {@code FLMEGFBOMDO}
   */
  public static final class FLMEGFBOMDO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FLMEGFBOMDO)
      FLMEGFBOMDOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FLMEGFBOMDO.newBuilder() to construct.
    private FLMEGFBOMDO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FLMEGFBOMDO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FLMEGFBOMDO();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.internal_static_FLMEGFBOMDO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.internal_static_FLMEGFBOMDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.class, emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.Builder.class);
    }

    public static final int JKBANIBHKEC_FIELD_NUMBER = 12;
    private int jKBANIBHKEC_ = 0;
    /**
     * <code>uint32 JKBANIBHKEC = 12;</code>
     * @return The jKBANIBHKEC.
     */
    @java.lang.Override
    public int getJKBANIBHKEC() {
      return jKBANIBHKEC_;
    }

    public static final int GKNMICKJLHO_FIELD_NUMBER = 5;
    private int gKNMICKJLHO_ = 0;
    /**
     * <code>uint32 GKNMICKJLHO = 5;</code>
     * @return The gKNMICKJLHO.
     */
    @java.lang.Override
    public int getGKNMICKJLHO() {
      return gKNMICKJLHO_;
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
      if (gKNMICKJLHO_ != 0) {
        output.writeUInt32(5, gKNMICKJLHO_);
      }
      if (jKBANIBHKEC_ != 0) {
        output.writeUInt32(12, jKBANIBHKEC_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gKNMICKJLHO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, gKNMICKJLHO_);
      }
      if (jKBANIBHKEC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, jKBANIBHKEC_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO other = (emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO) obj;

      if (getJKBANIBHKEC()
          != other.getJKBANIBHKEC()) return false;
      if (getGKNMICKJLHO()
          != other.getGKNMICKJLHO()) return false;
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
      hash = (37 * hash) + JKBANIBHKEC_FIELD_NUMBER;
      hash = (53 * hash) + getJKBANIBHKEC();
      hash = (37 * hash) + GKNMICKJLHO_FIELD_NUMBER;
      hash = (53 * hash) + getGKNMICKJLHO();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO prototype) {
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
     * Protobuf type {@code FLMEGFBOMDO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FLMEGFBOMDO)
        emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.internal_static_FLMEGFBOMDO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.internal_static_FLMEGFBOMDO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.class, emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.newBuilder()
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
        jKBANIBHKEC_ = 0;
        gKNMICKJLHO_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.internal_static_FLMEGFBOMDO_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO build() {
        emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO buildPartial() {
        emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO result = new emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.jKBANIBHKEC_ = jKBANIBHKEC_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gKNMICKJLHO_ = gKNMICKJLHO_;
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
        if (other instanceof emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO) {
          return mergeFrom((emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO other) {
        if (other == emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO.getDefaultInstance()) return this;
        if (other.getJKBANIBHKEC() != 0) {
          setJKBANIBHKEC(other.getJKBANIBHKEC());
        }
        if (other.getGKNMICKJLHO() != 0) {
          setGKNMICKJLHO(other.getGKNMICKJLHO());
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
                gKNMICKJLHO_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 96: {
                jKBANIBHKEC_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int jKBANIBHKEC_ ;
      /**
       * <code>uint32 JKBANIBHKEC = 12;</code>
       * @return The jKBANIBHKEC.
       */
      @java.lang.Override
      public int getJKBANIBHKEC() {
        return jKBANIBHKEC_;
      }
      /**
       * <code>uint32 JKBANIBHKEC = 12;</code>
       * @param value The jKBANIBHKEC to set.
       * @return This builder for chaining.
       */
      public Builder setJKBANIBHKEC(int value) {

        jKBANIBHKEC_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKBANIBHKEC = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKBANIBHKEC() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jKBANIBHKEC_ = 0;
        onChanged();
        return this;
      }

      private int gKNMICKJLHO_ ;
      /**
       * <code>uint32 GKNMICKJLHO = 5;</code>
       * @return The gKNMICKJLHO.
       */
      @java.lang.Override
      public int getGKNMICKJLHO() {
        return gKNMICKJLHO_;
      }
      /**
       * <code>uint32 GKNMICKJLHO = 5;</code>
       * @param value The gKNMICKJLHO to set.
       * @return This builder for chaining.
       */
      public Builder setGKNMICKJLHO(int value) {

        gKNMICKJLHO_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GKNMICKJLHO = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearGKNMICKJLHO() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gKNMICKJLHO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FLMEGFBOMDO)
    }

    // @@protoc_insertion_point(class_scope:FLMEGFBOMDO)
    private static final emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO();
    }

    public static emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FLMEGFBOMDO>
        PARSER = new com.google.protobuf.AbstractParser<FLMEGFBOMDO>() {
      @java.lang.Override
      public FLMEGFBOMDO parsePartialFrom(
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

    public static com.google.protobuf.Parser<FLMEGFBOMDO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FLMEGFBOMDO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FLMEGFBOMDOOuterClass.FLMEGFBOMDO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FLMEGFBOMDO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FLMEGFBOMDO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FLMEGFBOMDO.proto\"7\n\013FLMEGFBOMDO\022\023\n\013JK" +
      "BANIBHKEC\030\014 \001(\r\022\023\n\013GKNMICKJLHO\030\005 \001(\rB\035\n\033" +
      "emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FLMEGFBOMDO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FLMEGFBOMDO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FLMEGFBOMDO_descriptor,
        new java.lang.String[] { "JKBANIBHKEC", "GKNMICKJLHO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
