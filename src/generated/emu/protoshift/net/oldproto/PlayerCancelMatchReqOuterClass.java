// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerCancelMatchReq.proto

package emu.protoshift.net.oldproto;

public final class PlayerCancelMatchReqOuterClass {
  private PlayerCancelMatchReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerCancelMatchReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerCancelMatchReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    int getMatchTypeValue();
    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The matchType.
     */
    emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType getMatchType();
  }
  /**
   * <pre>
   * CmdId: 9117
   * Obf: HOBFLBCLPIC
   * </pre>
   *
   * Protobuf type {@code PlayerCancelMatchReq}
   */
  public static final class PlayerCancelMatchReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerCancelMatchReq)
      PlayerCancelMatchReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerCancelMatchReq.newBuilder() to construct.
    private PlayerCancelMatchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerCancelMatchReq() {
      matchType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerCancelMatchReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.internal_static_PlayerCancelMatchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.internal_static_PlayerCancelMatchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.class, emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.Builder.class);
    }

    public static final int MATCH_TYPE_FIELD_NUMBER = 7;
    private int matchType_ = 0;
    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <code>.MatchType match_type = 7;</code>
     * @return The matchType.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
      emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType result = emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.forNumber(matchType_);
      return result == null ? emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
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
      if (matchType_ != emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        output.writeEnum(7, matchType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (matchType_ != emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, matchType_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq other = (emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq) obj;

      if (matchType_ != other.matchType_) return false;
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
      hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + matchType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq prototype) {
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
     * CmdId: 9117
     * Obf: HOBFLBCLPIC
     * </pre>
     *
     * Protobuf type {@code PlayerCancelMatchReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerCancelMatchReq)
        emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.internal_static_PlayerCancelMatchReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.internal_static_PlayerCancelMatchReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.class, emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.newBuilder()
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
        matchType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.internal_static_PlayerCancelMatchReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq build() {
        emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq buildPartial() {
        emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq result = new emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.matchType_ = matchType_;
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
        if (other instanceof emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq) {
          return mergeFrom((emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq other) {
        if (other == emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq.getDefaultInstance()) return this;
        if (other.matchType_ != 0) {
          setMatchTypeValue(other.getMatchTypeValue());
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
              case 56: {
                matchType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
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

      private int matchType_ = 0;
      /**
       * <code>.MatchType match_type = 7;</code>
       * @return The enum numeric value on the wire for matchType.
       */
      @java.lang.Override public int getMatchTypeValue() {
        return matchType_;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @param value The enum numeric value on the wire for matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchTypeValue(int value) {
        matchType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @return The matchType.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType getMatchType() {
        emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType result = emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.forNumber(matchType_);
        return result == null ? emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @param value The matchType to set.
       * @return This builder for chaining.
       */
      public Builder setMatchType(emu.protoshift.net.oldproto.MatchTypeOuterClass.MatchType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        matchType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchType match_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMatchType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        matchType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerCancelMatchReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerCancelMatchReq)
    private static final emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq();
    }

    public static emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerCancelMatchReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerCancelMatchReq>() {
      @java.lang.Override
      public PlayerCancelMatchReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerCancelMatchReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerCancelMatchReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PlayerCancelMatchReqOuterClass.PlayerCancelMatchReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerCancelMatchReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerCancelMatchReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerCancelMatchReq.proto\032\017MatchType." +
      "proto\"6\n\024PlayerCancelMatchReq\022\036\n\nmatch_t" +
      "ype\030\007 \001(\0162\n.MatchTypeB\035\n\033emu.protoshift." +
      "net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.MatchTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerCancelMatchReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerCancelMatchReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerCancelMatchReq_descriptor,
        new java.lang.String[] { "MatchType", });
    emu.protoshift.net.oldproto.MatchTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
