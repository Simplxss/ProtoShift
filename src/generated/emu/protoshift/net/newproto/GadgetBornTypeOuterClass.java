// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetBornType.proto

package emu.protoshift.net.newproto;

public final class GadgetBornTypeOuterClass {
  private GadgetBornTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GadgetBornType}
   */
  public enum GadgetBornType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GADGET_BORN_TYPE_NONE = 0;</code>
     */
    GADGET_BORN_TYPE_NONE(0),
    /**
     * <code>GADGET_BORN_TYPE_IN_AIR = 1;</code>
     */
    GADGET_BORN_TYPE_IN_AIR(1),
    /**
     * <code>GADGET_BORN_TYPE_PLAYER = 2;</code>
     */
    GADGET_BORN_TYPE_PLAYER(2),
    /**
     * <code>GADGET_BORN_TYPE_MONSTER_HIT = 3;</code>
     */
    GADGET_BORN_TYPE_MONSTER_HIT(3),
    /**
     * <code>GADGET_BORN_TYPE_MONSTER_DIE = 4;</code>
     */
    GADGET_BORN_TYPE_MONSTER_DIE(4),
    /**
     * <code>GADGET_BORN_TYPE_GADGET = 5;</code>
     */
    GADGET_BORN_TYPE_GADGET(5),
    /**
     * <code>GADGET_BORN_TYPE_GROUND = 6;</code>
     */
    GADGET_BORN_TYPE_GROUND(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GADGET_BORN_TYPE_NONE = 0;</code>
     */
    public static final int GADGET_BORN_TYPE_NONE_VALUE = 0;
    /**
     * <code>GADGET_BORN_TYPE_IN_AIR = 1;</code>
     */
    public static final int GADGET_BORN_TYPE_IN_AIR_VALUE = 1;
    /**
     * <code>GADGET_BORN_TYPE_PLAYER = 2;</code>
     */
    public static final int GADGET_BORN_TYPE_PLAYER_VALUE = 2;
    /**
     * <code>GADGET_BORN_TYPE_MONSTER_HIT = 3;</code>
     */
    public static final int GADGET_BORN_TYPE_MONSTER_HIT_VALUE = 3;
    /**
     * <code>GADGET_BORN_TYPE_MONSTER_DIE = 4;</code>
     */
    public static final int GADGET_BORN_TYPE_MONSTER_DIE_VALUE = 4;
    /**
     * <code>GADGET_BORN_TYPE_GADGET = 5;</code>
     */
    public static final int GADGET_BORN_TYPE_GADGET_VALUE = 5;
    /**
     * <code>GADGET_BORN_TYPE_GROUND = 6;</code>
     */
    public static final int GADGET_BORN_TYPE_GROUND_VALUE = 6;


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
    public static GadgetBornType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GadgetBornType forNumber(int value) {
      switch (value) {
        case 0: return GADGET_BORN_TYPE_NONE;
        case 1: return GADGET_BORN_TYPE_IN_AIR;
        case 2: return GADGET_BORN_TYPE_PLAYER;
        case 3: return GADGET_BORN_TYPE_MONSTER_HIT;
        case 4: return GADGET_BORN_TYPE_MONSTER_DIE;
        case 5: return GADGET_BORN_TYPE_GADGET;
        case 6: return GADGET_BORN_TYPE_GROUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GadgetBornType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GadgetBornType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GadgetBornType>() {
            public GadgetBornType findValueByNumber(int number) {
              return GadgetBornType.forNumber(number);
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
      return emu.protoshift.net.newproto.GadgetBornTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GadgetBornType[] VALUES = values();

    public static GadgetBornType valueOf(
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

    private GadgetBornType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GadgetBornType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GadgetBornType.proto*\343\001\n\016GadgetBornTyp" +
      "e\022\031\n\025GADGET_BORN_TYPE_NONE\020\000\022\033\n\027GADGET_B" +
      "ORN_TYPE_IN_AIR\020\001\022\033\n\027GADGET_BORN_TYPE_PL" +
      "AYER\020\002\022 \n\034GADGET_BORN_TYPE_MONSTER_HIT\020\003" +
      "\022 \n\034GADGET_BORN_TYPE_MONSTER_DIE\020\004\022\033\n\027GA" +
      "DGET_BORN_TYPE_GADGET\020\005\022\033\n\027GADGET_BORN_T" +
      "YPE_GROUND\020\006B\035\n\033emu.protoshift.net.newpr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
