// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonReviseLevelNotify.proto

package emu.protoshift.net.oldproto;

public final class DungeonReviseLevelNotifyOuterClass {
  private DungeonReviseLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonReviseLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonReviseLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeon_id = 13;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 DEKNEDHELLG = 9;</code>
     * @return The dEKNEDHELLG.
     */
    int getDEKNEDHELLG();

    /**
     * <code>uint32 CONMHGGJNMC = 10;</code>
     * @return The cONMHGGJNMC.
     */
    int getCONMHGGJNMC();
  }
  /**
   * <pre>
   * Obf: BHBGFLBHMKP
   * </pre>
   *
   * Protobuf type {@code DungeonReviseLevelNotify}
   */
  public static final class DungeonReviseLevelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonReviseLevelNotify)
      DungeonReviseLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonReviseLevelNotify.newBuilder() to construct.
    private DungeonReviseLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonReviseLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonReviseLevelNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.internal_static_DungeonReviseLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.internal_static_DungeonReviseLevelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.class, emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.Builder.class);
    }

    public static final int DUNGEON_ID_FIELD_NUMBER = 13;
    private int dungeonId_ = 0;
    /**
     * <code>uint32 dungeon_id = 13;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int DEKNEDHELLG_FIELD_NUMBER = 9;
    private int dEKNEDHELLG_ = 0;
    /**
     * <code>uint32 DEKNEDHELLG = 9;</code>
     * @return The dEKNEDHELLG.
     */
    @java.lang.Override
    public int getDEKNEDHELLG() {
      return dEKNEDHELLG_;
    }

    public static final int CONMHGGJNMC_FIELD_NUMBER = 10;
    private int cONMHGGJNMC_ = 0;
    /**
     * <code>uint32 CONMHGGJNMC = 10;</code>
     * @return The cONMHGGJNMC.
     */
    @java.lang.Override
    public int getCONMHGGJNMC() {
      return cONMHGGJNMC_;
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
      if (dEKNEDHELLG_ != 0) {
        output.writeUInt32(9, dEKNEDHELLG_);
      }
      if (cONMHGGJNMC_ != 0) {
        output.writeUInt32(10, cONMHGGJNMC_);
      }
      if (dungeonId_ != 0) {
        output.writeUInt32(13, dungeonId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dEKNEDHELLG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dEKNEDHELLG_);
      }
      if (cONMHGGJNMC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cONMHGGJNMC_);
      }
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, dungeonId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify other = (emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getDEKNEDHELLG()
          != other.getDEKNEDHELLG()) return false;
      if (getCONMHGGJNMC()
          != other.getCONMHGGJNMC()) return false;
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
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + DEKNEDHELLG_FIELD_NUMBER;
      hash = (53 * hash) + getDEKNEDHELLG();
      hash = (37 * hash) + CONMHGGJNMC_FIELD_NUMBER;
      hash = (53 * hash) + getCONMHGGJNMC();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify prototype) {
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
     * Obf: BHBGFLBHMKP
     * </pre>
     *
     * Protobuf type {@code DungeonReviseLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonReviseLevelNotify)
        emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.internal_static_DungeonReviseLevelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.internal_static_DungeonReviseLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.class, emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.newBuilder()
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
        dungeonId_ = 0;
        dEKNEDHELLG_ = 0;
        cONMHGGJNMC_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.internal_static_DungeonReviseLevelNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify build() {
        emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify buildPartial() {
        emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify result = new emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonId_ = dungeonId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.dEKNEDHELLG_ = dEKNEDHELLG_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.cONMHGGJNMC_ = cONMHGGJNMC_;
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
        if (other instanceof emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify other) {
        if (other == emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getDEKNEDHELLG() != 0) {
          setDEKNEDHELLG(other.getDEKNEDHELLG());
        }
        if (other.getCONMHGGJNMC() != 0) {
          setCONMHGGJNMC(other.getCONMHGGJNMC());
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
              case 72: {
                dEKNEDHELLG_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 80: {
                cONMHGGJNMC_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 80
              case 104: {
                dungeonId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {

        dungeonId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int dEKNEDHELLG_ ;
      /**
       * <code>uint32 DEKNEDHELLG = 9;</code>
       * @return The dEKNEDHELLG.
       */
      @java.lang.Override
      public int getDEKNEDHELLG() {
        return dEKNEDHELLG_;
      }
      /**
       * <code>uint32 DEKNEDHELLG = 9;</code>
       * @param value The dEKNEDHELLG to set.
       * @return This builder for chaining.
       */
      public Builder setDEKNEDHELLG(int value) {

        dEKNEDHELLG_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DEKNEDHELLG = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDEKNEDHELLG() {
        bitField0_ = (bitField0_ & ~0x00000002);
        dEKNEDHELLG_ = 0;
        onChanged();
        return this;
      }

      private int cONMHGGJNMC_ ;
      /**
       * <code>uint32 CONMHGGJNMC = 10;</code>
       * @return The cONMHGGJNMC.
       */
      @java.lang.Override
      public int getCONMHGGJNMC() {
        return cONMHGGJNMC_;
      }
      /**
       * <code>uint32 CONMHGGJNMC = 10;</code>
       * @param value The cONMHGGJNMC to set.
       * @return This builder for chaining.
       */
      public Builder setCONMHGGJNMC(int value) {

        cONMHGGJNMC_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CONMHGGJNMC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCONMHGGJNMC() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cONMHGGJNMC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DungeonReviseLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:DungeonReviseLevelNotify)
    private static final emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify();
    }

    public static emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonReviseLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<DungeonReviseLevelNotify>() {
      @java.lang.Override
      public DungeonReviseLevelNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonReviseLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonReviseLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonReviseLevelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonReviseLevelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036DungeonReviseLevelNotify.proto\"X\n\030Dung" +
      "eonReviseLevelNotify\022\022\n\ndungeon_id\030\r \001(\r" +
      "\022\023\n\013DEKNEDHELLG\030\t \001(\r\022\023\n\013CONMHGGJNMC\030\n \001" +
      "(\rB\035\n\033emu.protoshift.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonReviseLevelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonReviseLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonReviseLevelNotify_descriptor,
        new java.lang.String[] { "DungeonId", "DEKNEDHELLG", "CONMHGGJNMC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
