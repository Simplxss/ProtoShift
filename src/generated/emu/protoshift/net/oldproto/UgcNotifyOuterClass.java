// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UgcNotify.proto

package emu.protoshift.net.oldproto;

public final class UgcNotifyOuterClass {
  private UgcNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UgcNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UgcNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool GKJAPKJDBPN = 8;</code>
     * @return The gKJAPKJDBPN.
     */
    boolean getGKJAPKJDBPN();

    /**
     * <code>bool POPHCJEGGJG = 3;</code>
     * @return The pOPHCJEGGJG.
     */
    boolean getPOPHCJEGGJG();

    /**
     * <code>bool IOPFGIPIHAG = 2;</code>
     * @return The iOPFGIPIHAG.
     */
    boolean getIOPFGIPIHAG();

    /**
     * <code>bool KOJNKEAKAFK = 10;</code>
     * @return The kOJNKEAKAFK.
     */
    boolean getKOJNKEAKAFK();
  }
  /**
   * <pre>
   * Obf: BNKNLILOIHN
   * </pre>
   *
   * Protobuf type {@code UgcNotify}
   */
  public static final class UgcNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UgcNotify)
      UgcNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UgcNotify.newBuilder() to construct.
    private UgcNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UgcNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UgcNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.UgcNotifyOuterClass.internal_static_UgcNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.class, emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.Builder.class);
    }

    public static final int GKJAPKJDBPN_FIELD_NUMBER = 8;
    private boolean gKJAPKJDBPN_ = false;
    /**
     * <code>bool GKJAPKJDBPN = 8;</code>
     * @return The gKJAPKJDBPN.
     */
    @java.lang.Override
    public boolean getGKJAPKJDBPN() {
      return gKJAPKJDBPN_;
    }

    public static final int POPHCJEGGJG_FIELD_NUMBER = 3;
    private boolean pOPHCJEGGJG_ = false;
    /**
     * <code>bool POPHCJEGGJG = 3;</code>
     * @return The pOPHCJEGGJG.
     */
    @java.lang.Override
    public boolean getPOPHCJEGGJG() {
      return pOPHCJEGGJG_;
    }

    public static final int IOPFGIPIHAG_FIELD_NUMBER = 2;
    private boolean iOPFGIPIHAG_ = false;
    /**
     * <code>bool IOPFGIPIHAG = 2;</code>
     * @return The iOPFGIPIHAG.
     */
    @java.lang.Override
    public boolean getIOPFGIPIHAG() {
      return iOPFGIPIHAG_;
    }

    public static final int KOJNKEAKAFK_FIELD_NUMBER = 10;
    private boolean kOJNKEAKAFK_ = false;
    /**
     * <code>bool KOJNKEAKAFK = 10;</code>
     * @return The kOJNKEAKAFK.
     */
    @java.lang.Override
    public boolean getKOJNKEAKAFK() {
      return kOJNKEAKAFK_;
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
      if (iOPFGIPIHAG_ != false) {
        output.writeBool(2, iOPFGIPIHAG_);
      }
      if (pOPHCJEGGJG_ != false) {
        output.writeBool(3, pOPHCJEGGJG_);
      }
      if (gKJAPKJDBPN_ != false) {
        output.writeBool(8, gKJAPKJDBPN_);
      }
      if (kOJNKEAKAFK_ != false) {
        output.writeBool(10, kOJNKEAKAFK_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iOPFGIPIHAG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, iOPFGIPIHAG_);
      }
      if (pOPHCJEGGJG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, pOPHCJEGGJG_);
      }
      if (gKJAPKJDBPN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, gKJAPKJDBPN_);
      }
      if (kOJNKEAKAFK_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, kOJNKEAKAFK_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify other = (emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify) obj;

      if (getGKJAPKJDBPN()
          != other.getGKJAPKJDBPN()) return false;
      if (getPOPHCJEGGJG()
          != other.getPOPHCJEGGJG()) return false;
      if (getIOPFGIPIHAG()
          != other.getIOPFGIPIHAG()) return false;
      if (getKOJNKEAKAFK()
          != other.getKOJNKEAKAFK()) return false;
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
      hash = (37 * hash) + GKJAPKJDBPN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGKJAPKJDBPN());
      hash = (37 * hash) + POPHCJEGGJG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getPOPHCJEGGJG());
      hash = (37 * hash) + IOPFGIPIHAG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIOPFGIPIHAG());
      hash = (37 * hash) + KOJNKEAKAFK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKOJNKEAKAFK());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify prototype) {
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
     * Obf: BNKNLILOIHN
     * </pre>
     *
     * Protobuf type {@code UgcNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UgcNotify)
        emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.UgcNotifyOuterClass.internal_static_UgcNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.class, emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.newBuilder()
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
        gKJAPKJDBPN_ = false;
        pOPHCJEGGJG_ = false;
        iOPFGIPIHAG_ = false;
        kOJNKEAKAFK_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.UgcNotifyOuterClass.internal_static_UgcNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify build() {
        emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify buildPartial() {
        emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify result = new emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.gKJAPKJDBPN_ = gKJAPKJDBPN_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pOPHCJEGGJG_ = pOPHCJEGGJG_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.iOPFGIPIHAG_ = iOPFGIPIHAG_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.kOJNKEAKAFK_ = kOJNKEAKAFK_;
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
        if (other instanceof emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify other) {
        if (other == emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify.getDefaultInstance()) return this;
        if (other.getGKJAPKJDBPN() != false) {
          setGKJAPKJDBPN(other.getGKJAPKJDBPN());
        }
        if (other.getPOPHCJEGGJG() != false) {
          setPOPHCJEGGJG(other.getPOPHCJEGGJG());
        }
        if (other.getIOPFGIPIHAG() != false) {
          setIOPFGIPIHAG(other.getIOPFGIPIHAG());
        }
        if (other.getKOJNKEAKAFK() != false) {
          setKOJNKEAKAFK(other.getKOJNKEAKAFK());
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
                iOPFGIPIHAG_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 24: {
                pOPHCJEGGJG_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 64: {
                gKJAPKJDBPN_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 80: {
                kOJNKEAKAFK_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
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

      private boolean gKJAPKJDBPN_ ;
      /**
       * <code>bool GKJAPKJDBPN = 8;</code>
       * @return The gKJAPKJDBPN.
       */
      @java.lang.Override
      public boolean getGKJAPKJDBPN() {
        return gKJAPKJDBPN_;
      }
      /**
       * <code>bool GKJAPKJDBPN = 8;</code>
       * @param value The gKJAPKJDBPN to set.
       * @return This builder for chaining.
       */
      public Builder setGKJAPKJDBPN(boolean value) {

        gKJAPKJDBPN_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool GKJAPKJDBPN = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGKJAPKJDBPN() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gKJAPKJDBPN_ = false;
        onChanged();
        return this;
      }

      private boolean pOPHCJEGGJG_ ;
      /**
       * <code>bool POPHCJEGGJG = 3;</code>
       * @return The pOPHCJEGGJG.
       */
      @java.lang.Override
      public boolean getPOPHCJEGGJG() {
        return pOPHCJEGGJG_;
      }
      /**
       * <code>bool POPHCJEGGJG = 3;</code>
       * @param value The pOPHCJEGGJG to set.
       * @return This builder for chaining.
       */
      public Builder setPOPHCJEGGJG(boolean value) {

        pOPHCJEGGJG_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool POPHCJEGGJG = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPOPHCJEGGJG() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pOPHCJEGGJG_ = false;
        onChanged();
        return this;
      }

      private boolean iOPFGIPIHAG_ ;
      /**
       * <code>bool IOPFGIPIHAG = 2;</code>
       * @return The iOPFGIPIHAG.
       */
      @java.lang.Override
      public boolean getIOPFGIPIHAG() {
        return iOPFGIPIHAG_;
      }
      /**
       * <code>bool IOPFGIPIHAG = 2;</code>
       * @param value The iOPFGIPIHAG to set.
       * @return This builder for chaining.
       */
      public Builder setIOPFGIPIHAG(boolean value) {

        iOPFGIPIHAG_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool IOPFGIPIHAG = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIOPFGIPIHAG() {
        bitField0_ = (bitField0_ & ~0x00000004);
        iOPFGIPIHAG_ = false;
        onChanged();
        return this;
      }

      private boolean kOJNKEAKAFK_ ;
      /**
       * <code>bool KOJNKEAKAFK = 10;</code>
       * @return The kOJNKEAKAFK.
       */
      @java.lang.Override
      public boolean getKOJNKEAKAFK() {
        return kOJNKEAKAFK_;
      }
      /**
       * <code>bool KOJNKEAKAFK = 10;</code>
       * @param value The kOJNKEAKAFK to set.
       * @return This builder for chaining.
       */
      public Builder setKOJNKEAKAFK(boolean value) {

        kOJNKEAKAFK_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>bool KOJNKEAKAFK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearKOJNKEAKAFK() {
        bitField0_ = (bitField0_ & ~0x00000008);
        kOJNKEAKAFK_ = false;
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


      // @@protoc_insertion_point(builder_scope:UgcNotify)
    }

    // @@protoc_insertion_point(class_scope:UgcNotify)
    private static final emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify();
    }

    public static emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UgcNotify>
        PARSER = new com.google.protobuf.AbstractParser<UgcNotify>() {
      @java.lang.Override
      public UgcNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<UgcNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UgcNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.UgcNotifyOuterClass.UgcNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UgcNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UgcNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017UgcNotify.proto\"_\n\tUgcNotify\022\023\n\013GKJAPK" +
      "JDBPN\030\010 \001(\010\022\023\n\013POPHCJEGGJG\030\003 \001(\010\022\023\n\013IOPF" +
      "GIPIHAG\030\002 \001(\010\022\023\n\013KOJNKEAKAFK\030\n \001(\010B\035\n\033em" +
      "u.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UgcNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UgcNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UgcNotify_descriptor,
        new java.lang.String[] { "GKJAPKJDBPN", "POPHCJEGGJG", "IOPFGIPIHAG", "KOJNKEAKAFK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
