// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WindFieldDetailInfo.proto

package emu.protoshift.net.oldproto;

public final class WindFieldDetailInfoOuterClass {
  private WindFieldDetailInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WindFieldDetailInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WindFieldDetailInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> 
        getStageInfoListList();
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo getStageInfoList(int index);
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    int getStageInfoListCount();
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder> 
        getStageInfoListOrBuilderList();
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder getStageInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: MLNINJIDONO
   * </pre>
   *
   * Protobuf type {@code WindFieldDetailInfo}
   */
  public static final class WindFieldDetailInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WindFieldDetailInfo)
      WindFieldDetailInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WindFieldDetailInfo.newBuilder() to construct.
    private WindFieldDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WindFieldDetailInfo() {
      stageInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WindFieldDetailInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.internal_static_WindFieldDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.internal_static_WindFieldDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.class, emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.Builder.class);
    }

    public static final int STAGE_INFO_LIST_FIELD_NUMBER = 14;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> stageInfoList_;
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> getStageInfoListList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder> 
        getStageInfoListOrBuilderList() {
      return stageInfoList_;
    }
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public int getStageInfoListCount() {
      return stageInfoList_.size();
    }
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo getStageInfoList(int index) {
      return stageInfoList_.get(index);
    }
    /**
     * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder getStageInfoListOrBuilder(
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
        output.writeMessage(14, stageInfoList_.get(i));
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
          .computeMessageSize(14, stageInfoList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo other = (emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo) obj;

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

    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo prototype) {
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
     * Obf: MLNINJIDONO
     * </pre>
     *
     * Protobuf type {@code WindFieldDetailInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WindFieldDetailInfo)
        emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.internal_static_WindFieldDetailInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.internal_static_WindFieldDetailInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.class, emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.newBuilder()
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
        return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.internal_static_WindFieldDetailInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo build() {
        emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo buildPartial() {
        emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo result = new emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo result) {
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

      private void buildPartial0(emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo result) {
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
        if (other instanceof emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo other) {
        if (other == emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo.getDefaultInstance()) return this;
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
              case 114: {
                emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.parser(),
                        extensionRegistry);
                if (stageInfoListBuilder_ == null) {
                  ensureStageInfoListIsMutable();
                  stageInfoList_.add(m);
                } else {
                  stageInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 114
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

      private java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> stageInfoList_ =
        java.util.Collections.emptyList();
      private void ensureStageInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo>(stageInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder> stageInfoListBuilder_;

      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> getStageInfoListList() {
        if (stageInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        } else {
          return stageInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public int getStageInfoListCount() {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.size();
        } else {
          return stageInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo getStageInfoList(int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);
        } else {
          return stageInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder setStageInfoList(
          int index, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo value) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder setStageInfoList(
          int index, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder builderForValue) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo value) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          int index, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo value) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder builderForValue) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder addStageInfoList(
          int index, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder builderForValue) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public Builder addAllStageInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo> values) {
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
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
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder getStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder getStageInfoListOrBuilder(
          int index) {
        if (stageInfoListBuilder_ == null) {
          return stageInfoList_.get(index);  } else {
          return stageInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder> 
           getStageInfoListOrBuilderList() {
        if (stageInfoListBuilder_ != null) {
          return stageInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stageInfoList_);
        }
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder addStageInfoListBuilder() {
        return getStageInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder addStageInfoListBuilder(
          int index) {
        return getStageInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .WindFieldStageInfo stage_info_list = 14;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder> 
           getStageInfoListBuilderList() {
        return getStageInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder> 
          getStageInfoListFieldBuilder() {
        if (stageInfoListBuilder_ == null) {
          stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfo.Builder, emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.WindFieldStageInfoOrBuilder>(
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


      // @@protoc_insertion_point(builder_scope:WindFieldDetailInfo)
    }

    // @@protoc_insertion_point(class_scope:WindFieldDetailInfo)
    private static final emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo();
    }

    public static emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WindFieldDetailInfo>
        PARSER = new com.google.protobuf.AbstractParser<WindFieldDetailInfo>() {
      @java.lang.Override
      public WindFieldDetailInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<WindFieldDetailInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WindFieldDetailInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.WindFieldDetailInfoOuterClass.WindFieldDetailInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WindFieldDetailInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WindFieldDetailInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031WindFieldDetailInfo.proto\032\030WindFieldSt" +
      "ageInfo.proto\"C\n\023WindFieldDetailInfo\022,\n\017" +
      "stage_info_list\030\016 \003(\0132\023.WindFieldStageIn" +
      "foB\035\n\033emu.protoshift.net.oldprotob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.getDescriptor(),
        });
    internal_static_WindFieldDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WindFieldDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WindFieldDetailInfo_descriptor,
        new java.lang.String[] { "StageInfoList", });
    emu.protoshift.net.oldproto.WindFieldStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
