// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChapterState.proto

package emu.protoshift.net.oldproto;

public final class ChapterStateOuterClass {
  private ChapterStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ChapterState}
   */
  public enum ChapterState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHAPTER_STATE_INVALID = 0;</code>
     */
    CHAPTER_STATE_INVALID(0),
    /**
     * <code>CHAPTER_STATE_UNABLE_TO_BEGIN = 1;</code>
     */
    CHAPTER_STATE_UNABLE_TO_BEGIN(1),
    /**
     * <code>CHAPTER_STATE_BEGIN = 2;</code>
     */
    CHAPTER_STATE_BEGIN(2),
    /**
     * <code>CHAPTER_STATE_END = 3;</code>
     */
    CHAPTER_STATE_END(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHAPTER_STATE_INVALID = 0;</code>
     */
    public static final int CHAPTER_STATE_INVALID_VALUE = 0;
    /**
     * <code>CHAPTER_STATE_UNABLE_TO_BEGIN = 1;</code>
     */
    public static final int CHAPTER_STATE_UNABLE_TO_BEGIN_VALUE = 1;
    /**
     * <code>CHAPTER_STATE_BEGIN = 2;</code>
     */
    public static final int CHAPTER_STATE_BEGIN_VALUE = 2;
    /**
     * <code>CHAPTER_STATE_END = 3;</code>
     */
    public static final int CHAPTER_STATE_END_VALUE = 3;


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
    public static ChapterState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChapterState forNumber(int value) {
      switch (value) {
        case 0: return CHAPTER_STATE_INVALID;
        case 1: return CHAPTER_STATE_UNABLE_TO_BEGIN;
        case 2: return CHAPTER_STATE_BEGIN;
        case 3: return CHAPTER_STATE_END;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChapterState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChapterState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChapterState>() {
            public ChapterState findValueByNumber(int number) {
              return ChapterState.forNumber(number);
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
      return emu.protoshift.net.oldproto.ChapterStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChapterState[] VALUES = values();

    public static ChapterState valueOf(
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

    private ChapterState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ChapterState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ChapterState.proto*|\n\014ChapterState\022\031\n\025" +
      "CHAPTER_STATE_INVALID\020\000\022!\n\035CHAPTER_STATE" +
      "_UNABLE_TO_BEGIN\020\001\022\027\n\023CHAPTER_STATE_BEGI" +
      "N\020\002\022\025\n\021CHAPTER_STATE_END\020\003B\035\n\033emu.protos" +
      "hift.net.oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
