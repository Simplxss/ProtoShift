// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueDungeonPlayerCellChangeNotify.proto

package emu.protoshift.net.oldproto;

public final class RogueDungeonPlayerCellChangeNotifyOuterClass {
  private RogueDungeonPlayerCellChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RogueDungeonPlayerCellChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RogueDungeonPlayerCellChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 old_cell_id = 12;</code>
     * @return The oldCellId.
     */
    int getOldCellId();

    /**
     * <code>uint32 cell_id = 1;</code>
     * @return The cellId.
     */
    int getCellId();
  }
  /**
   * <pre>
   * Obf: PACLNPPOHOD
   * </pre>
   *
   * Protobuf type {@code RogueDungeonPlayerCellChangeNotify}
   */
  public static final class RogueDungeonPlayerCellChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RogueDungeonPlayerCellChangeNotify)
      RogueDungeonPlayerCellChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RogueDungeonPlayerCellChangeNotify.newBuilder() to construct.
    private RogueDungeonPlayerCellChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RogueDungeonPlayerCellChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RogueDungeonPlayerCellChangeNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.internal_static_RogueDungeonPlayerCellChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.internal_static_RogueDungeonPlayerCellChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.class, emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.Builder.class);
    }

    public static final int OLD_CELL_ID_FIELD_NUMBER = 12;
    private int oldCellId_ = 0;
    /**
     * <code>uint32 old_cell_id = 12;</code>
     * @return The oldCellId.
     */
    @java.lang.Override
    public int getOldCellId() {
      return oldCellId_;
    }

    public static final int CELL_ID_FIELD_NUMBER = 1;
    private int cellId_ = 0;
    /**
     * <code>uint32 cell_id = 1;</code>
     * @return The cellId.
     */
    @java.lang.Override
    public int getCellId() {
      return cellId_;
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
      if (cellId_ != 0) {
        output.writeUInt32(1, cellId_);
      }
      if (oldCellId_ != 0) {
        output.writeUInt32(12, oldCellId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cellId_);
      }
      if (oldCellId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, oldCellId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify other = (emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify) obj;

      if (getOldCellId()
          != other.getOldCellId()) return false;
      if (getCellId()
          != other.getCellId()) return false;
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
      hash = (37 * hash) + OLD_CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOldCellId();
      hash = (37 * hash) + CELL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCellId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify prototype) {
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
     * Obf: PACLNPPOHOD
     * </pre>
     *
     * Protobuf type {@code RogueDungeonPlayerCellChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RogueDungeonPlayerCellChangeNotify)
        emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.internal_static_RogueDungeonPlayerCellChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.internal_static_RogueDungeonPlayerCellChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.class, emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.newBuilder()
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
        oldCellId_ = 0;
        cellId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.internal_static_RogueDungeonPlayerCellChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify build() {
        emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify buildPartial() {
        emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify result = new emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.oldCellId_ = oldCellId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.cellId_ = cellId_;
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
        if (other instanceof emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify other) {
        if (other == emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify.getDefaultInstance()) return this;
        if (other.getOldCellId() != 0) {
          setOldCellId(other.getOldCellId());
        }
        if (other.getCellId() != 0) {
          setCellId(other.getCellId());
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
                cellId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 96: {
                oldCellId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 96
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

      private int oldCellId_ ;
      /**
       * <code>uint32 old_cell_id = 12;</code>
       * @return The oldCellId.
       */
      @java.lang.Override
      public int getOldCellId() {
        return oldCellId_;
      }
      /**
       * <code>uint32 old_cell_id = 12;</code>
       * @param value The oldCellId to set.
       * @return This builder for chaining.
       */
      public Builder setOldCellId(int value) {

        oldCellId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 old_cell_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldCellId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        oldCellId_ = 0;
        onChanged();
        return this;
      }

      private int cellId_ ;
      /**
       * <code>uint32 cell_id = 1;</code>
       * @return The cellId.
       */
      @java.lang.Override
      public int getCellId() {
        return cellId_;
      }
      /**
       * <code>uint32 cell_id = 1;</code>
       * @param value The cellId to set.
       * @return This builder for chaining.
       */
      public Builder setCellId(int value) {

        cellId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cell_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCellId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        cellId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RogueDungeonPlayerCellChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:RogueDungeonPlayerCellChangeNotify)
    private static final emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify();
    }

    public static emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RogueDungeonPlayerCellChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<RogueDungeonPlayerCellChangeNotify>() {
      @java.lang.Override
      public RogueDungeonPlayerCellChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<RogueDungeonPlayerCellChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RogueDungeonPlayerCellChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RogueDungeonPlayerCellChangeNotifyOuterClass.RogueDungeonPlayerCellChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RogueDungeonPlayerCellChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RogueDungeonPlayerCellChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(RogueDungeonPlayerCellChangeNotify.pro" +
      "to\"J\n\"RogueDungeonPlayerCellChangeNotify" +
      "\022\023\n\013old_cell_id\030\014 \001(\r\022\017\n\007cell_id\030\001 \001(\rB\035" +
      "\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RogueDungeonPlayerCellChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RogueDungeonPlayerCellChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RogueDungeonPlayerCellChangeNotify_descriptor,
        new java.lang.String[] { "OldCellId", "CellId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
