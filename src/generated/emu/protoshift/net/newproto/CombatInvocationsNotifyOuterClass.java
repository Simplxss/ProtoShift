// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombatInvocationsNotify.proto

package emu.protoshift.net.newproto;

public final class CombatInvocationsNotifyOuterClass {
  private CombatInvocationsNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombatInvocationsNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombatInvocationsNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> 
        getInvokeListList();
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry getInvokeList(int index);
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    int getInvokeListCount();
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    java.util.List<? extends emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder> 
        getInvokeListOrBuilderList();
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder getInvokeListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code CombatInvocationsNotify}
   */
  public static final class CombatInvocationsNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombatInvocationsNotify)
      CombatInvocationsNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombatInvocationsNotify.newBuilder() to construct.
    private CombatInvocationsNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombatInvocationsNotify() {
      invokeList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombatInvocationsNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.internal_static_CombatInvocationsNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.internal_static_CombatInvocationsNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.class, emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.Builder.class);
    }

    public static final int INVOKE_LIST_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> invokeList_;
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> getInvokeListList() {
      return invokeList_;
    }
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder> 
        getInvokeListOrBuilderList() {
      return invokeList_;
    }
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    @java.lang.Override
    public int getInvokeListCount() {
      return invokeList_.size();
    }
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry getInvokeList(int index) {
      return invokeList_.get(index);
    }
    /**
     * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder getInvokeListOrBuilder(
        int index) {
      return invokeList_.get(index);
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
      for (int i = 0; i < invokeList_.size(); i++) {
        output.writeMessage(11, invokeList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < invokeList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, invokeList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify other = (emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify) obj;

      if (!getInvokeListList()
          .equals(other.getInvokeListList())) return false;
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
      if (getInvokeListCount() > 0) {
        hash = (37 * hash) + INVOKE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getInvokeListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify prototype) {
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
     * Protobuf type {@code CombatInvocationsNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombatInvocationsNotify)
        emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.internal_static_CombatInvocationsNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.internal_static_CombatInvocationsNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.class, emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.newBuilder()
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
        if (invokeListBuilder_ == null) {
          invokeList_ = java.util.Collections.emptyList();
        } else {
          invokeList_ = null;
          invokeListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.internal_static_CombatInvocationsNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify getDefaultInstanceForType() {
        return emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify build() {
        emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify buildPartial() {
        emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify result = new emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify result) {
        if (invokeListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            invokeList_ = java.util.Collections.unmodifiableList(invokeList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.invokeList_ = invokeList_;
        } else {
          result.invokeList_ = invokeListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify result) {
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
        if (other instanceof emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify) {
          return mergeFrom((emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify other) {
        if (other == emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify.getDefaultInstance()) return this;
        if (invokeListBuilder_ == null) {
          if (!other.invokeList_.isEmpty()) {
            if (invokeList_.isEmpty()) {
              invokeList_ = other.invokeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureInvokeListIsMutable();
              invokeList_.addAll(other.invokeList_);
            }
            onChanged();
          }
        } else {
          if (!other.invokeList_.isEmpty()) {
            if (invokeListBuilder_.isEmpty()) {
              invokeListBuilder_.dispose();
              invokeListBuilder_ = null;
              invokeList_ = other.invokeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              invokeListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getInvokeListFieldBuilder() : null;
            } else {
              invokeListBuilder_.addAllMessages(other.invokeList_);
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
              case 90: {
                emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry m =
                    input.readMessage(
                        emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.parser(),
                        extensionRegistry);
                if (invokeListBuilder_ == null) {
                  ensureInvokeListIsMutable();
                  invokeList_.add(m);
                } else {
                  invokeListBuilder_.addMessage(m);
                }
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

      private java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> invokeList_ =
        java.util.Collections.emptyList();
      private void ensureInvokeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          invokeList_ = new java.util.ArrayList<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry>(invokeList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder> invokeListBuilder_;

      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> getInvokeListList() {
        if (invokeListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(invokeList_);
        } else {
          return invokeListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public int getInvokeListCount() {
        if (invokeListBuilder_ == null) {
          return invokeList_.size();
        } else {
          return invokeListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry getInvokeList(int index) {
        if (invokeListBuilder_ == null) {
          return invokeList_.get(index);
        } else {
          return invokeListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder setInvokeList(
          int index, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry value) {
        if (invokeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokeListIsMutable();
          invokeList_.set(index, value);
          onChanged();
        } else {
          invokeListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder setInvokeList(
          int index, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder builderForValue) {
        if (invokeListBuilder_ == null) {
          ensureInvokeListIsMutable();
          invokeList_.set(index, builderForValue.build());
          onChanged();
        } else {
          invokeListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder addInvokeList(emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry value) {
        if (invokeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokeListIsMutable();
          invokeList_.add(value);
          onChanged();
        } else {
          invokeListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder addInvokeList(
          int index, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry value) {
        if (invokeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInvokeListIsMutable();
          invokeList_.add(index, value);
          onChanged();
        } else {
          invokeListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder addInvokeList(
          emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder builderForValue) {
        if (invokeListBuilder_ == null) {
          ensureInvokeListIsMutable();
          invokeList_.add(builderForValue.build());
          onChanged();
        } else {
          invokeListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder addInvokeList(
          int index, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder builderForValue) {
        if (invokeListBuilder_ == null) {
          ensureInvokeListIsMutable();
          invokeList_.add(index, builderForValue.build());
          onChanged();
        } else {
          invokeListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder addAllInvokeList(
          java.lang.Iterable<? extends emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry> values) {
        if (invokeListBuilder_ == null) {
          ensureInvokeListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, invokeList_);
          onChanged();
        } else {
          invokeListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder clearInvokeList() {
        if (invokeListBuilder_ == null) {
          invokeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          invokeListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public Builder removeInvokeList(int index) {
        if (invokeListBuilder_ == null) {
          ensureInvokeListIsMutable();
          invokeList_.remove(index);
          onChanged();
        } else {
          invokeListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder getInvokeListBuilder(
          int index) {
        return getInvokeListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder getInvokeListOrBuilder(
          int index) {
        if (invokeListBuilder_ == null) {
          return invokeList_.get(index);  } else {
          return invokeListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public java.util.List<? extends emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder> 
           getInvokeListOrBuilderList() {
        if (invokeListBuilder_ != null) {
          return invokeListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(invokeList_);
        }
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder addInvokeListBuilder() {
        return getInvokeListFieldBuilder().addBuilder(
            emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder addInvokeListBuilder(
          int index) {
        return getInvokeListFieldBuilder().addBuilder(
            index, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.getDefaultInstance());
      }
      /**
       * <code>repeated .CombatInvokeEntry invoke_list = 11;</code>
       */
      public java.util.List<emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder> 
           getInvokeListBuilderList() {
        return getInvokeListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder> 
          getInvokeListFieldBuilder() {
        if (invokeListBuilder_ == null) {
          invokeListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder, emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder>(
                  invokeList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          invokeList_ = null;
        }
        return invokeListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:CombatInvocationsNotify)
    }

    // @@protoc_insertion_point(class_scope:CombatInvocationsNotify)
    private static final emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify();
    }

    public static emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombatInvocationsNotify>
        PARSER = new com.google.protobuf.AbstractParser<CombatInvocationsNotify>() {
      @java.lang.Override
      public CombatInvocationsNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<CombatInvocationsNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombatInvocationsNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.newproto.CombatInvocationsNotifyOuterClass.CombatInvocationsNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombatInvocationsNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombatInvocationsNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CombatInvocationsNotify.proto\032\027CombatI" +
      "nvokeEntry.proto\"B\n\027CombatInvocationsNot" +
      "ify\022\'\n\013invoke_list\030\013 \003(\0132\022.CombatInvokeE" +
      "ntryB\035\n\033emu.protoshift.net.newprotob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.getDescriptor(),
        });
    internal_static_CombatInvocationsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombatInvocationsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombatInvocationsNotify_descriptor,
        new java.lang.String[] { "InvokeList", });
    emu.protoshift.net.newproto.CombatInvokeEntryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
