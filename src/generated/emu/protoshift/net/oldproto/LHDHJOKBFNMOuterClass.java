// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LHDHJOKBFNM.proto

package emu.protoshift.net.oldproto;

public final class LHDHJOKBFNMOuterClass {
  private LHDHJOKBFNMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LHDHJOKBFNMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LHDHJOKBFNM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float OMHOEBJEOFB = 2;</code>
     * @return The oMHOEBJEOFB.
     */
    float getOMHOEBJEOFB();

    /**
     * <code>uint32 LAJGLCIFKCP = 8;</code>
     * @return The lAJGLCIFKCP.
     */
    int getLAJGLCIFKCP();

    /**
     * <code>float FCNFGMADAEH = 13;</code>
     * @return The fCNFGMADAEH.
     */
    float getFCNFGMADAEH();

    /**
     * <code>float duration = 11;</code>
     * @return The duration.
     */
    float getDuration();
  }
  /**
   * Protobuf type {@code LHDHJOKBFNM}
   */
  public static final class LHDHJOKBFNM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LHDHJOKBFNM)
      LHDHJOKBFNMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LHDHJOKBFNM.newBuilder() to construct.
    private LHDHJOKBFNM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LHDHJOKBFNM() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LHDHJOKBFNM();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.class, emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.Builder.class);
    }

    public static final int OMHOEBJEOFB_FIELD_NUMBER = 2;
    private float oMHOEBJEOFB_ = 0F;
    /**
     * <code>float OMHOEBJEOFB = 2;</code>
     * @return The oMHOEBJEOFB.
     */
    @java.lang.Override
    public float getOMHOEBJEOFB() {
      return oMHOEBJEOFB_;
    }

    public static final int LAJGLCIFKCP_FIELD_NUMBER = 8;
    private int lAJGLCIFKCP_ = 0;
    /**
     * <code>uint32 LAJGLCIFKCP = 8;</code>
     * @return The lAJGLCIFKCP.
     */
    @java.lang.Override
    public int getLAJGLCIFKCP() {
      return lAJGLCIFKCP_;
    }

    public static final int FCNFGMADAEH_FIELD_NUMBER = 13;
    private float fCNFGMADAEH_ = 0F;
    /**
     * <code>float FCNFGMADAEH = 13;</code>
     * @return The fCNFGMADAEH.
     */
    @java.lang.Override
    public float getFCNFGMADAEH() {
      return fCNFGMADAEH_;
    }

    public static final int DURATION_FIELD_NUMBER = 11;
    private float duration_ = 0F;
    /**
     * <code>float duration = 11;</code>
     * @return The duration.
     */
    @java.lang.Override
    public float getDuration() {
      return duration_;
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
      if (java.lang.Float.floatToRawIntBits(oMHOEBJEOFB_) != 0) {
        output.writeFloat(2, oMHOEBJEOFB_);
      }
      if (lAJGLCIFKCP_ != 0) {
        output.writeUInt32(8, lAJGLCIFKCP_);
      }
      if (java.lang.Float.floatToRawIntBits(duration_) != 0) {
        output.writeFloat(11, duration_);
      }
      if (java.lang.Float.floatToRawIntBits(fCNFGMADAEH_) != 0) {
        output.writeFloat(13, fCNFGMADAEH_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(oMHOEBJEOFB_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, oMHOEBJEOFB_);
      }
      if (lAJGLCIFKCP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, lAJGLCIFKCP_);
      }
      if (java.lang.Float.floatToRawIntBits(duration_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(11, duration_);
      }
      if (java.lang.Float.floatToRawIntBits(fCNFGMADAEH_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(13, fCNFGMADAEH_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM other = (emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM) obj;

      if (java.lang.Float.floatToIntBits(getOMHOEBJEOFB())
          != java.lang.Float.floatToIntBits(
              other.getOMHOEBJEOFB())) return false;
      if (getLAJGLCIFKCP()
          != other.getLAJGLCIFKCP()) return false;
      if (java.lang.Float.floatToIntBits(getFCNFGMADAEH())
          != java.lang.Float.floatToIntBits(
              other.getFCNFGMADAEH())) return false;
      if (java.lang.Float.floatToIntBits(getDuration())
          != java.lang.Float.floatToIntBits(
              other.getDuration())) return false;
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
      hash = (37 * hash) + OMHOEBJEOFB_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOMHOEBJEOFB());
      hash = (37 * hash) + LAJGLCIFKCP_FIELD_NUMBER;
      hash = (53 * hash) + getLAJGLCIFKCP();
      hash = (37 * hash) + FCNFGMADAEH_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getFCNFGMADAEH());
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getDuration());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM prototype) {
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
     * Protobuf type {@code LHDHJOKBFNM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LHDHJOKBFNM)
        emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.class, emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.newBuilder()
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
        oMHOEBJEOFB_ = 0F;
        lAJGLCIFKCP_ = 0;
        fCNFGMADAEH_ = 0F;
        duration_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.internal_static_LHDHJOKBFNM_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM build() {
        emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM buildPartial() {
        emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM result = new emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.oMHOEBJEOFB_ = oMHOEBJEOFB_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lAJGLCIFKCP_ = lAJGLCIFKCP_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.fCNFGMADAEH_ = fCNFGMADAEH_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.duration_ = duration_;
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
        if (other instanceof emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM) {
          return mergeFrom((emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM other) {
        if (other == emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM.getDefaultInstance()) return this;
        if (other.getOMHOEBJEOFB() != 0F) {
          setOMHOEBJEOFB(other.getOMHOEBJEOFB());
        }
        if (other.getLAJGLCIFKCP() != 0) {
          setLAJGLCIFKCP(other.getLAJGLCIFKCP());
        }
        if (other.getFCNFGMADAEH() != 0F) {
          setFCNFGMADAEH(other.getFCNFGMADAEH());
        }
        if (other.getDuration() != 0F) {
          setDuration(other.getDuration());
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
              case 21: {
                oMHOEBJEOFB_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 21
              case 64: {
                lAJGLCIFKCP_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 93: {
                duration_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 93
              case 109: {
                fCNFGMADAEH_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 109
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

      private float oMHOEBJEOFB_ ;
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @return The oMHOEBJEOFB.
       */
      @java.lang.Override
      public float getOMHOEBJEOFB() {
        return oMHOEBJEOFB_;
      }
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @param value The oMHOEBJEOFB to set.
       * @return This builder for chaining.
       */
      public Builder setOMHOEBJEOFB(float value) {

        oMHOEBJEOFB_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>float OMHOEBJEOFB = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOMHOEBJEOFB() {
        bitField0_ = (bitField0_ & ~0x00000001);
        oMHOEBJEOFB_ = 0F;
        onChanged();
        return this;
      }

      private int lAJGLCIFKCP_ ;
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @return The lAJGLCIFKCP.
       */
      @java.lang.Override
      public int getLAJGLCIFKCP() {
        return lAJGLCIFKCP_;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @param value The lAJGLCIFKCP to set.
       * @return This builder for chaining.
       */
      public Builder setLAJGLCIFKCP(int value) {

        lAJGLCIFKCP_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAJGLCIFKCP() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lAJGLCIFKCP_ = 0;
        onChanged();
        return this;
      }

      private float fCNFGMADAEH_ ;
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @return The fCNFGMADAEH.
       */
      @java.lang.Override
      public float getFCNFGMADAEH() {
        return fCNFGMADAEH_;
      }
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @param value The fCNFGMADAEH to set.
       * @return This builder for chaining.
       */
      public Builder setFCNFGMADAEH(float value) {

        fCNFGMADAEH_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>float FCNFGMADAEH = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearFCNFGMADAEH() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fCNFGMADAEH_ = 0F;
        onChanged();
        return this;
      }

      private float duration_ ;
      /**
       * <code>float duration = 11;</code>
       * @return The duration.
       */
      @java.lang.Override
      public float getDuration() {
        return duration_;
      }
      /**
       * <code>float duration = 11;</code>
       * @param value The duration to set.
       * @return This builder for chaining.
       */
      public Builder setDuration(float value) {

        duration_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>float duration = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDuration() {
        bitField0_ = (bitField0_ & ~0x00000008);
        duration_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:LHDHJOKBFNM)
    }

    // @@protoc_insertion_point(class_scope:LHDHJOKBFNM)
    private static final emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM();
    }

    public static emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LHDHJOKBFNM>
        PARSER = new com.google.protobuf.AbstractParser<LHDHJOKBFNM>() {
      @java.lang.Override
      public LHDHJOKBFNM parsePartialFrom(
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

    public static com.google.protobuf.Parser<LHDHJOKBFNM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LHDHJOKBFNM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.LHDHJOKBFNMOuterClass.LHDHJOKBFNM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LHDHJOKBFNM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LHDHJOKBFNM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LHDHJOKBFNM.proto\"^\n\013LHDHJOKBFNM\022\023\n\013OM" +
      "HOEBJEOFB\030\002 \001(\002\022\023\n\013LAJGLCIFKCP\030\010 \001(\r\022\023\n\013" +
      "FCNFGMADAEH\030\r \001(\002\022\020\n\010duration\030\013 \001(\002B\035\n\033e" +
      "mu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LHDHJOKBFNM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LHDHJOKBFNM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LHDHJOKBFNM_descriptor,
        new java.lang.String[] { "OMHOEBJEOFB", "LAJGLCIFKCP", "FCNFGMADAEH", "Duration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
