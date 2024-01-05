// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CILHIPCABCG.proto

package emu.protoshift.net.oldproto;

public final class CILHIPCABCGOuterClass {
  private CILHIPCABCGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CILHIPCABCGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CILHIPCABCG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 room_id = 3;</code>
     * @return The roomId.
     */
    int getRoomId();

    /**
     * <code>uint64 guid = 1;</code>
     * @return The guid.
     */
    long getGuid();
  }
  /**
   * Protobuf type {@code CILHIPCABCG}
   */
  public static final class CILHIPCABCG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CILHIPCABCG)
      CILHIPCABCGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CILHIPCABCG.newBuilder() to construct.
    private CILHIPCABCG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CILHIPCABCG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CILHIPCABCG();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.internal_static_CILHIPCABCG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.internal_static_CILHIPCABCG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.class, emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.Builder.class);
    }

    public static final int ROOM_ID_FIELD_NUMBER = 3;
    private int roomId_ = 0;
    /**
     * <code>uint32 room_id = 3;</code>
     * @return The roomId.
     */
    @java.lang.Override
    public int getRoomId() {
      return roomId_;
    }

    public static final int GUID_FIELD_NUMBER = 1;
    private long guid_ = 0L;
    /**
     * <code>uint64 guid = 1;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
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
      if (guid_ != 0L) {
        output.writeUInt64(1, guid_);
      }
      if (roomId_ != 0) {
        output.writeUInt32(3, roomId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, guid_);
      }
      if (roomId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, roomId_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG other = (emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG) obj;

      if (getRoomId()
          != other.getRoomId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
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
      hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRoomId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG prototype) {
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
     * Protobuf type {@code CILHIPCABCG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CILHIPCABCG)
        emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.internal_static_CILHIPCABCG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.internal_static_CILHIPCABCG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.class, emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.newBuilder()
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
        roomId_ = 0;
        guid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.internal_static_CILHIPCABCG_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG build() {
        emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG buildPartial() {
        emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG result = new emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.roomId_ = roomId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.guid_ = guid_;
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
        if (other instanceof emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG) {
          return mergeFrom((emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG other) {
        if (other == emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG.getDefaultInstance()) return this;
        if (other.getRoomId() != 0) {
          setRoomId(other.getRoomId());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
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
                guid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 8
              case 24: {
                roomId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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
      private int bitField0_;

      private int roomId_ ;
      /**
       * <code>uint32 room_id = 3;</code>
       * @return The roomId.
       */
      @java.lang.Override
      public int getRoomId() {
        return roomId_;
      }
      /**
       * <code>uint32 room_id = 3;</code>
       * @param value The roomId to set.
       * @return This builder for chaining.
       */
      public Builder setRoomId(int value) {

        roomId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 room_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoomId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        roomId_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 1;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 1;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {

        guid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CILHIPCABCG)
    }

    // @@protoc_insertion_point(class_scope:CILHIPCABCG)
    private static final emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG();
    }

    public static emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CILHIPCABCG>
        PARSER = new com.google.protobuf.AbstractParser<CILHIPCABCG>() {
      @java.lang.Override
      public CILHIPCABCG parsePartialFrom(
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

    public static com.google.protobuf.Parser<CILHIPCABCG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CILHIPCABCG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.CILHIPCABCGOuterClass.CILHIPCABCG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CILHIPCABCG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CILHIPCABCG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CILHIPCABCG.proto\",\n\013CILHIPCABCG\022\017\n\007ro" +
      "om_id\030\003 \001(\r\022\014\n\004guid\030\001 \001(\004B\035\n\033emu.protosh" +
      "ift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CILHIPCABCG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CILHIPCABCG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CILHIPCABCG_descriptor,
        new java.lang.String[] { "RoomId", "Guid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
