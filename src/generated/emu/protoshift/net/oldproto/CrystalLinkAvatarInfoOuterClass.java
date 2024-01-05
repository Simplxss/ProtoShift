// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CrystalLinkAvatarInfo.proto

package emu.protoshift.net.oldproto;

public final class CrystalLinkAvatarInfoOuterClass {
  private CrystalLinkAvatarInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CrystalLinkAvatarInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CrystalLinkAvatarInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_trial = 7;</code>
     * @return The isTrial.
     */
    boolean getIsTrial();

    /**
     * <code>uint64 avatar_id = 1;</code>
     * @return The avatarId.
     */
    long getAvatarId();
  }
  /**
   * Protobuf type {@code CrystalLinkAvatarInfo}
   */
  public static final class CrystalLinkAvatarInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CrystalLinkAvatarInfo)
      CrystalLinkAvatarInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CrystalLinkAvatarInfo.newBuilder() to construct.
    private CrystalLinkAvatarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CrystalLinkAvatarInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CrystalLinkAvatarInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.internal_static_CrystalLinkAvatarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.internal_static_CrystalLinkAvatarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.class, emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.Builder.class);
    }

    public static final int IS_TRIAL_FIELD_NUMBER = 7;
    private boolean isTrial_ = false;
    /**
     * <code>bool is_trial = 7;</code>
     * @return The isTrial.
     */
    @java.lang.Override
    public boolean getIsTrial() {
      return isTrial_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 1;
    private long avatarId_ = 0L;
    /**
     * <code>uint64 avatar_id = 1;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public long getAvatarId() {
      return avatarId_;
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
      if (avatarId_ != 0L) {
        output.writeUInt64(1, avatarId_);
      }
      if (isTrial_ != false) {
        output.writeBool(7, isTrial_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, avatarId_);
      }
      if (isTrial_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isTrial_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo other = (emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo) obj;

      if (getIsTrial()
          != other.getIsTrial()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
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
      hash = (37 * hash) + IS_TRIAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTrial());
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarId());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo prototype) {
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
     * Protobuf type {@code CrystalLinkAvatarInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CrystalLinkAvatarInfo)
        emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.internal_static_CrystalLinkAvatarInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.internal_static_CrystalLinkAvatarInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.class, emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.newBuilder()
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
        isTrial_ = false;
        avatarId_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.internal_static_CrystalLinkAvatarInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo build() {
        emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo buildPartial() {
        emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo result = new emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isTrial_ = isTrial_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarId_ = avatarId_;
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
        if (other instanceof emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo other) {
        if (other == emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo.getDefaultInstance()) return this;
        if (other.getIsTrial() != false) {
          setIsTrial(other.getIsTrial());
        }
        if (other.getAvatarId() != 0L) {
          setAvatarId(other.getAvatarId());
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
                avatarId_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 56: {
                isTrial_ = input.readBool();
                bitField0_ |= 0x00000001;
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

      private boolean isTrial_ ;
      /**
       * <code>bool is_trial = 7;</code>
       * @return The isTrial.
       */
      @java.lang.Override
      public boolean getIsTrial() {
        return isTrial_;
      }
      /**
       * <code>bool is_trial = 7;</code>
       * @param value The isTrial to set.
       * @return This builder for chaining.
       */
      public Builder setIsTrial(boolean value) {

        isTrial_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trial = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTrial() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isTrial_ = false;
        onChanged();
        return this;
      }

      private long avatarId_ ;
      /**
       * <code>uint64 avatar_id = 1;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public long getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint64 avatar_id = 1;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(long value) {

        avatarId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CrystalLinkAvatarInfo)
    }

    // @@protoc_insertion_point(class_scope:CrystalLinkAvatarInfo)
    private static final emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo();
    }

    public static emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CrystalLinkAvatarInfo>
        PARSER = new com.google.protobuf.AbstractParser<CrystalLinkAvatarInfo>() {
      @java.lang.Override
      public CrystalLinkAvatarInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<CrystalLinkAvatarInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CrystalLinkAvatarInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CrystalLinkAvatarInfoOuterClass.CrystalLinkAvatarInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CrystalLinkAvatarInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CrystalLinkAvatarInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033CrystalLinkAvatarInfo.proto\"<\n\025Crystal" +
      "LinkAvatarInfo\022\020\n\010is_trial\030\007 \001(\010\022\021\n\tavat" +
      "ar_id\030\001 \001(\004B\035\n\033emu.protoshift.net.oldpro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CrystalLinkAvatarInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CrystalLinkAvatarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CrystalLinkAvatarInfo_descriptor,
        new java.lang.String[] { "IsTrial", "AvatarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
