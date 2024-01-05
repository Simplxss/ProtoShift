// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarPropNotify.proto

package emu.protoshift.net.oldproto;

public final class AvatarPropNotifyOuterClass {
  private AvatarPropNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarPropNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarPropNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 avatar_guid = 4;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    int getPropMapCount();
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    boolean containsPropMap(
        int key);
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Long>
    getPropMap();
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Long>
    getPropMapMap();
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    long getPropMapOrDefault(
        int key,
        long defaultValue);
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    long getPropMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: KGKHNJBJKOJ
   * </pre>
   *
   * Protobuf type {@code AvatarPropNotify}
   */
  public static final class AvatarPropNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarPropNotify)
      AvatarPropNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarPropNotify.newBuilder() to construct.
    private AvatarPropNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarPropNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarPropNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.class, emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.Builder.class);
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 4;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 4;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int PROP_MAP_FIELD_NUMBER = 8;
    private static final class PropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Long> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Long>newDefaultInstance(
                  emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_PropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.INT64,
                  0L);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Long> propMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
    internalGetPropMap() {
      if (propMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PropMapDefaultEntryHolder.defaultEntry);
      }
      return propMap_;
    }
    public int getPropMapCount() {
      return internalGetPropMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    @java.lang.Override
    public boolean containsPropMap(
        int key) {

      return internalGetPropMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Long> getPropMap() {
      return getPropMapMap();
    }
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Long> getPropMapMap() {
      return internalGetPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    @java.lang.Override
    public long getPropMapOrDefault(
        int key,
        long defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
     */
    @java.lang.Override
    public long getPropMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Long> map =
          internalGetPropMap().getMap();
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(4, avatarGuid_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPropMap(),
          PropMapDefaultEntryHolder.defaultEntry,
          8);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, avatarGuid_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Long> entry
           : internalGetPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
        propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(8, propMap__);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify other = (emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify) obj;

      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (!internalGetPropMap().equals(
          other.internalGetPropMap())) return false;
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
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      if (!internalGetPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPropMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify prototype) {
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
     * Obf: KGKHNJBJKOJ
     * </pre>
     *
     * Protobuf type {@code AvatarPropNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarPropNotify)
        emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetPropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 8:
            return internalGetMutablePropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.class, emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.newBuilder()
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
        avatarGuid_ = 0L;
        internalGetMutablePropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.internal_static_AvatarPropNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify build() {
        emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify buildPartial() {
        emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify result = new emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.propMap_ = internalGetPropMap();
          result.propMap_.makeImmutable();
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
        if (other instanceof emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify other) {
        if (other == emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify.getDefaultInstance()) return this;
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        internalGetMutablePropMap().mergeFrom(
            other.internalGetPropMap());
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
              case 32: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 66: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Long>
                propMap__ = input.readMessage(
                    PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePropMap().getMutableMap().put(
                    propMap__.getKey(), propMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 66
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

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Long> propMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
          internalGetPropMap() {
        if (propMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        return propMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Long>
          internalGetMutablePropMap() {
        if (propMap_ == null) {
          propMap_ = com.google.protobuf.MapField.newMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        if (!propMap_.isMutable()) {
          propMap_ = propMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return propMap_;
      }
      public int getPropMapCount() {
        return internalGetPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      @java.lang.Override
      public boolean containsPropMap(
          int key) {

        return internalGetPropMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getPropMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Long> getPropMap() {
        return getPropMapMap();
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Long> getPropMapMap() {
        return internalGetPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      @java.lang.Override
      public long getPropMapOrDefault(
          int key,
          long defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Long> map =
            internalGetPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      @java.lang.Override
      public long getPropMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Long> map =
            internalGetPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearPropMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutablePropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      public Builder removePropMap(
          int key) {

        internalGetMutablePropMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Long>
          getMutablePropMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutablePropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      public Builder putPropMap(
          int key,
          long value) {


        internalGetMutablePropMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, int64&gt; prop_map = 8;</code>
       */
      public Builder putAllPropMap(
          java.util.Map<java.lang.Integer, java.lang.Long> values) {
        internalGetMutablePropMap().getMutableMap()
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


      // @@protoc_insertion_point(builder_scope:AvatarPropNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarPropNotify)
    private static final emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify();
    }

    public static emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarPropNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarPropNotify>() {
      @java.lang.Override
      public AvatarPropNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarPropNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarPropNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarPropNotifyOuterClass.AvatarPropNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropNotify_PropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropNotify_PropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026AvatarPropNotify.proto\"\211\001\n\020AvatarPropN" +
      "otify\022\023\n\013avatar_guid\030\004 \001(\004\0220\n\010prop_map\030\010" +
      " \003(\0132\036.AvatarPropNotify.PropMapEntry\032.\n\014" +
      "PropMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\003" +
      ":\0028\001B\035\n\033emu.protoshift.net.oldprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropNotify_descriptor,
        new java.lang.String[] { "AvatarGuid", "PropMap", });
    internal_static_AvatarPropNotify_PropMapEntry_descriptor =
      internal_static_AvatarPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarPropNotify_PropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropNotify_PropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
