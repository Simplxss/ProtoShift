// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeSelectAvatarAndEnterDungeonReq.proto

package emu.protoshift.net.oldproto;

public final class RoguelikeSelectAvatarAndEnterDungeonReqOuterClass {
  private RoguelikeSelectAvatarAndEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeSelectAvatarAndEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    java.util.List<java.lang.Long> getOnstageAvatarGuidListList();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @return The count of onstageAvatarGuidList.
     */
    int getOnstageAvatarGuidListCount();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    long getOnstageAvatarGuidList(int index);

    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @return A list containing the backstageAvatarGuidList.
     */
    java.util.List<java.lang.Long> getBackstageAvatarGuidListList();
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @return The count of backstageAvatarGuidList.
     */
    int getBackstageAvatarGuidListCount();
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @param index The index of the element to return.
     * @return The backstageAvatarGuidList at the given index.
     */
    long getBackstageAvatarGuidList(int index);
  }
  /**
   * <pre>
   * Obf: GPEEBPGJELL
   * </pre>
   *
   * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonReq}
   */
  public static final class RoguelikeSelectAvatarAndEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeSelectAvatarAndEnterDungeonReq)
      RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeSelectAvatarAndEnterDungeonReq.newBuilder() to construct.
    private RoguelikeSelectAvatarAndEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeSelectAvatarAndEnterDungeonReq() {
      onstageAvatarGuidList_ = emptyLongList();
      backstageAvatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeSelectAvatarAndEnterDungeonReq();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.class, emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 7;
    private int stageId_ = 0;
    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList onstageAvatarGuidList_ =
        emptyLongList();
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @return A list containing the onstageAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getOnstageAvatarGuidListList() {
      return onstageAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @return The count of onstageAvatarGuidList.
     */
    public int getOnstageAvatarGuidListCount() {
      return onstageAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
     * @param index The index of the element to return.
     * @return The onstageAvatarGuidList at the given index.
     */
    public long getOnstageAvatarGuidList(int index) {
      return onstageAvatarGuidList_.getLong(index);
    }
    private int onstageAvatarGuidListMemoizedSerializedSize = -1;

    public static final int BACKSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList backstageAvatarGuidList_ =
        emptyLongList();
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @return A list containing the backstageAvatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getBackstageAvatarGuidListList() {
      return backstageAvatarGuidList_;
    }
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @return The count of backstageAvatarGuidList.
     */
    public int getBackstageAvatarGuidListCount() {
      return backstageAvatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
     * @param index The index of the element to return.
     * @return The backstageAvatarGuidList at the given index.
     */
    public long getBackstageAvatarGuidList(int index) {
      return backstageAvatarGuidList_.getLong(index);
    }
    private int backstageAvatarGuidListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getBackstageAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(backstageAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < backstageAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(backstageAvatarGuidList_.getLong(i));
      }
      if (stageId_ != 0) {
        output.writeUInt32(7, stageId_);
      }
      if (getOnstageAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(onstageAvatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < onstageAvatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(onstageAvatarGuidList_.getLong(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < backstageAvatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(backstageAvatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getBackstageAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        backstageAvatarGuidListMemoizedSerializedSize = dataSize;
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, stageId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < onstageAvatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(onstageAvatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getOnstageAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        onstageAvatarGuidListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq other = (emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (!getOnstageAvatarGuidListList()
          .equals(other.getOnstageAvatarGuidListList())) return false;
      if (!getBackstageAvatarGuidListList()
          .equals(other.getBackstageAvatarGuidListList())) return false;
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
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (getOnstageAvatarGuidListCount() > 0) {
        hash = (37 * hash) + ONSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getOnstageAvatarGuidListList().hashCode();
      }
      if (getBackstageAvatarGuidListCount() > 0) {
        hash = (37 * hash) + BACKSTAGE_AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBackstageAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq prototype) {
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
     * Obf: GPEEBPGJELL
     * </pre>
     *
     * Protobuf type {@code RoguelikeSelectAvatarAndEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeSelectAvatarAndEnterDungeonReq)
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.class, emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.newBuilder()
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
        stageId_ = 0;
        onstageAvatarGuidList_ = emptyLongList();
        backstageAvatarGuidList_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq build() {
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq buildPartial() {
        emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq result = new emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageId_ = stageId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          onstageAvatarGuidList_.makeImmutable();
          result.onstageAvatarGuidList_ = onstageAvatarGuidList_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          backstageAvatarGuidList_.makeImmutable();
          result.backstageAvatarGuidList_ = backstageAvatarGuidList_;
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
        if (other instanceof emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq) {
          return mergeFrom((emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq other) {
        if (other == emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (!other.onstageAvatarGuidList_.isEmpty()) {
          if (onstageAvatarGuidList_.isEmpty()) {
            onstageAvatarGuidList_ = other.onstageAvatarGuidList_;
            onstageAvatarGuidList_.makeImmutable();
            bitField0_ |= 0x00000002;
          } else {
            ensureOnstageAvatarGuidListIsMutable();
            onstageAvatarGuidList_.addAll(other.onstageAvatarGuidList_);
          }
          onChanged();
        }
        if (!other.backstageAvatarGuidList_.isEmpty()) {
          if (backstageAvatarGuidList_.isEmpty()) {
            backstageAvatarGuidList_ = other.backstageAvatarGuidList_;
            backstageAvatarGuidList_.makeImmutable();
            bitField0_ |= 0x00000004;
          } else {
            ensureBackstageAvatarGuidListIsMutable();
            backstageAvatarGuidList_.addAll(other.backstageAvatarGuidList_);
          }
          onChanged();
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
                long v = input.readUInt64();
                ensureBackstageAvatarGuidListIsMutable();
                backstageAvatarGuidList_.addLong(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureBackstageAvatarGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  backstageAvatarGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 56: {
                stageId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 88: {
                long v = input.readUInt64();
                ensureOnstageAvatarGuidListIsMutable();
                onstageAvatarGuidList_.addLong(v);
                break;
              } // case 88
              case 90: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureOnstageAvatarGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  onstageAvatarGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 90
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

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {

        stageId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stageId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList onstageAvatarGuidList_ = emptyLongList();
      private void ensureOnstageAvatarGuidListIsMutable() {
        if (!onstageAvatarGuidList_.isModifiable()) {
          onstageAvatarGuidList_ = makeMutableCopy(onstageAvatarGuidList_);
        }
        bitField0_ |= 0x00000002;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @return A list containing the onstageAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getOnstageAvatarGuidListList() {
        onstageAvatarGuidList_.makeImmutable();
        return onstageAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @return The count of onstageAvatarGuidList.
       */
      public int getOnstageAvatarGuidListCount() {
        return onstageAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @param index The index of the element to return.
       * @return The onstageAvatarGuidList at the given index.
       */
      public long getOnstageAvatarGuidList(int index) {
        return onstageAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The onstageAvatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setOnstageAvatarGuidList(
          int index, long value) {

        ensureOnstageAvatarGuidListIsMutable();
        onstageAvatarGuidList_.setLong(index, value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @param value The onstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addOnstageAvatarGuidList(long value) {

        ensureOnstageAvatarGuidListIsMutable();
        onstageAvatarGuidList_.addLong(value);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @param values The onstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllOnstageAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureOnstageAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, onstageAvatarGuidList_);
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 onstage_avatar_guid_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOnstageAvatarGuidList() {
        onstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList backstageAvatarGuidList_ = emptyLongList();
      private void ensureBackstageAvatarGuidListIsMutable() {
        if (!backstageAvatarGuidList_.isModifiable()) {
          backstageAvatarGuidList_ = makeMutableCopy(backstageAvatarGuidList_);
        }
        bitField0_ |= 0x00000004;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @return A list containing the backstageAvatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getBackstageAvatarGuidListList() {
        backstageAvatarGuidList_.makeImmutable();
        return backstageAvatarGuidList_;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @return The count of backstageAvatarGuidList.
       */
      public int getBackstageAvatarGuidListCount() {
        return backstageAvatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @param index The index of the element to return.
       * @return The backstageAvatarGuidList at the given index.
       */
      public long getBackstageAvatarGuidList(int index) {
        return backstageAvatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The backstageAvatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setBackstageAvatarGuidList(
          int index, long value) {

        ensureBackstageAvatarGuidListIsMutable();
        backstageAvatarGuidList_.setLong(index, value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @param value The backstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addBackstageAvatarGuidList(long value) {

        ensureBackstageAvatarGuidListIsMutable();
        backstageAvatarGuidList_.addLong(value);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @param values The backstageAvatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllBackstageAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureBackstageAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, backstageAvatarGuidList_);
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 backstage_avatar_guid_list = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearBackstageAvatarGuidList() {
        backstageAvatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000004);
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


      // @@protoc_insertion_point(builder_scope:RoguelikeSelectAvatarAndEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeSelectAvatarAndEnterDungeonReq)
    private static final emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq();
    }

    public static emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeSelectAvatarAndEnterDungeonReq>() {
      @java.lang.Override
      public RoguelikeSelectAvatarAndEnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeSelectAvatarAndEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.RoguelikeSelectAvatarAndEnterDungeonReqOuterClass.RoguelikeSelectAvatarAndEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-RoguelikeSelectAvatarAndEnterDungeonRe" +
      "q.proto\"\201\001\n\'RoguelikeSelectAvatarAndEnte" +
      "rDungeonReq\022\020\n\010stage_id\030\007 \001(\r\022 \n\030onstage" +
      "_avatar_guid_list\030\013 \003(\004\022\"\n\032backstage_ava" +
      "tar_guid_list\030\005 \003(\004B\035\n\033emu.protoshift.ne" +
      "t.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeSelectAvatarAndEnterDungeonReq_descriptor,
        new java.lang.String[] { "StageId", "OnstageAvatarGuidList", "BackstageAvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
