// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetFriendRemarkNameRsp.proto

package emu.protoshift.net.oldproto;

public final class SetFriendRemarkNameRspOuterClass {
  private SetFriendRemarkNameRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetFriendRemarkNameRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetFriendRemarkNameRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string remark_name = 11;</code>
     * @return The remarkName.
     */
    java.lang.String getRemarkName();
    /**
     * <code>string remark_name = 11;</code>
     * @return The bytes for remarkName.
     */
    com.google.protobuf.ByteString
        getRemarkNameBytes();

    /**
     * <code>bool is_clear_remark = 5;</code>
     * @return The isClearRemark.
     */
    boolean getIsClearRemark();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * Obf: LMCPOEKAKNN
   * </pre>
   *
   * Protobuf type {@code SetFriendRemarkNameRsp}
   */
  public static final class SetFriendRemarkNameRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetFriendRemarkNameRsp)
      SetFriendRemarkNameRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetFriendRemarkNameRsp.newBuilder() to construct.
    private SetFriendRemarkNameRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetFriendRemarkNameRsp() {
      remarkName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetFriendRemarkNameRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.class, emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.Builder.class);
    }

    public static final int UID_FIELD_NUMBER = 7;
    private int uid_ = 0;
    /**
     * <code>uint32 uid = 7;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int REMARK_NAME_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private volatile java.lang.Object remarkName_ = "";
    /**
     * <code>string remark_name = 11;</code>
     * @return The remarkName.
     */
    @java.lang.Override
    public java.lang.String getRemarkName() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        remarkName_ = s;
        return s;
      }
    }
    /**
     * <code>string remark_name = 11;</code>
     * @return The bytes for remarkName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarkNameBytes() {
      java.lang.Object ref = remarkName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        remarkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_CLEAR_REMARK_FIELD_NUMBER = 5;
    private boolean isClearRemark_ = false;
    /**
     * <code>bool is_clear_remark = 5;</code>
     * @return The isClearRemark.
     */
    @java.lang.Override
    public boolean getIsClearRemark() {
      return isClearRemark_;
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
        output.writeInt32(2, retcode_);
      }
      if (isClearRemark_ != false) {
        output.writeBool(5, isClearRemark_);
      }
      if (uid_ != 0) {
        output.writeUInt32(7, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, remarkName_);
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
          .computeInt32Size(2, retcode_);
      }
      if (isClearRemark_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isClearRemark_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(remarkName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, remarkName_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp other = (emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp) obj;

      if (getUid()
          != other.getUid()) return false;
      if (!getRemarkName()
          .equals(other.getRemarkName())) return false;
      if (getIsClearRemark()
          != other.getIsClearRemark()) return false;
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
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + REMARK_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getRemarkName().hashCode();
      hash = (37 * hash) + IS_CLEAR_REMARK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsClearRemark());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp prototype) {
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
     * Obf: LMCPOEKAKNN
     * </pre>
     *
     * Protobuf type {@code SetFriendRemarkNameRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetFriendRemarkNameRsp)
        emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.class, emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.newBuilder()
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
        uid_ = 0;
        remarkName_ = "";
        isClearRemark_ = false;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.internal_static_SetFriendRemarkNameRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp build() {
        emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp buildPartial() {
        emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp result = new emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.uid_ = uid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.remarkName_ = remarkName_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isClearRemark_ = isClearRemark_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
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
        if (other instanceof emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp other) {
        if (other == emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp.getDefaultInstance()) return this;
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getRemarkName().isEmpty()) {
          remarkName_ = other.remarkName_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getIsClearRemark() != false) {
          setIsClearRemark(other.getIsClearRemark());
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
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 16
              case 40: {
                isClearRemark_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 56: {
                uid_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 90: {
                remarkName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 90
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

      private int uid_ ;
      /**
       * <code>uint32 uid = 7;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {

        uid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object remarkName_ = "";
      /**
       * <code>string remark_name = 11;</code>
       * @return The remarkName.
       */
      public java.lang.String getRemarkName() {
        java.lang.Object ref = remarkName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          remarkName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string remark_name = 11;</code>
       * @return The bytes for remarkName.
       */
      public com.google.protobuf.ByteString
          getRemarkNameBytes() {
        java.lang.Object ref = remarkName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          remarkName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string remark_name = 11;</code>
       * @param value The remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        remarkName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemarkName() {
        remarkName_ = getDefaultInstance().getRemarkName();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string remark_name = 11;</code>
       * @param value The bytes for remarkName to set.
       * @return This builder for chaining.
       */
      public Builder setRemarkNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        remarkName_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private boolean isClearRemark_ ;
      /**
       * <code>bool is_clear_remark = 5;</code>
       * @return The isClearRemark.
       */
      @java.lang.Override
      public boolean getIsClearRemark() {
        return isClearRemark_;
      }
      /**
       * <code>bool is_clear_remark = 5;</code>
       * @param value The isClearRemark to set.
       * @return This builder for chaining.
       */
      public Builder setIsClearRemark(boolean value) {

        isClearRemark_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_clear_remark = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsClearRemark() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isClearRemark_ = false;
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
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000008);
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


      // @@protoc_insertion_point(builder_scope:SetFriendRemarkNameRsp)
    }

    // @@protoc_insertion_point(class_scope:SetFriendRemarkNameRsp)
    private static final emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp();
    }

    public static emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetFriendRemarkNameRsp>
        PARSER = new com.google.protobuf.AbstractParser<SetFriendRemarkNameRsp>() {
      @java.lang.Override
      public SetFriendRemarkNameRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<SetFriendRemarkNameRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetFriendRemarkNameRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SetFriendRemarkNameRspOuterClass.SetFriendRemarkNameRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetFriendRemarkNameRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetFriendRemarkNameRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034SetFriendRemarkNameRsp.proto\"d\n\026SetFri" +
      "endRemarkNameRsp\022\013\n\003uid\030\007 \001(\r\022\023\n\013remark_" +
      "name\030\013 \001(\t\022\027\n\017is_clear_remark\030\005 \001(\010\022\017\n\007r" +
      "etcode\030\002 \001(\005B\035\n\033emu.protoshift.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetFriendRemarkNameRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetFriendRemarkNameRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetFriendRemarkNameRsp_descriptor,
        new java.lang.String[] { "Uid", "RemarkName", "IsClearRemark", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
