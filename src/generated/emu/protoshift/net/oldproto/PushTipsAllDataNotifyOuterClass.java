// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushTipsAllDataNotify.proto

package emu.protoshift.net.oldproto;

public final class PushTipsAllDataNotifyOuterClass {
  private PushTipsAllDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PushTipsAllDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PushTipsAllDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> 
        getPushTipsListList();
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index);
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    int getPushTipsListCount();
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
        getPushTipsListOrBuilderList();
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 28129
   * Obf: CCALHGOIIHE
   * </pre>
   *
   * Protobuf type {@code PushTipsAllDataNotify}
   */
  public static final class PushTipsAllDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PushTipsAllDataNotify)
      PushTipsAllDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushTipsAllDataNotify.newBuilder() to construct.
    private PushTipsAllDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushTipsAllDataNotify() {
      pushTipsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushTipsAllDataNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.class, emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.Builder.class);
    }

    public static final int PUSH_TIPS_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> pushTipsList_;
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> getPushTipsListList() {
      return pushTipsList_;
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
        getPushTipsListOrBuilderList() {
      return pushTipsList_;
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    @java.lang.Override
    public int getPushTipsListCount() {
      return pushTipsList_.size();
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index) {
      return pushTipsList_.get(index);
    }
    /**
     * <code>repeated .PushTipsData push_tips_list = 1;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
        int index) {
      return pushTipsList_.get(index);
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
      for (int i = 0; i < pushTipsList_.size(); i++) {
        output.writeMessage(1, pushTipsList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pushTipsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, pushTipsList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify other = (emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify) obj;

      if (!getPushTipsListList()
          .equals(other.getPushTipsListList())) return false;
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
      if (getPushTipsListCount() > 0) {
        hash = (37 * hash) + PUSH_TIPS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPushTipsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify prototype) {
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
     * CmdId: 28129
     * Obf: CCALHGOIIHE
     * </pre>
     *
     * Protobuf type {@code PushTipsAllDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PushTipsAllDataNotify)
        emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.class, emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.newBuilder()
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
        if (pushTipsListBuilder_ == null) {
          pushTipsList_ = java.util.Collections.emptyList();
        } else {
          pushTipsList_ = null;
          pushTipsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.internal_static_PushTipsAllDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify build() {
        emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify buildPartial() {
        emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result = new emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result) {
        if (pushTipsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pushTipsList_ = java.util.Collections.unmodifiableList(pushTipsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pushTipsList_ = pushTipsList_;
        } else {
          result.pushTipsList_ = pushTipsListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify result) {
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
        if (other instanceof emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify other) {
        if (other == emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify.getDefaultInstance()) return this;
        if (pushTipsListBuilder_ == null) {
          if (!other.pushTipsList_.isEmpty()) {
            if (pushTipsList_.isEmpty()) {
              pushTipsList_ = other.pushTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePushTipsListIsMutable();
              pushTipsList_.addAll(other.pushTipsList_);
            }
            onChanged();
          }
        } else {
          if (!other.pushTipsList_.isEmpty()) {
            if (pushTipsListBuilder_.isEmpty()) {
              pushTipsListBuilder_.dispose();
              pushTipsListBuilder_ = null;
              pushTipsList_ = other.pushTipsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pushTipsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPushTipsListFieldBuilder() : null;
            } else {
              pushTipsListBuilder_.addAllMessages(other.pushTipsList_);
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
              case 10: {
                emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.parser(),
                        extensionRegistry);
                if (pushTipsListBuilder_ == null) {
                  ensurePushTipsListIsMutable();
                  pushTipsList_.add(m);
                } else {
                  pushTipsListBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> pushTipsList_ =
        java.util.Collections.emptyList();
      private void ensurePushTipsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pushTipsList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData>(pushTipsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder> pushTipsListBuilder_;

      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> getPushTipsListList() {
        if (pushTipsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pushTipsList_);
        } else {
          return pushTipsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public int getPushTipsListCount() {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.size();
        } else {
          return pushTipsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData getPushTipsList(int index) {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.get(index);
        } else {
          return pushTipsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder setPushTipsList(
          int index, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.set(index, value);
          onChanged();
        } else {
          pushTipsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder setPushTipsList(
          int index, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder addPushTipsList(emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.add(value);
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder addPushTipsList(
          int index, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData value) {
        if (pushTipsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePushTipsListIsMutable();
          pushTipsList_.add(index, value);
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder addPushTipsList(
          emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.add(builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder addPushTipsList(
          int index, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder builderForValue) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pushTipsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder addAllPushTipsList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData> values) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pushTipsList_);
          onChanged();
        } else {
          pushTipsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder clearPushTipsList() {
        if (pushTipsListBuilder_ == null) {
          pushTipsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pushTipsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public Builder removePushTipsList(int index) {
        if (pushTipsListBuilder_ == null) {
          ensurePushTipsListIsMutable();
          pushTipsList_.remove(index);
          onChanged();
        } else {
          pushTipsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder getPushTipsListBuilder(
          int index) {
        return getPushTipsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder getPushTipsListOrBuilder(
          int index) {
        if (pushTipsListBuilder_ == null) {
          return pushTipsList_.get(index);  } else {
          return pushTipsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
           getPushTipsListOrBuilderList() {
        if (pushTipsListBuilder_ != null) {
          return pushTipsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pushTipsList_);
        }
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder addPushTipsListBuilder() {
        return getPushTipsListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance());
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder addPushTipsListBuilder(
          int index) {
        return getPushTipsListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.getDefaultInstance());
      }
      /**
       * <code>repeated .PushTipsData push_tips_list = 1;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder> 
           getPushTipsListBuilderList() {
        return getPushTipsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder> 
          getPushTipsListFieldBuilder() {
        if (pushTipsListBuilder_ == null) {
          pushTipsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsData.Builder, emu.protoshift.net.oldproto.PushTipsDataOuterClass.PushTipsDataOrBuilder>(
                  pushTipsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pushTipsList_ = null;
        }
        return pushTipsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PushTipsAllDataNotify)
    }

    // @@protoc_insertion_point(class_scope:PushTipsAllDataNotify)
    private static final emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify();
    }

    public static emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushTipsAllDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<PushTipsAllDataNotify>() {
      @java.lang.Override
      public PushTipsAllDataNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PushTipsAllDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushTipsAllDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.PushTipsAllDataNotifyOuterClass.PushTipsAllDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PushTipsAllDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PushTipsAllDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PushTipsAllDataNotify.proto\032\022PushTipsD" +
      "ata.proto\">\n\025PushTipsAllDataNotify\022%\n\016pu" +
      "sh_tips_list\030\001 \003(\0132\r.PushTipsDataB\035\n\033emu" +
      ".protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.PushTipsDataOuterClass.getDescriptor(),
        });
    internal_static_PushTipsAllDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PushTipsAllDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PushTipsAllDataNotify_descriptor,
        new java.lang.String[] { "PushTipsList", });
    emu.protoshift.net.oldproto.PushTipsDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
