// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryFallInfo.proto

package emu.protoshift.net.oldproto;

public final class SceneGalleryFallInfoOuterClass {
  private SceneGalleryFallInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryFallInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryFallInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    int getScenePlayerFallInfoMapCount();
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    boolean containsScenePlayerFallInfoMap(
        int key);
    /**
     * Use {@link #getScenePlayerFallInfoMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
    getScenePlayerFallInfoMap();
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
    getScenePlayerFallInfoMapMap();
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo defaultValue);
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrThrow(
        int key);

    /**
     * <code>uint32 end_time = 7;</code>
     * @return The endTime.
     */
    int getEndTime();
  }
  /**
   * <pre>
   * Obf: IIBDBKMHMBI
   * </pre>
   *
   * Protobuf type {@code SceneGalleryFallInfo}
   */
  public static final class SceneGalleryFallInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryFallInfo)
      SceneGalleryFallInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryFallInfo.newBuilder() to construct.
    private SceneGalleryFallInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryFallInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryFallInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 5:
          return internalGetScenePlayerFallInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.class, emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.Builder.class);
    }

    public static final int SCENE_PLAYER_FALL_INFO_MAP_FIELD_NUMBER = 5;
    private static final class ScenePlayerFallInfoMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>newDefaultInstance(
                  emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> scenePlayerFallInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
    internalGetScenePlayerFallInfoMap() {
      if (scenePlayerFallInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry);
      }
      return scenePlayerFallInfoMap_;
    }
    public int getScenePlayerFallInfoMapCount() {
      return internalGetScenePlayerFallInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    @java.lang.Override
    public boolean containsScenePlayerFallInfoMap(
        int key) {

      return internalGetScenePlayerFallInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getScenePlayerFallInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> getScenePlayerFallInfoMap() {
      return getScenePlayerFallInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> getScenePlayerFallInfoMapMap() {
      return internalGetScenePlayerFallInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo defaultValue) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> map =
          internalGetScenePlayerFallInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> map =
          internalGetScenePlayerFallInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int END_TIME_FIELD_NUMBER = 7;
    private int endTime_ = 0;
    /**
     * <code>uint32 end_time = 7;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
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
          internalGetScenePlayerFallInfoMap(),
          ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry,
          5);
      if (endTime_ != 0) {
        output.writeUInt32(7, endTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> entry
           : internalGetScenePlayerFallInfoMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
        scenePlayerFallInfoMap__ = ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(5, scenePlayerFallInfoMap__);
      }
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, endTime_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo other = (emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo) obj;

      if (!internalGetScenePlayerFallInfoMap().equals(
          other.internalGetScenePlayerFallInfoMap())) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
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
      if (!internalGetScenePlayerFallInfoMap().getMap().isEmpty()) {
        hash = (37 * hash) + SCENE_PLAYER_FALL_INFO_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetScenePlayerFallInfoMap().hashCode();
      }
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo prototype) {
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
     * Obf: IIBDBKMHMBI
     * </pre>
     *
     * Protobuf type {@code SceneGalleryFallInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryFallInfo)
        emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 5:
            return internalGetScenePlayerFallInfoMap();
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
            return internalGetMutableScenePlayerFallInfoMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.class, emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.newBuilder()
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
        internalGetMutableScenePlayerFallInfoMap().clear();
        endTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.internal_static_SceneGalleryFallInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo build() {
        emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo buildPartial() {
        emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo result = new emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.scenePlayerFallInfoMap_ = internalGetScenePlayerFallInfoMap();
          result.scenePlayerFallInfoMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.endTime_ = endTime_;
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
        if (other instanceof emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo other) {
        if (other == emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo.getDefaultInstance()) return this;
        internalGetMutableScenePlayerFallInfoMap().mergeFrom(
            other.internalGetScenePlayerFallInfoMap());
        bitField0_ |= 0x00000001;
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
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
                com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
                scenePlayerFallInfoMap__ = input.readMessage(
                    ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableScenePlayerFallInfoMap().getMutableMap().put(
                    scenePlayerFallInfoMap__.getKey(), scenePlayerFallInfoMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 42
              case 56: {
                endTime_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
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
          java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> scenePlayerFallInfoMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
          internalGetScenePlayerFallInfoMap() {
        if (scenePlayerFallInfoMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry);
        }
        return scenePlayerFallInfoMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
          internalGetMutableScenePlayerFallInfoMap() {
        if (scenePlayerFallInfoMap_ == null) {
          scenePlayerFallInfoMap_ = com.google.protobuf.MapField.newMapField(
              ScenePlayerFallInfoMapDefaultEntryHolder.defaultEntry);
        }
        if (!scenePlayerFallInfoMap_.isMutable()) {
          scenePlayerFallInfoMap_ = scenePlayerFallInfoMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return scenePlayerFallInfoMap_;
      }
      public int getScenePlayerFallInfoMapCount() {
        return internalGetScenePlayerFallInfoMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      @java.lang.Override
      public boolean containsScenePlayerFallInfoMap(
          int key) {

        return internalGetScenePlayerFallInfoMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getScenePlayerFallInfoMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> getScenePlayerFallInfoMap() {
        return getScenePlayerFallInfoMapMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> getScenePlayerFallInfoMapMap() {
        return internalGetScenePlayerFallInfoMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrDefault(
          int key,
          /* nullable */
emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo defaultValue) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> map =
            internalGetScenePlayerFallInfoMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo getScenePlayerFallInfoMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> map =
            internalGetScenePlayerFallInfoMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearScenePlayerFallInfoMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableScenePlayerFallInfoMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      public Builder removeScenePlayerFallInfoMap(
          int key) {

        internalGetMutableScenePlayerFallInfoMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo>
          getMutableScenePlayerFallInfoMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableScenePlayerFallInfoMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      public Builder putScenePlayerFallInfoMap(
          int key,
          emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableScenePlayerFallInfoMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .FallPlayerInfo&gt; scene_player_fall_info_map = 5;</code>
       */
      public Builder putAllScenePlayerFallInfoMap(
          java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.FallPlayerInfo> values) {
        internalGetMutableScenePlayerFallInfoMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 7;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 7;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {

        endTime_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        endTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryFallInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryFallInfo)
    private static final emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo();
    }

    public static emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryFallInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryFallInfo>() {
      @java.lang.Override
      public SceneGalleryFallInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryFallInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryFallInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SceneGalleryFallInfoOuterClass.SceneGalleryFallInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFallInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFallInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneGalleryFallInfo.proto\032\024FallPlayer" +
      "Info.proto\"\317\001\n\024SceneGalleryFallInfo\022U\n\032s" +
      "cene_player_fall_info_map\030\005 \003(\01321.SceneG" +
      "alleryFallInfo.ScenePlayerFallInfoMapEnt" +
      "ry\022\020\n\010end_time\030\007 \001(\r\032N\n\033ScenePlayerFallI" +
      "nfoMapEntry\022\013\n\003key\030\001 \001(\r\022\036\n\005value\030\002 \001(\0132" +
      "\017.FallPlayerInfo:\0028\001B\035\n\033emu.protoshift.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryFallInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryFallInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFallInfo_descriptor,
        new java.lang.String[] { "ScenePlayerFallInfoMap", "EndTime", });
    internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_descriptor =
      internal_static_SceneGalleryFallInfo_descriptor.getNestedTypes().get(0);
    internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryFallInfo_ScenePlayerFallInfoMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.protoshift.net.oldproto.FallPlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
