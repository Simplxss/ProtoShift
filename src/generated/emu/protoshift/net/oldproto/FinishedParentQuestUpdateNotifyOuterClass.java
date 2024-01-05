// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishedParentQuestUpdateNotify.proto

package emu.protoshift.net.oldproto;

public final class FinishedParentQuestUpdateNotifyOuterClass {
  private FinishedParentQuestUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishedParentQuestUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishedParentQuestUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> 
        getParentQuestListList();
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest getParentQuestList(int index);
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    int getParentQuestListCount();
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder> 
        getParentQuestListOrBuilderList();
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 455
   * Obf: JCGNAICEEND
   * </pre>
   *
   * Protobuf type {@code FinishedParentQuestUpdateNotify}
   */
  public static final class FinishedParentQuestUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishedParentQuestUpdateNotify)
      FinishedParentQuestUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishedParentQuestUpdateNotify.newBuilder() to construct.
    private FinishedParentQuestUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishedParentQuestUpdateNotify() {
      parentQuestList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishedParentQuestUpdateNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.internal_static_FinishedParentQuestUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.class, emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.Builder.class);
    }

    public static final int PARENT_QUEST_LIST_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> parentQuestList_;
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> getParentQuestListList() {
      return parentQuestList_;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder> 
        getParentQuestListOrBuilderList() {
      return parentQuestList_;
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    @java.lang.Override
    public int getParentQuestListCount() {
      return parentQuestList_.size();
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest getParentQuestList(int index) {
      return parentQuestList_.get(index);
    }
    /**
     * <code>repeated .ParentQuest parent_quest_list = 3;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(
        int index) {
      return parentQuestList_.get(index);
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
      for (int i = 0; i < parentQuestList_.size(); i++) {
        output.writeMessage(3, parentQuestList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < parentQuestList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, parentQuestList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify other = (emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify) obj;

      if (!getParentQuestListList()
          .equals(other.getParentQuestListList())) return false;
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
      if (getParentQuestListCount() > 0) {
        hash = (37 * hash) + PARENT_QUEST_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getParentQuestListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify prototype) {
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
     * CmdId: 455
     * Obf: JCGNAICEEND
     * </pre>
     *
     * Protobuf type {@code FinishedParentQuestUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishedParentQuestUpdateNotify)
        emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.internal_static_FinishedParentQuestUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.class, emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.newBuilder()
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
        if (parentQuestListBuilder_ == null) {
          parentQuestList_ = java.util.Collections.emptyList();
        } else {
          parentQuestList_ = null;
          parentQuestListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.internal_static_FinishedParentQuestUpdateNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify build() {
        emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify buildPartial() {
        emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify result = new emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify result) {
        if (parentQuestListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            parentQuestList_ = java.util.Collections.unmodifiableList(parentQuestList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.parentQuestList_ = parentQuestList_;
        } else {
          result.parentQuestList_ = parentQuestListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify result) {
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
        if (other instanceof emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify other) {
        if (other == emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify.getDefaultInstance()) return this;
        if (parentQuestListBuilder_ == null) {
          if (!other.parentQuestList_.isEmpty()) {
            if (parentQuestList_.isEmpty()) {
              parentQuestList_ = other.parentQuestList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureParentQuestListIsMutable();
              parentQuestList_.addAll(other.parentQuestList_);
            }
            onChanged();
          }
        } else {
          if (!other.parentQuestList_.isEmpty()) {
            if (parentQuestListBuilder_.isEmpty()) {
              parentQuestListBuilder_.dispose();
              parentQuestListBuilder_ = null;
              parentQuestList_ = other.parentQuestList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              parentQuestListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getParentQuestListFieldBuilder() : null;
            } else {
              parentQuestListBuilder_.addAllMessages(other.parentQuestList_);
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
              case 26: {
                emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.parser(),
                        extensionRegistry);
                if (parentQuestListBuilder_ == null) {
                  ensureParentQuestListIsMutable();
                  parentQuestList_.add(m);
                } else {
                  parentQuestListBuilder_.addMessage(m);
                }
                break;
              } // case 26
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

      private java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> parentQuestList_ =
        java.util.Collections.emptyList();
      private void ensureParentQuestListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          parentQuestList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest>(parentQuestList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder> parentQuestListBuilder_;

      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> getParentQuestListList() {
        if (parentQuestListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(parentQuestList_);
        } else {
          return parentQuestListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public int getParentQuestListCount() {
        if (parentQuestListBuilder_ == null) {
          return parentQuestList_.size();
        } else {
          return parentQuestListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest getParentQuestList(int index) {
        if (parentQuestListBuilder_ == null) {
          return parentQuestList_.get(index);
        } else {
          return parentQuestListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder setParentQuestList(
          int index, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest value) {
        if (parentQuestListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParentQuestListIsMutable();
          parentQuestList_.set(index, value);
          onChanged();
        } else {
          parentQuestListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder setParentQuestList(
          int index, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
        if (parentQuestListBuilder_ == null) {
          ensureParentQuestListIsMutable();
          parentQuestList_.set(index, builderForValue.build());
          onChanged();
        } else {
          parentQuestListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder addParentQuestList(emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest value) {
        if (parentQuestListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParentQuestListIsMutable();
          parentQuestList_.add(value);
          onChanged();
        } else {
          parentQuestListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder addParentQuestList(
          int index, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest value) {
        if (parentQuestListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureParentQuestListIsMutable();
          parentQuestList_.add(index, value);
          onChanged();
        } else {
          parentQuestListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder addParentQuestList(
          emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
        if (parentQuestListBuilder_ == null) {
          ensureParentQuestListIsMutable();
          parentQuestList_.add(builderForValue.build());
          onChanged();
        } else {
          parentQuestListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder addParentQuestList(
          int index, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder builderForValue) {
        if (parentQuestListBuilder_ == null) {
          ensureParentQuestListIsMutable();
          parentQuestList_.add(index, builderForValue.build());
          onChanged();
        } else {
          parentQuestListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder addAllParentQuestList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest> values) {
        if (parentQuestListBuilder_ == null) {
          ensureParentQuestListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, parentQuestList_);
          onChanged();
        } else {
          parentQuestListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder clearParentQuestList() {
        if (parentQuestListBuilder_ == null) {
          parentQuestList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          parentQuestListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public Builder removeParentQuestList(int index) {
        if (parentQuestListBuilder_ == null) {
          ensureParentQuestListIsMutable();
          parentQuestList_.remove(index);
          onChanged();
        } else {
          parentQuestListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder getParentQuestListBuilder(
          int index) {
        return getParentQuestListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder getParentQuestListOrBuilder(
          int index) {
        if (parentQuestListBuilder_ == null) {
          return parentQuestList_.get(index);  } else {
          return parentQuestListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder> 
           getParentQuestListOrBuilderList() {
        if (parentQuestListBuilder_ != null) {
          return parentQuestListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(parentQuestList_);
        }
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder addParentQuestListBuilder() {
        return getParentQuestListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.getDefaultInstance());
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder addParentQuestListBuilder(
          int index) {
        return getParentQuestListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.getDefaultInstance());
      }
      /**
       * <code>repeated .ParentQuest parent_quest_list = 3;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder> 
           getParentQuestListBuilderList() {
        return getParentQuestListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder> 
          getParentQuestListFieldBuilder() {
        if (parentQuestListBuilder_ == null) {
          parentQuestListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuest.Builder, emu.protoshift.net.oldproto.ParentQuestOuterClass.ParentQuestOrBuilder>(
                  parentQuestList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          parentQuestList_ = null;
        }
        return parentQuestListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FinishedParentQuestUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:FinishedParentQuestUpdateNotify)
    private static final emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify();
    }

    public static emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishedParentQuestUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<FinishedParentQuestUpdateNotify>() {
      @java.lang.Override
      public FinishedParentQuestUpdateNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<FinishedParentQuestUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishedParentQuestUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.FinishedParentQuestUpdateNotifyOuterClass.FinishedParentQuestUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishedParentQuestUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%FinishedParentQuestUpdateNotify.proto\032" +
      "\021ParentQuest.proto\"J\n\037FinishedParentQues" +
      "tUpdateNotify\022\'\n\021parent_quest_list\030\003 \003(\013" +
      "2\014.ParentQuestB\035\n\033emu.protoshift.net.old" +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.ParentQuestOuterClass.getDescriptor(),
        });
    internal_static_FinishedParentQuestUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishedParentQuestUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishedParentQuestUpdateNotify_descriptor,
        new java.lang.String[] { "ParentQuestList", });
    emu.protoshift.net.oldproto.ParentQuestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
