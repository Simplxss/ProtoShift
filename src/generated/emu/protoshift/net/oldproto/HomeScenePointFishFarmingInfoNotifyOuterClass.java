// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeScenePointFishFarmingInfoNotify.proto

package emu.protoshift.net.oldproto;

public final class HomeScenePointFishFarmingInfoNotifyOuterClass {
  private HomeScenePointFishFarmingInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeScenePointFishFarmingInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeScenePointFishFarmingInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> 
        getFishFarmingInfoListList();
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfoList(int index);
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    int getFishFarmingInfoListCount();
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList();
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 1346
   * Obf: OPALNEMMKPE
   * </pre>
   *
   * Protobuf type {@code HomeScenePointFishFarmingInfoNotify}
   */
  public static final class HomeScenePointFishFarmingInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeScenePointFishFarmingInfoNotify)
      HomeScenePointFishFarmingInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeScenePointFishFarmingInfoNotify.newBuilder() to construct.
    private HomeScenePointFishFarmingInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeScenePointFishFarmingInfoNotify() {
      fishFarmingInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeScenePointFishFarmingInfoNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.internal_static_HomeScenePointFishFarmingInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.internal_static_HomeScenePointFishFarmingInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.class, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.Builder.class);
    }

    public static final int FISH_FARMING_INFO_LIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> fishFarmingInfoList_;
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> getFishFarmingInfoListList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> 
        getFishFarmingInfoListOrBuilderList() {
      return fishFarmingInfoList_;
    }
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    @java.lang.Override
    public int getFishFarmingInfoListCount() {
      return fishFarmingInfoList_.size();
    }
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfoList(int index) {
      return fishFarmingInfoList_.get(index);
    }
    /**
     * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
        int index) {
      return fishFarmingInfoList_.get(index);
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
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        output.writeMessage(5, fishFarmingInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fishFarmingInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, fishFarmingInfoList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify other = (emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify) obj;

      if (!getFishFarmingInfoListList()
          .equals(other.getFishFarmingInfoListList())) return false;
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
      if (getFishFarmingInfoListCount() > 0) {
        hash = (37 * hash) + FISH_FARMING_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFishFarmingInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify prototype) {
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
     * CmdId: 1346
     * Obf: OPALNEMMKPE
     * </pre>
     *
     * Protobuf type {@code HomeScenePointFishFarmingInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeScenePointFishFarmingInfoNotify)
        emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.internal_static_HomeScenePointFishFarmingInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.internal_static_HomeScenePointFishFarmingInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.class, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.newBuilder()
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
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
        } else {
          fishFarmingInfoList_ = null;
          fishFarmingInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.internal_static_HomeScenePointFishFarmingInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify build() {
        emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify buildPartial() {
        emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify result = new emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify result) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fishFarmingInfoList_ = java.util.Collections.unmodifiableList(fishFarmingInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fishFarmingInfoList_ = fishFarmingInfoList_;
        } else {
          result.fishFarmingInfoList_ = fishFarmingInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify other) {
        if (other == emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify.getDefaultInstance()) return this;
        if (fishFarmingInfoListBuilder_ == null) {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoList_.isEmpty()) {
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFishFarmingInfoListIsMutable();
              fishFarmingInfoList_.addAll(other.fishFarmingInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.fishFarmingInfoList_.isEmpty()) {
            if (fishFarmingInfoListBuilder_.isEmpty()) {
              fishFarmingInfoListBuilder_.dispose();
              fishFarmingInfoListBuilder_ = null;
              fishFarmingInfoList_ = other.fishFarmingInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fishFarmingInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFishFarmingInfoListFieldBuilder() : null;
            } else {
              fishFarmingInfoListBuilder_.addAllMessages(other.fishFarmingInfoList_);
            }
          }
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
              case 42: {
                emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.parser(),
                        extensionRegistry);
                if (fishFarmingInfoListBuilder_ == null) {
                  ensureFishFarmingInfoListIsMutable();
                  fishFarmingInfoList_.add(m);
                } else {
                  fishFarmingInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 42
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

      private java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> fishFarmingInfoList_ =
        java.util.Collections.emptyList();
      private void ensureFishFarmingInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fishFarmingInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo>(fishFarmingInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> fishFarmingInfoListBuilder_;

      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> getFishFarmingInfoListList() {
        if (fishFarmingInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        } else {
          return fishFarmingInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public int getFishFarmingInfoListCount() {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.size();
        } else {
          return fishFarmingInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo getFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);
        } else {
          return fishFarmingInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder setFishFarmingInfoList(
          int index, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder addFishFarmingInfoList(emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo value) {
        if (fishFarmingInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, value);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder addFishFarmingInfoList(
          emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder addFishFarmingInfoList(
          int index, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder builderForValue) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder addAllFishFarmingInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo> values) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fishFarmingInfoList_);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder clearFishFarmingInfoList() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public Builder removeFishFarmingInfoList(int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          ensureFishFarmingInfoListIsMutable();
          fishFarmingInfoList_.remove(index);
          onChanged();
        } else {
          fishFarmingInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder getFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder getFishFarmingInfoListOrBuilder(
          int index) {
        if (fishFarmingInfoListBuilder_ == null) {
          return fishFarmingInfoList_.get(index);  } else {
          return fishFarmingInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> 
           getFishFarmingInfoListOrBuilderList() {
        if (fishFarmingInfoListBuilder_ != null) {
          return fishFarmingInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fishFarmingInfoList_);
        }
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder addFishFarmingInfoListBuilder() {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder addFishFarmingInfoListBuilder(
          int index) {
        return getFishFarmingInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeScenePointFishFarmingInfo fish_farming_info_list = 5;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder> 
           getFishFarmingInfoListBuilderList() {
        return getFishFarmingInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder> 
          getFishFarmingInfoListFieldBuilder() {
        if (fishFarmingInfoListBuilder_ == null) {
          fishFarmingInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfo.Builder, emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.HomeScenePointFishFarmingInfoOrBuilder>(
                  fishFarmingInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fishFarmingInfoList_ = null;
        }
        return fishFarmingInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeScenePointFishFarmingInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeScenePointFishFarmingInfoNotify)
    private static final emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify();
    }

    public static emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeScenePointFishFarmingInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeScenePointFishFarmingInfoNotify>() {
      @java.lang.Override
      public HomeScenePointFishFarmingInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeScenePointFishFarmingInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeScenePointFishFarmingInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoNotifyOuterClass.HomeScenePointFishFarmingInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeScenePointFishFarmingInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeScenePointFishFarmingInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)HomeScenePointFishFarmingInfoNotify.pr" +
      "oto\032#HomeScenePointFishFarmingInfo.proto" +
      "\"e\n#HomeScenePointFishFarmingInfoNotify\022" +
      ">\n\026fish_farming_info_list\030\005 \003(\0132\036.HomeSc" +
      "enePointFishFarmingInfoB\035\n\033emu.protoshif" +
      "t.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeScenePointFishFarmingInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeScenePointFishFarmingInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeScenePointFishFarmingInfoNotify_descriptor,
        new java.lang.String[] { "FishFarmingInfoList", });
    emu.protoshift.net.oldproto.HomeScenePointFishFarmingInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
