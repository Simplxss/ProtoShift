// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DAOOBOPAAEE.proto

package emu.protoshift.net.oldproto;

public final class DAOOBOPAAEEOuterClass {
  private DAOOBOPAAEEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DAOOBOPAAEEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DAOOBOPAAEE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 src_app_id = 5;</code>
     * @return The srcAppId.
     */
    int getSrcAppId();

    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    boolean hasSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     * @return The srcPlayerInfo.
     */
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     */
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 742
   * </pre>
   *
   * Protobuf type {@code DAOOBOPAAEE}
   */
  public static final class DAOOBOPAAEE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DAOOBOPAAEE)
      DAOOBOPAAEEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DAOOBOPAAEE.newBuilder() to construct.
    private DAOOBOPAAEE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DAOOBOPAAEE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DAOOBOPAAEE();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.internal_static_DAOOBOPAAEE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.internal_static_DAOOBOPAAEE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.class, emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.Builder.class);
    }

    private int bitField0_;
    public static final int SRC_APP_ID_FIELD_NUMBER = 5;
    private int srcAppId_ = 0;
    /**
     * <code>uint32 src_app_id = 5;</code>
     * @return The srcAppId.
     */
    @java.lang.Override
    public int getSrcAppId() {
      return srcAppId_;
    }

    public static final int SRC_PLAYER_INFO_FIELD_NUMBER = 6;
    private emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     * @return Whether the srcPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasSrcPlayerInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     * @return The srcPlayerInfo.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
      return srcPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo src_player_info = 6;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
      return srcPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
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
      if (srcAppId_ != 0) {
        output.writeUInt32(5, srcAppId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(6, getSrcPlayerInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (srcAppId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, srcAppId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getSrcPlayerInfo());
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
      if (!(obj instanceof emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE other = (emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE) obj;

      if (getSrcAppId()
          != other.getSrcAppId()) return false;
      if (hasSrcPlayerInfo() != other.hasSrcPlayerInfo()) return false;
      if (hasSrcPlayerInfo()) {
        if (!getSrcPlayerInfo()
            .equals(other.getSrcPlayerInfo())) return false;
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
      hash = (37 * hash) + SRC_APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSrcAppId();
      if (hasSrcPlayerInfo()) {
        hash = (37 * hash) + SRC_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getSrcPlayerInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE prototype) {
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
     * CmdId: 742
     * </pre>
     *
     * Protobuf type {@code DAOOBOPAAEE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DAOOBOPAAEE)
        emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.internal_static_DAOOBOPAAEE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.internal_static_DAOOBOPAAEE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.class, emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.newBuilder()
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
          getSrcPlayerInfoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        srcAppId_ = 0;
        srcPlayerInfo_ = null;
        if (srcPlayerInfoBuilder_ != null) {
          srcPlayerInfoBuilder_.dispose();
          srcPlayerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.internal_static_DAOOBOPAAEE_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE build() {
        emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE buildPartial() {
        emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE result = new emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.srcAppId_ = srcAppId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.srcPlayerInfo_ = srcPlayerInfoBuilder_ == null
              ? srcPlayerInfo_
              : srcPlayerInfoBuilder_.build();
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
        if (other instanceof emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE) {
          return mergeFrom((emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE other) {
        if (other == emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE.getDefaultInstance()) return this;
        if (other.getSrcAppId() != 0) {
          setSrcAppId(other.getSrcAppId());
        }
        if (other.hasSrcPlayerInfo()) {
          mergeSrcPlayerInfo(other.getSrcPlayerInfo());
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
              case 40: {
                srcAppId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 50: {
                input.readMessage(
                    getSrcPlayerInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 50
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

      private int srcAppId_ ;
      /**
       * <code>uint32 src_app_id = 5;</code>
       * @return The srcAppId.
       */
      @java.lang.Override
      public int getSrcAppId() {
        return srcAppId_;
      }
      /**
       * <code>uint32 src_app_id = 5;</code>
       * @param value The srcAppId to set.
       * @return This builder for chaining.
       */
      public Builder setSrcAppId(int value) {

        srcAppId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 src_app_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSrcAppId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        srcAppId_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo srcPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> srcPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       * @return Whether the srcPlayerInfo field is set.
       */
      public boolean hasSrcPlayerInfo() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       * @return The srcPlayerInfo.
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getSrcPlayerInfo() {
        if (srcPlayerInfoBuilder_ == null) {
          return srcPlayerInfo_ == null ? emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        } else {
          return srcPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public Builder setSrcPlayerInfo(emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          srcPlayerInfo_ = value;
        } else {
          srcPlayerInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public Builder setSrcPlayerInfo(
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfo_ = builderForValue.build();
        } else {
          srcPlayerInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public Builder mergeSrcPlayerInfo(emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (srcPlayerInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            srcPlayerInfo_ != null &&
            srcPlayerInfo_ != emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance()) {
            getSrcPlayerInfoBuilder().mergeFrom(value);
          } else {
            srcPlayerInfo_ = value;
          }
        } else {
          srcPlayerInfoBuilder_.mergeFrom(value);
        }
        if (srcPlayerInfo_ != null) {
          bitField0_ |= 0x00000002;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public Builder clearSrcPlayerInfo() {
        bitField0_ = (bitField0_ & ~0x00000002);
        srcPlayerInfo_ = null;
        if (srcPlayerInfoBuilder_ != null) {
          srcPlayerInfoBuilder_.dispose();
          srcPlayerInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getSrcPlayerInfoBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSrcPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      public emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getSrcPlayerInfoOrBuilder() {
        if (srcPlayerInfoBuilder_ != null) {
          return srcPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return srcPlayerInfo_ == null ?
              emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : srcPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo src_player_info = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getSrcPlayerInfoFieldBuilder() {
        if (srcPlayerInfoBuilder_ == null) {
          srcPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getSrcPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          srcPlayerInfo_ = null;
        }
        return srcPlayerInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:DAOOBOPAAEE)
    }

    // @@protoc_insertion_point(class_scope:DAOOBOPAAEE)
    private static final emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE();
    }

    public static emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DAOOBOPAAEE>
        PARSER = new com.google.protobuf.AbstractParser<DAOOBOPAAEE>() {
      @java.lang.Override
      public DAOOBOPAAEE parsePartialFrom(
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

    public static com.google.protobuf.Parser<DAOOBOPAAEE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DAOOBOPAAEE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.DAOOBOPAAEEOuterClass.DAOOBOPAAEE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DAOOBOPAAEE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DAOOBOPAAEE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DAOOBOPAAEE.proto\032\026OnlinePlayerInfo.pr" +
      "oto\"M\n\013DAOOBOPAAEE\022\022\n\nsrc_app_id\030\005 \001(\r\022*" +
      "\n\017src_player_info\030\006 \001(\0132\021.OnlinePlayerIn" +
      "foB\035\n\033emu.protoshift.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_DAOOBOPAAEE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DAOOBOPAAEE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DAOOBOPAAEE_descriptor,
        new java.lang.String[] { "SrcAppId", "SrcPlayerInfo", });
    emu.protoshift.net.oldproto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
