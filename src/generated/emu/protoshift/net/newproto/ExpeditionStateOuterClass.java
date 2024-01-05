// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExpeditionState.proto

package emu.protoshift.net.newproto;

public final class ExpeditionStateOuterClass {
  private ExpeditionStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ExpeditionState}
   */
  public enum ExpeditionState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EXPEDITION_NONE = 0;</code>
     */
    EXPEDITION_NONE(0),
    /**
     * <code>EXPEDITION_STARTED = 1;</code>
     */
    EXPEDITION_STARTED(1),
    /**
     * <code>EXPEDITION_FINISHED = 2;</code>
     */
    EXPEDITION_FINISHED(2),
    /**
     * <code>EXPEDITION_REWARDED = 3;</code>
     */
    EXPEDITION_REWARDED(3),
    /**
     * <code>EXPEDITION_LOCKED = 4;</code>
     */
    EXPEDITION_LOCKED(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EXPEDITION_NONE = 0;</code>
     */
    public static final int EXPEDITION_NONE_VALUE = 0;
    /**
     * <code>EXPEDITION_STARTED = 1;</code>
     */
    public static final int EXPEDITION_STARTED_VALUE = 1;
    /**
     * <code>EXPEDITION_FINISHED = 2;</code>
     */
    public static final int EXPEDITION_FINISHED_VALUE = 2;
    /**
     * <code>EXPEDITION_REWARDED = 3;</code>
     */
    public static final int EXPEDITION_REWARDED_VALUE = 3;
    /**
     * <code>EXPEDITION_LOCKED = 4;</code>
     */
    public static final int EXPEDITION_LOCKED_VALUE = 4;


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
    public static ExpeditionState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExpeditionState forNumber(int value) {
      switch (value) {
        case 0: return EXPEDITION_NONE;
        case 1: return EXPEDITION_STARTED;
        case 2: return EXPEDITION_FINISHED;
        case 3: return EXPEDITION_REWARDED;
        case 4: return EXPEDITION_LOCKED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExpeditionState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExpeditionState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExpeditionState>() {
            public ExpeditionState findValueByNumber(int number) {
              return ExpeditionState.forNumber(number);
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
      return emu.protoshift.net.newproto.ExpeditionStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExpeditionState[] VALUES = values();

    public static ExpeditionState valueOf(
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

    private ExpeditionState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ExpeditionState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ExpeditionState.proto*\207\001\n\017ExpeditionSt" +
      "ate\022\023\n\017EXPEDITION_NONE\020\000\022\026\n\022EXPEDITION_S" +
      "TARTED\020\001\022\027\n\023EXPEDITION_FINISHED\020\002\022\027\n\023EXP" +
      "EDITION_REWARDED\020\003\022\025\n\021EXPEDITION_LOCKED\020" +
      "\004B\035\n\033emu.protoshift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
