// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KJOMKAIDNLB.proto

package emu.protoshift.net.oldproto;

public final class KJOMKAIDNLBOuterClass {
  private KJOMKAIDNLBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KJOMKAIDNLBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KJOMKAIDNLB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     * @return Whether the oHMODGBNODK field is set.
     */
    boolean hasOHMODGBNODK();
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     * @return The oHMODGBNODK.
     */
    emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK();
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     */
    emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder();

    /**
     * <code>.FDGOOBGNJMP enter_type = 13;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    int getEnterTypeValue();
    /**
     * <code>.FDGOOBGNJMP enter_type = 13;</code>
     * @return The enterType.
     */
    emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType();
  }
  /**
   * <pre>
   * CmdId: 25518
   * </pre>
   *
   * Protobuf type {@code KJOMKAIDNLB}
   */
  public static final class KJOMKAIDNLB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KJOMKAIDNLB)
      KJOMKAIDNLBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KJOMKAIDNLB.newBuilder() to construct.
    private KJOMKAIDNLB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KJOMKAIDNLB() {
      enterType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KJOMKAIDNLB();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.internal_static_KJOMKAIDNLB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.internal_static_KJOMKAIDNLB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.class, emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.Builder.class);
    }

    private int bitField0_;
    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OHMODGBNODK_FIELD_NUMBER = 8;
    private emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP oHMODGBNODK_;
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     * @return Whether the oHMODGBNODK field is set.
     */
    @java.lang.Override
    public boolean hasOHMODGBNODK() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     * @return The oHMODGBNODK.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK() {
      return oHMODGBNODK_ == null ? emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
    }
    /**
     * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder() {
      return oHMODGBNODK_ == null ? emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
    }

    public static final int ENTER_TYPE_FIELD_NUMBER = 13;
    private int enterType_ = 0;
    /**
     * <code>.FDGOOBGNJMP enter_type = 13;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    @java.lang.Override public int getEnterTypeValue() {
      return enterType_;
    }
    /**
     * <code>.FDGOOBGNJMP enter_type = 13;</code>
     * @return The enterType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType() {
      emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP result = emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.forNumber(enterType_);
      return result == null ? emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.UNRECOGNIZED : result;
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
        output.writeMessage(8, getOHMODGBNODK());
      }
      if (retcode_ != 0) {
        output.writeInt32(12, retcode_);
      }
      if (enterType_ != emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.FDGOOBGNJMP_EnterUgcDungeonNone.getNumber()) {
        output.writeEnum(13, enterType_);
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
          .computeMessageSize(8, getOHMODGBNODK());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      if (enterType_ != emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.FDGOOBGNJMP_EnterUgcDungeonNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, enterType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB other = (emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasOHMODGBNODK() != other.hasOHMODGBNODK()) return false;
      if (hasOHMODGBNODK()) {
        if (!getOHMODGBNODK()
            .equals(other.getOHMODGBNODK())) return false;
      }
      if (enterType_ != other.enterType_) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasOHMODGBNODK()) {
        hash = (37 * hash) + OHMODGBNODK_FIELD_NUMBER;
        hash = (53 * hash) + getOHMODGBNODK().hashCode();
      }
      hash = (37 * hash) + ENTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + enterType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB prototype) {
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
     * CmdId: 25518
     * </pre>
     *
     * Protobuf type {@code KJOMKAIDNLB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KJOMKAIDNLB)
        emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.internal_static_KJOMKAIDNLB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.internal_static_KJOMKAIDNLB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.class, emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.newBuilder()
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
          getOHMODGBNODKFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        retcode_ = 0;
        oHMODGBNODK_ = null;
        if (oHMODGBNODKBuilder_ != null) {
          oHMODGBNODKBuilder_.dispose();
          oHMODGBNODKBuilder_ = null;
        }
        enterType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.internal_static_KJOMKAIDNLB_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB build() {
        emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB buildPartial() {
        emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB result = new emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.oHMODGBNODK_ = oHMODGBNODKBuilder_ == null
              ? oHMODGBNODK_
              : oHMODGBNODKBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.enterType_ = enterType_;
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
        if (other instanceof emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB) {
          return mergeFrom((emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB other) {
        if (other == emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasOHMODGBNODK()) {
          mergeOHMODGBNODK(other.getOHMODGBNODK());
        }
        if (other.enterType_ != 0) {
          setEnterTypeValue(other.getEnterTypeValue());
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
              case 66: {
                input.readMessage(
                    getOHMODGBNODKFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 66
              case 96: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
              case 104: {
                enterType_ = input.readEnum();
                bitField0_ |= 0x00000004;
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP oHMODGBNODK_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder> oHMODGBNODKBuilder_;
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       * @return Whether the oHMODGBNODK field is set.
       */
      public boolean hasOHMODGBNODK() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       * @return The oHMODGBNODK.
       */
      public emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP getOHMODGBNODK() {
        if (oHMODGBNODKBuilder_ == null) {
          return oHMODGBNODK_ == null ? emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
        } else {
          return oHMODGBNODKBuilder_.getMessage();
        }
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public Builder setOHMODGBNODK(emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP value) {
        if (oHMODGBNODKBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          oHMODGBNODK_ = value;
        } else {
          oHMODGBNODKBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public Builder setOHMODGBNODK(
          emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder builderForValue) {
        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODK_ = builderForValue.build();
        } else {
          oHMODGBNODKBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public Builder mergeOHMODGBNODK(emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP value) {
        if (oHMODGBNODKBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            oHMODGBNODK_ != null &&
            oHMODGBNODK_ != emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance()) {
            getOHMODGBNODKBuilder().mergeFrom(value);
          } else {
            oHMODGBNODK_ = value;
          }
        } else {
          oHMODGBNODKBuilder_.mergeFrom(value);
        }
        if (oHMODGBNODK_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public Builder clearOHMODGBNODK() {
        bitField0_ = (bitField0_ & ~0x00000002);
        oHMODGBNODK_ = null;
        if (oHMODGBNODKBuilder_ != null) {
          oHMODGBNODKBuilder_.dispose();
          oHMODGBNODKBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder getOHMODGBNODKBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getOHMODGBNODKFieldBuilder().getBuilder();
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      public emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder getOHMODGBNODKOrBuilder() {
        if (oHMODGBNODKBuilder_ != null) {
          return oHMODGBNODKBuilder_.getMessageOrBuilder();
        } else {
          return oHMODGBNODK_ == null ?
              emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.getDefaultInstance() : oHMODGBNODK_;
        }
      }
      /**
       * <code>.IONAPMPJOBP OHMODGBNODK = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder> 
          getOHMODGBNODKFieldBuilder() {
        if (oHMODGBNODKBuilder_ == null) {
          oHMODGBNODKBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBP.Builder, emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.IONAPMPJOBPOrBuilder>(
                  getOHMODGBNODK(),
                  getParentForChildren(),
                  isClean());
          oHMODGBNODK_ = null;
        }
        return oHMODGBNODKBuilder_;
      }

      private int enterType_ = 0;
      /**
       * <code>.FDGOOBGNJMP enter_type = 13;</code>
       * @return The enum numeric value on the wire for enterType.
       */
      @java.lang.Override public int getEnterTypeValue() {
        return enterType_;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 13;</code>
       * @param value The enum numeric value on the wire for enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterTypeValue(int value) {
        enterType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 13;</code>
       * @return The enterType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP getEnterType() {
        emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP result = emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.forNumber(enterType_);
        return result == null ? emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP.UNRECOGNIZED : result;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 13;</code>
       * @param value The enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterType(emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.FDGOOBGNJMP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        enterType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.FDGOOBGNJMP enter_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        enterType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:KJOMKAIDNLB)
    }

    // @@protoc_insertion_point(class_scope:KJOMKAIDNLB)
    private static final emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB();
    }

    public static emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KJOMKAIDNLB>
        PARSER = new com.google.protobuf.AbstractParser<KJOMKAIDNLB>() {
      @java.lang.Override
      public KJOMKAIDNLB parsePartialFrom(
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

    public static com.google.protobuf.Parser<KJOMKAIDNLB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KJOMKAIDNLB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.KJOMKAIDNLBOuterClass.KJOMKAIDNLB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KJOMKAIDNLB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KJOMKAIDNLB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KJOMKAIDNLB.proto\032\021IONAPMPJOBP.proto\032\021" +
      "FDGOOBGNJMP.proto\"c\n\013KJOMKAIDNLB\022\017\n\007retc" +
      "ode\030\014 \001(\005\022!\n\013OHMODGBNODK\030\010 \001(\0132\014.IONAPMP" +
      "JOBP\022 \n\nenter_type\030\r \001(\0162\014.FDGOOBGNJMPB\035" +
      "\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.getDescriptor(),
        });
    internal_static_KJOMKAIDNLB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KJOMKAIDNLB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KJOMKAIDNLB_descriptor,
        new java.lang.String[] { "Retcode", "OHMODGBNODK", "EnterType", });
    emu.protoshift.net.oldproto.IONAPMPJOBPOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.FDGOOBGNJMPOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
