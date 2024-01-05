// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SceneGallerySumoInfo.proto

package emu.protoshift.net.oldproto;

public final class SceneGallerySumoInfoOuterClass {
  private SceneGallerySumoInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SceneGallerySumoInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SceneGallerySumoInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 DEJJPIOCJDD = 2;</code>
     * @return The dEJJPIOCJDD.
     */
    int getDEJJPIOCJDD();

    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 ENBKLKPPLHL = 6;</code>
     * @return The eNBKLKPPLHL.
     */
    int getENBKLKPPLHL();
  }
  /**
   * Protobuf type {@code SceneGallerySumoInfo}
   */
  public static final class SceneGallerySumoInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SceneGallerySumoInfo)
      SceneGallerySumoInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SceneGallerySumoInfo.newBuilder() to construct.
    private SceneGallerySumoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SceneGallerySumoInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SceneGallerySumoInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.class, emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.Builder.class);
    }

    public static final int DEJJPIOCJDD_FIELD_NUMBER = 2;
    private int dEJJPIOCJDD_ = 0;
    /**
     * <code>uint32 DEJJPIOCJDD = 2;</code>
     * @return The dEJJPIOCJDD.
     */
    @java.lang.Override
    public int getDEJJPIOCJDD() {
      return dEJJPIOCJDD_;
    }

    public static final int SCORE_FIELD_NUMBER = 10;
    private int score_ = 0;
    /**
     * <code>uint32 score = 10;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int ENBKLKPPLHL_FIELD_NUMBER = 6;
    private int eNBKLKPPLHL_ = 0;
    /**
     * <code>uint32 ENBKLKPPLHL = 6;</code>
     * @return The eNBKLKPPLHL.
     */
    @java.lang.Override
    public int getENBKLKPPLHL() {
      return eNBKLKPPLHL_;
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
      if (dEJJPIOCJDD_ != 0) {
        output.writeUInt32(2, dEJJPIOCJDD_);
      }
      if (eNBKLKPPLHL_ != 0) {
        output.writeUInt32(6, eNBKLKPPLHL_);
      }
      if (score_ != 0) {
        output.writeUInt32(10, score_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dEJJPIOCJDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dEJJPIOCJDD_);
      }
      if (eNBKLKPPLHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, eNBKLKPPLHL_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, score_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo other = (emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo) obj;

      if (getDEJJPIOCJDD()
          != other.getDEJJPIOCJDD()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getENBKLKPPLHL()
          != other.getENBKLKPPLHL()) return false;
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
      hash = (37 * hash) + DEJJPIOCJDD_FIELD_NUMBER;
      hash = (53 * hash) + getDEJJPIOCJDD();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + ENBKLKPPLHL_FIELD_NUMBER;
      hash = (53 * hash) + getENBKLKPPLHL();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo prototype) {
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
     * Protobuf type {@code SceneGallerySumoInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SceneGallerySumoInfo)
        emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.class, emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.newBuilder()
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
        dEJJPIOCJDD_ = 0;
        score_ = 0;
        eNBKLKPPLHL_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.internal_static_SceneGallerySumoInfo_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo build() {
        emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo buildPartial() {
        emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo result = new emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dEJJPIOCJDD_ = dEJJPIOCJDD_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.score_ = score_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.eNBKLKPPLHL_ = eNBKLKPPLHL_;
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
        if (other instanceof emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo) {
          return mergeFrom((emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo other) {
        if (other == emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo.getDefaultInstance()) return this;
        if (other.getDEJJPIOCJDD() != 0) {
          setDEJJPIOCJDD(other.getDEJJPIOCJDD());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getENBKLKPPLHL() != 0) {
          setENBKLKPPLHL(other.getENBKLKPPLHL());
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
              case 16: {
                dEJJPIOCJDD_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 48: {
                eNBKLKPPLHL_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 80: {
                score_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private int dEJJPIOCJDD_ ;
      /**
       * <code>uint32 DEJJPIOCJDD = 2;</code>
       * @return The dEJJPIOCJDD.
       */
      @java.lang.Override
      public int getDEJJPIOCJDD() {
        return dEJJPIOCJDD_;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 2;</code>
       * @param value The dEJJPIOCJDD to set.
       * @return This builder for chaining.
       */
      public Builder setDEJJPIOCJDD(int value) {

        dEJJPIOCJDD_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDEJJPIOCJDD() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dEJJPIOCJDD_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 10;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {

        score_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000002);
        score_ = 0;
        onChanged();
        return this;
      }

      private int eNBKLKPPLHL_ ;
      /**
       * <code>uint32 ENBKLKPPLHL = 6;</code>
       * @return The eNBKLKPPLHL.
       */
      @java.lang.Override
      public int getENBKLKPPLHL() {
        return eNBKLKPPLHL_;
      }
      /**
       * <code>uint32 ENBKLKPPLHL = 6;</code>
       * @param value The eNBKLKPPLHL to set.
       * @return This builder for chaining.
       */
      public Builder setENBKLKPPLHL(int value) {

        eNBKLKPPLHL_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ENBKLKPPLHL = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearENBKLKPPLHL() {
        bitField0_ = (bitField0_ & ~0x00000004);
        eNBKLKPPLHL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SceneGallerySumoInfo)
    }

    // @@protoc_insertion_point(class_scope:SceneGallerySumoInfo)
    private static final emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo();
    }

    public static emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SceneGallerySumoInfo>
        PARSER = new com.google.protobuf.AbstractParser<SceneGallerySumoInfo>() {
      @java.lang.Override
      public SceneGallerySumoInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<SceneGallerySumoInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SceneGallerySumoInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.SceneGallerySumoInfoOuterClass.SceneGallerySumoInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SceneGallerySumoInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SceneGallerySumoInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032SceneGallerySumoInfo.proto\"O\n\024SceneGal" +
      "lerySumoInfo\022\023\n\013DEJJPIOCJDD\030\002 \001(\r\022\r\n\005sco" +
      "re\030\n \001(\r\022\023\n\013ENBKLKPPLHL\030\006 \001(\rB\035\n\033emu.pro" +
      "toshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SceneGallerySumoInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SceneGallerySumoInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SceneGallerySumoInfo_descriptor,
        new java.lang.String[] { "DEJJPIOCJDD", "Score", "ENBKLKPPLHL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
