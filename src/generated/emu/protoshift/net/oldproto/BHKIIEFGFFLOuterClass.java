// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BHKIIEFGFFL.proto

package emu.protoshift.net.oldproto;

public final class BHKIIEFGFFLOuterClass {
  private BHKIIEFGFFLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BHKIIEFGFFLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BHKIIEFGFFL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> 
        getLevelInfoListList();
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA getLevelInfoList(int index);
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    int getLevelInfoListCount();
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    java.util.List<? extends emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder> 
        getLevelInfoListOrBuilderList();
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder getLevelInfoListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BHKIIEFGFFL}
   */
  public static final class BHKIIEFGFFL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BHKIIEFGFFL)
      BHKIIEFGFFLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BHKIIEFGFFL.newBuilder() to construct.
    private BHKIIEFGFFL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BHKIIEFGFFL() {
      levelInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BHKIIEFGFFL();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.internal_static_BHKIIEFGFFL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.internal_static_BHKIIEFGFFL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.class, emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.Builder.class);
    }

    public static final int LEVEL_INFO_LIST_FIELD_NUMBER = 9;
    @SuppressWarnings("serial")
    private java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> levelInfoList_;
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> getLevelInfoListList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder> 
        getLevelInfoListOrBuilderList() {
      return levelInfoList_;
    }
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    @java.lang.Override
    public int getLevelInfoListCount() {
      return levelInfoList_.size();
    }
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA getLevelInfoList(int index) {
      return levelInfoList_.get(index);
    }
    /**
     * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
     */
    @java.lang.Override
    public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder getLevelInfoListOrBuilder(
        int index) {
      return levelInfoList_.get(index);
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
      for (int i = 0; i < levelInfoList_.size(); i++) {
        output.writeMessage(9, levelInfoList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < levelInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, levelInfoList_.get(i));
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
      if (!(obj instanceof emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL other = (emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL) obj;

      if (!getLevelInfoListList()
          .equals(other.getLevelInfoListList())) return false;
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
      if (getLevelInfoListCount() > 0) {
        hash = (37 * hash) + LEVEL_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getLevelInfoListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL prototype) {
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
     * Protobuf type {@code BHKIIEFGFFL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BHKIIEFGFFL)
        emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.internal_static_BHKIIEFGFFL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.internal_static_BHKIIEFGFFL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.class, emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.newBuilder()
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
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
        } else {
          levelInfoList_ = null;
          levelInfoListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.internal_static_BHKIIEFGFFL_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL build() {
        emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL buildPartial() {
        emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL result = new emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL result) {
        if (levelInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            levelInfoList_ = java.util.Collections.unmodifiableList(levelInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.levelInfoList_ = levelInfoList_;
        } else {
          result.levelInfoList_ = levelInfoListBuilder_.build();
        }
      }

      private void buildPartial0(emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL result) {
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
        if (other instanceof emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL) {
          return mergeFrom((emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL other) {
        if (other == emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL.getDefaultInstance()) return this;
        if (levelInfoListBuilder_ == null) {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoList_.isEmpty()) {
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLevelInfoListIsMutable();
              levelInfoList_.addAll(other.levelInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.levelInfoList_.isEmpty()) {
            if (levelInfoListBuilder_.isEmpty()) {
              levelInfoListBuilder_.dispose();
              levelInfoListBuilder_ = null;
              levelInfoList_ = other.levelInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              levelInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLevelInfoListFieldBuilder() : null;
            } else {
              levelInfoListBuilder_.addAllMessages(other.levelInfoList_);
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
              case 74: {
                emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA m =
                    input.readMessage(
                        emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.parser(),
                        extensionRegistry);
                if (levelInfoListBuilder_ == null) {
                  ensureLevelInfoListIsMutable();
                  levelInfoList_.add(m);
                } else {
                  levelInfoListBuilder_.addMessage(m);
                }
                break;
              } // case 74
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

      private java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> levelInfoList_ =
        java.util.Collections.emptyList();
      private void ensureLevelInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          levelInfoList_ = new java.util.ArrayList<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA>(levelInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder> levelInfoListBuilder_;

      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> getLevelInfoListList() {
        if (levelInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        } else {
          return levelInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public int getLevelInfoListCount() {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.size();
        } else {
          return levelInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA getLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);
        } else {
          return levelInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder setLevelInfoList(
          int index, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder addLevelInfoList(emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA value) {
        if (levelInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, value);
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder addLevelInfoList(
          emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder addLevelInfoList(
          int index, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder builderForValue) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          levelInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder addAllLevelInfoList(
          java.lang.Iterable<? extends emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA> values) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, levelInfoList_);
          onChanged();
        } else {
          levelInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder clearLevelInfoList() {
        if (levelInfoListBuilder_ == null) {
          levelInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          levelInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public Builder removeLevelInfoList(int index) {
        if (levelInfoListBuilder_ == null) {
          ensureLevelInfoListIsMutable();
          levelInfoList_.remove(index);
          onChanged();
        } else {
          levelInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder getLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder getLevelInfoListOrBuilder(
          int index) {
        if (levelInfoListBuilder_ == null) {
          return levelInfoList_.get(index);  } else {
          return levelInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public java.util.List<? extends emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder> 
           getLevelInfoListOrBuilderList() {
        if (levelInfoListBuilder_ != null) {
          return levelInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(levelInfoList_);
        }
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder addLevelInfoListBuilder() {
        return getLevelInfoListFieldBuilder().addBuilder(
            emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.getDefaultInstance());
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder addLevelInfoListBuilder(
          int index) {
        return getLevelInfoListFieldBuilder().addBuilder(
            index, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.getDefaultInstance());
      }
      /**
       * <code>repeated .DIAODPEOGAA level_info_list = 9;</code>
       */
      public java.util.List<emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder> 
           getLevelInfoListBuilderList() {
        return getLevelInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder> 
          getLevelInfoListFieldBuilder() {
        if (levelInfoListBuilder_ == null) {
          levelInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder, emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder>(
                  levelInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          levelInfoList_ = null;
        }
        return levelInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BHKIIEFGFFL)
    }

    // @@protoc_insertion_point(class_scope:BHKIIEFGFFL)
    private static final emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL();
    }

    public static emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BHKIIEFGFFL>
        PARSER = new com.google.protobuf.AbstractParser<BHKIIEFGFFL>() {
      @java.lang.Override
      public BHKIIEFGFFL parsePartialFrom(
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

    public static com.google.protobuf.Parser<BHKIIEFGFFL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BHKIIEFGFFL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.BHKIIEFGFFLOuterClass.BHKIIEFGFFL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BHKIIEFGFFL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BHKIIEFGFFL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BHKIIEFGFFL.proto\032\021DIAODPEOGAA.proto\"4" +
      "\n\013BHKIIEFGFFL\022%\n\017level_info_list\030\t \003(\0132\014" +
      ".DIAODPEOGAAB\035\n\033emu.protoshift.net.oldpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.getDescriptor(),
        });
    internal_static_BHKIIEFGFFL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BHKIIEFGFFL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BHKIIEFGFFL_descriptor,
        new java.lang.String[] { "LevelInfoList", });
    emu.protoshift.net.oldproto.DIAODPEOGAAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
