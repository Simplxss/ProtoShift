// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OfferingPariDetailData.proto

package emu.protoshift.net.oldproto;

public final class OfferingPariDetailDataOuterClass {
  private OfferingPariDetailDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OfferingPariDetailDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OfferingPariDetailData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GEDMGFJIPAH = 14;</code>
     * @return The gEDMGFJIPAH.
     */
    int getGEDMGFJIPAH();

    /**
     * <code>bool BLMBNCGDAOI = 15;</code>
     * @return The bLMBNCGDAOI.
     */
    boolean getBLMBNCGDAOI();
  }
  /**
   * Protobuf type {@code OfferingPariDetailData}
   */
  public static final class OfferingPariDetailData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OfferingPariDetailData)
      OfferingPariDetailDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OfferingPariDetailData.newBuilder() to construct.
    private OfferingPariDetailData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OfferingPariDetailData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OfferingPariDetailData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.internal_static_OfferingPariDetailData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.internal_static_OfferingPariDetailData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.class, emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.Builder.class);
    }

    public static final int GEDMGFJIPAH_FIELD_NUMBER = 14;
    private int gEDMGFJIPAH_ = 0;
    /**
     * <code>uint32 GEDMGFJIPAH = 14;</code>
     * @return The gEDMGFJIPAH.
     */
    @java.lang.Override
    public int getGEDMGFJIPAH() {
      return gEDMGFJIPAH_;
    }

    public static final int BLMBNCGDAOI_FIELD_NUMBER = 15;
    private boolean bLMBNCGDAOI_ = false;
    /**
     * <code>bool BLMBNCGDAOI = 15;</code>
     * @return The bLMBNCGDAOI.
     */
    @java.lang.Override
    public boolean getBLMBNCGDAOI() {
      return bLMBNCGDAOI_;
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
      if (gEDMGFJIPAH_ != 0) {
        output.writeUInt32(14, gEDMGFJIPAH_);
      }
      if (bLMBNCGDAOI_ != false) {
        output.writeBool(15, bLMBNCGDAOI_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gEDMGFJIPAH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, gEDMGFJIPAH_);
      }
      if (bLMBNCGDAOI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, bLMBNCGDAOI_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData other = (emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData) obj;

      if (getGEDMGFJIPAH()
          != other.getGEDMGFJIPAH()) return false;
      if (getBLMBNCGDAOI()
          != other.getBLMBNCGDAOI()) return false;
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
      hash = (37 * hash) + GEDMGFJIPAH_FIELD_NUMBER;
      hash = (53 * hash) + getGEDMGFJIPAH();
      hash = (37 * hash) + BLMBNCGDAOI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBLMBNCGDAOI());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData prototype) {
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
     * Protobuf type {@code OfferingPariDetailData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OfferingPariDetailData)
        emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.internal_static_OfferingPariDetailData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.internal_static_OfferingPariDetailData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.class, emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.newBuilder()
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
        gEDMGFJIPAH_ = 0;
        bLMBNCGDAOI_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.internal_static_OfferingPariDetailData_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData build() {
        emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData buildPartial() {
        emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData result = new emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gEDMGFJIPAH_ = gEDMGFJIPAH_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bLMBNCGDAOI_ = bLMBNCGDAOI_;
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
        if (other instanceof emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData) {
          return mergeFrom((emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData other) {
        if (other == emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData.getDefaultInstance()) return this;
        if (other.getGEDMGFJIPAH() != 0) {
          setGEDMGFJIPAH(other.getGEDMGFJIPAH());
        }
        if (other.getBLMBNCGDAOI() != false) {
          setBLMBNCGDAOI(other.getBLMBNCGDAOI());
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
              case 112: {
                gEDMGFJIPAH_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 112
              case 120: {
                bLMBNCGDAOI_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private int gEDMGFJIPAH_ ;
      /**
       * <code>uint32 GEDMGFJIPAH = 14;</code>
       * @return The gEDMGFJIPAH.
       */
      @java.lang.Override
      public int getGEDMGFJIPAH() {
        return gEDMGFJIPAH_;
      }
      /**
       * <code>uint32 GEDMGFJIPAH = 14;</code>
       * @param value The gEDMGFJIPAH to set.
       * @return This builder for chaining.
       */
      public Builder setGEDMGFJIPAH(int value) {

        gEDMGFJIPAH_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GEDMGFJIPAH = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGEDMGFJIPAH() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gEDMGFJIPAH_ = 0;
        onChanged();
        return this;
      }

      private boolean bLMBNCGDAOI_ ;
      /**
       * <code>bool BLMBNCGDAOI = 15;</code>
       * @return The bLMBNCGDAOI.
       */
      @java.lang.Override
      public boolean getBLMBNCGDAOI() {
        return bLMBNCGDAOI_;
      }
      /**
       * <code>bool BLMBNCGDAOI = 15;</code>
       * @param value The bLMBNCGDAOI to set.
       * @return This builder for chaining.
       */
      public Builder setBLMBNCGDAOI(boolean value) {

        bLMBNCGDAOI_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool BLMBNCGDAOI = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearBLMBNCGDAOI() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bLMBNCGDAOI_ = false;
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


      // @@protoc_insertion_point(builder_scope:OfferingPariDetailData)
    }

    // @@protoc_insertion_point(class_scope:OfferingPariDetailData)
    private static final emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData();
    }

    public static emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OfferingPariDetailData>
        PARSER = new com.google.protobuf.AbstractParser<OfferingPariDetailData>() {
      @java.lang.Override
      public OfferingPariDetailData parsePartialFrom(
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

    public static com.google.protobuf.Parser<OfferingPariDetailData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OfferingPariDetailData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.OfferingPariDetailDataOuterClass.OfferingPariDetailData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OfferingPariDetailData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OfferingPariDetailData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034OfferingPariDetailData.proto\"B\n\026Offeri" +
      "ngPariDetailData\022\023\n\013GEDMGFJIPAH\030\016 \001(\r\022\023\n" +
      "\013BLMBNCGDAOI\030\017 \001(\010B\035\n\033emu.protoshift.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OfferingPariDetailData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OfferingPariDetailData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OfferingPariDetailData_descriptor,
        new java.lang.String[] { "GEDMGFJIPAH", "BLMBNCGDAOI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
