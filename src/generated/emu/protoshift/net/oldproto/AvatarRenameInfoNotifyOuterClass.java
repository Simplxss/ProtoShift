// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarRenameInfoNotify.proto

package emu.protoshift.net.oldproto;

public final class AvatarRenameInfoNotifyOuterClass {
  private AvatarRenameInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarRenameInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarRenameInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> 
        getAvatarRenameListList();
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index);
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    int getAvatarRenameListCount();
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
        getAvatarRenameListOrBuilderList();
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 26468
   * Obf: MEDFBIJCAGF
   * </pre>
   *
   * Protobuf type {@code AvatarRenameInfoNotify}
   */
  public static final class AvatarRenameInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarRenameInfoNotify)
      AvatarRenameInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarRenameInfoNotify.newBuilder() to construct.
    private AvatarRenameInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarRenameInfoNotify() {
      avatarRenameList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarRenameInfoNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.class, emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.Builder.class);
    }

    public static final int AVATAR_RENAME_LIST_FIELD_NUMBER = 8;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> avatarRenameList_;
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> getAvatarRenameListList() {
      return avatarRenameList_;
    }
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
        getAvatarRenameListOrBuilderList() {
      return avatarRenameList_;
    }
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    @java.lang.Override
    public int getAvatarRenameListCount() {
      return avatarRenameList_.size();
    }
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index) {
      return avatarRenameList_.get(index);
    }
    /**
     * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
        int index) {
      return avatarRenameList_.get(index);
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
      for (int i = 0; i < avatarRenameList_.size(); i++) {
        output.writeMessage(8, avatarRenameList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < avatarRenameList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, avatarRenameList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify other = (emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify) obj;

      if (!getAvatarRenameListList()
          .equals(other.getAvatarRenameListList())) return false;
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
      if (getAvatarRenameListCount() > 0) {
        hash = (37 * hash) + AVATAR_RENAME_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarRenameListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify prototype) {
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
     * CmdId: 26468
     * Obf: MEDFBIJCAGF
     * </pre>
     *
     * Protobuf type {@code AvatarRenameInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarRenameInfoNotify)
        emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.class, emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.newBuilder()
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
        if (avatarRenameListBuilder_ == null) {
          avatarRenameList_ = java.util.Collections.emptyList();
        } else {
          avatarRenameList_ = null;
          avatarRenameListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.internal_static_AvatarRenameInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify build() {
        emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify buildPartial() {
        emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result = new emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result) {
        if (avatarRenameListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            avatarRenameList_ = java.util.Collections.unmodifiableList(avatarRenameList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.avatarRenameList_ = avatarRenameList_;
        } else {
          result.avatarRenameList_ = avatarRenameListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify result) {
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
        if (other instanceof emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify other) {
        if (other == emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify.getDefaultInstance()) return this;
        if (avatarRenameListBuilder_ == null) {
          if (!other.avatarRenameList_.isEmpty()) {
            if (avatarRenameList_.isEmpty()) {
              avatarRenameList_ = other.avatarRenameList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAvatarRenameListIsMutable();
              avatarRenameList_.addAll(other.avatarRenameList_);
            }
            onChanged();
          }
        } else {
          if (!other.avatarRenameList_.isEmpty()) {
            if (avatarRenameListBuilder_.isEmpty()) {
              avatarRenameListBuilder_.dispose();
              avatarRenameListBuilder_ = null;
              avatarRenameList_ = other.avatarRenameList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              avatarRenameListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAvatarRenameListFieldBuilder() : null;
            } else {
              avatarRenameListBuilder_.addAllMessages(other.avatarRenameList_);
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
              case 66: {
                emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.parser(),
                        extensionRegistry);
                if (avatarRenameListBuilder_ == null) {
                  ensureAvatarRenameListIsMutable();
                  avatarRenameList_.add(m);
                } else {
                  avatarRenameListBuilder_.addMessage(m);
                }
                break;
              } // case 66
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

      private java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> avatarRenameList_ =
        java.util.Collections.emptyList();
      private void ensureAvatarRenameListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarRenameList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo>(avatarRenameList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> avatarRenameListBuilder_;

      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> getAvatarRenameListList() {
        if (avatarRenameListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(avatarRenameList_);
        } else {
          return avatarRenameListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public int getAvatarRenameListCount() {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.size();
        } else {
          return avatarRenameListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo getAvatarRenameList(int index) {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.get(index);
        } else {
          return avatarRenameListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder setAvatarRenameList(
          int index, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.set(index, value);
          onChanged();
        } else {
          avatarRenameListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder setAvatarRenameList(
          int index, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.set(index, builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder addAvatarRenameList(emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(value);
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder addAvatarRenameList(
          int index, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo value) {
        if (avatarRenameListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(index, value);
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder addAvatarRenameList(
          emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder addAvatarRenameList(
          int index, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder builderForValue) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.add(index, builderForValue.build());
          onChanged();
        } else {
          avatarRenameListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder addAllAvatarRenameList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo> values) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, avatarRenameList_);
          onChanged();
        } else {
          avatarRenameListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder clearAvatarRenameList() {
        if (avatarRenameListBuilder_ == null) {
          avatarRenameList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          avatarRenameListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public Builder removeAvatarRenameList(int index) {
        if (avatarRenameListBuilder_ == null) {
          ensureAvatarRenameListIsMutable();
          avatarRenameList_.remove(index);
          onChanged();
        } else {
          avatarRenameListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder getAvatarRenameListBuilder(
          int index) {
        return getAvatarRenameListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder getAvatarRenameListOrBuilder(
          int index) {
        if (avatarRenameListBuilder_ == null) {
          return avatarRenameList_.get(index);  } else {
          return avatarRenameListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
           getAvatarRenameListOrBuilderList() {
        if (avatarRenameListBuilder_ != null) {
          return avatarRenameListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(avatarRenameList_);
        }
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder addAvatarRenameListBuilder() {
        return getAvatarRenameListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder addAvatarRenameListBuilder(
          int index) {
        return getAvatarRenameListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .AvatarRenameInfo avatar_rename_list = 8;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder> 
           getAvatarRenameListBuilderList() {
        return getAvatarRenameListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder> 
          getAvatarRenameListFieldBuilder() {
        if (avatarRenameListBuilder_ == null) {
          avatarRenameListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfo.Builder, emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.AvatarRenameInfoOrBuilder>(
                  avatarRenameList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          avatarRenameList_ = null;
        }
        return avatarRenameListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AvatarRenameInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:AvatarRenameInfoNotify)
    private static final emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify();
    }

    public static emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarRenameInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<AvatarRenameInfoNotify>() {
      @java.lang.Override
      public AvatarRenameInfoNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarRenameInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarRenameInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.AvatarRenameInfoNotifyOuterClass.AvatarRenameInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarRenameInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarRenameInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034AvatarRenameInfoNotify.proto\032\026AvatarRe" +
      "nameInfo.proto\"G\n\026AvatarRenameInfoNotify" +
      "\022-\n\022avatar_rename_list\030\010 \003(\0132\021.AvatarRen" +
      "ameInfoB\035\n\033emu.protoshift.net.oldprotob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.getDescriptor(),
        });
    internal_static_AvatarRenameInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarRenameInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarRenameInfoNotify_descriptor,
        new java.lang.String[] { "AvatarRenameList", });
    emu.protoshift.net.oldproto.AvatarRenameInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
