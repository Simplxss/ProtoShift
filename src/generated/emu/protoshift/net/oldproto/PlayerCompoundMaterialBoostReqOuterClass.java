// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCompoundMaterialBoostReq.proto

package emu.protoshift.net.oldproto;

public final class PlayerCompoundMaterialBoostReqOuterClass {
  private PlayerCompoundMaterialBoostReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCompoundMaterialBoostReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCompoundMaterialBoostReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 OFGJECHPEPD = 3;</code>
     * @return The oFGJECHPEPD.
     */
    int getOFGJECHPEPD();

    /**
     * <code>bool is_boost_all = 1;</code>
     * @return The isBoostAll.
     */
    boolean getIsBoostAll();

    /**
     * <code>uint32 DDGFJLPEALM = 6;</code>
     * @return The dDGFJLPEALM.
     */
    int getDDGFJLPEALM();

    /**
     * <code>uint32 OJEJLNFJDGG = 14;</code>
     * @return The oJEJLNFJDGG.
     */
    int getOJEJLNFJDGG();
  }
  /**
   * <pre>
   * Obf: HLAOGKCEDGO
   * </pre>
   *
   * Protobuf type {@code PlayerCompoundMaterialBoostReq}
   */
  public static final class PlayerCompoundMaterialBoostReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCompoundMaterialBoostReq)
      PlayerCompoundMaterialBoostReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCompoundMaterialBoostReq.newBuilder() to construct.
    private PlayerCompoundMaterialBoostReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCompoundMaterialBoostReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCompoundMaterialBoostReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.internal_static_PlayerCompoundMaterialBoostReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.internal_static_PlayerCompoundMaterialBoostReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.class, emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.Builder.class);
    }

    public static final int OFGJECHPEPD_FIELD_NUMBER = 3;
    private int oFGJECHPEPD_ = 0;
    /**
     * <code>uint32 OFGJECHPEPD = 3;</code>
     * @return The oFGJECHPEPD.
     */
    @java.lang.Override
    public int getOFGJECHPEPD() {
      return oFGJECHPEPD_;
    }

    public static final int IS_BOOST_ALL_FIELD_NUMBER = 1;
    private boolean isBoostAll_ = false;
    /**
     * <code>bool is_boost_all = 1;</code>
     * @return The isBoostAll.
     */
    @java.lang.Override
    public boolean getIsBoostAll() {
      return isBoostAll_;
    }

    public static final int DDGFJLPEALM_FIELD_NUMBER = 6;
    private int dDGFJLPEALM_ = 0;
    /**
     * <code>uint32 DDGFJLPEALM = 6;</code>
     * @return The dDGFJLPEALM.
     */
    @java.lang.Override
    public int getDDGFJLPEALM() {
      return dDGFJLPEALM_;
    }

    public static final int OJEJLNFJDGG_FIELD_NUMBER = 14;
    private int oJEJLNFJDGG_ = 0;
    /**
     * <code>uint32 OJEJLNFJDGG = 14;</code>
     * @return The oJEJLNFJDGG.
     */
    @java.lang.Override
    public int getOJEJLNFJDGG() {
      return oJEJLNFJDGG_;
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
      if (isBoostAll_ != false) {
        output.writeBool(1, isBoostAll_);
      }
      if (oFGJECHPEPD_ != 0) {
        output.writeUInt32(3, oFGJECHPEPD_);
      }
      if (dDGFJLPEALM_ != 0) {
        output.writeUInt32(6, dDGFJLPEALM_);
      }
      if (oJEJLNFJDGG_ != 0) {
        output.writeUInt32(14, oJEJLNFJDGG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isBoostAll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isBoostAll_);
      }
      if (oFGJECHPEPD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, oFGJECHPEPD_);
      }
      if (dDGFJLPEALM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, dDGFJLPEALM_);
      }
      if (oJEJLNFJDGG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, oJEJLNFJDGG_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq other = (emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq) obj;

      if (getOFGJECHPEPD()
          != other.getOFGJECHPEPD()) return false;
      if (getIsBoostAll()
          != other.getIsBoostAll()) return false;
      if (getDDGFJLPEALM()
          != other.getDDGFJLPEALM()) return false;
      if (getOJEJLNFJDGG()
          != other.getOJEJLNFJDGG()) return false;
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
      hash = (37 * hash) + OFGJECHPEPD_FIELD_NUMBER;
      hash = (53 * hash) + getOFGJECHPEPD();
      hash = (37 * hash) + IS_BOOST_ALL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsBoostAll());
      hash = (37 * hash) + DDGFJLPEALM_FIELD_NUMBER;
      hash = (53 * hash) + getDDGFJLPEALM();
      hash = (37 * hash) + OJEJLNFJDGG_FIELD_NUMBER;
      hash = (53 * hash) + getOJEJLNFJDGG();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq prototype) {
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
     * Obf: HLAOGKCEDGO
     * </pre>
     *
     * Protobuf type {@code PlayerCompoundMaterialBoostReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCompoundMaterialBoostReq)
        emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.internal_static_PlayerCompoundMaterialBoostReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.internal_static_PlayerCompoundMaterialBoostReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.class, emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.newBuilder()
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
        oFGJECHPEPD_ = 0;
        isBoostAll_ = false;
        dDGFJLPEALM_ = 0;
        oJEJLNFJDGG_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.internal_static_PlayerCompoundMaterialBoostReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq build() {
        emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq buildPartial() {
        emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq result = new emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.oFGJECHPEPD_ = oFGJECHPEPD_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isBoostAll_ = isBoostAll_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.dDGFJLPEALM_ = dDGFJLPEALM_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.oJEJLNFJDGG_ = oJEJLNFJDGG_;
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
        if (other instanceof emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq) {
          return mergeFrom((emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq other) {
        if (other == emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq.getDefaultInstance()) return this;
        if (other.getOFGJECHPEPD() != 0) {
          setOFGJECHPEPD(other.getOFGJECHPEPD());
        }
        if (other.getIsBoostAll() != false) {
          setIsBoostAll(other.getIsBoostAll());
        }
        if (other.getDDGFJLPEALM() != 0) {
          setDDGFJLPEALM(other.getDDGFJLPEALM());
        }
        if (other.getOJEJLNFJDGG() != 0) {
          setOJEJLNFJDGG(other.getOJEJLNFJDGG());
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
              case 8: {
                isBoostAll_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 24: {
                oFGJECHPEPD_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 48: {
                dDGFJLPEALM_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 112: {
                oJEJLNFJDGG_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 112
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

      private int oFGJECHPEPD_ ;
      /**
       * <code>uint32 OFGJECHPEPD = 3;</code>
       * @return The oFGJECHPEPD.
       */
      @java.lang.Override
      public int getOFGJECHPEPD() {
        return oFGJECHPEPD_;
      }
      /**
       * <code>uint32 OFGJECHPEPD = 3;</code>
       * @param value The oFGJECHPEPD to set.
       * @return This builder for chaining.
       */
      public Builder setOFGJECHPEPD(int value) {

        oFGJECHPEPD_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OFGJECHPEPD = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearOFGJECHPEPD() {
        bitField0_ = (bitField0_ & ~0x00000001);
        oFGJECHPEPD_ = 0;
        onChanged();
        return this;
      }

      private boolean isBoostAll_ ;
      /**
       * <code>bool is_boost_all = 1;</code>
       * @return The isBoostAll.
       */
      @java.lang.Override
      public boolean getIsBoostAll() {
        return isBoostAll_;
      }
      /**
       * <code>bool is_boost_all = 1;</code>
       * @param value The isBoostAll to set.
       * @return This builder for chaining.
       */
      public Builder setIsBoostAll(boolean value) {

        isBoostAll_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_boost_all = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsBoostAll() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isBoostAll_ = false;
        onChanged();
        return this;
      }

      private int dDGFJLPEALM_ ;
      /**
       * <code>uint32 DDGFJLPEALM = 6;</code>
       * @return The dDGFJLPEALM.
       */
      @java.lang.Override
      public int getDDGFJLPEALM() {
        return dDGFJLPEALM_;
      }
      /**
       * <code>uint32 DDGFJLPEALM = 6;</code>
       * @param value The dDGFJLPEALM to set.
       * @return This builder for chaining.
       */
      public Builder setDDGFJLPEALM(int value) {

        dDGFJLPEALM_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DDGFJLPEALM = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearDDGFJLPEALM() {
        bitField0_ = (bitField0_ & ~0x00000004);
        dDGFJLPEALM_ = 0;
        onChanged();
        return this;
      }

      private int oJEJLNFJDGG_ ;
      /**
       * <code>uint32 OJEJLNFJDGG = 14;</code>
       * @return The oJEJLNFJDGG.
       */
      @java.lang.Override
      public int getOJEJLNFJDGG() {
        return oJEJLNFJDGG_;
      }
      /**
       * <code>uint32 OJEJLNFJDGG = 14;</code>
       * @param value The oJEJLNFJDGG to set.
       * @return This builder for chaining.
       */
      public Builder setOJEJLNFJDGG(int value) {

        oJEJLNFJDGG_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OJEJLNFJDGG = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOJEJLNFJDGG() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oJEJLNFJDGG_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCompoundMaterialBoostReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCompoundMaterialBoostReq)
    private static final emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq();
    }

    public static emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCompoundMaterialBoostReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCompoundMaterialBoostReq>() {
      @java.lang.Override
      public PlayerCompoundMaterialBoostReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCompoundMaterialBoostReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCompoundMaterialBoostReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PlayerCompoundMaterialBoostReqOuterClass.PlayerCompoundMaterialBoostReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCompoundMaterialBoostReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCompoundMaterialBoostReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$PlayerCompoundMaterialBoostReq.proto\"u" +
      "\n\036PlayerCompoundMaterialBoostReq\022\023\n\013OFGJ" +
      "ECHPEPD\030\003 \001(\r\022\024\n\014is_boost_all\030\001 \001(\010\022\023\n\013D" +
      "DGFJLPEALM\030\006 \001(\r\022\023\n\013OJEJLNFJDGG\030\016 \001(\rB\035\n" +
      "\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerCompoundMaterialBoostReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCompoundMaterialBoostReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCompoundMaterialBoostReq_descriptor,
        new java.lang.String[] { "OFGJECHPEPD", "IsBoostAll", "DDGFJLPEALM", "OJEJLNFJDGG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
