// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingDropResultNotify.proto

package emu.protoshift.net.oldproto;

public final class MiracleRingDropResultNotifyOuterClass {
  private MiracleRingDropResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingDropResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingDropResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 FJNJHHGGFKG = 15;</code>
     * @return The fJNJHHGGFKG.
     */
    int getFJNJHHGGFKG();

    /**
     * <code>int32 BKFAGMHHFDD = 7;</code>
     * @return The bKFAGMHHFDD.
     */
    int getBKFAGMHHFDD();
  }
  /**
   * <pre>
   * Obf: CIFAJMLOOIJ
   * </pre>
   *
   * Protobuf type {@code MiracleRingDropResultNotify}
   */
  public static final class MiracleRingDropResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingDropResultNotify)
      MiracleRingDropResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingDropResultNotify.newBuilder() to construct.
    private MiracleRingDropResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingDropResultNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingDropResultNotify();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.class, emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.Builder.class);
    }

    public static final int FJNJHHGGFKG_FIELD_NUMBER = 15;
    private int fJNJHHGGFKG_ = 0;
    /**
     * <code>uint32 FJNJHHGGFKG = 15;</code>
     * @return The fJNJHHGGFKG.
     */
    @java.lang.Override
    public int getFJNJHHGGFKG() {
      return fJNJHHGGFKG_;
    }

    public static final int BKFAGMHHFDD_FIELD_NUMBER = 7;
    private int bKFAGMHHFDD_ = 0;
    /**
     * <code>int32 BKFAGMHHFDD = 7;</code>
     * @return The bKFAGMHHFDD.
     */
    @java.lang.Override
    public int getBKFAGMHHFDD() {
      return bKFAGMHHFDD_;
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
      if (bKFAGMHHFDD_ != 0) {
        output.writeInt32(7, bKFAGMHHFDD_);
      }
      if (fJNJHHGGFKG_ != 0) {
        output.writeUInt32(15, fJNJHHGGFKG_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (bKFAGMHHFDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, bKFAGMHHFDD_);
      }
      if (fJNJHHGGFKG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, fJNJHHGGFKG_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify other = (emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify) obj;

      if (getFJNJHHGGFKG()
          != other.getFJNJHHGGFKG()) return false;
      if (getBKFAGMHHFDD()
          != other.getBKFAGMHHFDD()) return false;
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
      hash = (37 * hash) + FJNJHHGGFKG_FIELD_NUMBER;
      hash = (53 * hash) + getFJNJHHGGFKG();
      hash = (37 * hash) + BKFAGMHHFDD_FIELD_NUMBER;
      hash = (53 * hash) + getBKFAGMHHFDD();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify prototype) {
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
     * Obf: CIFAJMLOOIJ
     * </pre>
     *
     * Protobuf type {@code MiracleRingDropResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingDropResultNotify)
        emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.class, emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.newBuilder()
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
        fJNJHHGGFKG_ = 0;
        bKFAGMHHFDD_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.internal_static_MiracleRingDropResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify build() {
        emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify buildPartial() {
        emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify result = new emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.fJNJHHGGFKG_ = fJNJHHGGFKG_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.bKFAGMHHFDD_ = bKFAGMHHFDD_;
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
        if (other instanceof emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify) {
          return mergeFrom((emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify other) {
        if (other == emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify.getDefaultInstance()) return this;
        if (other.getFJNJHHGGFKG() != 0) {
          setFJNJHHGGFKG(other.getFJNJHHGGFKG());
        }
        if (other.getBKFAGMHHFDD() != 0) {
          setBKFAGMHHFDD(other.getBKFAGMHHFDD());
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
              case 56: {
                bKFAGMHHFDD_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 120: {
                fJNJHHGGFKG_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private int fJNJHHGGFKG_ ;
      /**
       * <code>uint32 FJNJHHGGFKG = 15;</code>
       * @return The fJNJHHGGFKG.
       */
      @java.lang.Override
      public int getFJNJHHGGFKG() {
        return fJNJHHGGFKG_;
      }
      /**
       * <code>uint32 FJNJHHGGFKG = 15;</code>
       * @param value The fJNJHHGGFKG to set.
       * @return This builder for chaining.
       */
      public Builder setFJNJHHGGFKG(int value) {

        fJNJHHGGFKG_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FJNJHHGGFKG = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFJNJHHGGFKG() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fJNJHHGGFKG_ = 0;
        onChanged();
        return this;
      }

      private int bKFAGMHHFDD_ ;
      /**
       * <code>int32 BKFAGMHHFDD = 7;</code>
       * @return The bKFAGMHHFDD.
       */
      @java.lang.Override
      public int getBKFAGMHHFDD() {
        return bKFAGMHHFDD_;
      }
      /**
       * <code>int32 BKFAGMHHFDD = 7;</code>
       * @param value The bKFAGMHHFDD to set.
       * @return This builder for chaining.
       */
      public Builder setBKFAGMHHFDD(int value) {

        bKFAGMHHFDD_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 BKFAGMHHFDD = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearBKFAGMHHFDD() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bKFAGMHHFDD_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MiracleRingDropResultNotify)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingDropResultNotify)
    private static final emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify();
    }

    public static emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingDropResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingDropResultNotify>() {
      @java.lang.Override
      public MiracleRingDropResultNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<MiracleRingDropResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingDropResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.MiracleRingDropResultNotifyOuterClass.MiracleRingDropResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingDropResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingDropResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!MiracleRingDropResultNotify.proto\"G\n\033M" +
      "iracleRingDropResultNotify\022\023\n\013FJNJHHGGFK" +
      "G\030\017 \001(\r\022\023\n\013BKFAGMHHFDD\030\007 \001(\005B\035\n\033emu.prot" +
      "oshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MiracleRingDropResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingDropResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingDropResultNotify_descriptor,
        new java.lang.String[] { "FJNJHHGGFKG", "BKFAGMHHFDD", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
