// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FOOGHEMFBHL.proto

package emu.protoshift.net.oldproto;

public final class FOOGHEMFBHLOuterClass {
  private FOOGHEMFBHLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FOOGHEMFBHLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FOOGHEMFBHL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    int getPropMapCount();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    boolean containsPropMap(
        int key);
    /**
     * Use {@link #getPropMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
    getPropMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
    getPropMapMap();
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue defaultValue);
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * CmdId: 2569
   * </pre>
   *
   * Protobuf type {@code FOOGHEMFBHL}
   */
  public static final class FOOGHEMFBHL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FOOGHEMFBHL)
      FOOGHEMFBHLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FOOGHEMFBHL.newBuilder() to construct.
    private FOOGHEMFBHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FOOGHEMFBHL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FOOGHEMFBHL();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetPropMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.class, emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.Builder.class);
    }

    public static final int PROP_MAP_FIELD_NUMBER = 2;
    private static final class PropMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>newDefaultInstance(
                  emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_PropMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.protoshift.net.oldproto.PropValueOuterClass.PropValue.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> propMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
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
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
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
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> getPropMap() {
      return getPropMapMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> getPropMapMap() {
      return internalGetPropMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue defaultValue) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> map =
          internalGetPropMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> map =
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetPropMap(),
          PropMapDefaultEntryHolder.defaultEntry,
          2);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> entry
           : internalGetPropMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
        propMap__ = PropMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, propMap__);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL other = (emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL) obj;

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
      if (!internalGetPropMap().getMap().isEmpty()) {
        hash = (37 * hash) + PROP_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetPropMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL prototype) {
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
     * CmdId: 2569
     * </pre>
     *
     * Protobuf type {@code FOOGHEMFBHL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FOOGHEMFBHL)
        emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
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
          case 2:
            return internalGetMutablePropMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.class, emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.newBuilder()
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
        internalGetMutablePropMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.internal_static_FOOGHEMFBHL_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL build() {
        emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL buildPartial() {
        emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL result = new emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL) {
          return mergeFrom((emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL other) {
        if (other == emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL.getDefaultInstance()) return this;
        internalGetMutablePropMap().mergeFrom(
            other.internalGetPropMap());
        bitField0_ |= 0x00000001;
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
              case 18: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
                propMap__ = input.readMessage(
                    PropMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutablePropMap().getMutableMap().put(
                    propMap__.getKey(), propMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 18
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
          java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> propMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
          internalGetPropMap() {
        if (propMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        return propMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
          internalGetMutablePropMap() {
        if (propMap_ == null) {
          propMap_ = com.google.protobuf.MapField.newMapField(
              PropMapDefaultEntryHolder.defaultEntry);
        }
        if (!propMap_.isMutable()) {
          propMap_ = propMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return propMap_;
      }
      public int getPropMapCount() {
        return internalGetPropMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
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
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> getPropMap() {
        return getPropMapMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> getPropMapMap() {
        return internalGetPropMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrDefault(
          int key,
          /* nullable */
emu.protoshift.net.oldproto.PropValueOuterClass.PropValue defaultValue) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.PropValueOuterClass.PropValue getPropMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> map =
            internalGetPropMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearPropMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutablePropMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
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
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue>
          getMutablePropMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutablePropMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
       */
      public Builder putPropMap(
          int key,
          emu.protoshift.net.oldproto.PropValueOuterClass.PropValue value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutablePropMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .PropValue&gt; prop_map = 2;</code>
       */
      public Builder putAllPropMap(
          java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.PropValueOuterClass.PropValue> values) {
        internalGetMutablePropMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:FOOGHEMFBHL)
    }

    // @@protoc_insertion_point(class_scope:FOOGHEMFBHL)
    private static final emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL();
    }

    public static emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FOOGHEMFBHL>
        PARSER = new com.google.protobuf.AbstractParser<FOOGHEMFBHL>() {
      @java.lang.Override
      public FOOGHEMFBHL parsePartialFrom(
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

    public static com.google.protobuf.Parser<FOOGHEMFBHL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FOOGHEMFBHL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FOOGHEMFBHLOuterClass.FOOGHEMFBHL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FOOGHEMFBHL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FOOGHEMFBHL_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FOOGHEMFBHL_PropMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FOOGHEMFBHL_PropMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FOOGHEMFBHL.proto\032\017PropValue.proto\"v\n\013" +
      "FOOGHEMFBHL\022+\n\010prop_map\030\002 \003(\0132\031.FOOGHEMF" +
      "BHL.PropMapEntry\032:\n\014PropMapEntry\022\013\n\003key\030" +
      "\001 \001(\r\022\031\n\005value\030\002 \001(\0132\n.PropValue:\0028\001B\035\n\033" +
      "emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.PropValueOuterClass.getDescriptor(),
        });
    internal_static_FOOGHEMFBHL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FOOGHEMFBHL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FOOGHEMFBHL_descriptor,
        new java.lang.String[] { "PropMap", });
    internal_static_FOOGHEMFBHL_PropMapEntry_descriptor =
      internal_static_FOOGHEMFBHL_descriptor.getNestedTypes().get(0);
    internal_static_FOOGHEMFBHL_PropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FOOGHEMFBHL_PropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.protoshift.net.oldproto.PropValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
