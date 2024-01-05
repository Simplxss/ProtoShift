// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FocusAvatarReq.proto

package emu.protoshift.net.oldproto;

public final class FocusAvatarReqOuterClass {
  private FocusAvatarReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FocusAvatarReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FocusAvatarReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_focus = 5;</code>
     * @return The isFocus.
     */
    boolean getIsFocus();

    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * <pre>
   * Obf: OIHEDACFGPL
   * </pre>
   *
   * Protobuf type {@code FocusAvatarReq}
   */
  public static final class FocusAvatarReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FocusAvatarReq)
      FocusAvatarReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FocusAvatarReq.newBuilder() to construct.
    private FocusAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FocusAvatarReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FocusAvatarReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.internal_static_FocusAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.internal_static_FocusAvatarReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.class, emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.Builder.class);
    }

    public static final int IS_FOCUS_FIELD_NUMBER = 5;
    private boolean isFocus_ = false;
    /**
     * <code>bool is_focus = 5;</code>
     * @return The isFocus.
     */
    @java.lang.Override
    public boolean getIsFocus() {
      return isFocus_;
    }

    public static final int AVATAR_GUID_FIELD_NUMBER = 2;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatar_guid = 2;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(2, avatarGuid_);
      }
      if (isFocus_ != false) {
        output.writeBool(5, isFocus_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, avatarGuid_);
      }
      if (isFocus_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isFocus_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq other = (emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq) obj;

      if (getIsFocus()
          != other.getIsFocus()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + IS_FOCUS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFocus());
      hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq prototype) {
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
     * Obf: OIHEDACFGPL
     * </pre>
     *
     * Protobuf type {@code FocusAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FocusAvatarReq)
        emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.internal_static_FocusAvatarReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.internal_static_FocusAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.class, emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.newBuilder()
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
        isFocus_ = false;
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.internal_static_FocusAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq build() {
        emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq buildPartial() {
        emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq result = new emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isFocus_ = isFocus_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq) {
          return mergeFrom((emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq other) {
        if (other == emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq.getDefaultInstance()) return this;
        if (other.getIsFocus() != false) {
          setIsFocus(other.getIsFocus());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 40: {
                isFocus_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
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

      private boolean isFocus_ ;
      /**
       * <code>bool is_focus = 5;</code>
       * @return The isFocus.
       */
      @java.lang.Override
      public boolean getIsFocus() {
        return isFocus_;
      }
      /**
       * <code>bool is_focus = 5;</code>
       * @param value The isFocus to set.
       * @return This builder for chaining.
       */
      public Builder setIsFocus(boolean value) {

        isFocus_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_focus = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFocus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isFocus_ = false;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {

        avatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatar_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:FocusAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:FocusAvatarReq)
    private static final emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq();
    }

    public static emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FocusAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<FocusAvatarReq>() {
      @java.lang.Override
      public FocusAvatarReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<FocusAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FocusAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FocusAvatarReqOuterClass.FocusAvatarReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FocusAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FocusAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024FocusAvatarReq.proto\"7\n\016FocusAvatarReq" +
      "\022\020\n\010is_focus\030\005 \001(\010\022\023\n\013avatar_guid\030\002 \001(\004B" +
      "\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FocusAvatarReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FocusAvatarReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FocusAvatarReq_descriptor,
        new java.lang.String[] { "IsFocus", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
