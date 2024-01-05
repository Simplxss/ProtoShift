// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ONKDBNHDBIP.proto

package emu.protoshift.net.oldproto;

public final class ONKDBNHDBIPOuterClass {
  private ONKDBNHDBIPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ONKDBNHDBIPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ONKDBNHDBIP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    int getLKIIDLFOIACCount();
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    boolean containsLKIIDLFOIAC(
        int key);
    /**
     * Use {@link #getLKIIDLFOIACMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
    getLKIIDLFOIAC();
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
    getLKIIDLFOIACMap();
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ defaultValue);
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 4157
   * </pre>
   *
   * Protobuf type {@code ONKDBNHDBIP}
   */
  public static final class ONKDBNHDBIP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ONKDBNHDBIP)
      ONKDBNHDBIPOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ONKDBNHDBIP.newBuilder() to construct.
    private ONKDBNHDBIP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ONKDBNHDBIP() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ONKDBNHDBIP();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 13:
          return internalGetLKIIDLFOIAC();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.class, emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int LKIIDLFOIAC_FIELD_NUMBER = 13;
    private static final class LKIIDLFOIACDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>newDefaultInstance(
                  emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> lKIIDLFOIAC_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
    internalGetLKIIDLFOIAC() {
      if (lKIIDLFOIAC_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            LKIIDLFOIACDefaultEntryHolder.defaultEntry);
      }
      return lKIIDLFOIAC_;
    }
    public int getLKIIDLFOIACCount() {
      return internalGetLKIIDLFOIAC().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    @java.lang.Override
    public boolean containsLKIIDLFOIAC(
        int key) {

      return internalGetLKIIDLFOIAC().getMap().containsKey(key);
    }
    /**
     * Use {@link #getLKIIDLFOIACMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> getLKIIDLFOIAC() {
      return getLKIIDLFOIACMap();
    }
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> getLKIIDLFOIACMap() {
      return internalGetLKIIDLFOIAC().getMap();
    }
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ defaultValue) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> map =
          internalGetLKIIDLFOIAC().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> map =
          internalGetLKIIDLFOIAC().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetLKIIDLFOIAC(),
          LKIIDLFOIACDefaultEntryHolder.defaultEntry,
          13);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> entry
           : internalGetLKIIDLFOIAC().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
        lKIIDLFOIAC__ = LKIIDLFOIACDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(13, lKIIDLFOIAC__);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP other = (emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetLKIIDLFOIAC().equals(
          other.internalGetLKIIDLFOIAC())) return false;
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
      if (!internalGetLKIIDLFOIAC().getMap().isEmpty()) {
        hash = (37 * hash) + LKIIDLFOIAC_FIELD_NUMBER;
        hash = (53 * hash) + internalGetLKIIDLFOIAC().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP prototype) {
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
     * CmdId: 4157
     * </pre>
     *
     * Protobuf type {@code ONKDBNHDBIP}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ONKDBNHDBIP)
        emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIPOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetLKIIDLFOIAC();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 13:
            return internalGetMutableLKIIDLFOIAC();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.class, emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.newBuilder()
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
        retcode_ = 0;
        internalGetMutableLKIIDLFOIAC().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.internal_static_ONKDBNHDBIP_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP build() {
        emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP buildPartial() {
        emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP result = new emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lKIIDLFOIAC_ = internalGetLKIIDLFOIAC();
          result.lKIIDLFOIAC_.makeImmutable();
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
        if (other instanceof emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP) {
          return mergeFrom((emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP other) {
        if (other == emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableLKIIDLFOIAC().mergeFrom(
            other.internalGetLKIIDLFOIAC());
        bitField0_ |= 0x00000002;
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 106: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
                lKIIDLFOIAC__ = input.readMessage(
                    LKIIDLFOIACDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableLKIIDLFOIAC().getMutableMap().put(
                    lKIIDLFOIAC__.getKey(), lKIIDLFOIAC__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 106
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
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
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
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> lKIIDLFOIAC_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
          internalGetLKIIDLFOIAC() {
        if (lKIIDLFOIAC_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              LKIIDLFOIACDefaultEntryHolder.defaultEntry);
        }
        return lKIIDLFOIAC_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
          internalGetMutableLKIIDLFOIAC() {
        if (lKIIDLFOIAC_ == null) {
          lKIIDLFOIAC_ = com.google.protobuf.MapField.newMapField(
              LKIIDLFOIACDefaultEntryHolder.defaultEntry);
        }
        if (!lKIIDLFOIAC_.isMutable()) {
          lKIIDLFOIAC_ = lKIIDLFOIAC_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return lKIIDLFOIAC_;
      }
      public int getLKIIDLFOIACCount() {
        return internalGetLKIIDLFOIAC().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      @java.lang.Override
      public boolean containsLKIIDLFOIAC(
          int key) {

        return internalGetLKIIDLFOIAC().getMap().containsKey(key);
      }
      /**
       * Use {@link #getLKIIDLFOIACMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> getLKIIDLFOIAC() {
        return getLKIIDLFOIACMap();
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> getLKIIDLFOIACMap() {
        return internalGetLKIIDLFOIAC().getMap();
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrDefault(
          int key,
          /* nullable */
emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ defaultValue) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> map =
            internalGetLKIIDLFOIAC().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ getLKIIDLFOIACOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> map =
            internalGetLKIIDLFOIAC().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearLKIIDLFOIAC() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableLKIIDLFOIAC().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      public Builder removeLKIIDLFOIAC(
          int key) {

        internalGetMutableLKIIDLFOIAC().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ>
          getMutableLKIIDLFOIAC() {
        bitField0_ |= 0x00000002;
        return internalGetMutableLKIIDLFOIAC().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      public Builder putLKIIDLFOIAC(
          int key,
          emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableLKIIDLFOIAC().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, .HAFJIPDBOGJ&gt; LKIIDLFOIAC = 13;</code>
       */
      public Builder putAllLKIIDLFOIAC(
          java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.HAFJIPDBOGJ> values) {
        internalGetMutableLKIIDLFOIAC().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:ONKDBNHDBIP)
    }

    // @@protoc_insertion_point(class_scope:ONKDBNHDBIP)
    private static final emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP();
    }

    public static emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ONKDBNHDBIP>
        PARSER = new com.google.protobuf.AbstractParser<ONKDBNHDBIP>() {
      @java.lang.Override
      public ONKDBNHDBIP parsePartialFrom(
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

    public static com.google.protobuf.Parser<ONKDBNHDBIP> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ONKDBNHDBIP> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ONKDBNHDBIPOuterClass.ONKDBNHDBIP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ONKDBNHDBIP_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ONKDBNHDBIP_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ONKDBNHDBIP.proto\032\021HAFJIPDBOGJ.proto\"\224" +
      "\001\n\013ONKDBNHDBIP\022\017\n\007retcode\030\006 \001(\005\0222\n\013LKIID" +
      "LFOIAC\030\r \003(\0132\035.ONKDBNHDBIP.LKIIDLFOIACEn" +
      "try\032@\n\020LKIIDLFOIACEntry\022\013\n\003key\030\001 \001(\r\022\033\n\005" +
      "value\030\002 \001(\0132\014.HAFJIPDBOGJ:\0028\001B\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.getDescriptor(),
        });
    internal_static_ONKDBNHDBIP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ONKDBNHDBIP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ONKDBNHDBIP_descriptor,
        new java.lang.String[] { "Retcode", "LKIIDLFOIAC", });
    internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_descriptor =
      internal_static_ONKDBNHDBIP_descriptor.getNestedTypes().get(0);
    internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ONKDBNHDBIP_LKIIDLFOIACEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.protoshift.net.oldproto.HAFJIPDBOGJOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
