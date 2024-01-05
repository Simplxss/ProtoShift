// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NJLDOIOAKPE.proto

package emu.protoshift.net.oldproto;

public final class NJLDOIOAKPEOuterClass {
  private NJLDOIOAKPEOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NJLDOIOAKPEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NJLDOIOAKPE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 dungeon_guid = 15;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>bool KJAPHMNCAPJ = 14;</code>
     * @return The kJAPHMNCAPJ.
     */
    boolean getKJAPHMNCAPJ();
  }
  /**
   * Protobuf type {@code NJLDOIOAKPE}
   */
  public static final class NJLDOIOAKPE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NJLDOIOAKPE)
      NJLDOIOAKPEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NJLDOIOAKPE.newBuilder() to construct.
    private NJLDOIOAKPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NJLDOIOAKPE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NJLDOIOAKPE();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.internal_static_NJLDOIOAKPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.internal_static_NJLDOIOAKPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.class, emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.Builder.class);
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 15;
    private long dungeonGuid_ = 0L;
    /**
     * <code>uint64 dungeon_guid = 15;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int KJAPHMNCAPJ_FIELD_NUMBER = 14;
    private boolean kJAPHMNCAPJ_ = false;
    /**
     * <code>bool KJAPHMNCAPJ = 14;</code>
     * @return The kJAPHMNCAPJ.
     */
    @java.lang.Override
    public boolean getKJAPHMNCAPJ() {
      return kJAPHMNCAPJ_;
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
      if (kJAPHMNCAPJ_ != false) {
        output.writeBool(14, kJAPHMNCAPJ_);
      }
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(15, dungeonGuid_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (kJAPHMNCAPJ_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, kJAPHMNCAPJ_);
      }
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, dungeonGuid_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE other = (emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE) obj;

      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getKJAPHMNCAPJ()
          != other.getKJAPHMNCAPJ()) return false;
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
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + KJAPHMNCAPJ_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getKJAPHMNCAPJ());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE prototype) {
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
     * Protobuf type {@code NJLDOIOAKPE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NJLDOIOAKPE)
        emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.internal_static_NJLDOIOAKPE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.internal_static_NJLDOIOAKPE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.class, emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.newBuilder()
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
        dungeonGuid_ = 0L;
        kJAPHMNCAPJ_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.internal_static_NJLDOIOAKPE_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE build() {
        emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE buildPartial() {
        emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE result = new emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonGuid_ = dungeonGuid_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.kJAPHMNCAPJ_ = kJAPHMNCAPJ_;
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
        if (other instanceof emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE) {
          return mergeFrom((emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE other) {
        if (other == emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE.getDefaultInstance()) return this;
        if (other.getDungeonGuid() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getKJAPHMNCAPJ() != false) {
          setKJAPHMNCAPJ(other.getKJAPHMNCAPJ());
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
              case 112: {
                kJAPHMNCAPJ_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
              case 120: {
                dungeonGuid_ = input.readUInt64();
                bitField0_ |= 0x00000001;
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

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 15;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 15;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {

        dungeonGuid_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private boolean kJAPHMNCAPJ_ ;
      /**
       * <code>bool KJAPHMNCAPJ = 14;</code>
       * @return The kJAPHMNCAPJ.
       */
      @java.lang.Override
      public boolean getKJAPHMNCAPJ() {
        return kJAPHMNCAPJ_;
      }
      /**
       * <code>bool KJAPHMNCAPJ = 14;</code>
       * @param value The kJAPHMNCAPJ to set.
       * @return This builder for chaining.
       */
      public Builder setKJAPHMNCAPJ(boolean value) {

        kJAPHMNCAPJ_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool KJAPHMNCAPJ = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearKJAPHMNCAPJ() {
        bitField0_ = (bitField0_ & ~0x00000002);
        kJAPHMNCAPJ_ = false;
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


      // @@protoc_insertion_point(builder_scope:NJLDOIOAKPE)
    }

    // @@protoc_insertion_point(class_scope:NJLDOIOAKPE)
    private static final emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE();
    }

    public static emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NJLDOIOAKPE>
        PARSER = new com.google.protobuf.AbstractParser<NJLDOIOAKPE>() {
      @java.lang.Override
      public NJLDOIOAKPE parsePartialFrom(
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

    public static com.google.protobuf.Parser<NJLDOIOAKPE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NJLDOIOAKPE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.NJLDOIOAKPEOuterClass.NJLDOIOAKPE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NJLDOIOAKPE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NJLDOIOAKPE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NJLDOIOAKPE.proto\"8\n\013NJLDOIOAKPE\022\024\n\014du" +
      "ngeon_guid\030\017 \001(\004\022\023\n\013KJAPHMNCAPJ\030\016 \001(\010B\035\n" +
      "\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NJLDOIOAKPE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NJLDOIOAKPE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NJLDOIOAKPE_descriptor,
        new java.lang.String[] { "DungeonGuid", "KJAPHMNCAPJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
