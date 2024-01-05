// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Equip.proto

package emu.protoshift.net.newproto;

public final class EquipOuterClass {
  private EquipOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EquipOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Equip)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    boolean hasReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary getReliquary();
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder();

    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    boolean hasWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    emu.protoshift.net.newproto.WeaponOuterClass.Weapon getWeapon();
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder();

    /**
     * <code>bool is_locked = 3;</code>
     * @return The isLocked.
     */
    boolean getIsLocked();

    emu.protoshift.net.newproto.EquipOuterClass.Equip.DetailCase getDetailCase();
  }
  /**
   * Protobuf type {@code Equip}
   */
  public static final class Equip extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Equip)
      EquipOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Equip.newBuilder() to construct.
    private Equip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Equip() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Equip();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.EquipOuterClass.internal_static_Equip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.EquipOuterClass.internal_static_Equip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.EquipOuterClass.Equip.class, emu.protoshift.net.newproto.EquipOuterClass.Equip.Builder.class);
    }

    private int detailCase_ = 0;
    @SuppressWarnings("serial")
    private java.lang.Object detail_;
    public enum DetailCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      RELIQUARY(1),
      WEAPON(2),
      DETAIL_NOT_SET(0);
      private final int value;
      private DetailCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static DetailCase valueOf(int value) {
        return forNumber(value);
      }

      public static DetailCase forNumber(int value) {
        switch (value) {
          case 1: return RELIQUARY;
          case 2: return WEAPON;
          case 0: return DETAIL_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public DetailCase
    getDetailCase() {
      return DetailCase.forNumber(
          detailCase_);
    }

    public static final int RELIQUARY_FIELD_NUMBER = 1;
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return Whether the reliquary field is set.
     */
    @java.lang.Override
    public boolean hasReliquary() {
      return detailCase_ == 1;
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     * @return The reliquary.
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary getReliquary() {
      if (detailCase_ == 1) {
         return (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }
    /**
     * <code>.Reliquary reliquary = 1;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
      if (detailCase_ == 1) {
         return (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_;
      }
      return emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
    }

    public static final int WEAPON_FIELD_NUMBER = 2;
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return Whether the weapon field is set.
     */
    @java.lang.Override
    public boolean hasWeapon() {
      return detailCase_ == 2;
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     * @return The weapon.
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.WeaponOuterClass.Weapon getWeapon() {
      if (detailCase_ == 2) {
         return (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_;
      }
      return emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
    }
    /**
     * <code>.Weapon weapon = 2;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
      if (detailCase_ == 2) {
         return (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_;
      }
      return emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
    }

    public static final int IS_LOCKED_FIELD_NUMBER = 3;
    private boolean isLocked_ = false;
    /**
     * <code>bool is_locked = 3;</code>
     * @return The isLocked.
     */
    @java.lang.Override
    public boolean getIsLocked() {
      return isLocked_;
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
      if (detailCase_ == 1) {
        output.writeMessage(1, (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 2) {
        output.writeMessage(2, (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_);
      }
      if (isLocked_ != false) {
        output.writeBool(3, isLocked_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (detailCase_ == 1) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_);
      }
      if (detailCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_);
      }
      if (isLocked_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, isLocked_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.EquipOuterClass.Equip)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.EquipOuterClass.Equip other = (emu.protoshift.net.newproto.EquipOuterClass.Equip) obj;

      if (getIsLocked()
          != other.getIsLocked()) return false;
      if (!getDetailCase().equals(other.getDetailCase())) return false;
      switch (detailCase_) {
        case 1:
          if (!getReliquary()
              .equals(other.getReliquary())) return false;
          break;
        case 2:
          if (!getWeapon()
              .equals(other.getWeapon())) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + IS_LOCKED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsLocked());
      switch (detailCase_) {
        case 1:
          hash = (37 * hash) + RELIQUARY_FIELD_NUMBER;
          hash = (53 * hash) + getReliquary().hashCode();
          break;
        case 2:
          hash = (37 * hash) + WEAPON_FIELD_NUMBER;
          hash = (53 * hash) + getWeapon().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.EquipOuterClass.Equip parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.EquipOuterClass.Equip prototype) {
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
     * Protobuf type {@code Equip}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Equip)
        emu.protoshift.net.newproto.EquipOuterClass.EquipOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.EquipOuterClass.internal_static_Equip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.EquipOuterClass.Equip.class, emu.protoshift.net.newproto.EquipOuterClass.Equip.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.EquipOuterClass.Equip.newBuilder()
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
        if (reliquaryBuilder_ != null) {
          reliquaryBuilder_.clear();
        }
        if (weaponBuilder_ != null) {
          weaponBuilder_.clear();
        }
        isLocked_ = false;
        detailCase_ = 0;
        detail_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.EquipOuterClass.internal_static_Equip_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EquipOuterClass.Equip getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.EquipOuterClass.Equip.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EquipOuterClass.Equip build() {
        emu.protoshift.net.newproto.EquipOuterClass.Equip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.EquipOuterClass.Equip buildPartial() {
        emu.protoshift.net.newproto.EquipOuterClass.Equip result = new emu.protoshift.net.newproto.EquipOuterClass.Equip(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.EquipOuterClass.Equip result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.isLocked_ = isLocked_;
        }
      }

      private void buildPartialOneofs(emu.protoshift.net.newproto.EquipOuterClass.Equip result) {
        result.detailCase_ = detailCase_;
        result.detail_ = this.detail_;
        if (detailCase_ == 1 &&
            reliquaryBuilder_ != null) {
          result.detail_ = reliquaryBuilder_.build();
        }
        if (detailCase_ == 2 &&
            weaponBuilder_ != null) {
          result.detail_ = weaponBuilder_.build();
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
        if (other instanceof emu.protoshift.net.newproto.EquipOuterClass.Equip) {
          return mergeFrom((emu.protoshift.net.newproto.EquipOuterClass.Equip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.EquipOuterClass.Equip other) {
        if (other == emu.protoshift.net.newproto.EquipOuterClass.Equip.getDefaultInstance()) return this;
        if (other.getIsLocked() != false) {
          setIsLocked(other.getIsLocked());
        }
        switch (other.getDetailCase()) {
          case RELIQUARY: {
            mergeReliquary(other.getReliquary());
            break;
          }
          case WEAPON: {
            mergeWeapon(other.getWeapon());
            break;
          }
          case DETAIL_NOT_SET: {
            break;
          }
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
              case 10: {
                input.readMessage(
                    getReliquaryFieldBuilder().getBuilder(),
                    extensionRegistry);
                detailCase_ = 1;
                break;
              } // case 10
              case 18: {
                input.readMessage(
                    getWeaponFieldBuilder().getBuilder(),
                    extensionRegistry);
                detailCase_ = 2;
                break;
              } // case 18
              case 24: {
                isLocked_ = input.readBool();
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
      private int detailCase_ = 0;
      private java.lang.Object detail_;
      public DetailCase
          getDetailCase() {
        return DetailCase.forNumber(
            detailCase_);
      }

      public Builder clearDetail() {
        detailCase_ = 0;
        detail_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary, emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.Builder, emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder> reliquaryBuilder_;
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return Whether the reliquary field is set.
       */
      @java.lang.Override
      public boolean hasReliquary() {
        return detailCase_ == 1;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       * @return The reliquary.
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary getReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1) {
            return (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        } else {
          if (detailCase_ == 1) {
            return reliquaryBuilder_.getMessage();
          }
          return emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(value);
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder setReliquary(
          emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.Builder builderForValue) {
        if (reliquaryBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          reliquaryBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder mergeReliquary(emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary value) {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1 &&
              detail_ != emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance()) {
            detail_ = emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.newBuilder((emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 1) {
            reliquaryBuilder_.mergeFrom(value);
          } else {
            reliquaryBuilder_.setMessage(value);
          }
        }
        detailCase_ = 1;
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public Builder clearReliquary() {
        if (reliquaryBuilder_ == null) {
          if (detailCase_ == 1) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 1) {
            detailCase_ = 0;
            detail_ = null;
          }
          reliquaryBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      public emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.Builder getReliquaryBuilder() {
        return getReliquaryFieldBuilder().getBuilder();
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder getReliquaryOrBuilder() {
        if ((detailCase_ == 1) && (reliquaryBuilder_ != null)) {
          return reliquaryBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 1) {
            return (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_;
          }
          return emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
        }
      }
      /**
       * <code>.Reliquary reliquary = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary, emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.Builder, emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder> 
          getReliquaryFieldBuilder() {
        if (reliquaryBuilder_ == null) {
          if (!(detailCase_ == 1)) {
            detail_ = emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.getDefaultInstance();
          }
          reliquaryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary, emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary.Builder, emu.protoshift.net.newproto.ReliquaryOuterClass.ReliquaryOrBuilder>(
                  (emu.protoshift.net.newproto.ReliquaryOuterClass.Reliquary) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 1;
        onChanged();
        return reliquaryBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.WeaponOuterClass.Weapon, emu.protoshift.net.newproto.WeaponOuterClass.Weapon.Builder, emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder> weaponBuilder_;
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return Whether the weapon field is set.
       */
      @java.lang.Override
      public boolean hasWeapon() {
        return detailCase_ == 2;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       * @return The weapon.
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.WeaponOuterClass.Weapon getWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2) {
            return (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_;
          }
          return emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
        } else {
          if (detailCase_ == 2) {
            return weaponBuilder_.getMessage();
          }
          return emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(emu.protoshift.net.newproto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          detail_ = value;
          onChanged();
        } else {
          weaponBuilder_.setMessage(value);
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder setWeapon(
          emu.protoshift.net.newproto.WeaponOuterClass.Weapon.Builder builderForValue) {
        if (weaponBuilder_ == null) {
          detail_ = builderForValue.build();
          onChanged();
        } else {
          weaponBuilder_.setMessage(builderForValue.build());
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder mergeWeapon(emu.protoshift.net.newproto.WeaponOuterClass.Weapon value) {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2 &&
              detail_ != emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance()) {
            detail_ = emu.protoshift.net.newproto.WeaponOuterClass.Weapon.newBuilder((emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_)
                .mergeFrom(value).buildPartial();
          } else {
            detail_ = value;
          }
          onChanged();
        } else {
          if (detailCase_ == 2) {
            weaponBuilder_.mergeFrom(value);
          } else {
            weaponBuilder_.setMessage(value);
          }
        }
        detailCase_ = 2;
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public Builder clearWeapon() {
        if (weaponBuilder_ == null) {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
            onChanged();
          }
        } else {
          if (detailCase_ == 2) {
            detailCase_ = 0;
            detail_ = null;
          }
          weaponBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      public emu.protoshift.net.newproto.WeaponOuterClass.Weapon.Builder getWeaponBuilder() {
        return getWeaponFieldBuilder().getBuilder();
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      @java.lang.Override
      public emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder getWeaponOrBuilder() {
        if ((detailCase_ == 2) && (weaponBuilder_ != null)) {
          return weaponBuilder_.getMessageOrBuilder();
        } else {
          if (detailCase_ == 2) {
            return (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_;
          }
          return emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
        }
      }
      /**
       * <code>.Weapon weapon = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.protoshift.net.newproto.WeaponOuterClass.Weapon, emu.protoshift.net.newproto.WeaponOuterClass.Weapon.Builder, emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder> 
          getWeaponFieldBuilder() {
        if (weaponBuilder_ == null) {
          if (!(detailCase_ == 2)) {
            detail_ = emu.protoshift.net.newproto.WeaponOuterClass.Weapon.getDefaultInstance();
          }
          weaponBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.protoshift.net.newproto.WeaponOuterClass.Weapon, emu.protoshift.net.newproto.WeaponOuterClass.Weapon.Builder, emu.protoshift.net.newproto.WeaponOuterClass.WeaponOrBuilder>(
                  (emu.protoshift.net.newproto.WeaponOuterClass.Weapon) detail_,
                  getParentForChildren(),
                  isClean());
          detail_ = null;
        }
        detailCase_ = 2;
        onChanged();
        return weaponBuilder_;
      }

      private boolean isLocked_ ;
      /**
       * <code>bool is_locked = 3;</code>
       * @return The isLocked.
       */
      @java.lang.Override
      public boolean getIsLocked() {
        return isLocked_;
      }
      /**
       * <code>bool is_locked = 3;</code>
       * @param value The isLocked to set.
       * @return This builder for chaining.
       */
      public Builder setIsLocked(boolean value) {

        isLocked_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_locked = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsLocked() {
        bitField0_ = (bitField0_ & ~0x00000004);
        isLocked_ = false;
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


      // @@protoc_insertion_point(builder_scope:Equip)
    }

    // @@protoc_insertion_point(class_scope:Equip)
    private static final emu.protoshift.net.newproto.EquipOuterClass.Equip DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.EquipOuterClass.Equip();
    }

    public static emu.protoshift.net.newproto.EquipOuterClass.Equip getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Equip>
        PARSER = new com.google.protobuf.AbstractParser<Equip>() {
      @java.lang.Override
      public Equip parsePartialFrom(
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

    public static com.google.protobuf.Parser<Equip> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Equip> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.EquipOuterClass.Equip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Equip_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Equip_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Equip.proto\032\017Reliquary.proto\032\014Weapon.p" +
      "roto\"`\n\005Equip\022\037\n\treliquary\030\001 \001(\0132\n.Reliq" +
      "uaryH\000\022\031\n\006weapon\030\002 \001(\0132\007.WeaponH\000\022\021\n\tis_" +
      "locked\030\003 \001(\010B\010\n\006detailB\035\n\033emu.protoshift" +
      ".net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.newproto.ReliquaryOuterClass.getDescriptor(),
          emu.protoshift.net.newproto.WeaponOuterClass.getDescriptor(),
        });
    internal_static_Equip_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Equip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Equip_descriptor,
        new java.lang.String[] { "Reliquary", "Weapon", "IsLocked", "Detail", });
    emu.protoshift.net.newproto.ReliquaryOuterClass.getDescriptor();
    emu.protoshift.net.newproto.WeaponOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
