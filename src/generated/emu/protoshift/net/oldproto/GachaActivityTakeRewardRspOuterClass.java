// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaActivityTakeRewardRsp.proto

package emu.protoshift.net.oldproto;

public final class GachaActivityTakeRewardRspOuterClass {
  private GachaActivityTakeRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaActivityTakeRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaActivityTakeRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    int getRobotNumMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    boolean containsRobotNumMap(
        int key);
    /**
     * Use {@link #getRobotNumMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getRobotNumMap();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getRobotNumMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    int getRobotNumMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    int getRobotNumMapOrThrow(
        int key);
  }
  /**
   * <pre>
   * Obf: NGFOLBFFEFO
   * </pre>
   *
   * Protobuf type {@code GachaActivityTakeRewardRsp}
   */
  public static final class GachaActivityTakeRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaActivityTakeRewardRsp)
      GachaActivityTakeRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaActivityTakeRewardRsp.newBuilder() to construct.
    private GachaActivityTakeRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaActivityTakeRewardRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaActivityTakeRewardRsp();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 10:
          return internalGetRobotNumMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.class, emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ROBOT_NUM_MAP_FIELD_NUMBER = 10;
    private static final class RobotNumMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> robotNumMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetRobotNumMap() {
      if (robotNumMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RobotNumMapDefaultEntryHolder.defaultEntry);
      }
      return robotNumMap_;
    }
    public int getRobotNumMapCount() {
      return internalGetRobotNumMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    @java.lang.Override
    public boolean containsRobotNumMap(
        int key) {

      return internalGetRobotNumMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRobotNumMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMap() {
      return getRobotNumMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMapMap() {
      return internalGetRobotNumMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    @java.lang.Override
    public int getRobotNumMapOrDefault(
        int key,
        int defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetRobotNumMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
     */
    @java.lang.Override
    public int getRobotNumMapOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetRobotNumMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetRobotNumMap(),
          RobotNumMapDefaultEntryHolder.defaultEntry,
          10);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetRobotNumMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        robotNumMap__ = RobotNumMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(10, robotNumMap__);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp other = (emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!internalGetRobotNumMap().equals(
          other.internalGetRobotNumMap())) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (!internalGetRobotNumMap().getMap().isEmpty()) {
        hash = (37 * hash) + ROBOT_NUM_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetRobotNumMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp prototype) {
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
     * Obf: NGFOLBFFEFO
     * </pre>
     *
     * Protobuf type {@code GachaActivityTakeRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaActivityTakeRewardRsp)
        emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetRobotNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 10:
            return internalGetMutableRobotNumMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.class, emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.newBuilder()
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
        retcode_ = 0;
        internalGetMutableRobotNumMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.internal_static_GachaActivityTakeRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp build() {
        emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp buildPartial() {
        emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp result = new emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.robotNumMap_ = internalGetRobotNumMap();
          result.robotNumMap_.makeImmutable();
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
        if (other instanceof emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp) {
          return mergeFrom((emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp other) {
        if (other == emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        internalGetMutableRobotNumMap().mergeFrom(
            other.internalGetRobotNumMap());
        bitField0_ |= 0x00000002;
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
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 82: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                robotNumMap__ = input.readMessage(
                    RobotNumMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableRobotNumMap().getMutableMap().put(
                    robotNumMap__.getKey(), robotNumMap__.getValue());
                bitField0_ |= 0x00000002;
                break;
              } // case 82
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {

        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> robotNumMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetRobotNumMap() {
        if (robotNumMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              RobotNumMapDefaultEntryHolder.defaultEntry);
        }
        return robotNumMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
          internalGetMutableRobotNumMap() {
        if (robotNumMap_ == null) {
          robotNumMap_ = com.google.protobuf.MapField.newMapField(
              RobotNumMapDefaultEntryHolder.defaultEntry);
        }
        if (!robotNumMap_.isMutable()) {
          robotNumMap_ = robotNumMap_.copy();
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return robotNumMap_;
      }
      public int getRobotNumMapCount() {
        return internalGetRobotNumMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      @java.lang.Override
      public boolean containsRobotNumMap(
          int key) {

        return internalGetRobotNumMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getRobotNumMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMap() {
        return getRobotNumMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, java.lang.Integer> getRobotNumMapMap() {
        return internalGetRobotNumMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      @java.lang.Override
      public int getRobotNumMapOrDefault(
          int key,
          int defaultValue) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetRobotNumMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      @java.lang.Override
      public int getRobotNumMapOrThrow(
          int key) {

        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetRobotNumMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearRobotNumMap() {
        bitField0_ = (bitField0_ & ~0x00000002);
        internalGetMutableRobotNumMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      public Builder removeRobotNumMap(
          int key) {

        internalGetMutableRobotNumMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
          getMutableRobotNumMap() {
        bitField0_ |= 0x00000002;
        return internalGetMutableRobotNumMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      public Builder putRobotNumMap(
          int key,
          int value) {


        internalGetMutableRobotNumMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; robot_num_map = 10;</code>
       */
      public Builder putAllRobotNumMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableRobotNumMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:GachaActivityTakeRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:GachaActivityTakeRewardRsp)
    private static final emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp();
    }

    public static emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaActivityTakeRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<GachaActivityTakeRewardRsp>() {
      @java.lang.Override
      public GachaActivityTakeRewardRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GachaActivityTakeRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaActivityTakeRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GachaActivityTakeRewardRspOuterClass.GachaActivityTakeRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityTakeRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityTakeRewardRsp_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GachaActivityTakeRewardRsp.proto\"\246\001\n\032G" +
      "achaActivityTakeRewardRsp\022\017\n\007retcode\030\007 \001" +
      "(\005\022C\n\rrobot_num_map\030\n \003(\0132,.GachaActivit" +
      "yTakeRewardRsp.RobotNumMapEntry\0322\n\020Robot" +
      "NumMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:" +
      "\0028\001B\035\n\033emu.protoshift.net.oldprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaActivityTakeRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaActivityTakeRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityTakeRewardRsp_descriptor,
        new java.lang.String[] { "Retcode", "RobotNumMap", });
    internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_descriptor =
      internal_static_GachaActivityTakeRewardRsp_descriptor.getNestedTypes().get(0);
    internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaActivityTakeRewardRsp_RobotNumMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
