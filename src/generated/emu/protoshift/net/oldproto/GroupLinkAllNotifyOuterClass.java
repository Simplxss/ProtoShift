// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupLinkAllNotify.proto

package emu.protoshift.net.oldproto;

public final class GroupLinkAllNotifyOuterClass {
  private GroupLinkAllNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GroupLinkAllNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GroupLinkAllNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> 
        getBundleListList();
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getBundleList(int index);
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    int getBundleListCount();
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> 
        getBundleListOrBuilderList();
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 22877
   * Obf: ICDIPPGCHPF
   * </pre>
   *
   * Protobuf type {@code GroupLinkAllNotify}
   */
  public static final class GroupLinkAllNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GroupLinkAllNotify)
      GroupLinkAllNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GroupLinkAllNotify.newBuilder() to construct.
    private GroupLinkAllNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GroupLinkAllNotify() {
      bundleList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GroupLinkAllNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.internal_static_GroupLinkAllNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.internal_static_GroupLinkAllNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.class, emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.Builder.class);
    }

    public static final int BUNDLE_LIST_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> bundleList_;
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> getBundleListList() {
      return bundleList_;
    }
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> 
        getBundleListOrBuilderList() {
      return bundleList_;
    }
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    @java.lang.Override
    public int getBundleListCount() {
      return bundleList_.size();
    }
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getBundleList(int index) {
      return bundleList_.get(index);
    }
    /**
     * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleListOrBuilder(
        int index) {
      return bundleList_.get(index);
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
      for (int i = 0; i < bundleList_.size(); i++) {
        output.writeMessage(4, bundleList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < bundleList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, bundleList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify other = (emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify) obj;

      if (!getBundleListList()
          .equals(other.getBundleListList())) return false;
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
      if (getBundleListCount() > 0) {
        hash = (37 * hash) + BUNDLE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBundleListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify prototype) {
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
     * CmdId: 22877
     * Obf: ICDIPPGCHPF
     * </pre>
     *
     * Protobuf type {@code GroupLinkAllNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GroupLinkAllNotify)
        emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.internal_static_GroupLinkAllNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.internal_static_GroupLinkAllNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.class, emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.newBuilder()
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
        if (bundleListBuilder_ == null) {
          bundleList_ = java.util.Collections.emptyList();
        } else {
          bundleList_ = null;
          bundleListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.internal_static_GroupLinkAllNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify build() {
        emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify buildPartial() {
        emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify result = new emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify result) {
        if (bundleListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            bundleList_ = java.util.Collections.unmodifiableList(bundleList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.bundleList_ = bundleList_;
        } else {
          result.bundleList_ = bundleListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify result) {
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
        if (other instanceof emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify other) {
        if (other == emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify.getDefaultInstance()) return this;
        if (bundleListBuilder_ == null) {
          if (!other.bundleList_.isEmpty()) {
            if (bundleList_.isEmpty()) {
              bundleList_ = other.bundleList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBundleListIsMutable();
              bundleList_.addAll(other.bundleList_);
            }
            onChanged();
          }
        } else {
          if (!other.bundleList_.isEmpty()) {
            if (bundleListBuilder_.isEmpty()) {
              bundleListBuilder_.dispose();
              bundleListBuilder_ = null;
              bundleList_ = other.bundleList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              bundleListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBundleListFieldBuilder() : null;
            } else {
              bundleListBuilder_.addAllMessages(other.bundleList_);
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
                emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.parser(),
                        extensionRegistry);
                if (bundleListBuilder_ == null) {
                  ensureBundleListIsMutable();
                  bundleList_.add(m);
                } else {
                  bundleListBuilder_.addMessage(m);
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

      private java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> bundleList_ =
        java.util.Collections.emptyList();
      private void ensureBundleListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          bundleList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle>(bundleList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> bundleListBuilder_;

      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> getBundleListList() {
        if (bundleListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(bundleList_);
        } else {
          return bundleListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public int getBundleListCount() {
        if (bundleListBuilder_ == null) {
          return bundleList_.size();
        } else {
          return bundleListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle getBundleList(int index) {
        if (bundleListBuilder_ == null) {
          return bundleList_.get(index);
        } else {
          return bundleListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder setBundleList(
          int index, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle value) {
        if (bundleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBundleListIsMutable();
          bundleList_.set(index, value);
          onChanged();
        } else {
          bundleListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder setBundleList(
          int index, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder builderForValue) {
        if (bundleListBuilder_ == null) {
          ensureBundleListIsMutable();
          bundleList_.set(index, builderForValue.build());
          onChanged();
        } else {
          bundleListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder addBundleList(emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle value) {
        if (bundleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBundleListIsMutable();
          bundleList_.add(value);
          onChanged();
        } else {
          bundleListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder addBundleList(
          int index, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle value) {
        if (bundleListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBundleListIsMutable();
          bundleList_.add(index, value);
          onChanged();
        } else {
          bundleListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder addBundleList(
          emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder builderForValue) {
        if (bundleListBuilder_ == null) {
          ensureBundleListIsMutable();
          bundleList_.add(builderForValue.build());
          onChanged();
        } else {
          bundleListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder addBundleList(
          int index, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder builderForValue) {
        if (bundleListBuilder_ == null) {
          ensureBundleListIsMutable();
          bundleList_.add(index, builderForValue.build());
          onChanged();
        } else {
          bundleListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder addAllBundleList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle> values) {
        if (bundleListBuilder_ == null) {
          ensureBundleListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, bundleList_);
          onChanged();
        } else {
          bundleListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder clearBundleList() {
        if (bundleListBuilder_ == null) {
          bundleList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          bundleListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public Builder removeBundleList(int index) {
        if (bundleListBuilder_ == null) {
          ensureBundleListIsMutable();
          bundleList_.remove(index);
          onChanged();
        } else {
          bundleListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder getBundleListBuilder(
          int index) {
        return getBundleListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder getBundleListOrBuilder(
          int index) {
        if (bundleListBuilder_ == null) {
          return bundleList_.get(index);  } else {
          return bundleListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> 
           getBundleListOrBuilderList() {
        if (bundleListBuilder_ != null) {
          return bundleListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(bundleList_);
        }
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder addBundleListBuilder() {
        return getBundleListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance());
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder addBundleListBuilder(
          int index) {
        return getBundleListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.getDefaultInstance());
      }
      /**
       * <code>repeated .GroupLinkBundle bundle_list = 4;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder> 
           getBundleListBuilderList() {
        return getBundleListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder> 
          getBundleListFieldBuilder() {
        if (bundleListBuilder_ == null) {
          bundleListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundle.Builder, emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.GroupLinkBundleOrBuilder>(
                  bundleList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          bundleList_ = null;
        }
        return bundleListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GroupLinkAllNotify)
    }

    // @@protoc_insertion_point(class_scope:GroupLinkAllNotify)
    private static final emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify();
    }

    public static emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GroupLinkAllNotify>
        PARSER = new com.google.protobuf.AbstractParser<GroupLinkAllNotify>() {
      @java.lang.Override
      public GroupLinkAllNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<GroupLinkAllNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GroupLinkAllNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.GroupLinkAllNotifyOuterClass.GroupLinkAllNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GroupLinkAllNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GroupLinkAllNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GroupLinkAllNotify.proto\032\025GroupLinkBun" +
      "dle.proto\";\n\022GroupLinkAllNotify\022%\n\013bundl" +
      "e_list\030\004 \003(\0132\020.GroupLinkBundleB\035\n\033emu.pr" +
      "otoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.getDescriptor(),
        });
    internal_static_GroupLinkAllNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GroupLinkAllNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GroupLinkAllNotify_descriptor,
        new java.lang.String[] { "BundleList", });
    emu.protoshift.net.oldproto.GroupLinkBundleOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
