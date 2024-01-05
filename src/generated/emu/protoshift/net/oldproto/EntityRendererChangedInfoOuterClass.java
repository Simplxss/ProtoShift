// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityRendererChangedInfo.proto

package emu.protoshift.net.oldproto;

public final class EntityRendererChangedInfoOuterClass {
  private EntityRendererChangedInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityRendererChangedInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityRendererChangedInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    int getChangedRenderersCount();
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    boolean containsChangedRenderers(
        java.lang.String key);
    /**
     * Use {@link #getChangedRenderersMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Integer>
    getChangedRenderers();
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    java.util.Map<java.lang.String, java.lang.Integer>
    getChangedRenderersMap();
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    int getChangedRenderersOrDefault(
        java.lang.String key,
        int defaultValue);
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    int getChangedRenderersOrThrow(
        java.lang.String key);

    /**
     * <code>uint32 visibility_count = 2;</code>
     * @return The visibilityCount.
     */
    int getVisibilityCount();

    /**
     * <code>bool is_cached = 3;</code>
     * @return The isCached.
     */
    boolean getIsCached();
  }
  /**
   * Protobuf type {@code EntityRendererChangedInfo}
   */
  public static final class EntityRendererChangedInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityRendererChangedInfo)
      EntityRendererChangedInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityRendererChangedInfo.newBuilder() to construct.
    private EntityRendererChangedInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityRendererChangedInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityRendererChangedInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetChangedRenderers();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.class, emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder.class);
    }

    public static final int CHANGED_RENDERERS_FIELD_NUMBER = 1;
    private static final class ChangedRenderersDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.String, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.String, java.lang.Integer>newDefaultInstance(
                  emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.STRING,
                  "",
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> changedRenderers_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetChangedRenderers() {
      if (changedRenderers_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ChangedRenderersDefaultEntryHolder.defaultEntry);
      }
      return changedRenderers_;
    }
    public int getChangedRenderersCount() {
      return internalGetChangedRenderers().getMap().size();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override
    public boolean containsChangedRenderers(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetChangedRenderers().getMap().containsKey(key);
    }
    /**
     * Use {@link #getChangedRenderersMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderers() {
      return getChangedRenderersMap();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderersMap() {
      return internalGetChangedRenderers().getMap();
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override
    public int getChangedRenderersOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetChangedRenderers().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
     */
    @java.lang.Override
    public int getChangedRenderersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetChangedRenderers().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int VISIBILITY_COUNT_FIELD_NUMBER = 2;
    private int visibilityCount_ = 0;
    /**
     * <code>uint32 visibility_count = 2;</code>
     * @return The visibilityCount.
     */
    @java.lang.Override
    public int getVisibilityCount() {
      return visibilityCount_;
    }

    public static final int IS_CACHED_FIELD_NUMBER = 3;
    private boolean isCached_ = false;
    /**
     * <code>bool is_cached = 3;</code>
     * @return The isCached.
     */
    @java.lang.Override
    public boolean getIsCached() {
      return isCached_;
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
        .serializeStringMapTo(
          output,
          internalGetChangedRenderers(),
          ChangedRenderersDefaultEntryHolder.defaultEntry,
          1);
      if (visibilityCount_ != 0) {
        output.writeUInt32(2, visibilityCount_);
      }
      if (isCached_ != false) {
        output.writeBool(3, isCached_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
           : internalGetChangedRenderers().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
        changedRenderers__ = ChangedRenderersDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, changedRenderers__);
      }
      if (visibilityCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, visibilityCount_);
      }
      if (isCached_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isCached_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo other = (emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo) obj;

      if (!internalGetChangedRenderers().equals(
          other.internalGetChangedRenderers())) return false;
      if (getVisibilityCount()
          != other.getVisibilityCount()) return false;
      if (getIsCached()
          != other.getIsCached()) return false;
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
      if (!internalGetChangedRenderers().getMap().isEmpty()) {
        hash = (37 * hash) + CHANGED_RENDERERS_FIELD_NUMBER;
        hash = (53 * hash) + internalGetChangedRenderers().hashCode();
      }
      hash = (37 * hash) + VISIBILITY_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getVisibilityCount();
      hash = (37 * hash) + IS_CACHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCached());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo prototype) {
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
     * Protobuf type {@code EntityRendererChangedInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityRendererChangedInfo)
        emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetChangedRenderers();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 1:
            return internalGetMutableChangedRenderers();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.class, emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder()
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
        internalGetMutableChangedRenderers().clear();
        visibilityCount_ = 0;
        isCached_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.internal_static_EntityRendererChangedInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo build() {
        emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo buildPartial() {
        emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo result = new emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.changedRenderers_ = internalGetChangedRenderers();
          result.changedRenderers_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.visibilityCount_ = visibilityCount_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isCached_ = isCached_;
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
        if (other instanceof emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo other) {
        if (other == emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance()) return this;
        internalGetMutableChangedRenderers().mergeFrom(
            other.internalGetChangedRenderers());
        bitField0_ |= 0x00000001;
        if (other.getVisibilityCount() != 0) {
          setVisibilityCount(other.getVisibilityCount());
        }
        if (other.getIsCached() != false) {
          setIsCached(other.getIsCached());
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
              case 10: {
                com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
                changedRenderers__ = input.readMessage(
                    ChangedRenderersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableChangedRenderers().getMutableMap().put(
                    changedRenderers__.getKey(), changedRenderers__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                visibilityCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                isCached_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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
          java.lang.String, java.lang.Integer> changedRenderers_;
      private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
          internalGetChangedRenderers() {
        if (changedRenderers_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ChangedRenderersDefaultEntryHolder.defaultEntry);
        }
        return changedRenderers_;
      }
      private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
          internalGetMutableChangedRenderers() {
        if (changedRenderers_ == null) {
          changedRenderers_ = com.google.protobuf.MapField.newMapField(
              ChangedRenderersDefaultEntryHolder.defaultEntry);
        }
        if (!changedRenderers_.isMutable()) {
          changedRenderers_ = changedRenderers_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return changedRenderers_;
      }
      public int getChangedRenderersCount() {
        return internalGetChangedRenderers().getMap().size();
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      @java.lang.Override
      public boolean containsChangedRenderers(
          java.lang.String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        return internalGetChangedRenderers().getMap().containsKey(key);
      }
      /**
       * Use {@link #getChangedRenderersMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderers() {
        return getChangedRenderersMap();
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.String, java.lang.Integer> getChangedRenderersMap() {
        return internalGetChangedRenderers().getMap();
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      @java.lang.Override
      public int getChangedRenderersOrDefault(
          java.lang.String key,
          int defaultValue) {
        if (key == null) { throw new NullPointerException("map key"); }
        java.util.Map<java.lang.String, java.lang.Integer> map =
            internalGetChangedRenderers().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      @java.lang.Override
      public int getChangedRenderersOrThrow(
          java.lang.String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        java.util.Map<java.lang.String, java.lang.Integer> map =
            internalGetChangedRenderers().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearChangedRenderers() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableChangedRenderers().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      public Builder removeChangedRenderers(
          java.lang.String key) {
        if (key == null) { throw new NullPointerException("map key"); }
        internalGetMutableChangedRenderers().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.String, java.lang.Integer>
          getMutableChangedRenderers() {
        bitField0_ |= 0x00000001;
        return internalGetMutableChangedRenderers().getMutableMap();
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      public Builder putChangedRenderers(
          java.lang.String key,
          int value) {
        if (key == null) { throw new NullPointerException("map key"); }

        internalGetMutableChangedRenderers().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;string, uint32&gt; changed_renderers = 1;</code>
       */
      public Builder putAllChangedRenderers(
          java.util.Map<java.lang.String, java.lang.Integer> values) {
        internalGetMutableChangedRenderers().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private int visibilityCount_ ;
      /**
       * <code>uint32 visibility_count = 2;</code>
       * @return The visibilityCount.
       */
      @java.lang.Override
      public int getVisibilityCount() {
        return visibilityCount_;
      }
      /**
       * <code>uint32 visibility_count = 2;</code>
       * @param value The visibilityCount to set.
       * @return This builder for chaining.
       */
      public Builder setVisibilityCount(int value) {

        visibilityCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 visibility_count = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVisibilityCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        visibilityCount_ = 0;
        onChanged();
        return this;
      }

      private boolean isCached_ ;
      /**
       * <code>bool is_cached = 3;</code>
       * @return The isCached.
       */
      @java.lang.Override
      public boolean getIsCached() {
        return isCached_;
      }
      /**
       * <code>bool is_cached = 3;</code>
       * @param value The isCached to set.
       * @return This builder for chaining.
       */
      public Builder setIsCached(boolean value) {

        isCached_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_cached = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCached() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isCached_ = false;
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


      // @@protoc_insertion_point(builder_scope:EntityRendererChangedInfo)
    }

    // @@protoc_insertion_point(class_scope:EntityRendererChangedInfo)
    private static final emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo();
    }

    public static emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityRendererChangedInfo>
        PARSER = new com.google.protobuf.AbstractParser<EntityRendererChangedInfo>() {
      @java.lang.Override
      public EntityRendererChangedInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EntityRendererChangedInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityRendererChangedInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityRendererChangedInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityRendererChangedInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037EntityRendererChangedInfo.proto\"\316\001\n\031En" +
      "tityRendererChangedInfo\022K\n\021changed_rende" +
      "rers\030\001 \003(\01320.EntityRendererChangedInfo.C" +
      "hangedRenderersEntry\022\030\n\020visibility_count" +
      "\030\002 \001(\r\022\021\n\tis_cached\030\003 \001(\010\0327\n\025ChangedRend" +
      "erersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\r:\002" +
      "8\001B\035\n\033emu.protoshift.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EntityRendererChangedInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityRendererChangedInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityRendererChangedInfo_descriptor,
        new java.lang.String[] { "ChangedRenderers", "VisibilityCount", "IsCached", });
    internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor =
      internal_static_EntityRendererChangedInfo_descriptor.getNestedTypes().get(0);
    internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityRendererChangedInfo_ChangedRenderersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
