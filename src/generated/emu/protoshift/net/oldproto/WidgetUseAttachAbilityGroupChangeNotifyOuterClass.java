// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetUseAttachAbilityGroupChangeNotify.proto

package emu.protoshift.net.oldproto;

public final class WidgetUseAttachAbilityGroupChangeNotifyOuterClass {
  private WidgetUseAttachAbilityGroupChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetUseAttachAbilityGroupChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetUseAttachAbilityGroupChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_attach = 1;</code>
     * @return The isAttach.
     */
    boolean getIsAttach();

    /**
     * <code>uint32 material_id = 3;</code>
     * @return The materialId.
     */
    int getMaterialId();
  }
  /**
   * <pre>
   * Obf: GLLODFLDCPE
   * </pre>
   *
   * Protobuf type {@code WidgetUseAttachAbilityGroupChangeNotify}
   */
  public static final class WidgetUseAttachAbilityGroupChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetUseAttachAbilityGroupChangeNotify)
      WidgetUseAttachAbilityGroupChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetUseAttachAbilityGroupChangeNotify.newBuilder() to construct.
    private WidgetUseAttachAbilityGroupChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetUseAttachAbilityGroupChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetUseAttachAbilityGroupChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.class, emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.Builder.class);
    }

    public static final int IS_ATTACH_FIELD_NUMBER = 1;
    private boolean isAttach_ = false;
    /**
     * <code>bool is_attach = 1;</code>
     * @return The isAttach.
     */
    @java.lang.Override
    public boolean getIsAttach() {
      return isAttach_;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 3;
    private int materialId_ = 0;
    /**
     * <code>uint32 material_id = 3;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
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
      if (isAttach_ != false) {
        output.writeBool(1, isAttach_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(3, materialId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAttach_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isAttach_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, materialId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify other = (emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify) obj;

      if (getIsAttach()
          != other.getIsAttach()) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
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
      hash = (37 * hash) + IS_ATTACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAttach());
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify prototype) {
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
     * Obf: GLLODFLDCPE
     * </pre>
     *
     * Protobuf type {@code WidgetUseAttachAbilityGroupChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetUseAttachAbilityGroupChangeNotify)
        emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.class, emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.newBuilder()
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
        isAttach_ = false;
        materialId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify build() {
        emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify buildPartial() {
        emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify result = new emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isAttach_ = isAttach_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.materialId_ = materialId_;
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
        if (other instanceof emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify other) {
        if (other == emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify.getDefaultInstance()) return this;
        if (other.getIsAttach() != false) {
          setIsAttach(other.getIsAttach());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
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
                isAttach_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 24: {
                materialId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private boolean isAttach_ ;
      /**
       * <code>bool is_attach = 1;</code>
       * @return The isAttach.
       */
      @java.lang.Override
      public boolean getIsAttach() {
        return isAttach_;
      }
      /**
       * <code>bool is_attach = 1;</code>
       * @param value The isAttach to set.
       * @return This builder for chaining.
       */
      public Builder setIsAttach(boolean value) {

        isAttach_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_attach = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAttach() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isAttach_ = false;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 3;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 3;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {

        materialId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        materialId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetUseAttachAbilityGroupChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:WidgetUseAttachAbilityGroupChangeNotify)
    private static final emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify();
    }

    public static emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<WidgetUseAttachAbilityGroupChangeNotify>() {
      @java.lang.Override
      public WidgetUseAttachAbilityGroupChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetUseAttachAbilityGroupChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WidgetUseAttachAbilityGroupChangeNotifyOuterClass.WidgetUseAttachAbilityGroupChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-WidgetUseAttachAbilityGroupChangeNotif" +
      "y.proto\"Q\n\'WidgetUseAttachAbilityGroupCh" +
      "angeNotify\022\021\n\tis_attach\030\001 \001(\010\022\023\n\013materia" +
      "l_id\030\003 \001(\rB\035\n\033emu.protoshift.net.oldprot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetUseAttachAbilityGroupChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetUseAttachAbilityGroupChangeNotify_descriptor,
        new java.lang.String[] { "IsAttach", "MaterialId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
