// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMetaModifierDurabilityChange.proto

package emu.protoshift.net.newproto;

public final class AbilityMetaModifierDurabilityChangeOuterClass {
  private AbilityMetaModifierDurabilityChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMetaModifierDurabilityChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMetaModifierDurabilityChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *sus
     * </pre>
     *
     * <code>float remain_durability = 9;</code>
     * @return The remainDurability.
     */
    float getRemainDurability();

    /**
     * <pre>
     *sus
     * </pre>
     *
     * <code>float reduce_durability = 6;</code>
     * @return The reduceDurability.
     */
    float getReduceDurability();
  }
  /**
   * Protobuf type {@code AbilityMetaModifierDurabilityChange}
   */
  public static final class AbilityMetaModifierDurabilityChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMetaModifierDurabilityChange)
      AbilityMetaModifierDurabilityChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMetaModifierDurabilityChange.newBuilder() to construct.
    private AbilityMetaModifierDurabilityChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMetaModifierDurabilityChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMetaModifierDurabilityChange();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.internal_static_AbilityMetaModifierDurabilityChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.internal_static_AbilityMetaModifierDurabilityChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.class, emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.Builder.class);
    }

    public static final int REMAIN_DURABILITY_FIELD_NUMBER = 9;
    private float remainDurability_ = 0F;
    /**
     * <pre>
     *sus
     * </pre>
     *
     * <code>float remain_durability = 9;</code>
     * @return The remainDurability.
     */
    @java.lang.Override
    public float getRemainDurability() {
      return remainDurability_;
    }

    public static final int REDUCE_DURABILITY_FIELD_NUMBER = 6;
    private float reduceDurability_ = 0F;
    /**
     * <pre>
     *sus
     * </pre>
     *
     * <code>float reduce_durability = 6;</code>
     * @return The reduceDurability.
     */
    @java.lang.Override
    public float getReduceDurability() {
      return reduceDurability_;
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
      if (java.lang.Float.floatToRawIntBits(reduceDurability_) != 0) {
        output.writeFloat(6, reduceDurability_);
      }
      if (java.lang.Float.floatToRawIntBits(remainDurability_) != 0) {
        output.writeFloat(9, remainDurability_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Float.floatToRawIntBits(reduceDurability_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, reduceDurability_);
      }
      if (java.lang.Float.floatToRawIntBits(remainDurability_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, remainDurability_);
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
      if (!(obj instanceof emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange other = (emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange) obj;

      if (java.lang.Float.floatToIntBits(getRemainDurability())
          != java.lang.Float.floatToIntBits(
              other.getRemainDurability())) return false;
      if (java.lang.Float.floatToIntBits(getReduceDurability())
          != java.lang.Float.floatToIntBits(
              other.getReduceDurability())) return false;
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
      hash = (37 * hash) + REMAIN_DURABILITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getRemainDurability());
      hash = (37 * hash) + REDUCE_DURABILITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getReduceDurability());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange prototype) {
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
     * Protobuf type {@code AbilityMetaModifierDurabilityChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMetaModifierDurabilityChange)
        emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.internal_static_AbilityMetaModifierDurabilityChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.internal_static_AbilityMetaModifierDurabilityChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.class, emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.newBuilder()
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
        remainDurability_ = 0F;
        reduceDurability_ = 0F;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.internal_static_AbilityMetaModifierDurabilityChange_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange build() {
        emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange buildPartial() {
        emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange result = new emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.remainDurability_ = remainDurability_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.reduceDurability_ = reduceDurability_;
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
        if (other instanceof emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange) {
          return mergeFrom((emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange other) {
        if (other == emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange.getDefaultInstance()) return this;
        if (other.getRemainDurability() != 0F) {
          setRemainDurability(other.getRemainDurability());
        }
        if (other.getReduceDurability() != 0F) {
          setReduceDurability(other.getReduceDurability());
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
              case 53: {
                reduceDurability_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 53
              case 77: {
                remainDurability_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 77
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

      private float remainDurability_ ;
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float remain_durability = 9;</code>
       * @return The remainDurability.
       */
      @java.lang.Override
      public float getRemainDurability() {
        return remainDurability_;
      }
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float remain_durability = 9;</code>
       * @param value The remainDurability to set.
       * @return This builder for chaining.
       */
      public Builder setRemainDurability(float value) {

        remainDurability_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float remain_durability = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRemainDurability() {
        bitField0_ = (bitField0_ & ~0x00000001);
        remainDurability_ = 0F;
        onChanged();
        return this;
      }

      private float reduceDurability_ ;
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float reduce_durability = 6;</code>
       * @return The reduceDurability.
       */
      @java.lang.Override
      public float getReduceDurability() {
        return reduceDurability_;
      }
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float reduce_durability = 6;</code>
       * @param value The reduceDurability to set.
       * @return This builder for chaining.
       */
      public Builder setReduceDurability(float value) {

        reduceDurability_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *sus
       * </pre>
       *
       * <code>float reduce_durability = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearReduceDurability() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reduceDurability_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:AbilityMetaModifierDurabilityChange)
    }

    // @@protoc_insertion_point(class_scope:AbilityMetaModifierDurabilityChange)
    private static final emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange();
    }

    public static emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMetaModifierDurabilityChange>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMetaModifierDurabilityChange>() {
      @java.lang.Override
      public AbilityMetaModifierDurabilityChange parsePartialFrom(
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

    public static com.google.protobuf.Parser<AbilityMetaModifierDurabilityChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMetaModifierDurabilityChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.AbilityMetaModifierDurabilityChangeOuterClass.AbilityMetaModifierDurabilityChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMetaModifierDurabilityChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMetaModifierDurabilityChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)AbilityMetaModifierDurabilityChange.pr" +
      "oto\"[\n#AbilityMetaModifierDurabilityChan" +
      "ge\022\031\n\021remain_durability\030\t \001(\002\022\031\n\021reduce_" +
      "durability\030\006 \001(\002B\035\n\033emu.protoshift.net.n" +
      "ewprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMetaModifierDurabilityChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMetaModifierDurabilityChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMetaModifierDurabilityChange_descriptor,
        new java.lang.String[] { "RemainDurability", "ReduceDurability", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
