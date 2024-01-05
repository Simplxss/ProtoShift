// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityAttachedModifier.proto

package emu.protoshift.net.newproto;

public final class AbilityAttachedModifierOuterClass {
  private AbilityAttachedModifierOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityAttachedModifierOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityAttachedModifier)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_serverbuff_modifier = 4;</code>
     * @return The isServerbuffModifier.
     */
    boolean getIsServerbuffModifier();

    /**
     * <code>bool is_invalid = 1;</code>
     * @return The isInvalid.
     */
    boolean getIsInvalid();

    /**
     * <code>int32 attach_name_hash = 5;</code>
     * @return The attachNameHash.
     */
    int getAttachNameHash();

    /**
     * <code>uint32 instanced_modifier_id = 3;</code>
     * @return The instancedModifierId.
     */
    int getInstancedModifierId();

    /**
     * <code>uint32 owner_entity_id = 2;</code>
     * @return The ownerEntityId.
     */
    int getOwnerEntityId();
  }
  /**
   * Protobuf type {@code AbilityAttachedModifier}
   */
  public static final class AbilityAttachedModifier extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityAttachedModifier)
      AbilityAttachedModifierOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityAttachedModifier.newBuilder() to construct.
    private AbilityAttachedModifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityAttachedModifier() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityAttachedModifier();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.class, emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder.class);
    }

    public static final int IS_SERVERBUFF_MODIFIER_FIELD_NUMBER = 4;
    private boolean isServerbuffModifier_ = false;
    /**
     * <code>bool is_serverbuff_modifier = 4;</code>
     * @return The isServerbuffModifier.
     */
    @java.lang.Override
    public boolean getIsServerbuffModifier() {
      return isServerbuffModifier_;
    }

    public static final int IS_INVALID_FIELD_NUMBER = 1;
    private boolean isInvalid_ = false;
    /**
     * <code>bool is_invalid = 1;</code>
     * @return The isInvalid.
     */
    @java.lang.Override
    public boolean getIsInvalid() {
      return isInvalid_;
    }

    public static final int ATTACH_NAME_HASH_FIELD_NUMBER = 5;
    private int attachNameHash_ = 0;
    /**
     * <code>int32 attach_name_hash = 5;</code>
     * @return The attachNameHash.
     */
    @java.lang.Override
    public int getAttachNameHash() {
      return attachNameHash_;
    }

    public static final int INSTANCED_MODIFIER_ID_FIELD_NUMBER = 3;
    private int instancedModifierId_ = 0;
    /**
     * <code>uint32 instanced_modifier_id = 3;</code>
     * @return The instancedModifierId.
     */
    @java.lang.Override
    public int getInstancedModifierId() {
      return instancedModifierId_;
    }

    public static final int OWNER_ENTITY_ID_FIELD_NUMBER = 2;
    private int ownerEntityId_ = 0;
    /**
     * <code>uint32 owner_entity_id = 2;</code>
     * @return The ownerEntityId.
     */
    @java.lang.Override
    public int getOwnerEntityId() {
      return ownerEntityId_;
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
      if (isInvalid_ != false) {
        output.writeBool(1, isInvalid_);
      }
      if (ownerEntityId_ != 0) {
        output.writeUInt32(2, ownerEntityId_);
      }
      if (instancedModifierId_ != 0) {
        output.writeUInt32(3, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        output.writeBool(4, isServerbuffModifier_);
      }
      if (attachNameHash_ != 0) {
        output.writeInt32(5, attachNameHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isInvalid_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isInvalid_);
      }
      if (ownerEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, ownerEntityId_);
      }
      if (instancedModifierId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, instancedModifierId_);
      }
      if (isServerbuffModifier_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isServerbuffModifier_);
      }
      if (attachNameHash_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, attachNameHash_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier other = (emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier) obj;

      if (getIsServerbuffModifier()
          != other.getIsServerbuffModifier()) return false;
      if (getIsInvalid()
          != other.getIsInvalid()) return false;
      if (getAttachNameHash()
          != other.getAttachNameHash()) return false;
      if (getInstancedModifierId()
          != other.getInstancedModifierId()) return false;
      if (getOwnerEntityId()
          != other.getOwnerEntityId()) return false;
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
      hash = (37 * hash) + IS_SERVERBUFF_MODIFIER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsServerbuffModifier());
      hash = (37 * hash) + IS_INVALID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInvalid());
      hash = (37 * hash) + ATTACH_NAME_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getAttachNameHash();
      hash = (37 * hash) + INSTANCED_MODIFIER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getInstancedModifierId();
      hash = (37 * hash) + OWNER_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerEntityId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier prototype) {
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
     * Protobuf type {@code AbilityAttachedModifier}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityAttachedModifier)
        emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifierOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.class, emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.newBuilder()
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
        isServerbuffModifier_ = false;
        isInvalid_ = false;
        attachNameHash_ = 0;
        instancedModifierId_ = 0;
        ownerEntityId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.internal_static_AbilityAttachedModifier_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier build() {
        emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier buildPartial() {
        emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier result = new emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isServerbuffModifier_ = isServerbuffModifier_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isInvalid_ = isInvalid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.attachNameHash_ = attachNameHash_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.instancedModifierId_ = instancedModifierId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.ownerEntityId_ = ownerEntityId_;
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
        if (other instanceof emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier) {
          return mergeFrom((emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier other) {
        if (other == emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier.getDefaultInstance()) return this;
        if (other.getIsServerbuffModifier() != false) {
          setIsServerbuffModifier(other.getIsServerbuffModifier());
        }
        if (other.getIsInvalid() != false) {
          setIsInvalid(other.getIsInvalid());
        }
        if (other.getAttachNameHash() != 0) {
          setAttachNameHash(other.getAttachNameHash());
        }
        if (other.getInstancedModifierId() != 0) {
          setInstancedModifierId(other.getInstancedModifierId());
        }
        if (other.getOwnerEntityId() != 0) {
          setOwnerEntityId(other.getOwnerEntityId());
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
                isInvalid_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 16: {
                ownerEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 16
              case 24: {
                instancedModifierId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 24
              case 32: {
                isServerbuffModifier_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 40: {
                attachNameHash_ = input.readInt32();
                bitField0_ |= 0x00000004;
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

      private boolean isServerbuffModifier_ ;
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @return The isServerbuffModifier.
       */
      @java.lang.Override
      public boolean getIsServerbuffModifier() {
        return isServerbuffModifier_;
      }
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @param value The isServerbuffModifier to set.
       * @return This builder for chaining.
       */
      public Builder setIsServerbuffModifier(boolean value) {

        isServerbuffModifier_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_serverbuff_modifier = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsServerbuffModifier() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isServerbuffModifier_ = false;
        onChanged();
        return this;
      }

      private boolean isInvalid_ ;
      /**
       * <code>bool is_invalid = 1;</code>
       * @return The isInvalid.
       */
      @java.lang.Override
      public boolean getIsInvalid() {
        return isInvalid_;
      }
      /**
       * <code>bool is_invalid = 1;</code>
       * @param value The isInvalid to set.
       * @return This builder for chaining.
       */
      public Builder setIsInvalid(boolean value) {

        isInvalid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_invalid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInvalid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isInvalid_ = false;
        onChanged();
        return this;
      }

      private int attachNameHash_ ;
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @return The attachNameHash.
       */
      @java.lang.Override
      public int getAttachNameHash() {
        return attachNameHash_;
      }
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @param value The attachNameHash to set.
       * @return This builder for chaining.
       */
      public Builder setAttachNameHash(int value) {

        attachNameHash_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 attach_name_hash = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAttachNameHash() {
        bitField0_ = (bitField0_ & ~0x00000004);
        attachNameHash_ = 0;
        onChanged();
        return this;
      }

      private int instancedModifierId_ ;
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @return The instancedModifierId.
       */
      @java.lang.Override
      public int getInstancedModifierId() {
        return instancedModifierId_;
      }
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @param value The instancedModifierId to set.
       * @return This builder for chaining.
       */
      public Builder setInstancedModifierId(int value) {

        instancedModifierId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 instanced_modifier_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstancedModifierId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        instancedModifierId_ = 0;
        onChanged();
        return this;
      }

      private int ownerEntityId_ ;
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @return The ownerEntityId.
       */
      @java.lang.Override
      public int getOwnerEntityId() {
        return ownerEntityId_;
      }
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @param value The ownerEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerEntityId(int value) {

        ownerEntityId_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_entity_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerEntityId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        ownerEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AbilityAttachedModifier)
    }

    // @@protoc_insertion_point(class_scope:AbilityAttachedModifier)
    private static final emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier();
    }

    public static emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityAttachedModifier>
        PARSER = new com.google.protobuf.AbstractParser<AbilityAttachedModifier>() {
      @java.lang.Override
      public AbilityAttachedModifier parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityAttachedModifier> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityAttachedModifier> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.AbilityAttachedModifierOuterClass.AbilityAttachedModifier getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityAttachedModifier_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityAttachedModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035AbilityAttachedModifier.proto\"\237\001\n\027Abil" +
      "ityAttachedModifier\022\036\n\026is_serverbuff_mod" +
      "ifier\030\004 \001(\010\022\022\n\nis_invalid\030\001 \001(\010\022\030\n\020attac" +
      "h_name_hash\030\005 \001(\005\022\035\n\025instanced_modifier_" +
      "id\030\003 \001(\r\022\027\n\017owner_entity_id\030\002 \001(\rB\035\n\033emu" +
      ".protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityAttachedModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityAttachedModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityAttachedModifier_descriptor,
        new java.lang.String[] { "IsServerbuffModifier", "IsInvalid", "AttachNameHash", "InstancedModifierId", "OwnerEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
