// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CookRecipeData.proto

package emu.protoshift.net.oldproto;

public final class CookRecipeDataOuterClass {
  private CookRecipeDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CookRecipeDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CookRecipeData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 recipe_id = 5;</code>
     * @return The recipeId.
     */
    int getRecipeId();

    /**
     * <code>uint32 proficiency = 10;</code>
     * @return The proficiency.
     */
    int getProficiency();
  }
  /**
   * Protobuf type {@code CookRecipeData}
   */
  public static final class CookRecipeData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CookRecipeData)
      CookRecipeDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CookRecipeData.newBuilder() to construct.
    private CookRecipeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CookRecipeData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CookRecipeData();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.class, emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.Builder.class);
    }

    public static final int RECIPE_ID_FIELD_NUMBER = 5;
    private int recipeId_ = 0;
    /**
     * <code>uint32 recipe_id = 5;</code>
     * @return The recipeId.
     */
    @java.lang.Override
    public int getRecipeId() {
      return recipeId_;
    }

    public static final int PROFICIENCY_FIELD_NUMBER = 10;
    private int proficiency_ = 0;
    /**
     * <code>uint32 proficiency = 10;</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
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
      if (recipeId_ != 0) {
        output.writeUInt32(5, recipeId_);
      }
      if (proficiency_ != 0) {
        output.writeUInt32(10, proficiency_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recipeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, recipeId_);
      }
      if (proficiency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, proficiency_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData other = (emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData) obj;

      if (getRecipeId()
          != other.getRecipeId()) return false;
      if (getProficiency()
          != other.getProficiency()) return false;
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
      hash = (37 * hash) + RECIPE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRecipeId();
      hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
      hash = (53 * hash) + getProficiency();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData prototype) {
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
     * Protobuf type {@code CookRecipeData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CookRecipeData)
        emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.internal_static_CookRecipeData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.class, emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.newBuilder()
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
        recipeId_ = 0;
        proficiency_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.internal_static_CookRecipeData_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData build() {
        emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData buildPartial() {
        emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData result = new emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.recipeId_ = recipeId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.proficiency_ = proficiency_;
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
        if (other instanceof emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData) {
          return mergeFrom((emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData other) {
        if (other == emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance()) return this;
        if (other.getRecipeId() != 0) {
          setRecipeId(other.getRecipeId());
        }
        if (other.getProficiency() != 0) {
          setProficiency(other.getProficiency());
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
                recipeId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 80: {
                proficiency_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private int recipeId_ ;
      /**
       * <code>uint32 recipe_id = 5;</code>
       * @return The recipeId.
       */
      @java.lang.Override
      public int getRecipeId() {
        return recipeId_;
      }
      /**
       * <code>uint32 recipe_id = 5;</code>
       * @param value The recipeId to set.
       * @return This builder for chaining.
       */
      public Builder setRecipeId(int value) {

        recipeId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 recipe_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecipeId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        recipeId_ = 0;
        onChanged();
        return this;
      }

      private int proficiency_ ;
      /**
       * <code>uint32 proficiency = 10;</code>
       * @return The proficiency.
       */
      @java.lang.Override
      public int getProficiency() {
        return proficiency_;
      }
      /**
       * <code>uint32 proficiency = 10;</code>
       * @param value The proficiency to set.
       * @return This builder for chaining.
       */
      public Builder setProficiency(int value) {

        proficiency_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 proficiency = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearProficiency() {
        bitField0_ = (bitField0_ & ~0x00000002);
        proficiency_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CookRecipeData)
    }

    // @@protoc_insertion_point(class_scope:CookRecipeData)
    private static final emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData();
    }

    public static emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CookRecipeData>
        PARSER = new com.google.protobuf.AbstractParser<CookRecipeData>() {
      @java.lang.Override
      public CookRecipeData parsePartialFrom(
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

    public static com.google.protobuf.Parser<CookRecipeData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CookRecipeData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CookRecipeDataOuterClass.CookRecipeData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CookRecipeData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CookRecipeData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CookRecipeData.proto\"8\n\016CookRecipeData" +
      "\022\021\n\trecipe_id\030\005 \001(\r\022\023\n\013proficiency\030\n \001(\r" +
      "B\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CookRecipeData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CookRecipeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CookRecipeData_descriptor,
        new java.lang.String[] { "RecipeId", "Proficiency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
