// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGalleryIslandPartySailInfo.proto

package emu.protoshift.net.oldproto;

public final class SceneGalleryIslandPartySailInfoOuterClass {
  private SceneGalleryIslandPartySailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGalleryIslandPartySailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGalleryIslandPartySailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 coin = 1;</code>
     * @return The coin.
     */
    int getCoin();

    /**
     * <code>uint32 CGEHJNCLFIH = 7;</code>
     * @return The cGEHJNCLFIH.
     */
    int getCGEHJNCLFIH();

    /**
     * <code>uint32 GHJGNKKLNED = 11;</code>
     * @return The gHJGNKKLNED.
     */
    int getGHJGNKKLNED();

    /**
     * <code>.GalleryStartSource start_source = 13;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 13;</code>
     * @return The startSource.
     */
    emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>uint32 KAGPALOPJHK = 10;</code>
     * @return The kAGPALOPJHK.
     */
    int getKAGPALOPJHK();

    /**
     * <code>uint32 FIBKEJGKANH = 4;</code>
     * @return The fIBKEJGKANH.
     */
    int getFIBKEJGKANH();

    /**
     * <code>.IslandPartySailStage stage = 6;</code>
     * @return The enum numeric value on the wire for stage.
     */
    int getStageValue();
    /**
     * <code>.IslandPartySailStage stage = 6;</code>
     * @return The stage.
     */
    emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage();
  }
  /**
   * <pre>
   * Obf: GBGEALIJHNE
   * </pre>
   *
   * Protobuf type {@code SceneGalleryIslandPartySailInfo}
   */
  public static final class SceneGalleryIslandPartySailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGalleryIslandPartySailInfo)
      SceneGalleryIslandPartySailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGalleryIslandPartySailInfo.newBuilder() to construct.
    private SceneGalleryIslandPartySailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGalleryIslandPartySailInfo() {
      startSource_ = 0;
      stage_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGalleryIslandPartySailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.class, emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.Builder.class);
    }

    public static final int COIN_FIELD_NUMBER = 1;
    private int coin_ = 0;
    /**
     * <code>uint32 coin = 1;</code>
     * @return The coin.
     */
    @java.lang.Override
    public int getCoin() {
      return coin_;
    }

    public static final int CGEHJNCLFIH_FIELD_NUMBER = 7;
    private int cGEHJNCLFIH_ = 0;
    /**
     * <code>uint32 CGEHJNCLFIH = 7;</code>
     * @return The cGEHJNCLFIH.
     */
    @java.lang.Override
    public int getCGEHJNCLFIH() {
      return cGEHJNCLFIH_;
    }

    public static final int GHJGNKKLNED_FIELD_NUMBER = 11;
    private int gHJGNKKLNED_ = 0;
    /**
     * <code>uint32 GHJGNKKLNED = 11;</code>
     * @return The gHJGNKKLNED.
     */
    @java.lang.Override
    public int getGHJGNKKLNED() {
      return gHJGNKKLNED_;
    }

    public static final int START_SOURCE_FIELD_NUMBER = 13;
    private int startSource_ = 0;
    /**
     * <code>.GalleryStartSource start_source = 13;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 13;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.forNumber(startSource_);
      return result == null ? emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int KAGPALOPJHK_FIELD_NUMBER = 10;
    private int kAGPALOPJHK_ = 0;
    /**
     * <code>uint32 KAGPALOPJHK = 10;</code>
     * @return The kAGPALOPJHK.
     */
    @java.lang.Override
    public int getKAGPALOPJHK() {
      return kAGPALOPJHK_;
    }

    public static final int FIBKEJGKANH_FIELD_NUMBER = 4;
    private int fIBKEJGKANH_ = 0;
    /**
     * <code>uint32 FIBKEJGKANH = 4;</code>
     * @return The fIBKEJGKANH.
     */
    @java.lang.Override
    public int getFIBKEJGKANH() {
      return fIBKEJGKANH_;
    }

    public static final int STAGE_FIELD_NUMBER = 6;
    private int stage_ = 0;
    /**
     * <code>.IslandPartySailStage stage = 6;</code>
     * @return The enum numeric value on the wire for stage.
     */
    @java.lang.Override public int getStageValue() {
      return stage_;
    }
    /**
     * <code>.IslandPartySailStage stage = 6;</code>
     * @return The stage.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
      emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.forNumber(stage_);
      return result == null ? emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
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
      if (coin_ != 0) {
        output.writeUInt32(1, coin_);
      }
      if (fIBKEJGKANH_ != 0) {
        output.writeUInt32(4, fIBKEJGKANH_);
      }
      if (stage_ != emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        output.writeEnum(6, stage_);
      }
      if (cGEHJNCLFIH_ != 0) {
        output.writeUInt32(7, cGEHJNCLFIH_);
      }
      if (kAGPALOPJHK_ != 0) {
        output.writeUInt32(10, kAGPALOPJHK_);
      }
      if (gHJGNKKLNED_ != 0) {
        output.writeUInt32(11, gHJGNKKLNED_);
      }
      if (startSource_ != emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        output.writeEnum(13, startSource_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (coin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, coin_);
      }
      if (fIBKEJGKANH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, fIBKEJGKANH_);
      }
      if (stage_ != emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.ISLAND_PARTY_SAIL_STAGE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, stage_);
      }
      if (cGEHJNCLFIH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cGEHJNCLFIH_);
      }
      if (kAGPALOPJHK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, kAGPALOPJHK_);
      }
      if (gHJGNKKLNED_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, gHJGNKKLNED_);
      }
      if (startSource_ != emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, startSource_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo other = (emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo) obj;

      if (getCoin()
          != other.getCoin()) return false;
      if (getCGEHJNCLFIH()
          != other.getCGEHJNCLFIH()) return false;
      if (getGHJGNKKLNED()
          != other.getGHJGNKKLNED()) return false;
      if (startSource_ != other.startSource_) return false;
      if (getKAGPALOPJHK()
          != other.getKAGPALOPJHK()) return false;
      if (getFIBKEJGKANH()
          != other.getFIBKEJGKANH()) return false;
      if (stage_ != other.stage_) return false;
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
      hash = (37 * hash) + COIN_FIELD_NUMBER;
      hash = (53 * hash) + getCoin();
      hash = (37 * hash) + CGEHJNCLFIH_FIELD_NUMBER;
      hash = (53 * hash) + getCGEHJNCLFIH();
      hash = (37 * hash) + GHJGNKKLNED_FIELD_NUMBER;
      hash = (53 * hash) + getGHJGNKKLNED();
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + KAGPALOPJHK_FIELD_NUMBER;
      hash = (53 * hash) + getKAGPALOPJHK();
      hash = (37 * hash) + FIBKEJGKANH_FIELD_NUMBER;
      hash = (53 * hash) + getFIBKEJGKANH();
      hash = (37 * hash) + STAGE_FIELD_NUMBER;
      hash = (53 * hash) + stage_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo prototype) {
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
     * Obf: GBGEALIJHNE
     * </pre>
     *
     * Protobuf type {@code SceneGalleryIslandPartySailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGalleryIslandPartySailInfo)
        emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.class, emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.newBuilder()
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
        coin_ = 0;
        cGEHJNCLFIH_ = 0;
        gHJGNKKLNED_ = 0;
        startSource_ = 0;
        kAGPALOPJHK_ = 0;
        fIBKEJGKANH_ = 0;
        stage_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.internal_static_SceneGalleryIslandPartySailInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo build() {
        emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo buildPartial() {
        emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo result = new emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.coin_ = coin_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cGEHJNCLFIH_ = cGEHJNCLFIH_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gHJGNKKLNED_ = gHJGNKKLNED_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.startSource_ = startSource_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.kAGPALOPJHK_ = kAGPALOPJHK_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.fIBKEJGKANH_ = fIBKEJGKANH_;
        }
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.stage_ = stage_;
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
        if (other instanceof emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo other) {
        if (other == emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo.getDefaultInstance()) return this;
        if (other.getCoin() != 0) {
          setCoin(other.getCoin());
        }
        if (other.getCGEHJNCLFIH() != 0) {
          setCGEHJNCLFIH(other.getCGEHJNCLFIH());
        }
        if (other.getGHJGNKKLNED() != 0) {
          setGHJGNKKLNED(other.getGHJGNKKLNED());
        }
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getKAGPALOPJHK() != 0) {
          setKAGPALOPJHK(other.getKAGPALOPJHK());
        }
        if (other.getFIBKEJGKANH() != 0) {
          setFIBKEJGKANH(other.getFIBKEJGKANH());
        }
        if (other.stage_ != 0) {
          setStageValue(other.getStageValue());
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
              case 8: {
                coin_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 32: {
                fIBKEJGKANH_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 32
              case 48: {
                stage_ = input.readEnum();
                bitField0_ |= 0x00000040;
                break;
              } // case 48
              case 56: {
                cGEHJNCLFIH_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 80: {
                kAGPALOPJHK_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 80
              case 88: {
                gHJGNKKLNED_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 88
              case 104: {
                startSource_ = input.readEnum();
                bitField0_ |= 0x00000008;
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

      private int coin_ ;
      /**
       * <code>uint32 coin = 1;</code>
       * @return The coin.
       */
      @java.lang.Override
      public int getCoin() {
        return coin_;
      }
      /**
       * <code>uint32 coin = 1;</code>
       * @param value The coin to set.
       * @return This builder for chaining.
       */
      public Builder setCoin(int value) {

        coin_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 coin = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        coin_ = 0;
        onChanged();
        return this;
      }

      private int cGEHJNCLFIH_ ;
      /**
       * <code>uint32 CGEHJNCLFIH = 7;</code>
       * @return The cGEHJNCLFIH.
       */
      @java.lang.Override
      public int getCGEHJNCLFIH() {
        return cGEHJNCLFIH_;
      }
      /**
       * <code>uint32 CGEHJNCLFIH = 7;</code>
       * @param value The cGEHJNCLFIH to set.
       * @return This builder for chaining.
       */
      public Builder setCGEHJNCLFIH(int value) {

        cGEHJNCLFIH_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CGEHJNCLFIH = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCGEHJNCLFIH() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cGEHJNCLFIH_ = 0;
        onChanged();
        return this;
      }

      private int gHJGNKKLNED_ ;
      /**
       * <code>uint32 GHJGNKKLNED = 11;</code>
       * @return The gHJGNKKLNED.
       */
      @java.lang.Override
      public int getGHJGNKKLNED() {
        return gHJGNKKLNED_;
      }
      /**
       * <code>uint32 GHJGNKKLNED = 11;</code>
       * @param value The gHJGNKKLNED to set.
       * @return This builder for chaining.
       */
      public Builder setGHJGNKKLNED(int value) {

        gHJGNKKLNED_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GHJGNKKLNED = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGHJGNKKLNED() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gHJGNKKLNED_ = 0;
        onChanged();
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 13;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 13;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        startSource_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 13;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.forNumber(startSource_);
        return result == null ? emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 13;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startSource_ = 0;
        onChanged();
        return this;
      }

      private int kAGPALOPJHK_ ;
      /**
       * <code>uint32 KAGPALOPJHK = 10;</code>
       * @return The kAGPALOPJHK.
       */
      @java.lang.Override
      public int getKAGPALOPJHK() {
        return kAGPALOPJHK_;
      }
      /**
       * <code>uint32 KAGPALOPJHK = 10;</code>
       * @param value The kAGPALOPJHK to set.
       * @return This builder for chaining.
       */
      public Builder setKAGPALOPJHK(int value) {

        kAGPALOPJHK_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KAGPALOPJHK = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearKAGPALOPJHK() {
        bitField0_ = (bitField0_ & ~0x00000010);
        kAGPALOPJHK_ = 0;
        onChanged();
        return this;
      }

      private int fIBKEJGKANH_ ;
      /**
       * <code>uint32 FIBKEJGKANH = 4;</code>
       * @return The fIBKEJGKANH.
       */
      @java.lang.Override
      public int getFIBKEJGKANH() {
        return fIBKEJGKANH_;
      }
      /**
       * <code>uint32 FIBKEJGKANH = 4;</code>
       * @param value The fIBKEJGKANH to set.
       * @return This builder for chaining.
       */
      public Builder setFIBKEJGKANH(int value) {

        fIBKEJGKANH_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FIBKEJGKANH = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearFIBKEJGKANH() {
        bitField0_ = (bitField0_ & ~0x00000020);
        fIBKEJGKANH_ = 0;
        onChanged();
        return this;
      }

      private int stage_ = 0;
      /**
       * <code>.IslandPartySailStage stage = 6;</code>
       * @return The enum numeric value on the wire for stage.
       */
      @java.lang.Override public int getStageValue() {
        return stage_;
      }
      /**
       * <code>.IslandPartySailStage stage = 6;</code>
       * @param value The enum numeric value on the wire for stage to set.
       * @return This builder for chaining.
       */
      public Builder setStageValue(int value) {
        stage_ = value;
        bitField0_ |= 0x00000040;
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 6;</code>
       * @return The stage.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage getStage() {
        emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage result = emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.forNumber(stage_);
        return result == null ? emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage.UNRECOGNIZED : result;
      }
      /**
       * <code>.IslandPartySailStage stage = 6;</code>
       * @param value The stage to set.
       * @return This builder for chaining.
       */
      public Builder setStage(emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.IslandPartySailStage value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000040;
        stage_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.IslandPartySailStage stage = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearStage() {
        bitField0_ = (bitField0_ & ~0x00000040);
        stage_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGalleryIslandPartySailInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGalleryIslandPartySailInfo)
    private static final emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo();
    }

    public static emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGalleryIslandPartySailInfo>() {
      @java.lang.Override
      public SceneGalleryIslandPartySailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGalleryIslandPartySailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SceneGalleryIslandPartySailInfoOuterClass.SceneGalleryIslandPartySailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGalleryIslandPartySailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%SceneGalleryIslandPartySailInfo.proto\032" +
      "\030GalleryStartSource.proto\032\032IslandPartySa" +
      "ilStage.proto\"\324\001\n\037SceneGalleryIslandPart" +
      "ySailInfo\022\014\n\004coin\030\001 \001(\r\022\023\n\013CGEHJNCLFIH\030\007" +
      " \001(\r\022\023\n\013GHJGNKKLNED\030\013 \001(\r\022)\n\014start_sourc" +
      "e\030\r \001(\0162\023.GalleryStartSource\022\023\n\013KAGPALOP" +
      "JHK\030\n \001(\r\022\023\n\013FIBKEJGKANH\030\004 \001(\r\022$\n\005stage\030" +
      "\006 \001(\0162\025.IslandPartySailStageB\035\n\033emu.prot" +
      "oshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.getDescriptor(),
        });
    internal_static_SceneGalleryIslandPartySailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGalleryIslandPartySailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGalleryIslandPartySailInfo_descriptor,
        new java.lang.String[] { "Coin", "CGEHJNCLFIH", "GHJGNKKLNED", "StartSource", "KAGPALOPJHK", "FIBKEJGKANH", "Stage", });
    emu.protoshift.net.oldproto.GalleryStartSourceOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.IslandPartySailStageOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
