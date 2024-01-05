// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CIADDPPKCOA.proto

package emu.protoshift.net.oldproto;

public final class CIADDPPKCOAOuterClass {
  private CIADDPPKCOAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CIADDPPKCOAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CIADDPPKCOA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 ugc_guid = 11;</code>
     * @return The ugcGuid.
     */
    long getUgcGuid();

    /**
     * <code>uint32 music_basic_id = 7;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code CIADDPPKCOA}
   */
  public static final class CIADDPPKCOA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CIADDPPKCOA)
      CIADDPPKCOAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CIADDPPKCOA.newBuilder() to construct.
    private CIADDPPKCOA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CIADDPPKCOA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CIADDPPKCOA();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.internal_static_CIADDPPKCOA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.internal_static_CIADDPPKCOA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.class, emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.Builder.class);
    }

    public static final int UGC_GUID_FIELD_NUMBER = 11;
    private long ugcGuid_ = 0L;
    /**
     * <code>uint64 ugc_guid = 11;</code>
     * @return The ugcGuid.
     */
    @java.lang.Override
    public long getUgcGuid() {
      return ugcGuid_;
    }

    public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 7;
    private int musicBasicId_ = 0;
    /**
     * <code>uint32 music_basic_id = 7;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (musicBasicId_ != 0) {
        output.writeUInt32(7, musicBasicId_);
      }
      if (ugcGuid_ != 0L) {
        output.writeUInt64(11, ugcGuid_);
      }
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
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, musicBasicId_);
      }
      if (ugcGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, ugcGuid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA other = (emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA) obj;

      if (getUgcGuid()
          != other.getUgcGuid()) return false;
      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
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
      hash = (37 * hash) + UGC_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUgcGuid());
      hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA prototype) {
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
     * Protobuf type {@code CIADDPPKCOA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CIADDPPKCOA)
        emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.internal_static_CIADDPPKCOA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.internal_static_CIADDPPKCOA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.class, emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.newBuilder()
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
        ugcGuid_ = 0L;
        musicBasicId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.internal_static_CIADDPPKCOA_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA build() {
        emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA buildPartial() {
        emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA result = new emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.ugcGuid_ = ugcGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.musicBasicId_ = musicBasicId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA) {
          return mergeFrom((emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA other) {
        if (other == emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA.getDefaultInstance()) return this;
        if (other.getUgcGuid() != 0L) {
          setUgcGuid(other.getUgcGuid());
        }
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
        }
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
              case 48: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 56: {
                musicBasicId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 88: {
                ugcGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private long ugcGuid_ ;
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @return The ugcGuid.
       */
      @java.lang.Override
      public long getUgcGuid() {
        return ugcGuid_;
      }
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @param value The ugcGuid to set.
       * @return This builder for chaining.
       */
      public Builder setUgcGuid(long value) {

        ugcGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 ugc_guid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUgcGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ugcGuid_ = 0L;
        onChanged();
        return this;
      }

      private int musicBasicId_ ;
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {

        musicBasicId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_basic_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        musicBasicId_ = 0;
        onChanged();
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
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:CIADDPPKCOA)
    }

    // @@protoc_insertion_point(class_scope:CIADDPPKCOA)
    private static final emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA();
    }

    public static emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CIADDPPKCOA>
        PARSER = new com.google.protobuf.AbstractParser<CIADDPPKCOA>() {
      @java.lang.Override
      public CIADDPPKCOA parsePartialFrom(
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

    public static com.google.protobuf.Parser<CIADDPPKCOA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CIADDPPKCOA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CIADDPPKCOAOuterClass.CIADDPPKCOA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CIADDPPKCOA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CIADDPPKCOA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CIADDPPKCOA.proto\"H\n\013CIADDPPKCOA\022\020\n\010ug" +
      "c_guid\030\013 \001(\004\022\026\n\016music_basic_id\030\007 \001(\r\022\017\n\007" +
      "retcode\030\006 \001(\005B\035\n\033emu.protoshift.net.oldp" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CIADDPPKCOA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CIADDPPKCOA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CIADDPPKCOA_descriptor,
        new java.lang.String[] { "UgcGuid", "MusicBasicId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
