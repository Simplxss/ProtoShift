// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LanternRiteFireworksInfo.proto

package emu.protoshift.net.oldproto;

public final class LanternRiteFireworksInfoOuterClass {
  private LanternRiteFireworksInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanternRiteFireworksInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanternRiteFireworksInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> 
        getStageInfoListList();
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo getStageInfoList(int index);
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    int getStageInfoListCount();
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder> 
        getStageInfoListOrBuilderList();
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder getStageInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: KIINMBGKFOK
   * </pre>
   *
   * Protobuf type {@code LanternRiteFireworksInfo}
   */
  public static final class LanternRiteFireworksInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanternRiteFireworksInfo)
      LanternRiteFireworksInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanternRiteFireworksInfo.newBuilder() to construct.
    private LanternRiteFireworksInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LanternRiteFireworksInfo() {
      stageInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanternRiteFireworksInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.internal_static_LanternRiteFireworksInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.internal_static_LanternRiteFireworksInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.class, emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.Builder.class);
    }

    public static final int STAGE_INFO_LIST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> stageInfoList_;
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> getStageInfoListList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder> 
        getStageInfoListOrBuilderList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    @java.lang.Override
    public int getStageInfoListCount() {
      return stageInfoList_.size();
    }
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo getStageInfoList(int index) {
      return stageInfoList_.get(index);
    }
    /**
     * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder getStageInfoListOrBuilder(
        int index) {
      return stageInfoList_.get(index);
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
      for (int i = 0; i < stageInfoList_.size(); i++) {
        output.writeMessage(4, stageInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < stageInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, stageInfoList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo other = (emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo) obj;

      if (!getStageInfoListList()
          .equals(other.getStageInfoListList())) return false;
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
      if (getStageInfoListCount() > 0) {
        hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getStageInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo prototype) {
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
     * Obf: KIINMBGKFOK
     * </pre>
     *
     * Protobuf type {@code LanternRiteFireworksInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LanternRiteFireworksInfo)
        emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.internal_static_LanternRiteFireworksInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.internal_static_LanternRiteFireworksInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.class, emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.newBuilder()
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
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
        } else {
          stageInfoList_ = null;
          stageInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.internal_static_LanternRiteFireworksInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo build() {
        emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo buildPartial() {
        emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo result = new emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo result) {
        if (stageInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.stageInfoList_ = stageInfoList_;
        } else {
          result.stageInfoList_ = stageInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo result) {
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
        if (other instanceof emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo other) {
        if (other == emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo.getDefaultInstance()) return this;
        if (stageInfoListBuilder_ == null) {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoList_.isEmpty()) {
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureStageInfoListIsMutable();
              stageInfoList_.addAll(other.stageInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.stageInfoList_.isEmpty()) {
            if (stageInfoListBuilder_.isEmpty()) {
              stageInfoListBuilder_.dispose();
              stageInfoListBuilder_ = null;
              stageInfoList_ = other.stageInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              stageInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getStageInfoListFieldBuilder() : null;
            } else {
              stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
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
              case 34: {
                emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.parser(),
                        extensionRegistry);
                if (stageInfoListBuilder_ == null) {
                  ensureStageInfoListIsMutable();
                  stageInfoList_.add(m);
                } else {
                  stageInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 34
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

      private java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> stageInfoList_ =
        java.util.Collections.emptyList();
      private void ensureStageInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo>(stageInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder> stageInfoListBuilder_;

      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> getStageInfoListList() {
        if (stageInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        } else {
          return stageInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public int getStageInfoListCount() {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.size();
        } else {
          return stageInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo getStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);
        } else {
          return stageInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder setStageInfoList(
          int index, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder setStageInfoList(
          int index, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder addStageInfoList(emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder addStageInfoList(
          int index, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo value) {
        if (stageInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, value);
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder addStageInfoList(
          emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder addStageInfoList(
          int index, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder builderForValue) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          stageInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder addAllStageInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo> values) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, stageInfoList_);
          onChanged();
        } else {
          stageInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder clearStageInfoList() {
        if (stageInfoListBuilder_ == null) {
          stageInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          stageInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public Builder removeStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          ensureStageInfoListIsMutable();
          stageInfoList_.remove(index);
          onChanged();
        } else {
          stageInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder getStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder getStageInfoListOrBuilder(
          int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);  } else {
          return stageInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder> 
           getStageInfoListOrBuilderList() {
        if (stageInfoListBuilder_ != null) {
          return stageInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        }
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder addStageInfoListBuilder() {
        return getStageInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder addStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .LanternRiteFireworksStageInfo stage_info_list = 4;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder> 
           getStageInfoListBuilderList() {
        return getStageInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder> 
          getStageInfoListFieldBuilder() {
        if (stageInfoListBuilder_ == null) {
          stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfo.Builder, emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.LanternRiteFireworksStageInfoOrBuilder>(
                  stageInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          stageInfoList_ = null;
        }
        return stageInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:LanternRiteFireworksInfo)
    }

    // @@protoc_insertion_point(class_scope:LanternRiteFireworksInfo)
    private static final emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo();
    }

    public static emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanternRiteFireworksInfo>
        PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksInfo>() {
      @java.lang.Override
      public LanternRiteFireworksInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<LanternRiteFireworksInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanternRiteFireworksInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.LanternRiteFireworksInfoOuterClass.LanternRiteFireworksInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanternRiteFireworksInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanternRiteFireworksInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036LanternRiteFireworksInfo.proto\032#Lanter" +
      "nRiteFireworksStageInfo.proto\"S\n\030Lantern" +
      "RiteFireworksInfo\0227\n\017stage_info_list\030\004 \003" +
      "(\0132\036.LanternRiteFireworksStageInfoB\035\n\033em" +
      "u.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.getDescriptor(),
        });
    internal_static_LanternRiteFireworksInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanternRiteFireworksInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanternRiteFireworksInfo_descriptor,
        new java.lang.String[] { "StageInfoList", });
    emu.protoshift.net.oldproto.LanternRiteFireworksStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
