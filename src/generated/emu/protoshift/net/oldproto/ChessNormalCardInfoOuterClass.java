// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChessNormalCardInfo.proto

package emu.protoshift.net.oldproto;

public final class ChessNormalCardInfoOuterClass {
  private ChessNormalCardInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChessNormalCardInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChessNormalCardInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 cost_points = 11;</code>
     * @return The costPoints.
     */
    int getCostPoints();

    /**
     * <code>bool is_attach_curse = 15;</code>
     * @return The isAttachCurse.
     */
    boolean getIsAttachCurse();

    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * Protobuf type {@code ChessNormalCardInfo}
   */
  public static final class ChessNormalCardInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChessNormalCardInfo)
      ChessNormalCardInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChessNormalCardInfo.newBuilder() to construct.
    private ChessNormalCardInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChessNormalCardInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChessNormalCardInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.class, emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder.class);
    }

    public static final int COST_POINTS_FIELD_NUMBER = 11;
    private int costPoints_ = 0;
    /**
     * <code>uint32 cost_points = 11;</code>
     * @return The costPoints.
     */
    @java.lang.Override
    public int getCostPoints() {
      return costPoints_;
    }

    public static final int IS_ATTACH_CURSE_FIELD_NUMBER = 15;
    private boolean isAttachCurse_ = false;
    /**
     * <code>bool is_attach_curse = 15;</code>
     * @return The isAttachCurse.
     */
    @java.lang.Override
    public boolean getIsAttachCurse() {
      return isAttachCurse_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 1;
    private int cardId_ = 0;
    /**
     * <code>uint32 card_id = 1;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(1, cardId_);
      }
      if (costPoints_ != 0) {
        output.writeUInt32(11, costPoints_);
      }
      if (isAttachCurse_ != false) {
        output.writeBool(15, isAttachCurse_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cardId_);
      }
      if (costPoints_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, costPoints_);
      }
      if (isAttachCurse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isAttachCurse_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo other = (emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo) obj;

      if (getCostPoints()
          != other.getCostPoints()) return false;
      if (getIsAttachCurse()
          != other.getIsAttachCurse()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + COST_POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getCostPoints();
      hash = (37 * hash) + IS_ATTACH_CURSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAttachCurse());
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo prototype) {
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
     * Protobuf type {@code ChessNormalCardInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChessNormalCardInfo)
        emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.class, emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.newBuilder()
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
        costPoints_ = 0;
        isAttachCurse_ = false;
        cardId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.internal_static_ChessNormalCardInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo build() {
        emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo buildPartial() {
        emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo result = new emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.costPoints_ = costPoints_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isAttachCurse_ = isAttachCurse_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.cardId_ = cardId_;
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
        if (other instanceof emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo other) {
        if (other == emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo.getDefaultInstance()) return this;
        if (other.getCostPoints() != 0) {
          setCostPoints(other.getCostPoints());
        }
        if (other.getIsAttachCurse() != false) {
          setIsAttachCurse(other.getIsAttachCurse());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
                cardId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 8
              case 88: {
                costPoints_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
              case 120: {
                isAttachCurse_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 120
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

      private int costPoints_ ;
      /**
       * <code>uint32 cost_points = 11;</code>
       * @return The costPoints.
       */
      @java.lang.Override
      public int getCostPoints() {
        return costPoints_;
      }
      /**
       * <code>uint32 cost_points = 11;</code>
       * @param value The costPoints to set.
       * @return This builder for chaining.
       */
      public Builder setCostPoints(int value) {

        costPoints_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cost_points = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostPoints() {
        bitField0_ = (bitField0_ & ~0x00000001);
        costPoints_ = 0;
        onChanged();
        return this;
      }

      private boolean isAttachCurse_ ;
      /**
       * <code>bool is_attach_curse = 15;</code>
       * @return The isAttachCurse.
       */
      @java.lang.Override
      public boolean getIsAttachCurse() {
        return isAttachCurse_;
      }
      /**
       * <code>bool is_attach_curse = 15;</code>
       * @param value The isAttachCurse to set.
       * @return This builder for chaining.
       */
      public Builder setIsAttachCurse(boolean value) {

        isAttachCurse_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_attach_curse = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAttachCurse() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isAttachCurse_ = false;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 1;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {

        cardId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChessNormalCardInfo)
    }

    // @@protoc_insertion_point(class_scope:ChessNormalCardInfo)
    private static final emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo();
    }

    public static emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChessNormalCardInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChessNormalCardInfo>() {
      @java.lang.Override
      public ChessNormalCardInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChessNormalCardInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChessNormalCardInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.ChessNormalCardInfoOuterClass.ChessNormalCardInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChessNormalCardInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChessNormalCardInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ChessNormalCardInfo.proto\"T\n\023ChessNorm" +
      "alCardInfo\022\023\n\013cost_points\030\013 \001(\r\022\027\n\017is_at" +
      "tach_curse\030\017 \001(\010\022\017\n\007card_id\030\001 \001(\rB\035\n\033emu" +
      ".protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChessNormalCardInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChessNormalCardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChessNormalCardInfo_descriptor,
        new java.lang.String[] { "CostPoints", "IsAttachCurse", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
