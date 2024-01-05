// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoActivityDetailInfo.proto

package emu.protoshift.net.oldproto;

public final class SumoActivityDetailInfoOuterClass {
  private SumoActivityDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoActivityDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoActivityDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    int getSumoStageMapCount();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    boolean containsSumoStageMap(
        int key);
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
    getSumoStageMap();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
    getSumoStageMapMap();
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData defaultValue);
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
        int key);

    /**
     * <code>uint32 last_stage_id = 14;</code>
     * @return The lastStageId.
     */
    int getLastStageId();

    /**
     * <code>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * Obf: CNCHFJOILPA
   * </pre>
   *
   * Protobuf type {@code SumoActivityDetailInfo}
   */
  public static final class SumoActivityDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoActivityDetailInfo)
      SumoActivityDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoActivityDetailInfo.newBuilder() to construct.
    private SumoActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoActivityDetailInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoActivityDetailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetSumoStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);
    }

    public static final int SUMO_STAGE_MAP_FIELD_NUMBER = 2;
    private static final class SumoStageMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>newDefaultInstance(
                  emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> sumoStageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
    internalGetSumoStageMap() {
      if (sumoStageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SumoStageMapDefaultEntryHolder.defaultEntry);
      }
      return sumoStageMap_;
    }
    public int getSumoStageMapCount() {
      return internalGetSumoStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.lang.Override
    public boolean containsSumoStageMap(
        int key) {

      return internalGetSumoStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSumoStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> getSumoStageMap() {
      return getSumoStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> getSumoStageMapMap() {
      return internalGetSumoStageMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
        int key,
        /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData defaultValue) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> map =
          internalGetSumoStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> map =
          internalGetSumoStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int LAST_STAGE_ID_FIELD_NUMBER = 14;
    private int lastStageId_ = 0;
    /**
     * <code>uint32 last_stage_id = 14;</code>
     * @return The lastStageId.
     */
    @java.lang.Override
    public int getLastStageId() {
      return lastStageId_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 8;
    private int difficultyId_ = 0;
    /**
     * <code>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
          internalGetSumoStageMap(),
          SumoStageMapDefaultEntryHolder.defaultEntry,
          2);
      if (difficultyId_ != 0) {
        output.writeUInt32(8, difficultyId_);
      }
      if (lastStageId_ != 0) {
        output.writeUInt32(14, lastStageId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> entry
           : internalGetSumoStageMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
        sumoStageMap__ = SumoStageMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, sumoStageMap__);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, difficultyId_);
      }
      if (lastStageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, lastStageId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo other = (emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) obj;

      if (!internalGetSumoStageMap().equals(
          other.internalGetSumoStageMap())) return false;
      if (getLastStageId()
          != other.getLastStageId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      if (!internalGetSumoStageMap().getMap().isEmpty()) {
        hash = (37 * hash) + SUMO_STAGE_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetSumoStageMap().hashCode();
      }
      hash = (37 * hash) + LAST_STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLastStageId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo prototype) {
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
     * Obf: CNCHFJOILPA
     * </pre>
     *
     * Protobuf type {@code SumoActivityDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoActivityDetailInfo)
        emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 2:
            return internalGetSumoStageMap();
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
            return internalGetMutableSumoStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.class, emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.newBuilder()
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
        internalGetMutableSumoStageMap().clear();
        lastStageId_ = 0;
        difficultyId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.internal_static_SumoActivityDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo build() {
        emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo buildPartial() {
        emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result = new emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.sumoStageMap_ = internalGetSumoStageMap();
          result.sumoStageMap_.makeImmutable();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lastStageId_ = lastStageId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo other) {
        if (other == emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo.getDefaultInstance()) return this;
        internalGetMutableSumoStageMap().mergeFrom(
            other.internalGetSumoStageMap());
        bitField0_ |= 0x00000001;
        if (other.getLastStageId() != 0) {
          setLastStageId(other.getLastStageId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
              case 18: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
                sumoStageMap__ = input.readMessage(
                    SumoStageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableSumoStageMap().getMutableMap().put(
                    sumoStageMap__.getKey(), sumoStageMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 64: {
                difficultyId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 112: {
                lastStageId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
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
          java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> sumoStageMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
          internalGetSumoStageMap() {
        if (sumoStageMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              SumoStageMapDefaultEntryHolder.defaultEntry);
        }
        return sumoStageMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
          internalGetMutableSumoStageMap() {
        if (sumoStageMap_ == null) {
          sumoStageMap_ = com.google.protobuf.MapField.newMapField(
              SumoStageMapDefaultEntryHolder.defaultEntry);
        }
        if (!sumoStageMap_.isMutable()) {
          sumoStageMap_ = sumoStageMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return sumoStageMap_;
      }
      public int getSumoStageMapCount() {
        return internalGetSumoStageMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override
      public boolean containsSumoStageMap(
          int key) {

        return internalGetSumoStageMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getSumoStageMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> getSumoStageMap() {
        return getSumoStageMapMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> getSumoStageMapMap() {
        return internalGetSumoStageMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrDefault(
          int key,
          /* nullable */
emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData defaultValue) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> map =
            internalGetSumoStageMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData getSumoStageMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> map =
            internalGetSumoStageMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearSumoStageMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableSumoStageMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      public Builder removeSumoStageMap(
          int key) {

        internalGetMutableSumoStageMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData>
          getMutableSumoStageMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableSumoStageMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      public Builder putSumoStageMap(
          int key,
          emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData value) {

        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableSumoStageMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .SumoStageData&gt; sumo_stage_map = 2;</code>
       */
      public Builder putAllSumoStageMap(
          java.util.Map<java.lang.Integer, emu.protoshift.net.oldproto.SumoStageDataOuterClass.SumoStageData> values) {
        internalGetMutableSumoStageMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
        return this;
      }

      private int lastStageId_ ;
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @return The lastStageId.
       */
      @java.lang.Override
      public int getLastStageId() {
        return lastStageId_;
      }
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @param value The lastStageId to set.
       * @return This builder for chaining.
       */
      public Builder setLastStageId(int value) {

        lastStageId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_stage_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastStageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lastStageId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {

        difficultyId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoActivityDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:SumoActivityDetailInfo)
    private static final emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo();
    }

    public static emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoActivityDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<SumoActivityDetailInfo>() {
      @java.lang.Override
      public SumoActivityDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SumoActivityDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoActivityDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SumoActivityDetailInfoOuterClass.SumoActivityDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoActivityDetailInfo_SumoStageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SumoActivityDetailInfo.proto\032\023SumoStag" +
      "eData.proto\"\316\001\n\026SumoActivityDetailInfo\022A" +
      "\n\016sumo_stage_map\030\002 \003(\0132).SumoActivityDet" +
      "ailInfo.SumoStageMapEntry\022\025\n\rlast_stage_" +
      "id\030\016 \001(\r\022\025\n\rdifficulty_id\030\010 \001(\r\032C\n\021SumoS" +
      "tageMapEntry\022\013\n\003key\030\001 \001(\r\022\035\n\005value\030\002 \001(\013" +
      "2\016.SumoStageData:\0028\001B\035\n\033emu.protoshift.n" +
      "et.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.SumoStageDataOuterClass.getDescriptor(),
        });
    internal_static_SumoActivityDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoActivityDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoActivityDetailInfo_descriptor,
        new java.lang.String[] { "SumoStageMap", "LastStageId", "DifficultyId", });
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor =
      internal_static_SumoActivityDetailInfo_descriptor.getNestedTypes().get(0);
    internal_static_SumoActivityDetailInfo_SumoStageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoActivityDetailInfo_SumoStageMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.protoshift.net.oldproto.SumoStageDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
