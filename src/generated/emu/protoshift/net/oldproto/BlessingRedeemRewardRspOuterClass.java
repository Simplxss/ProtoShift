// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingRedeemRewardRsp.proto

package emu.protoshift.net.oldproto;

public final class BlessingRedeemRewardRspOuterClass {
  private BlessingRedeemRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingRedeemRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingRedeemRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    int getPicNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    boolean containsPicNumMap(
        int key);
    /**
     * Use {@link #getPicNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPicNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getPicNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    int getPicNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    int getPicNumMapOrThrow(
        int key);

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: DBAKMINAGNC
   * </pre>
   *
   * Protobuf type {@code BlessingRedeemRewardRsp}
   */
  public static final class BlessingRedeemRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingRedeemRewardRsp)
      BlessingRedeemRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingRedeemRewardRsp.newBuilder() to construct.
    private BlessingRedeemRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingRedeemRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingRedeemRewardRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetPicNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.class, emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.Builder.class);
    }

    public static final int PIC_NUM_MAP_FIELD_NUMBER = 5;
    private static final class PicNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> picNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetPicNumMap() {
      if (picNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PicNumMapDefaultEntryHolder.defaultEntry);
      }
      return picNumMap_;
    }
    public int getPicNumMapCount() {
      return internalGetPicNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    @java.lang.Override
    public boolean containsPicNumMap(
        int key) {

      return internalGetPicNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPicNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPicNumMap() {
      return getPicNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getPicNumMapMap() {
      return internalGetPicNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    @java.lang.Override
    public int getPicNumMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPicNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
     */
    @java.lang.Override
    public int getPicNumMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetPicNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPicNumMap(),
          PicNumMapDefaultEntryHolder.defaultEntry,
          5);
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetPicNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        picNumMap__ = PicNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(5, picNumMap__);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp other = (emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp) obj;

      if (!internalGetPicNumMap().equals(
          other.internalGetPicNumMap())) return false;
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
      if (!internalGetPicNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + PIC_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPicNumMap().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp prototype) {
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
     * Obf: DBAKMINAGNC
     * </pre>
     *
     * Protobuf type {@code BlessingRedeemRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingRedeemRewardRsp)
        emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetPicNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetMutablePicNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.class, emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.newBuilder()
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
        internalGetMutablePicNumMap().clear();
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.internal_static_BlessingRedeemRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp build() {
        emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp buildPartial() {
        emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp result = new emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.picNumMap_ = internalGetPicNumMap();
          result.picNumMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
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
        if (other instanceof emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp other) {
        if (other == emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp.getDefaultInstance()) return this;
        internalGetMutablePicNumMap().mergeFrom(
            other.internalGetPicNumMap());
        bitField0_ |= 0x00000001;
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
              case 42: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                picNumMap__ = input.readMessage(
                    PicNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePicNumMap().getMutableMap().put(
                    picNumMap__.getKey(), picNumMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 42
              case 48: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
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

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> picNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetPicNumMap() {
        if (picNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PicNumMapDefaultEntryHolder.defaultEntry);
        }
        return picNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutablePicNumMap() {
        if (picNumMap_ == null) {
          picNumMap_ = com.google.protobuf.MapField.newMapField(
              PicNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!picNumMap_.isMutable()) {
          picNumMap_ = picNumMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return picNumMap_;
      }
      public int getPicNumMapCount() {
        return internalGetPicNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      @java.lang.Override
      public boolean containsPicNumMap(
          int key) {

        return internalGetPicNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPicNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPicNumMap() {
        return getPicNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getPicNumMapMap() {
        return internalGetPicNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      @java.lang.Override
      public int getPicNumMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPicNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      @java.lang.Override
      public int getPicNumMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetPicNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearPicNumMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutablePicNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      public Builder removePicNumMap(
          int key) {

        internalGetMutablePicNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutablePicNumMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutablePicNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      public Builder putPicNumMap(
          int key,
          int value) {


        internalGetMutablePicNumMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; pic_num_map = 5;</code>
       */
      public Builder putAllPicNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutablePicNumMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

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
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:BlessingRedeemRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingRedeemRewardRsp)
    private static final emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp();
    }

    public static emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingRedeemRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingRedeemRewardRsp>() {
      @java.lang.Override
      public BlessingRedeemRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<BlessingRedeemRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingRedeemRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.BlessingRedeemRewardRspOuterClass.BlessingRedeemRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingRedeemRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingRedeemRewardRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035BlessingRedeemRewardRsp.proto\"\232\001\n\027Bles" +
      "singRedeemRewardRsp\022<\n\013pic_num_map\030\005 \003(\013" +
      "2\'.BlessingRedeemRewardRsp.PicNumMapEntr" +
      "y\022\017\n\007retcode\030\006 \001(\005\0320\n\016PicNumMapEntry\022\013\n\003" +
      "key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\035\n\033emu.prot" +
      "oshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlessingRedeemRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingRedeemRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingRedeemRewardRsp_descriptor,
        new java.lang.String[] { "PicNumMap", "Retcode", });
    internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_descriptor =
      internal_static_BlessingRedeemRewardRsp_descriptor.getNestedTypes().get(0);
    internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingRedeemRewardRsp_PicNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
