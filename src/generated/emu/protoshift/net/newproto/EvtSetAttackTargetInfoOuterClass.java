// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtSetAttackTargetInfo.proto

package emu.protoshift.net.newproto;

public final class EvtSetAttackTargetInfoOuterClass {
  private EvtSetAttackTargetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtSetAttackTargetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtSetAttackTargetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint32 attack_target_id = 5;</code>
     * @return The attackTargetId.
     */
    int getAttackTargetId();

    /**
     * <code>uint32 select_point_index = 2;</code>
     * @return The selectPointIndex.
     */
    int getSelectPointIndex();
  }
  /**
   * Protobuf type {@code EvtSetAttackTargetInfo}
   */
  public static final class EvtSetAttackTargetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtSetAttackTargetInfo)
      EvtSetAttackTargetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtSetAttackTargetInfo.newBuilder() to construct.
    private EvtSetAttackTargetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtSetAttackTargetInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtSetAttackTargetInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.internal_static_EvtSetAttackTargetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.internal_static_EvtSetAttackTargetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.class, emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 6;
    private int entityId_ = 0;
    /**
     * <code>uint32 entity_id = 6;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int ATTACK_TARGET_ID_FIELD_NUMBER = 5;
    private int attackTargetId_ = 0;
    /**
     * <code>uint32 attack_target_id = 5;</code>
     * @return The attackTargetId.
     */
    @java.lang.Override
    public int getAttackTargetId() {
      return attackTargetId_;
    }

    public static final int SELECT_POINT_INDEX_FIELD_NUMBER = 2;
    private int selectPointIndex_ = 0;
    /**
     * <code>uint32 select_point_index = 2;</code>
     * @return The selectPointIndex.
     */
    @java.lang.Override
    public int getSelectPointIndex() {
      return selectPointIndex_;
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
      if (selectPointIndex_ != 0) {
        output.writeUInt32(2, selectPointIndex_);
      }
      if (attackTargetId_ != 0) {
        output.writeUInt32(5, attackTargetId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(6, entityId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (selectPointIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, selectPointIndex_);
      }
      if (attackTargetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, attackTargetId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, entityId_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo other = (emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (getAttackTargetId()
          != other.getAttackTargetId()) return false;
      if (getSelectPointIndex()
          != other.getSelectPointIndex()) return false;
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
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + ATTACK_TARGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAttackTargetId();
      hash = (37 * hash) + SELECT_POINT_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getSelectPointIndex();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo prototype) {
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
     * Protobuf type {@code EvtSetAttackTargetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtSetAttackTargetInfo)
        emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.internal_static_EvtSetAttackTargetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.internal_static_EvtSetAttackTargetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.class, emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.newBuilder()
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
        entityId_ = 0;
        attackTargetId_ = 0;
        selectPointIndex_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.internal_static_EvtSetAttackTargetInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo build() {
        emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo buildPartial() {
        emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo result = new emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.attackTargetId_ = attackTargetId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.selectPointIndex_ = selectPointIndex_;
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
        if (other instanceof emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo) {
          return mergeFrom((emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo other) {
        if (other == emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getAttackTargetId() != 0) {
          setAttackTargetId(other.getAttackTargetId());
        }
        if (other.getSelectPointIndex() != 0) {
          setSelectPointIndex(other.getSelectPointIndex());
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
                selectPointIndex_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 16
              case 40: {
                attackTargetId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 48: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
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

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {

        entityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int attackTargetId_ ;
      /**
       * <code>uint32 attack_target_id = 5;</code>
       * @return The attackTargetId.
       */
      @java.lang.Override
      public int getAttackTargetId() {
        return attackTargetId_;
      }
      /**
       * <code>uint32 attack_target_id = 5;</code>
       * @param value The attackTargetId to set.
       * @return This builder for chaining.
       */
      public Builder setAttackTargetId(int value) {

        attackTargetId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 attack_target_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAttackTargetId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        attackTargetId_ = 0;
        onChanged();
        return this;
      }

      private int selectPointIndex_ ;
      /**
       * <code>uint32 select_point_index = 2;</code>
       * @return The selectPointIndex.
       */
      @java.lang.Override
      public int getSelectPointIndex() {
        return selectPointIndex_;
      }
      /**
       * <code>uint32 select_point_index = 2;</code>
       * @param value The selectPointIndex to set.
       * @return This builder for chaining.
       */
      public Builder setSelectPointIndex(int value) {

        selectPointIndex_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 select_point_index = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelectPointIndex() {
        bitField0_ = (bitField0_ & ~0x00000004);
        selectPointIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtSetAttackTargetInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtSetAttackTargetInfo)
    private static final emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo();
    }

    public static emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtSetAttackTargetInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtSetAttackTargetInfo>() {
      @java.lang.Override
      public EvtSetAttackTargetInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtSetAttackTargetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtSetAttackTargetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.EvtSetAttackTargetInfoOuterClass.EvtSetAttackTargetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtSetAttackTargetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtSetAttackTargetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034EvtSetAttackTargetInfo.proto\"a\n\026EvtSet" +
      "AttackTargetInfo\022\021\n\tentity_id\030\006 \001(\r\022\030\n\020a" +
      "ttack_target_id\030\005 \001(\r\022\032\n\022select_point_in" +
      "dex\030\002 \001(\rB\035\n\033emu.protoshift.net.newproto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EvtSetAttackTargetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtSetAttackTargetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtSetAttackTargetInfo_descriptor,
        new java.lang.String[] { "EntityId", "AttackTargetId", "SelectPointIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
