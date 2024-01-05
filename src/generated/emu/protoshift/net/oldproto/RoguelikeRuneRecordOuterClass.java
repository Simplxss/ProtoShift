// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeRuneRecord.proto

package emu.protoshift.net.oldproto;

public final class RoguelikeRuneRecordOuterClass {
  private RoguelikeRuneRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeRuneRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeRuneRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GEENANGPMFL = 13;</code>
     * @return The gEENANGPMFL.
     */
    int getGEENANGPMFL();

    /**
     * <code>uint32 OLCPNJOLEMO = 6;</code>
     * @return The oLCPNJOLEMO.
     */
    int getOLCPNJOLEMO();

    /**
     * <code>uint32 rune_id = 12;</code>
     * @return The runeId.
     */
    int getRuneId();
  }
  /**
   * Protobuf type {@code RoguelikeRuneRecord}
   */
  public static final class RoguelikeRuneRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeRuneRecord)
      RoguelikeRuneRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeRuneRecord.newBuilder() to construct.
    private RoguelikeRuneRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeRuneRecord() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeRuneRecord();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.class, emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder.class);
    }

    public static final int GEENANGPMFL_FIELD_NUMBER = 13;
    private int gEENANGPMFL_ = 0;
    /**
     * <code>uint32 GEENANGPMFL = 13;</code>
     * @return The gEENANGPMFL.
     */
    @java.lang.Override
    public int getGEENANGPMFL() {
      return gEENANGPMFL_;
    }

    public static final int OLCPNJOLEMO_FIELD_NUMBER = 6;
    private int oLCPNJOLEMO_ = 0;
    /**
     * <code>uint32 OLCPNJOLEMO = 6;</code>
     * @return The oLCPNJOLEMO.
     */
    @java.lang.Override
    public int getOLCPNJOLEMO() {
      return oLCPNJOLEMO_;
    }

    public static final int RUNE_ID_FIELD_NUMBER = 12;
    private int runeId_ = 0;
    /**
     * <code>uint32 rune_id = 12;</code>
     * @return The runeId.
     */
    @java.lang.Override
    public int getRuneId() {
      return runeId_;
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
      if (oLCPNJOLEMO_ != 0) {
        output.writeUInt32(6, oLCPNJOLEMO_);
      }
      if (runeId_ != 0) {
        output.writeUInt32(12, runeId_);
      }
      if (gEENANGPMFL_ != 0) {
        output.writeUInt32(13, gEENANGPMFL_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (oLCPNJOLEMO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, oLCPNJOLEMO_);
      }
      if (runeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, runeId_);
      }
      if (gEENANGPMFL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, gEENANGPMFL_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord other = (emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord) obj;

      if (getGEENANGPMFL()
          != other.getGEENANGPMFL()) return false;
      if (getOLCPNJOLEMO()
          != other.getOLCPNJOLEMO()) return false;
      if (getRuneId()
          != other.getRuneId()) return false;
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
      hash = (37 * hash) + GEENANGPMFL_FIELD_NUMBER;
      hash = (53 * hash) + getGEENANGPMFL();
      hash = (37 * hash) + OLCPNJOLEMO_FIELD_NUMBER;
      hash = (53 * hash) + getOLCPNJOLEMO();
      hash = (37 * hash) + RUNE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRuneId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord prototype) {
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
     * Protobuf type {@code RoguelikeRuneRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeRuneRecord)
        emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.class, emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.newBuilder()
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
        gEENANGPMFL_ = 0;
        oLCPNJOLEMO_ = 0;
        runeId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.internal_static_RoguelikeRuneRecord_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord build() {
        emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord buildPartial() {
        emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord result = new emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gEENANGPMFL_ = gEENANGPMFL_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.oLCPNJOLEMO_ = oLCPNJOLEMO_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.runeId_ = runeId_;
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
        if (other instanceof emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord) {
          return mergeFrom((emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord other) {
        if (other == emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord.getDefaultInstance()) return this;
        if (other.getGEENANGPMFL() != 0) {
          setGEENANGPMFL(other.getGEENANGPMFL());
        }
        if (other.getOLCPNJOLEMO() != 0) {
          setOLCPNJOLEMO(other.getOLCPNJOLEMO());
        }
        if (other.getRuneId() != 0) {
          setRuneId(other.getRuneId());
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
              case 48: {
                oLCPNJOLEMO_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 96: {
                runeId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 104: {
                gEENANGPMFL_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int gEENANGPMFL_ ;
      /**
       * <code>uint32 GEENANGPMFL = 13;</code>
       * @return The gEENANGPMFL.
       */
      @java.lang.Override
      public int getGEENANGPMFL() {
        return gEENANGPMFL_;
      }
      /**
       * <code>uint32 GEENANGPMFL = 13;</code>
       * @param value The gEENANGPMFL to set.
       * @return This builder for chaining.
       */
      public Builder setGEENANGPMFL(int value) {

        gEENANGPMFL_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GEENANGPMFL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGEENANGPMFL() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gEENANGPMFL_ = 0;
        onChanged();
        return this;
      }

      private int oLCPNJOLEMO_ ;
      /**
       * <code>uint32 OLCPNJOLEMO = 6;</code>
       * @return The oLCPNJOLEMO.
       */
      @java.lang.Override
      public int getOLCPNJOLEMO() {
        return oLCPNJOLEMO_;
      }
      /**
       * <code>uint32 OLCPNJOLEMO = 6;</code>
       * @param value The oLCPNJOLEMO to set.
       * @return This builder for chaining.
       */
      public Builder setOLCPNJOLEMO(int value) {

        oLCPNJOLEMO_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OLCPNJOLEMO = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearOLCPNJOLEMO() {
        bitField0_ = (bitField0_ & ~0x00000002);
        oLCPNJOLEMO_ = 0;
        onChanged();
        return this;
      }

      private int runeId_ ;
      /**
       * <code>uint32 rune_id = 12;</code>
       * @return The runeId.
       */
      @java.lang.Override
      public int getRuneId() {
        return runeId_;
      }
      /**
       * <code>uint32 rune_id = 12;</code>
       * @param value The runeId to set.
       * @return This builder for chaining.
       */
      public Builder setRuneId(int value) {

        runeId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 rune_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRuneId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        runeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeRuneRecord)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeRuneRecord)
    private static final emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord();
    }

    public static emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeRuneRecord>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeRuneRecord>() {
      @java.lang.Override
      public RoguelikeRuneRecord parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeRuneRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeRuneRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RoguelikeRuneRecordOuterClass.RoguelikeRuneRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeRuneRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeRuneRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031RoguelikeRuneRecord.proto\"P\n\023Roguelike" +
      "RuneRecord\022\023\n\013GEENANGPMFL\030\r \001(\r\022\023\n\013OLCPN" +
      "JOLEMO\030\006 \001(\r\022\017\n\007rune_id\030\014 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeRuneRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeRuneRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeRuneRecord_descriptor,
        new java.lang.String[] { "GEENANGPMFL", "OLCPNJOLEMO", "RuneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
