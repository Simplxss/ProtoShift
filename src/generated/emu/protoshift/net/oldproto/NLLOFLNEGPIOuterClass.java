// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NLLOFLNEGPI.proto

package emu.protoshift.net.oldproto;

public final class NLLOFLNEGPIOuterClass {
  private NLLOFLNEGPIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NLLOFLNEGPIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NLLOFLNEGPI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     * @return Whether the fNBOEJGHJCB field is set.
     */
    boolean hasFNBOEJGHJCB();
    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     * @return The fNBOEJGHJCB.
     */
    emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA getFNBOEJGHJCB();
    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     */
    emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder getFNBOEJGHJCBOrBuilder();

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 26893
   * </pre>
   *
   * Protobuf type {@code NLLOFLNEGPI}
   */
  public static final class NLLOFLNEGPI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NLLOFLNEGPI)
      NLLOFLNEGPIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NLLOFLNEGPI.newBuilder() to construct.
    private NLLOFLNEGPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NLLOFLNEGPI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NLLOFLNEGPI();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.internal_static_NLLOFLNEGPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.internal_static_NLLOFLNEGPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.class, emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.Builder.class);
    }

    private int bitField0_;
    public static final int SCHEDULE_ID_FIELD_NUMBER = 11;
    private int scheduleId_ = 0;
    /**
     * <code>uint32 schedule_id = 11;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int FNBOEJGHJCB_FIELD_NUMBER = 4;
    private emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA fNBOEJGHJCB_;
    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     * @return Whether the fNBOEJGHJCB field is set.
     */
    @java.lang.Override
    public boolean hasFNBOEJGHJCB() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     * @return The fNBOEJGHJCB.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA getFNBOEJGHJCB() {
      return fNBOEJGHJCB_ == null ? emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.getDefaultInstance() : fNBOEJGHJCB_;
    }
    /**
     * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder getFNBOEJGHJCBOrBuilder() {
      return fNBOEJGHJCB_ == null ? emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.getDefaultInstance() : fNBOEJGHJCB_;
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(4, getFNBOEJGHJCB());
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(11, scheduleId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getFNBOEJGHJCB());
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, scheduleId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI other = (emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (hasFNBOEJGHJCB() != other.hasFNBOEJGHJCB()) return false;
      if (hasFNBOEJGHJCB()) {
        if (!getFNBOEJGHJCB()
            .equals(other.getFNBOEJGHJCB())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      if (hasFNBOEJGHJCB()) {
        hash = (37 * hash) + FNBOEJGHJCB_FIELD_NUMBER;
        hash = (53 * hash) + getFNBOEJGHJCB().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI prototype) {
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
     * CmdId: 26893
     * </pre>
     *
     * Protobuf type {@code NLLOFLNEGPI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NLLOFLNEGPI)
        emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.internal_static_NLLOFLNEGPI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.internal_static_NLLOFLNEGPI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.class, emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getFNBOEJGHJCBFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        scheduleId_ = 0;
        fNBOEJGHJCB_ = null;
        if (fNBOEJGHJCBBuilder_ != null) {
          fNBOEJGHJCBBuilder_.dispose();
          fNBOEJGHJCBBuilder_ = null;
        }
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.internal_static_NLLOFLNEGPI_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI build() {
        emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI buildPartial() {
        emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI result = new emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.scheduleId_ = scheduleId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.fNBOEJGHJCB_ = fNBOEJGHJCBBuilder_ == null
              ? fNBOEJGHJCB_
              : fNBOEJGHJCBBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI) {
          return mergeFrom((emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI other) {
        if (other == emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.hasFNBOEJGHJCB()) {
          mergeFNBOEJGHJCB(other.getFNBOEJGHJCB());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
              case 34: {
                input.readMessage(
                    getFNBOEJGHJCBFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 34
              case 88: {
                scheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 120: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
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

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {

        scheduleId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA fNBOEJGHJCB_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.Builder, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder> fNBOEJGHJCBBuilder_;
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       * @return Whether the fNBOEJGHJCB field is set.
       */
      public boolean hasFNBOEJGHJCB() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       * @return The fNBOEJGHJCB.
       */
      public emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA getFNBOEJGHJCB() {
        if (fNBOEJGHJCBBuilder_ == null) {
          return fNBOEJGHJCB_ == null ? emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.getDefaultInstance() : fNBOEJGHJCB_;
        } else {
          return fNBOEJGHJCBBuilder_.getMessage();
        }
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public Builder setFNBOEJGHJCB(emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA value) {
        if (fNBOEJGHJCBBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          fNBOEJGHJCB_ = value;
        } else {
          fNBOEJGHJCBBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public Builder setFNBOEJGHJCB(
          emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.Builder builderForValue) {
        if (fNBOEJGHJCBBuilder_ == null) {
          fNBOEJGHJCB_ = builderForValue.build();
        } else {
          fNBOEJGHJCBBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public Builder mergeFNBOEJGHJCB(emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA value) {
        if (fNBOEJGHJCBBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            fNBOEJGHJCB_ != null &&
            fNBOEJGHJCB_ != emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.getDefaultInstance()) {
            getFNBOEJGHJCBBuilder().mergeFrom(value);
          } else {
            fNBOEJGHJCB_ = value;
          }
        } else {
          fNBOEJGHJCBBuilder_.mergeFrom(value);
        }
        if (fNBOEJGHJCB_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public Builder clearFNBOEJGHJCB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fNBOEJGHJCB_ = null;
        if (fNBOEJGHJCBBuilder_ != null) {
          fNBOEJGHJCBBuilder_.dispose();
          fNBOEJGHJCBBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.Builder getFNBOEJGHJCBBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getFNBOEJGHJCBFieldBuilder().getBuilder();
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      public emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder getFNBOEJGHJCBOrBuilder() {
        if (fNBOEJGHJCBBuilder_ != null) {
          return fNBOEJGHJCBBuilder_.getMessageOrBuilder();
        } else {
          return fNBOEJGHJCB_ == null ?
              emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.getDefaultInstance() : fNBOEJGHJCB_;
        }
      }
      /**
       * <code>.BMPINLMLPGA FNBOEJGHJCB = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.Builder, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder> 
          getFNBOEJGHJCBFieldBuilder() {
        if (fNBOEJGHJCBBuilder_ == null) {
          fNBOEJGHJCBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGA.Builder, emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.BMPINLMLPGAOrBuilder>(
                  getFNBOEJGHJCB(),
                  getParentForChildren(),
                  isClean());
          fNBOEJGHJCB_ = null;
        }
        return fNBOEJGHJCBBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
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


      // @@protoc_insertion_point(builder_scope:NLLOFLNEGPI)
    }

    // @@protoc_insertion_point(class_scope:NLLOFLNEGPI)
    private static final emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI();
    }

    public static emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NLLOFLNEGPI>
        PARSER = new com.google.protobuf.AbstractParser<NLLOFLNEGPI>() {
      @java.lang.Override
      public NLLOFLNEGPI parsePartialFrom(
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

    public static com.google.protobuf.Parser<NLLOFLNEGPI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NLLOFLNEGPI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.NLLOFLNEGPIOuterClass.NLLOFLNEGPI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NLLOFLNEGPI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NLLOFLNEGPI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NLLOFLNEGPI.proto\032\021BMPINLMLPGA.proto\"V" +
      "\n\013NLLOFLNEGPI\022\023\n\013schedule_id\030\013 \001(\r\022!\n\013FN" +
      "BOEJGHJCB\030\004 \001(\0132\014.BMPINLMLPGA\022\017\n\007retcode" +
      "\030\017 \001(\005B\035\n\033emu.protoshift.net.oldprotob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.getDescriptor(),
        });
    internal_static_NLLOFLNEGPI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NLLOFLNEGPI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NLLOFLNEGPI_descriptor,
        new java.lang.String[] { "ScheduleId", "FNBOEJGHJCB", "Retcode", });
    emu.protoshift.net.oldproto.BMPINLMLPGAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
