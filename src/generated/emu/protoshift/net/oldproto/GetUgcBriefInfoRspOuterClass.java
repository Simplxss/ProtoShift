// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetUgcBriefInfoRsp.proto

package emu.protoshift.net.oldproto;

public final class GetUgcBriefInfoRspOuterClass {
  private GetUgcBriefInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetUgcBriefInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetUgcBriefInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    int getUgcTypeValue();
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType();

    /**
     * <code>uint64 ugc_guid = 1;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    boolean hasMusicBriefInfo();
    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     * @return The musicBriefInfo.
     */
    emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo();
    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     */
    emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 25183
   * Obf: IGIDBNBJDIA
   * </pre>
   *
   * Protobuf type {@code GetUgcBriefInfoRsp}
   */
  public static final class GetUgcBriefInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetUgcBriefInfoRsp)
      GetUgcBriefInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetUgcBriefInfoRsp.newBuilder() to construct.
    private GetUgcBriefInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetUgcBriefInfoRsp() {
      ugcType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetUgcBriefInfoRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
    }

    private int bitField0_;
    public static final int UGC_TYPE_FIELD_NUMBER = 13;
    private int ugcType_ = 0;
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The enum numeric value on the wire for ugcType.
     */
    @java.lang.Override public int getUgcTypeValue() {
      return ugcType_;
    }
    /**
     * <code>.UgcType ugc_type = 13;</code>
     * @return The ugcType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
      emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType result = emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.forNumber(ugcType_);
      return result == null ? emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
    }

    public static final int UGC_GUID_FIELD_NUMBER = 1;
    private long ugcGuid_ = 0L;
    /**
     * <code>uint64 ugc_guid = 1;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 12;
    private emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo musicBriefInfo_;
    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasMusicBriefInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     * @return The musicBriefInfo.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo() {
      return musicBriefInfo_ == null ? emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance() : musicBriefInfo_;
    }
    /**
     * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
      return musicBriefInfo_ == null ? emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance() : musicBriefInfo_;
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
      if (ugcGuid_ != 0L) {
        output.writeUInt64(1, ugcGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(12, getMusicBriefInfo());
      }
      if (ugcType_ != emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        output.writeEnum(13, ugcType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, ugcGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getMusicBriefInfo());
      }
      if (ugcType_ != emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UGC_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, ugcType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other = (emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) obj;

      if (ugcType_ != other.ugcType_) return false;
      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasMusicBriefInfo() != other.hasMusicBriefInfo()) return false;
      if (hasMusicBriefInfo()) {
        if (!getMusicBriefInfo()
            .equals(other.getMusicBriefInfo())) return false;
      }
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
      hash = (37 * hash) + UGC_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + ugcType_;
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasMusicBriefInfo()) {
        hash = (37 * hash) + MUSIC_BRIEF_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMusicBriefInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp prototype) {
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
     * CmdId: 25183
     * Obf: IGIDBNBJDIA
     * </pre>
     *
     * Protobuf type {@code GetUgcBriefInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetUgcBriefInfoRsp)
        emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.class, emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getMusicBriefInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        ugcType_ = 0;
        ugcGuid_ = 0L;
        retcode_ = 0;
        musicBriefInfo_ = null;
        if (musicBriefInfoBuilder_ != null) {
          musicBriefInfoBuilder_.dispose();
          musicBriefInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.internal_static_GetUgcBriefInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp build() {
        emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp buildPartial() {
        emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result = new emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ugcType_ = ugcType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.ugcGuid_ = ugcGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.musicBriefInfo_ = musicBriefInfoBuilder_ == null
              ? musicBriefInfo_
              : musicBriefInfoBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp other) {
        if (other == emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp.getDefaultInstance()) return this;
        if (other.ugcType_ != 0) {
          setUgcTypeValue(other.getUgcTypeValue());
        }
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasMusicBriefInfo()) {
          mergeMusicBriefInfo(other.getMusicBriefInfo());
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
                ugcGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 98: {
                input.readMessage(
                    getMusicBriefInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 98
              case 104: {
                ugcType_ = input.readEnum();
                bitField0_ |= 0x00000001;
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

      private int ugcType_ = 0;
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The enum numeric value on the wire for ugcType.
       */
      @java.lang.Override public int getUgcTypeValue() {
        return ugcType_;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The enum numeric value on the wire for ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcTypeValue(int value) {
        ugcType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return The ugcType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType getUgcType() {
        emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType result = emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.forNumber(ugcType_);
        return result == null ? emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType.UNRECOGNIZED : result;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @param value The ugcType to set.
       * @return This builder for chaining.
       */
      public Builder setUgcType(emu.protoshift.net.oldproto.UgcTypeOuterClass.UgcType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        ugcType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.UgcType ugc_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ugcType_ = 0;
        onChanged();
        return this;
      }

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 1;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 1;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {

        ugcGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo musicBriefInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       * @return Whether the musicBriefInfo field is set.
       */
      public boolean hasMusicBriefInfo() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       * @return The musicBriefInfo.
       */
      public emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo getMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          return musicBriefInfo_ == null ? emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance() : musicBriefInfo_;
        } else {
          return musicBriefInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public Builder setMusicBriefInfo(emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          musicBriefInfo_ = value;
        } else {
          musicBriefInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public Builder setMusicBriefInfo(
          emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder builderForValue) {
        if (musicBriefInfoBuilder_ == null) {
          musicBriefInfo_ = builderForValue.build();
        } else {
          musicBriefInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public Builder mergeMusicBriefInfo(emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            musicBriefInfo_ != null &&
            musicBriefInfo_ != emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance()) {
            getMusicBriefInfoBuilder().mergeFrom(value);
          } else {
            musicBriefInfo_ = value;
          }
        } else {
          musicBriefInfoBuilder_.mergeFrom(value);
        }
        if (musicBriefInfo_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public Builder clearMusicBriefInfo() {
        bitField0_ = (bitField0_ & ~0x00000008);
        musicBriefInfo_ = null;
        if (musicBriefInfoBuilder_ != null) {
          musicBriefInfoBuilder_.dispose();
          musicBriefInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder getMusicBriefInfoBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getMusicBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      public emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
        if (musicBriefInfoBuilder_ != null) {
          return musicBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          return musicBriefInfo_ == null ?
              emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.getDefaultInstance() : musicBriefInfo_;
        }
      }
      /**
       * <code>optional .UgcMusicBriefInfo music_brief_info = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder> 
          getMusicBriefInfoFieldBuilder() {
        if (musicBriefInfoBuilder_ == null) {
          musicBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfo.Builder, emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.UgcMusicBriefInfoOrBuilder>(
                  getMusicBriefInfo(),
                  getParentForChildren(),
                  isClean());
          musicBriefInfo_ = null;
        }
        return musicBriefInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GetUgcBriefInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetUgcBriefInfoRsp)
    private static final emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp();
    }

    public static emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetUgcBriefInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetUgcBriefInfoRsp>() {
      @java.lang.Override
      public GetUgcBriefInfoRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GetUgcBriefInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetUgcBriefInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GetUgcBriefInfoRspOuterClass.GetUgcBriefInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUgcBriefInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUgcBriefInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GetUgcBriefInfoRsp.proto\032\rUgcType.prot" +
      "o\032\027UgcMusicBriefInfo.proto\"\233\001\n\022GetUgcBri" +
      "efInfoRsp\022\032\n\010ugc_type\030\r \001(\0162\010.UgcType\022\020\n" +
      "\010ugc_guid\030\001 \001(\004\022\017\n\007retcode\030\002 \001(\005\0221\n\020musi" +
      "c_brief_info\030\014 \001(\0132\022.UgcMusicBriefInfoH\000" +
      "\210\001\001B\023\n\021_music_brief_infoB\035\n\033emu.protoshi" +
      "ft.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.UgcTypeOuterClass.getDescriptor(),
          emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.getDescriptor(),
        });
    internal_static_GetUgcBriefInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUgcBriefInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUgcBriefInfoRsp_descriptor,
        new java.lang.String[] { "UgcType", "UgcGuid", "Retcode", "MusicBriefInfo", "MusicBriefInfo", });
    emu.protoshift.net.oldproto.UgcTypeOuterClass.getDescriptor();
    emu.protoshift.net.oldproto.UgcMusicBriefInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
