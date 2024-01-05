// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Investigation.proto

package emu.protoshift.net.oldproto;

public final class InvestigationOuterClass {
  private InvestigationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InvestigationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Investigation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 progress = 7;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>.Investigation.State state = 12;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.Investigation.State state = 12;</code>
     * @return The state.
     */
    emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State getState();

    /**
     * <code>uint32 total_progress = 14;</code>
     * @return The totalProgress.
     */
    int getTotalProgress();
  }
  /**
   * Protobuf type {@code Investigation}
   */
  public static final class Investigation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Investigation)
      InvestigationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Investigation.newBuilder() to construct.
    private Investigation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Investigation() {
      state_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Investigation();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.protoshift.net.oldproto.InvestigationOuterClass.internal_static_Investigation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.protoshift.net.oldproto.InvestigationOuterClass.internal_static_Investigation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.class, emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.Builder.class);
    }

    /**
     * <pre>
     * Obf: GMMLBMGDPPP
     * </pre>
     *
     * Protobuf enum {@code Investigation.State}
     */
    public enum State
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INVALID = 0;</code>
       */
      INVALID(0),
      /**
       * <code>IN_PROGRESS = 1;</code>
       */
      IN_PROGRESS(1),
      /**
       * <code>COMPLETE = 2;</code>
       */
      COMPLETE(2),
      /**
       * <code>REWARD_TAKEN = 3;</code>
       */
      REWARD_TAKEN(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>INVALID = 0;</code>
       */
      public static final int INVALID_VALUE = 0;
      /**
       * <code>IN_PROGRESS = 1;</code>
       */
      public static final int IN_PROGRESS_VALUE = 1;
      /**
       * <code>COMPLETE = 2;</code>
       */
      public static final int COMPLETE_VALUE = 2;
      /**
       * <code>REWARD_TAKEN = 3;</code>
       */
      public static final int REWARD_TAKEN_VALUE = 3;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static State valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static State forNumber(int value) {
        switch (value) {
          case 0: return INVALID;
          case 1: return IN_PROGRESS;
          case 2: return COMPLETE;
          case 3: return REWARD_TAKEN;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<State>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          State> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<State>() {
              public State findValueByNumber(int number) {
                return State.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.getDescriptor().getEnumTypes().get(0);
      }

      private static final State[] VALUES = values();

      public static State valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private State(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:Investigation.State)
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_ = 0;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int PROGRESS_FIELD_NUMBER = 7;
    private int progress_ = 0;
    /**
     * <code>uint32 progress = 7;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int STATE_FIELD_NUMBER = 12;
    private int state_ = 0;
    /**
     * <code>.Investigation.State state = 12;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.Investigation.State state = 12;</code>
     * @return The state.
     */
    @java.lang.Override public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State getState() {
      emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State result = emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.forNumber(state_);
      return result == null ? emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.UNRECOGNIZED : result;
    }

    public static final int TOTAL_PROGRESS_FIELD_NUMBER = 14;
    private int totalProgress_ = 0;
    /**
     * <code>uint32 total_progress = 14;</code>
     * @return The totalProgress.
     */
    @java.lang.Override
    public int getTotalProgress() {
      return totalProgress_;
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
      if (progress_ != 0) {
        output.writeUInt32(7, progress_);
      }
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      if (state_ != emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.INVALID.getNumber()) {
        output.writeEnum(12, state_);
      }
      if (totalProgress_ != 0) {
        output.writeUInt32(14, totalProgress_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, progress_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
      }
      if (state_ != emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, state_);
      }
      if (totalProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, totalProgress_);
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
      if (!(obj instanceof emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation)) {
        return super.equals(obj);
      }
      emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation other = (emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation) obj;

      if (getId()
          != other.getId()) return false;
      if (getProgress()
          != other.getProgress()) return false;
      if (state_ != other.state_) return false;
      if (getTotalProgress()
          != other.getTotalProgress()) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + TOTAL_PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getTotalProgress();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation parseFrom(
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
    public static Builder newBuilder(emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation prototype) {
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
     * Protobuf type {@code Investigation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Investigation)
        emu.protoshift.net.oldproto.InvestigationOuterClass.InvestigationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.protoshift.net.oldproto.InvestigationOuterClass.internal_static_Investigation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.protoshift.net.oldproto.InvestigationOuterClass.internal_static_Investigation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.class, emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.Builder.class);
      }

      // Construct using emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.newBuilder()
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
        id_ = 0;
        progress_ = 0;
        state_ = 0;
        totalProgress_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.protoshift.net.oldproto.InvestigationOuterClass.internal_static_Investigation_descriptor;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation getDefaultInstanceForType() {
        return emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.getDefaultInstance();
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation build() {
        emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation buildPartial() {
        emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation result = new emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.progress_ = progress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.state_ = state_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.totalProgress_ = totalProgress_;
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
        if (other instanceof emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation) {
          return mergeFrom((emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation other) {
        if (other == emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getTotalProgress() != 0) {
          setTotalProgress(other.getTotalProgress());
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
                progress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 64: {
                id_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
              case 96: {
                state_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
              case 112: {
                totalProgress_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 112
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

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int progress_ ;
      /**
       * <code>uint32 progress = 7;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 7;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {

        progress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        progress_ = 0;
        onChanged();
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.Investigation.State state = 12;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.Investigation.State state = 12;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        state_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.Investigation.State state = 12;</code>
       * @return The state.
       */
      @java.lang.Override
      public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State getState() {
        emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State result = emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.forNumber(state_);
        return result == null ? emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.Investigation.State state = 12;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Investigation.State state = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000004);
        state_ = 0;
        onChanged();
        return this;
      }

      private int totalProgress_ ;
      /**
       * <code>uint32 total_progress = 14;</code>
       * @return The totalProgress.
       */
      @java.lang.Override
      public int getTotalProgress() {
        return totalProgress_;
      }
      /**
       * <code>uint32 total_progress = 14;</code>
       * @param value The totalProgress to set.
       * @return This builder for chaining.
       */
      public Builder setTotalProgress(int value) {

        totalProgress_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 total_progress = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearTotalProgress() {
        bitField0_ = (bitField0_ & ~0x00000008);
        totalProgress_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Investigation)
    }

    // @@protoc_insertion_point(class_scope:Investigation)
    private static final emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation();
    }

    public static emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Investigation>
        PARSER = new com.google.protobuf.AbstractParser<Investigation>() {
      @java.lang.Override
      public Investigation parsePartialFrom(
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

    public static com.google.protobuf.Parser<Investigation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Investigation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.protoshift.net.oldproto.InvestigationOuterClass.Investigation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Investigation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Investigation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023Investigation.proto\"\261\001\n\rInvestigation\022" +
      "\n\n\002id\030\010 \001(\r\022\020\n\010progress\030\007 \001(\r\022#\n\005state\030\014" +
      " \001(\0162\024.Investigation.State\022\026\n\016total_prog" +
      "ress\030\016 \001(\r\"E\n\005State\022\013\n\007INVALID\020\000\022\017\n\013IN_P" +
      "ROGRESS\020\001\022\014\n\010COMPLETE\020\002\022\020\n\014REWARD_TAKEN\020" +
      "\003B\035\n\033emu.protoshift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Investigation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Investigation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Investigation_descriptor,
        new java.lang.String[] { "Id", "Progress", "State", "TotalProgress", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
