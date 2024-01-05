// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MatchReason.proto

package emu.protoshift.net.newproto;

public final class MatchReasonOuterClass {
  private MatchReasonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code MatchReason}
   */
  public enum MatchReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MATCH_NONE = 0;</code>
     */
    MATCH_NONE(0),
    /**
     * <code>MATCH_FINISH = 1;</code>
     */
    MATCH_FINISH(1),
    /**
     * <code>MATCH_PLAYER_CANCEL = 2;</code>
     */
    MATCH_PLAYER_CANCEL(2),
    /**
     * <code>MATCH_TIMEOUT = 3;</code>
     */
    MATCH_TIMEOUT(3),
    /**
     * <code>MATCH_PLAYER_CONFIRM = 4;</code>
     */
    MATCH_PLAYER_CONFIRM(4),
    /**
     * <code>MATCH_FAILED = 5;</code>
     */
    MATCH_FAILED(5),
    /**
     * <code>MATCH_SYSTEM_ERROR = 6;</code>
     */
    MATCH_SYSTEM_ERROR(6),
    /**
     * <code>MATCH_INTERRUPTED = 7;</code>
     */
    MATCH_INTERRUPTED(7),
    /**
     * <code>MATCH_MP_UNAVAILABLE = 8;</code>
     */
    MATCH_MP_UNAVAILABLE(8),
    /**
     * <code>MATCH_CONFIRM_TIMEOUT = 9;</code>
     */
    MATCH_CONFIRM_TIMEOUT(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MATCH_NONE = 0;</code>
     */
    public static final int MATCH_NONE_VALUE = 0;
    /**
     * <code>MATCH_FINISH = 1;</code>
     */
    public static final int MATCH_FINISH_VALUE = 1;
    /**
     * <code>MATCH_PLAYER_CANCEL = 2;</code>
     */
    public static final int MATCH_PLAYER_CANCEL_VALUE = 2;
    /**
     * <code>MATCH_TIMEOUT = 3;</code>
     */
    public static final int MATCH_TIMEOUT_VALUE = 3;
    /**
     * <code>MATCH_PLAYER_CONFIRM = 4;</code>
     */
    public static final int MATCH_PLAYER_CONFIRM_VALUE = 4;
    /**
     * <code>MATCH_FAILED = 5;</code>
     */
    public static final int MATCH_FAILED_VALUE = 5;
    /**
     * <code>MATCH_SYSTEM_ERROR = 6;</code>
     */
    public static final int MATCH_SYSTEM_ERROR_VALUE = 6;
    /**
     * <code>MATCH_INTERRUPTED = 7;</code>
     */
    public static final int MATCH_INTERRUPTED_VALUE = 7;
    /**
     * <code>MATCH_MP_UNAVAILABLE = 8;</code>
     */
    public static final int MATCH_MP_UNAVAILABLE_VALUE = 8;
    /**
     * <code>MATCH_CONFIRM_TIMEOUT = 9;</code>
     */
    public static final int MATCH_CONFIRM_TIMEOUT_VALUE = 9;


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
    public static MatchReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MatchReason forNumber(int value) {
      switch (value) {
        case 0: return MATCH_NONE;
        case 1: return MATCH_FINISH;
        case 2: return MATCH_PLAYER_CANCEL;
        case 3: return MATCH_TIMEOUT;
        case 4: return MATCH_PLAYER_CONFIRM;
        case 5: return MATCH_FAILED;
        case 6: return MATCH_SYSTEM_ERROR;
        case 7: return MATCH_INTERRUPTED;
        case 8: return MATCH_MP_UNAVAILABLE;
        case 9: return MATCH_CONFIRM_TIMEOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MatchReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MatchReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MatchReason>() {
            public MatchReason findValueByNumber(int number) {
              return MatchReason.forNumber(number);
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
      return emu.protoshift.net.newproto.MatchReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final MatchReason[] VALUES = values();

    public static MatchReason valueOf(
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

    private MatchReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:MatchReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MatchReason.proto*\353\001\n\013MatchReason\022\016\n\nM" +
      "ATCH_NONE\020\000\022\020\n\014MATCH_FINISH\020\001\022\027\n\023MATCH_P" +
      "LAYER_CANCEL\020\002\022\021\n\rMATCH_TIMEOUT\020\003\022\030\n\024MAT" +
      "CH_PLAYER_CONFIRM\020\004\022\020\n\014MATCH_FAILED\020\005\022\026\n" +
      "\022MATCH_SYSTEM_ERROR\020\006\022\025\n\021MATCH_INTERRUPT" +
      "ED\020\007\022\030\n\024MATCH_MP_UNAVAILABLE\020\010\022\031\n\025MATCH_" +
      "CONFIRM_TIMEOUT\020\tB\035\n\033emu.protoshift.net." +
      "newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
