// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HPJPOMAIPNC.proto

package emu.protoshift.net.oldproto;

public final class HPJPOMAIPNCOuterClass {
  private HPJPOMAIPNCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code HPJPOMAIPNC}
   */
  public enum HPJPOMAIPNC
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>HPJPOMAIPNC_GcgLevelNone = 0;</code>
     */
    HPJPOMAIPNC_GcgLevelNone(0),
    /**
     * <code>HPJPOMAIPNC_GcgLevelConst = 1;</code>
     */
    HPJPOMAIPNC_GcgLevelConst(1),
    /**
     * <code>HPJPOMAIPNC_GcgLevelWeek = 2;</code>
     */
    HPJPOMAIPNC_GcgLevelWeek(2),
    /**
     * <code>HPJPOMAIPNC_GcgLevelWorld = 3;</code>
     */
    HPJPOMAIPNC_GcgLevelWorld(3),
    /**
     * <code>HPJPOMAIPNC_GcgLevelBoss = 4;</code>
     */
    HPJPOMAIPNC_GcgLevelBoss(4),
    /**
     * <code>HPJPOMAIPNC_GcgLevelCharacter = 5;</code>
     */
    HPJPOMAIPNC_GcgLevelCharacter(5),
    /**
     * <code>HPJPOMAIPNC_GcgLevelBreak = 6;</code>
     */
    HPJPOMAIPNC_GcgLevelBreak(6),
    /**
     * <code>HPJPOMAIPNC_GcgLevelQuest = 7;</code>
     */
    HPJPOMAIPNC_GcgLevelQuest(7),
    /**
     * <code>HPJPOMAIPNC_GcgLevelGuideGroup = 8;</code>
     */
    HPJPOMAIPNC_GcgLevelGuideGroup(8),
    /**
     * <code>HPJPOMAIPNC_GcgLevelOther = 9;</code>
     */
    HPJPOMAIPNC_GcgLevelOther(9),
    /**
     * <code>HPJPOMAIPNC_GcgLevelJourney = 10;</code>
     */
    HPJPOMAIPNC_GcgLevelJourney(10),
    /**
     * <code>HPJPOMAIPNC_GcgLevelPve = 11;</code>
     */
    HPJPOMAIPNC_GcgLevelPve(11),
    /**
     * <code>HPJPOMAIPNC_GcgLevelPveInfinite = 12;</code>
     */
    HPJPOMAIPNC_GcgLevelPveInfinite(12),
    /**
     * <code>HPJPOMAIPNC_GcgLevelPvePuzzle = 13;</code>
     */
    HPJPOMAIPNC_GcgLevelPvePuzzle(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>HPJPOMAIPNC_GcgLevelNone = 0;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelNone_VALUE = 0;
    /**
     * <code>HPJPOMAIPNC_GcgLevelConst = 1;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelConst_VALUE = 1;
    /**
     * <code>HPJPOMAIPNC_GcgLevelWeek = 2;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelWeek_VALUE = 2;
    /**
     * <code>HPJPOMAIPNC_GcgLevelWorld = 3;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelWorld_VALUE = 3;
    /**
     * <code>HPJPOMAIPNC_GcgLevelBoss = 4;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelBoss_VALUE = 4;
    /**
     * <code>HPJPOMAIPNC_GcgLevelCharacter = 5;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelCharacter_VALUE = 5;
    /**
     * <code>HPJPOMAIPNC_GcgLevelBreak = 6;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelBreak_VALUE = 6;
    /**
     * <code>HPJPOMAIPNC_GcgLevelQuest = 7;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelQuest_VALUE = 7;
    /**
     * <code>HPJPOMAIPNC_GcgLevelGuideGroup = 8;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelGuideGroup_VALUE = 8;
    /**
     * <code>HPJPOMAIPNC_GcgLevelOther = 9;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelOther_VALUE = 9;
    /**
     * <code>HPJPOMAIPNC_GcgLevelJourney = 10;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelJourney_VALUE = 10;
    /**
     * <code>HPJPOMAIPNC_GcgLevelPve = 11;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelPve_VALUE = 11;
    /**
     * <code>HPJPOMAIPNC_GcgLevelPveInfinite = 12;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelPveInfinite_VALUE = 12;
    /**
     * <code>HPJPOMAIPNC_GcgLevelPvePuzzle = 13;</code>
     */
    public static final int HPJPOMAIPNC_GcgLevelPvePuzzle_VALUE = 13;


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
    public static HPJPOMAIPNC valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static HPJPOMAIPNC forNumber(int value) {
      switch (value) {
        case 0: return HPJPOMAIPNC_GcgLevelNone;
        case 1: return HPJPOMAIPNC_GcgLevelConst;
        case 2: return HPJPOMAIPNC_GcgLevelWeek;
        case 3: return HPJPOMAIPNC_GcgLevelWorld;
        case 4: return HPJPOMAIPNC_GcgLevelBoss;
        case 5: return HPJPOMAIPNC_GcgLevelCharacter;
        case 6: return HPJPOMAIPNC_GcgLevelBreak;
        case 7: return HPJPOMAIPNC_GcgLevelQuest;
        case 8: return HPJPOMAIPNC_GcgLevelGuideGroup;
        case 9: return HPJPOMAIPNC_GcgLevelOther;
        case 10: return HPJPOMAIPNC_GcgLevelJourney;
        case 11: return HPJPOMAIPNC_GcgLevelPve;
        case 12: return HPJPOMAIPNC_GcgLevelPveInfinite;
        case 13: return HPJPOMAIPNC_GcgLevelPvePuzzle;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<HPJPOMAIPNC>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        HPJPOMAIPNC> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HPJPOMAIPNC>() {
            public HPJPOMAIPNC findValueByNumber(int number) {
              return HPJPOMAIPNC.forNumber(number);
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
      return emu.protoshift.net.oldproto.HPJPOMAIPNCOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final HPJPOMAIPNC[] VALUES = values();

    public static HPJPOMAIPNC valueOf(
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

    private HPJPOMAIPNC(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HPJPOMAIPNC)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HPJPOMAIPNC.proto*\317\003\n\013HPJPOMAIPNC\022\034\n\030H" +
      "PJPOMAIPNC_GcgLevelNone\020\000\022\035\n\031HPJPOMAIPNC" +
      "_GcgLevelConst\020\001\022\034\n\030HPJPOMAIPNC_GcgLevel" +
      "Week\020\002\022\035\n\031HPJPOMAIPNC_GcgLevelWorld\020\003\022\034\n" +
      "\030HPJPOMAIPNC_GcgLevelBoss\020\004\022!\n\035HPJPOMAIP" +
      "NC_GcgLevelCharacter\020\005\022\035\n\031HPJPOMAIPNC_Gc" +
      "gLevelBreak\020\006\022\035\n\031HPJPOMAIPNC_GcgLevelQue" +
      "st\020\007\022\"\n\036HPJPOMAIPNC_GcgLevelGuideGroup\020\010" +
      "\022\035\n\031HPJPOMAIPNC_GcgLevelOther\020\t\022\037\n\033HPJPO" +
      "MAIPNC_GcgLevelJourney\020\n\022\033\n\027HPJPOMAIPNC_" +
      "GcgLevelPve\020\013\022#\n\037HPJPOMAIPNC_GcgLevelPve" +
      "Infinite\020\014\022!\n\035HPJPOMAIPNC_GcgLevelPvePuz" +
      "zle\020\rB\035\n\033emu.protoshift.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
