// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegionalPlayVar.proto

package emu.protoshift.net.oldproto;

public final class RegionalPlayVarOuterClass {
  private RegionalPlayVarOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RegionalPlayVarOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionalPlayVar)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float CDLIONNFPIF = 14;</code>
     * @return The cDLIONNFPIF.
     */
    float getCDLIONNFPIF();

    /**
     * <code>uint32 type = 5;</code>
     * @return The type.
     */
    int getType();

    /**
     * <code>float LPCPLLLHLIO = 11;</code>
     * @return The lPCPLLLHLIO.
     */
    float getLPCPLLLHLIO();

    /**
     * <code>float value = 4;</code>
     * @return The value.
     */
    float getValue();
  }
  /**
   * Protobuf type {@code RegionalPlayVar}
   */
  public static final class RegionalPlayVar extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionalPlayVar)
      RegionalPlayVarOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionalPlayVar.newBuilder() to construct.
    private RegionalPlayVar(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionalPlayVar() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RegionalPlayVar();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.class, emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.Builder.class);
    }

    public static final int CDLIONNFPIF_FIELD_NUMBER = 14;
    private float cDLIONNFPIF_ = 0F;
    /**
     * <code>float CDLIONNFPIF = 14;</code>
     * @return The cDLIONNFPIF.
     */
    @java.lang.Override
    public float getCDLIONNFPIF() {
      return cDLIONNFPIF_;
    }

    public static final int TYPE_FIELD_NUMBER = 5;
    private int type_ = 0;
    /**
     * <code>uint32 type = 5;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    public static final int LPCPLLLHLIO_FIELD_NUMBER = 11;
    private float lPCPLLLHLIO_ = 0F;
    /**
     * <code>float LPCPLLLHLIO = 11;</code>
     * @return The lPCPLLLHLIO.
     */
    @java.lang.Override
    public float getLPCPLLLHLIO() {
      return lPCPLLLHLIO_;
    }

    public static final int VALUE_FIELD_NUMBER = 4;
    private float value_ = 0F;
    /**
     * <code>float value = 4;</code>
     * @return The value.
     */
    @java.lang.Override
    public float getValue() {
      return value_;
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
      if (java.lang.Float.floatToRawIntBits(value_) != 0) {
        output.writeFloat(4, value_);
      }
      if (type_ != 0) {
        output.writeUInt32(5, type_);
      }
      if (java.lang.Float.floatToRawIntBits(lPCPLLLHLIO_) != 0) {
        output.writeFloat(11, lPCPLLLHLIO_);
      }
      if (java.lang.Float.floatToRawIntBits(cDLIONNFPIF_) != 0) {
        output.writeFloat(14, cDLIONNFPIF_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(value_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, value_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, type_);
      }
      if (java.lang.Float.floatToRawIntBits(lPCPLLLHLIO_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, lPCPLLLHLIO_);
      }
      if (java.lang.Float.floatToRawIntBits(cDLIONNFPIF_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, cDLIONNFPIF_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar other = (emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar) obj;

      if (java.lang.Float.floatToIntBits(getCDLIONNFPIF())
          != java.lang.Float.floatToIntBits(
              other.getCDLIONNFPIF())) return false;
      if (getType()
          != other.getType()) return false;
      if (java.lang.Float.floatToIntBits(getLPCPLLLHLIO())
          != java.lang.Float.floatToIntBits(
              other.getLPCPLLLHLIO())) return false;
      if (java.lang.Float.floatToIntBits(getValue())
          != java.lang.Float.floatToIntBits(
              other.getValue())) return false;
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
      hash = (37 * hash) + CDLIONNFPIF_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCDLIONNFPIF());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + LPCPLLLHLIO_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getLPCPLLLHLIO());
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getValue());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar prototype) {
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
     * Protobuf type {@code RegionalPlayVar}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionalPlayVar)
        emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVarOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.class, emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.newBuilder()
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
        cDLIONNFPIF_ = 0F;
        type_ = 0;
        lPCPLLLHLIO_ = 0F;
        value_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.internal_static_RegionalPlayVar_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar build() {
        emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar buildPartial() {
        emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar result = new emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.cDLIONNFPIF_ = cDLIONNFPIF_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.lPCPLLLHLIO_ = lPCPLLLHLIO_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.value_ = value_;
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
        if (other instanceof emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar) {
          return mergeFrom((emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar other) {
        if (other == emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar.getDefaultInstance()) return this;
        if (other.getCDLIONNFPIF() != 0F) {
          setCDLIONNFPIF(other.getCDLIONNFPIF());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getLPCPLLLHLIO() != 0F) {
          setLPCPLLLHLIO(other.getLPCPLLLHLIO());
        }
        if (other.getValue() != 0F) {
          setValue(other.getValue());
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
              case 37: {
                value_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 37
              case 40: {
                type_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 93: {
                lPCPLLLHLIO_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 93
              case 117: {
                cDLIONNFPIF_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 117
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

      private float cDLIONNFPIF_ ;
      /**
       * <code>float CDLIONNFPIF = 14;</code>
       * @return The cDLIONNFPIF.
       */
      @java.lang.Override
      public float getCDLIONNFPIF() {
        return cDLIONNFPIF_;
      }
      /**
       * <code>float CDLIONNFPIF = 14;</code>
       * @param value The cDLIONNFPIF to set.
       * @return This builder for chaining.
       */
      public Builder setCDLIONNFPIF(float value) {

        cDLIONNFPIF_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float CDLIONNFPIF = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCDLIONNFPIF() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cDLIONNFPIF_ = 0F;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 5;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 5;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {

        type_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      private float lPCPLLLHLIO_ ;
      /**
       * <code>float LPCPLLLHLIO = 11;</code>
       * @return The lPCPLLLHLIO.
       */
      @java.lang.Override
      public float getLPCPLLLHLIO() {
        return lPCPLLLHLIO_;
      }
      /**
       * <code>float LPCPLLLHLIO = 11;</code>
       * @param value The lPCPLLLHLIO to set.
       * @return This builder for chaining.
       */
      public Builder setLPCPLLLHLIO(float value) {

        lPCPLLLHLIO_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>float LPCPLLLHLIO = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLPCPLLLHLIO() {
        bitField0_ = (bitField0_ & ~0x00000004);
        lPCPLLLHLIO_ = 0F;
        onChanged();
        return this;
      }

      private float value_ ;
      /**
       * <code>float value = 4;</code>
       * @return The value.
       */
      @java.lang.Override
      public float getValue() {
        return value_;
      }
      /**
       * <code>float value = 4;</code>
       * @param value The value to set.
       * @return This builder for chaining.
       */
      public Builder setValue(float value) {

        value_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>float value = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        value_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:RegionalPlayVar)
    }

    // @@protoc_insertion_point(class_scope:RegionalPlayVar)
    private static final emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar();
    }

    public static emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionalPlayVar>
        PARSER = new com.google.protobuf.AbstractParser<RegionalPlayVar>() {
      @java.lang.Override
      public RegionalPlayVar parsePartialFrom(
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

    public static com.google.protobuf.Parser<RegionalPlayVar> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionalPlayVar> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RegionalPlayVarOuterClass.RegionalPlayVar getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionalPlayVar_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionalPlayVar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RegionalPlayVar.proto\"X\n\017RegionalPlayV" +
      "ar\022\023\n\013CDLIONNFPIF\030\016 \001(\002\022\014\n\004type\030\005 \001(\r\022\023\n" +
      "\013LPCPLLLHLIO\030\013 \001(\002\022\r\n\005value\030\004 \001(\002B\035\n\033emu" +
      ".protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RegionalPlayVar_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegionalPlayVar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionalPlayVar_descriptor,
        new java.lang.String[] { "CDLIONNFPIF", "Type", "LPCPLLLHLIO", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
