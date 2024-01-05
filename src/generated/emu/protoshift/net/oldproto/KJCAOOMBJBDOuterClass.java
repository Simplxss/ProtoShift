// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KJCAOOMBJBD.proto

package emu.protoshift.net.oldproto;

public final class KJCAOOMBJBDOuterClass {
  private KJCAOOMBJBDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KJCAOOMBJBDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KJCAOOMBJBD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 3;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>fixed64 time_stamp = 6;</code>
     * @return The timeStamp.
     */
    long getTimeStamp();

    /**
     * <code>fixed64 begin_time = 1;</code>
     * @return The beginTime.
     */
    long getBeginTime();
  }
  /**
   * Protobuf type {@code KJCAOOMBJBD}
   */
  public static final class KJCAOOMBJBD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KJCAOOMBJBD)
      KJCAOOMBJBDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KJCAOOMBJBD.newBuilder() to construct.
    private KJCAOOMBJBD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KJCAOOMBJBD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KJCAOOMBJBD();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.internal_static_KJCAOOMBJBD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.internal_static_KJCAOOMBJBD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.class, emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 3;
    private int controllerId_ = 0;
    /**
     * <code>uint32 controller_id = 3;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int TIME_STAMP_FIELD_NUMBER = 6;
    private long timeStamp_ = 0L;
    /**
     * <code>fixed64 time_stamp = 6;</code>
     * @return The timeStamp.
     */
    @java.lang.Override
    public long getTimeStamp() {
      return timeStamp_;
    }

    public static final int BEGIN_TIME_FIELD_NUMBER = 1;
    private long beginTime_ = 0L;
    /**
     * <code>fixed64 begin_time = 1;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public long getBeginTime() {
      return beginTime_;
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
      if (beginTime_ != 0L) {
        output.writeFixed64(1, beginTime_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(3, controllerId_);
      }
      if (timeStamp_ != 0L) {
        output.writeFixed64(6, timeStamp_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (beginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(1, beginTime_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, controllerId_);
      }
      if (timeStamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeFixed64Size(6, timeStamp_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD other = (emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (getTimeStamp()
          != other.getTimeStamp()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
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
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + TIME_STAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeStamp());
      hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginTime());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD prototype) {
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
     * Protobuf type {@code KJCAOOMBJBD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KJCAOOMBJBD)
        emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.internal_static_KJCAOOMBJBD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.internal_static_KJCAOOMBJBD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.class, emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.newBuilder()
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
        controllerId_ = 0;
        timeStamp_ = 0L;
        beginTime_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.internal_static_KJCAOOMBJBD_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD build() {
        emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD buildPartial() {
        emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD result = new emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.controllerId_ = controllerId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.timeStamp_ = timeStamp_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.beginTime_ = beginTime_;
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
        if (other instanceof emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD) {
          return mergeFrom((emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD other) {
        if (other == emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getTimeStamp() != 0L) {
          setTimeStamp(other.getTimeStamp());
        }
        if (other.getBeginTime() != 0L) {
          setBeginTime(other.getBeginTime());
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
              case 9: {
                beginTime_ = input.readFixed64();
                bitField0_ |= 0x00000004;
                break;
              } // case 9
              case 24: {
                controllerId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 49: {
                timeStamp_ = input.readFixed64();
                bitField0_ |= 0x00000002;
                break;
              } // case 49
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

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 3;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 3;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {

        controllerId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private long timeStamp_ ;
      /**
       * <code>fixed64 time_stamp = 6;</code>
       * @return The timeStamp.
       */
      @java.lang.Override
      public long getTimeStamp() {
        return timeStamp_;
      }
      /**
       * <code>fixed64 time_stamp = 6;</code>
       * @param value The timeStamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimeStamp(long value) {

        timeStamp_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 time_stamp = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeStamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timeStamp_ = 0L;
        onChanged();
        return this;
      }

      private long beginTime_ ;
      /**
       * <code>fixed64 begin_time = 1;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public long getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>fixed64 begin_time = 1;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(long value) {

        beginTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>fixed64 begin_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        beginTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:KJCAOOMBJBD)
    }

    // @@protoc_insertion_point(class_scope:KJCAOOMBJBD)
    private static final emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD();
    }

    public static emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KJCAOOMBJBD>
        PARSER = new com.google.protobuf.AbstractParser<KJCAOOMBJBD>() {
      @java.lang.Override
      public KJCAOOMBJBD parsePartialFrom(
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

    public static com.google.protobuf.Parser<KJCAOOMBJBD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KJCAOOMBJBD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.KJCAOOMBJBDOuterClass.KJCAOOMBJBD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KJCAOOMBJBD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KJCAOOMBJBD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021KJCAOOMBJBD.proto\"L\n\013KJCAOOMBJBD\022\025\n\rco" +
      "ntroller_id\030\003 \001(\r\022\022\n\ntime_stamp\030\006 \001(\006\022\022\n" +
      "\nbegin_time\030\001 \001(\006B\035\n\033emu.protoshift.net." +
      "oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KJCAOOMBJBD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KJCAOOMBJBD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KJCAOOMBJBD_descriptor,
        new java.lang.String[] { "ControllerId", "TimeStamp", "BeginTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
