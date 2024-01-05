// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetReportReq.proto

package emu.protoshift.net.oldproto;

public final class WidgetReportReqOuterClass {
  private WidgetReportReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetReportReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetReportReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool IENCBHNGNDM = 2;</code>
     * @return The iENCBHNGNDM.
     */
    boolean getIENCBHNGNDM();

    /**
     * <code>uint32 material_id = 11;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>uint32 weather_wizard_shield_value = 14;</code>
     * @return The weatherWizardShieldValue.
     */
    int getWeatherWizardShieldValue();

    /**
     * <code>bool NEIOFMCDAKD = 3;</code>
     * @return The nEIOFMCDAKD.
     */
    boolean getNEIOFMCDAKD();

    /**
     * <code>bool KPAMJCLNJIF = 5;</code>
     * @return The kPAMJCLNJIF.
     */
    boolean getKPAMJCLNJIF();
  }
  /**
   * <pre>
   * Obf: HLEILGAJMPD
   * </pre>
   *
   * Protobuf type {@code WidgetReportReq}
   */
  public static final class WidgetReportReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetReportReq)
      WidgetReportReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetReportReq.newBuilder() to construct.
    private WidgetReportReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetReportReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetReportReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
    }

    public static final int IENCBHNGNDM_FIELD_NUMBER = 2;
    private boolean iENCBHNGNDM_ = false;
    /**
     * <code>bool IENCBHNGNDM = 2;</code>
     * @return The iENCBHNGNDM.
     */
    @java.lang.Override
    public boolean getIENCBHNGNDM() {
      return iENCBHNGNDM_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 11;
    private int materialId_ = 0;
    /**
     * <code>uint32 material_id = 11;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER = 14;
    private int weatherWizardShieldValue_ = 0;
    /**
     * <code>uint32 weather_wizard_shield_value = 14;</code>
     * @return The weatherWizardShieldValue.
     */
    @java.lang.Override
    public int getWeatherWizardShieldValue() {
      return weatherWizardShieldValue_;
    }

    public static final int NEIOFMCDAKD_FIELD_NUMBER = 3;
    private boolean nEIOFMCDAKD_ = false;
    /**
     * <code>bool NEIOFMCDAKD = 3;</code>
     * @return The nEIOFMCDAKD.
     */
    @java.lang.Override
    public boolean getNEIOFMCDAKD() {
      return nEIOFMCDAKD_;
    }

    public static final int KPAMJCLNJIF_FIELD_NUMBER = 5;
    private boolean kPAMJCLNJIF_ = false;
    /**
     * <code>bool KPAMJCLNJIF = 5;</code>
     * @return The kPAMJCLNJIF.
     */
    @java.lang.Override
    public boolean getKPAMJCLNJIF() {
      return kPAMJCLNJIF_;
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
      if (iENCBHNGNDM_ != false) {
        output.writeBool(2, iENCBHNGNDM_);
      }
      if (nEIOFMCDAKD_ != false) {
        output.writeBool(3, nEIOFMCDAKD_);
      }
      if (kPAMJCLNJIF_ != false) {
        output.writeBool(5, kPAMJCLNJIF_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(11, materialId_);
      }
      if (weatherWizardShieldValue_ != 0) {
        output.writeUInt32(14, weatherWizardShieldValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iENCBHNGNDM_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, iENCBHNGNDM_);
      }
      if (nEIOFMCDAKD_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, nEIOFMCDAKD_);
      }
      if (kPAMJCLNJIF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, kPAMJCLNJIF_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, materialId_);
      }
      if (weatherWizardShieldValue_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, weatherWizardShieldValue_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq other = (emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq) obj;

      if (getIENCBHNGNDM()
          != other.getIENCBHNGNDM()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getWeatherWizardShieldValue()
          != other.getWeatherWizardShieldValue()) return false;
      if (getNEIOFMCDAKD()
          != other.getNEIOFMCDAKD()) return false;
      if (getKPAMJCLNJIF()
          != other.getKPAMJCLNJIF()) return false;
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
      hash = (37 * hash) + IENCBHNGNDM_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIENCBHNGNDM());
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + WEATHER_WIZARD_SHIELD_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getWeatherWizardShieldValue();
      hash = (37 * hash) + NEIOFMCDAKD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getNEIOFMCDAKD());
      hash = (37 * hash) + KPAMJCLNJIF_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKPAMJCLNJIF());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq prototype) {
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
     * Obf: HLEILGAJMPD
     * </pre>
     *
     * Protobuf type {@code WidgetReportReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetReportReq)
        emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.class, emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.newBuilder()
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
        iENCBHNGNDM_ = false;
        materialId_ = 0;
        weatherWizardShieldValue_ = 0;
        nEIOFMCDAKD_ = false;
        kPAMJCLNJIF_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.internal_static_WidgetReportReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq build() {
        emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq buildPartial() {
        emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq result = new emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.iENCBHNGNDM_ = iENCBHNGNDM_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.materialId_ = materialId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.weatherWizardShieldValue_ = weatherWizardShieldValue_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.nEIOFMCDAKD_ = nEIOFMCDAKD_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.kPAMJCLNJIF_ = kPAMJCLNJIF_;
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
        if (other instanceof emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq) {
          return mergeFrom((emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq other) {
        if (other == emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq.getDefaultInstance()) return this;
        if (other.getIENCBHNGNDM() != false) {
          setIENCBHNGNDM(other.getIENCBHNGNDM());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getWeatherWizardShieldValue() != 0) {
          setWeatherWizardShieldValue(other.getWeatherWizardShieldValue());
        }
        if (other.getNEIOFMCDAKD() != false) {
          setNEIOFMCDAKD(other.getNEIOFMCDAKD());
        }
        if (other.getKPAMJCLNJIF() != false) {
          setKPAMJCLNJIF(other.getKPAMJCLNJIF());
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
              case 16: {
                iENCBHNGNDM_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 24: {
                nEIOFMCDAKD_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 24
              case 40: {
                kPAMJCLNJIF_ = input.readBool();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              case 88: {
                materialId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 88
              case 112: {
                weatherWizardShieldValue_ = input.readUInt32();
                bitField0_ |= 0x00000004;
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

      private boolean iENCBHNGNDM_ ;
      /**
       * <code>bool IENCBHNGNDM = 2;</code>
       * @return The iENCBHNGNDM.
       */
      @java.lang.Override
      public boolean getIENCBHNGNDM() {
        return iENCBHNGNDM_;
      }
      /**
       * <code>bool IENCBHNGNDM = 2;</code>
       * @param value The iENCBHNGNDM to set.
       * @return This builder for chaining.
       */
      public Builder setIENCBHNGNDM(boolean value) {

        iENCBHNGNDM_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool IENCBHNGNDM = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIENCBHNGNDM() {
        bitField0_ = (bitField0_ & ~0x00000001);
        iENCBHNGNDM_ = false;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 11;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 11;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {

        materialId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        materialId_ = 0;
        onChanged();
        return this;
      }

      private int weatherWizardShieldValue_ ;
      /**
       * <code>uint32 weather_wizard_shield_value = 14;</code>
       * @return The weatherWizardShieldValue.
       */
      @java.lang.Override
      public int getWeatherWizardShieldValue() {
        return weatherWizardShieldValue_;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 14;</code>
       * @param value The weatherWizardShieldValue to set.
       * @return This builder for chaining.
       */
      public Builder setWeatherWizardShieldValue(int value) {

        weatherWizardShieldValue_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 weather_wizard_shield_value = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearWeatherWizardShieldValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        weatherWizardShieldValue_ = 0;
        onChanged();
        return this;
      }

      private boolean nEIOFMCDAKD_ ;
      /**
       * <code>bool NEIOFMCDAKD = 3;</code>
       * @return The nEIOFMCDAKD.
       */
      @java.lang.Override
      public boolean getNEIOFMCDAKD() {
        return nEIOFMCDAKD_;
      }
      /**
       * <code>bool NEIOFMCDAKD = 3;</code>
       * @param value The nEIOFMCDAKD to set.
       * @return This builder for chaining.
       */
      public Builder setNEIOFMCDAKD(boolean value) {

        nEIOFMCDAKD_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool NEIOFMCDAKD = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNEIOFMCDAKD() {
        bitField0_ = (bitField0_ & ~0x00000008);
        nEIOFMCDAKD_ = false;
        onChanged();
        return this;
      }

      private boolean kPAMJCLNJIF_ ;
      /**
       * <code>bool KPAMJCLNJIF = 5;</code>
       * @return The kPAMJCLNJIF.
       */
      @java.lang.Override
      public boolean getKPAMJCLNJIF() {
        return kPAMJCLNJIF_;
      }
      /**
       * <code>bool KPAMJCLNJIF = 5;</code>
       * @param value The kPAMJCLNJIF to set.
       * @return This builder for chaining.
       */
      public Builder setKPAMJCLNJIF(boolean value) {

        kPAMJCLNJIF_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>bool KPAMJCLNJIF = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearKPAMJCLNJIF() {
        bitField0_ = (bitField0_ & ~0x00000010);
        kPAMJCLNJIF_ = false;
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


      // @@protoc_insertion_point(builder_scope:WidgetReportReq)
    }

    // @@protoc_insertion_point(class_scope:WidgetReportReq)
    private static final emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq();
    }

    public static emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetReportReq>
        PARSER = new com.google.protobuf.AbstractParser<WidgetReportReq>() {
      @java.lang.Override
      public WidgetReportReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetReportReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetReportReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WidgetReportReqOuterClass.WidgetReportReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetReportReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetReportReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025WidgetReportReq.proto\"\212\001\n\017WidgetReport" +
      "Req\022\023\n\013IENCBHNGNDM\030\002 \001(\010\022\023\n\013material_id\030" +
      "\013 \001(\r\022#\n\033weather_wizard_shield_value\030\016 \001" +
      "(\r\022\023\n\013NEIOFMCDAKD\030\003 \001(\010\022\023\n\013KPAMJCLNJIF\030\005" +
      " \001(\010B\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetReportReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetReportReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetReportReq_descriptor,
        new java.lang.String[] { "IENCBHNGNDM", "MaterialId", "WeatherWizardShieldValue", "NEIOFMCDAKD", "KPAMJCLNJIF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
