// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LAOBOIBJGOK.proto

package emu.protoshift.net.oldproto;

public final class LAOBOIBJGOKOuterClass {
  private LAOBOIBJGOKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LAOBOIBJGOKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LAOBOIBJGOK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 instanced_ability_id = 5;</code>
     * @return The instancedAbilityId.
     */
    int getInstancedAbilityId();

    /**
     * <code>int32 local_id = 10;</code>
     * @return The localId.
     */
    int getLocalId();

    /**
     * <code>uint32 instanced_modifier_id = 7;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     * @return Whether the parentAbilityName field is set.
     */
    boolean hasParentAbilityName();
    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     * @return The parentAbilityName.
     */
    emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString getParentAbilityName();
    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     */
    emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder();

    /**
     * <code>uint32 caster_id = 14;</code>
     * @return The casterId.
     */
    int getCasterId();

    /**
     * <code>int32 modifier_local_id = 12;</code>
     * @return The modifierLocalId.
     */
    int getModifierLocalId();
  }
  /**
   * Protobuf type {@code LAOBOIBJGOK}
   */
  public static final class LAOBOIBJGOK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LAOBOIBJGOK)
      LAOBOIBJGOKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LAOBOIBJGOK.newBuilder() to construct.
    private LAOBOIBJGOK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LAOBOIBJGOK() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LAOBOIBJGOK();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.internal_static_LAOBOIBJGOK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.internal_static_LAOBOIBJGOK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.class, emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder.class);
    }

    private int bitField0_;
    public static final int INSTANCED_ABILITY_ID_FIELD_NUMBER = 5;
    private int instancedAbilityId_ = 0;
    /**
     * <code>uint32 instanced_ability_id = 5;</code>
     * @return The instancedAbilityId.
     */
    @java.lang.Override
    public int getInstancedAbilityId() {
      return instancedAbilityId_;
    }

    public static final int LOCAL_ID_FIELD_NUMBER = 10;
    private int localId_ = 0;
    /**
     * <code>int32 local_id = 10;</code>
     * @return The localId.
     */
    @java.lang.Override
    public int getLocalId() {
      return localId_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 7;
    private int instancedModifierId_ = 0;
    /**
     * <code>uint32 instanced_modifier_id = 7;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int PARENT_ABILITY_NAME_FIELD_NUMBER = 6;
    private emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString parentAbilityName_;
    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     * @return Whether the parentAbilityName field is set.
     */
    @java.lang.Override
    public boolean hasParentAbilityName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     * @return The parentAbilityName.
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString getParentAbilityName() {
      return parentAbilityName_ == null ? emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : parentAbilityName_;
    }
    /**
     * <code>.AbilityString parent_ability_name = 6;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder() {
      return parentAbilityName_ == null ? emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : parentAbilityName_;
    }

    public static final int CASTER_ID_FIELD_NUMBER = 14;
    private int casterId_ = 0;
    /**
     * <code>uint32 caster_id = 14;</code>
     * @return The casterId.
     */
    @java.lang.Override
    public int getCasterId() {
      return casterId_;
    }

    public static final int MODIFIER_LOCAL_ID_FIELD_NUMBER = 12;
    private int modifierLocalId_ = 0;
    /**
     * <code>int32 modifier_local_id = 12;</code>
     * @return The modifierLocalId.
     */
    @java.lang.Override
    public int getModifierLocalId() {
      return modifierLocalId_;
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
      if (instancedAbilityId_ != 0) {
        output.writeUInt32(5, instancedAbilityId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(6, getParentAbilityName());
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(7, instancedModifierId_);
      }
      if (localId_ != 0) {
        output.writeInt32(10, localId_);
      }
      if (modifierLocalId_ != 0) {
        output.writeInt32(12, modifierLocalId_);
      }
      if (casterId_ != 0) {
        output.writeUInt32(14, casterId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (instancedAbilityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, instancedAbilityId_);
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getParentAbilityName());
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, instancedModifierId_);
      }
      if (localId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, localId_);
      }
      if (modifierLocalId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(12, modifierLocalId_);
      }
      if (casterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, casterId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK other = (emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK) obj;

      if (getInstancedAbilityId()
          != other.getInstancedAbilityId()) return false;
      if (getLocalId()
          != other.getLocalId()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (hasParentAbilityName() != other.hasParentAbilityName()) return false;
      if (hasParentAbilityName()) {
        if (!getParentAbilityName()
            .equals(other.getParentAbilityName())) return false;
      }
      if (getCasterId()
          != other.getCasterId()) return false;
      if (getModifierLocalId()
          != other.getModifierLocalId()) return false;
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
      hash = (37 * hash) + INSTANCED_ABILITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedAbilityId();
      hash = (37 * hash) + LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLocalId();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      if (hasParentAbilityName()) {
        hash = (37 * hash) + PARENT_ABILITY_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getParentAbilityName().hashCode();
      }
      hash = (37 * hash) + CASTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCasterId();
      hash = (37 * hash) + MODIFIER_LOCAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getModifierLocalId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK prototype) {
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
     * Protobuf type {@code LAOBOIBJGOK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LAOBOIBJGOK)
        emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.internal_static_LAOBOIBJGOK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.internal_static_LAOBOIBJGOK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.class, emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.newBuilder()
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
          getParentAbilityNameFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        instancedAbilityId_ = 0;
        localId_ = 0;
        instancedModifierId_ = 0;
        parentAbilityName_ = null;
        if (parentAbilityNameBuilder_ != null) {
          parentAbilityNameBuilder_.dispose();
          parentAbilityNameBuilder_ = null;
        }
        casterId_ = 0;
        modifierLocalId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.internal_static_LAOBOIBJGOK_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK build() {
        emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK buildPartial() {
        emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK result = new emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.instancedAbilityId_ = instancedAbilityId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.localId_ = localId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.instancedModifierId_ = instancedModifierId_;
        }
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.parentAbilityName_ = parentAbilityNameBuilder_ == null
              ? parentAbilityName_
              : parentAbilityNameBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.casterId_ = casterId_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.modifierLocalId_ = modifierLocalId_;
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
        if (other instanceof emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK) {
          return mergeFrom((emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK other) {
        if (other == emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK.getDefaultInstance()) return this;
        if (other.getInstancedAbilityId() != 0) {
          setInstancedAbilityId(other.getInstancedAbilityId());
        }
        if (other.getLocalId() != 0) {
          setLocalId(other.getLocalId());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.hasParentAbilityName()) {
          mergeParentAbilityName(other.getParentAbilityName());
        }
        if (other.getCasterId() != 0) {
          setCasterId(other.getCasterId());
        }
        if (other.getModifierLocalId() != 0) {
          setModifierLocalId(other.getModifierLocalId());
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
                instancedAbilityId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 50: {
                input.readMessage(
                    getParentAbilityNameFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 50
              case 56: {
                instancedModifierId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 56
              case 80: {
                localId_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
              case 96: {
                modifierLocalId_ = input.readInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 96
              case 112: {
                casterId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 112
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

      private int instancedAbilityId_ ;
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @return The instancedAbilityId.
       */
      @java.lang.Override
      public int getInstancedAbilityId() {
        return instancedAbilityId_;
      }
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @param value The instancedAbilityId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedAbilityId(int value) {

        instancedAbilityId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_ability_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedAbilityId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        instancedAbilityId_ = 0;
        onChanged();
        return this;
      }

      private int localId_ ;
      /**
       * <code>int32 local_id = 10;</code>
       * @return The localId.
       */
      @java.lang.Override
      public int getLocalId() {
        return localId_;
      }
      /**
       * <code>int32 local_id = 10;</code>
       * @param value The localId to set.
       * @return This builder for chaining.
       */
      public Builder setLocalId(int value) {

        localId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 local_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLocalId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        localId_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 7;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 7;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {

        instancedModifierId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString parentAbilityName_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> parentAbilityNameBuilder_;
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       * @return Whether the parentAbilityName field is set.
       */
      public boolean hasParentAbilityName() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       * @return The parentAbilityName.
       */
      public emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString getParentAbilityName() {
        if (parentAbilityNameBuilder_ == null) {
          return parentAbilityName_ == null ? emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : parentAbilityName_;
        } else {
          return parentAbilityNameBuilder_.getMessage();
        }
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public Builder setParentAbilityName(emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (parentAbilityNameBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          parentAbilityName_ = value;
        } else {
          parentAbilityNameBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public Builder setParentAbilityName(
          emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.Builder builderForValue) {
        if (parentAbilityNameBuilder_ == null) {
          parentAbilityName_ = builderForValue.build();
        } else {
          parentAbilityNameBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public Builder mergeParentAbilityName(emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString value) {
        if (parentAbilityNameBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
            parentAbilityName_ != null &&
            parentAbilityName_ != emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance()) {
            getParentAbilityNameBuilder().mergeFrom(value);
          } else {
            parentAbilityName_ = value;
          }
        } else {
          parentAbilityNameBuilder_.mergeFrom(value);
        }
        if (parentAbilityName_ != null) {
          bitField0_ |= 0x00000008;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public Builder clearParentAbilityName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        parentAbilityName_ = null;
        if (parentAbilityNameBuilder_ != null) {
          parentAbilityNameBuilder_.dispose();
          parentAbilityNameBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.Builder getParentAbilityNameBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getParentAbilityNameFieldBuilder().getBuilder();
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      public emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder getParentAbilityNameOrBuilder() {
        if (parentAbilityNameBuilder_ != null) {
          return parentAbilityNameBuilder_.getMessageOrBuilder();
        } else {
          return parentAbilityName_ == null ?
              emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.getDefaultInstance() : parentAbilityName_;
        }
      }
      /**
       * <code>.AbilityString parent_ability_name = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder> 
          getParentAbilityNameFieldBuilder() {
        if (parentAbilityNameBuilder_ == null) {
          parentAbilityNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityString.Builder, emu.protoshift.net.oldproto.AbilityStringOuterClass.AbilityStringOrBuilder>(
                  getParentAbilityName(),
                  getParentForChildren(),
                  isClean());
          parentAbilityName_ = null;
        }
        return parentAbilityNameBuilder_;
      }

      private int casterId_ ;
      /**
       * <code>uint32 caster_id = 14;</code>
       * @return The casterId.
       */
      @java.lang.Override
      public int getCasterId() {
        return casterId_;
      }
      /**
       * <code>uint32 caster_id = 14;</code>
       * @param value The casterId to set.
       * @return This builder for chaining.
       */
      public Builder setCasterId(int value) {

        casterId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 caster_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCasterId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        casterId_ = 0;
        onChanged();
        return this;
      }

      private int modifierLocalId_ ;
      /**
       * <code>int32 modifier_local_id = 12;</code>
       * @return The modifierLocalId.
       */
      @java.lang.Override
      public int getModifierLocalId() {
        return modifierLocalId_;
      }
      /**
       * <code>int32 modifier_local_id = 12;</code>
       * @param value The modifierLocalId to set.
       * @return This builder for chaining.
       */
      public Builder setModifierLocalId(int value) {

        modifierLocalId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>int32 modifier_local_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearModifierLocalId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        modifierLocalId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LAOBOIBJGOK)
    }

    // @@protoc_insertion_point(class_scope:LAOBOIBJGOK)
    private static final emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK();
    }

    public static emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LAOBOIBJGOK>
        PARSER = new com.google.protobuf.AbstractParser<LAOBOIBJGOK>() {
      @java.lang.Override
      public LAOBOIBJGOK parsePartialFrom(
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

    public static com.google.protobuf.Parser<LAOBOIBJGOK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LAOBOIBJGOK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.LAOBOIBJGOKOuterClass.LAOBOIBJGOK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LAOBOIBJGOK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LAOBOIBJGOK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LAOBOIBJGOK.proto\032\023AbilityString.proto" +
      "\"\267\001\n\013LAOBOIBJGOK\022\034\n\024instanced_ability_id" +
      "\030\005 \001(\r\022\020\n\010local_id\030\n \001(\005\022\035\n\025instanced_mo" +
      "difier_id\030\007 \001(\r\022+\n\023parent_ability_name\030\006" +
      " \001(\0132\016.AbilityString\022\021\n\tcaster_id\030\016 \001(\r\022" +
      "\031\n\021modifier_local_id\030\014 \001(\005B\035\n\033emu.protos" +
      "hift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.AbilityStringOuterClass.getDescriptor(),
        });
    internal_static_LAOBOIBJGOK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LAOBOIBJGOK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LAOBOIBJGOK_descriptor,
        new java.lang.String[] { "InstancedAbilityId", "LocalId", "InstancedModifierId", "ParentAbilityName", "CasterId", "ModifierLocalId", });
    emu.protoshift.net.oldproto.AbilityStringOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
