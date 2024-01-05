// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExhibitionDisplayInfo.proto

package emu.protoshift.net.newproto;

public final class ExhibitionDisplayInfoOuterClass {
  private ExhibitionDisplayInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExhibitionDisplayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExhibitionDisplayInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>uint32 detail_param = 3;</code>
     * @return The detailParam.
     */
    int getDetailParam();
  }
  /**
   * Protobuf type {@code ExhibitionDisplayInfo}
   */
  public static final class ExhibitionDisplayInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExhibitionDisplayInfo)
      ExhibitionDisplayInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExhibitionDisplayInfo.newBuilder() to construct.
    private ExhibitionDisplayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExhibitionDisplayInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExhibitionDisplayInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.class, emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int PARAM_FIELD_NUMBER = 2;
    private int param_ = 0;
    /**
     * <code>uint32 param = 2;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int DETAIL_PARAM_FIELD_NUMBER = 3;
    private int detailParam_ = 0;
    /**
     * <code>uint32 detail_param = 3;</code>
     * @return The detailParam.
     */
    @java.lang.Override
    public int getDetailParam() {
      return detailParam_;
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (param_ != 0) {
        output.writeUInt32(2, param_);
      }
      if (detailParam_ != 0) {
        output.writeUInt32(3, detailParam_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, param_);
      }
      if (detailParam_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, detailParam_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo other = (emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo) obj;

      if (getId()
          != other.getId()) return false;
      if (getParam()
          != other.getParam()) return false;
      if (getDetailParam()
          != other.getDetailParam()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      hash = (37 * hash) + DETAIL_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getDetailParam();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo prototype) {
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
     * Protobuf type {@code ExhibitionDisplayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExhibitionDisplayInfo)
        emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.class, emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.newBuilder()
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
        id_ = 0;
        param_ = 0;
        detailParam_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.internal_static_ExhibitionDisplayInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo build() {
        emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo buildPartial() {
        emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo result = new emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.param_ = param_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.detailParam_ = detailParam_;
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
        if (other instanceof emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo) {
          return mergeFrom((emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo other) {
        if (other == emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.getDetailParam() != 0) {
          setDetailParam(other.getDetailParam());
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
                id_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                param_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                detailParam_ = input.readUInt32();
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

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 2;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {

        param_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        param_ = 0;
        onChanged();
        return this;
      }

      private int detailParam_ ;
      /**
       * <code>uint32 detail_param = 3;</code>
       * @return The detailParam.
       */
      @java.lang.Override
      public int getDetailParam() {
        return detailParam_;
      }
      /**
       * <code>uint32 detail_param = 3;</code>
       * @param value The detailParam to set.
       * @return This builder for chaining.
       */
      public Builder setDetailParam(int value) {

        detailParam_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 detail_param = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDetailParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        detailParam_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ExhibitionDisplayInfo)
    }

    // @@protoc_insertion_point(class_scope:ExhibitionDisplayInfo)
    private static final emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo();
    }

    public static emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExhibitionDisplayInfo>
        PARSER = new com.google.protobuf.AbstractParser<ExhibitionDisplayInfo>() {
      @java.lang.Override
      public ExhibitionDisplayInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ExhibitionDisplayInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExhibitionDisplayInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.ExhibitionDisplayInfoOuterClass.ExhibitionDisplayInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExhibitionDisplayInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExhibitionDisplayInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033ExhibitionDisplayInfo.proto\"H\n\025Exhibit" +
      "ionDisplayInfo\022\n\n\002id\030\001 \001(\r\022\r\n\005param\030\002 \001(" +
      "\r\022\024\n\014detail_param\030\003 \001(\rB\035\n\033emu.protoshif" +
      "t.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ExhibitionDisplayInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ExhibitionDisplayInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExhibitionDisplayInfo_descriptor,
        new java.lang.String[] { "Id", "Param", "DetailParam", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
