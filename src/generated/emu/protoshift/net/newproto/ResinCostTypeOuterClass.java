// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResinCostType.proto

package emu.protoshift.net.newproto;

public final class ResinCostTypeOuterClass {
  private ResinCostTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ResinCostType}
   */
  public enum ResinCostType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>RESIN_COST_TYPE_NONE = 0;</code>
     */
    RESIN_COST_TYPE_NONE(0),
    /**
     * <code>RESIN_COST_TYPE_NORMAL = 1;</code>
     */
    RESIN_COST_TYPE_NORMAL(1),
    /**
     * <code>RESIN_COST_TYPE_CONDENSE = 2;</code>
     */
    RESIN_COST_TYPE_CONDENSE(2),
    /**
     * <code>RESIN_COST_TYPE_REUNION_PRIVILEGE = 3;</code>
     */
    RESIN_COST_TYPE_REUNION_PRIVILEGE(3),
    /**
     * <code>RESIN_COST_TYPE_OP_ACTIVITY = 4;</code>
     */
    RESIN_COST_TYPE_OP_ACTIVITY(4),
    /**
     * <code>RESIN_COST_TYPE_MATERIAL = 5;</code>
     */
    RESIN_COST_TYPE_MATERIAL(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>RESIN_COST_TYPE_NONE = 0;</code>
     */
    public static final int RESIN_COST_TYPE_NONE_VALUE = 0;
    /**
     * <code>RESIN_COST_TYPE_NORMAL = 1;</code>
     */
    public static final int RESIN_COST_TYPE_NORMAL_VALUE = 1;
    /**
     * <code>RESIN_COST_TYPE_CONDENSE = 2;</code>
     */
    public static final int RESIN_COST_TYPE_CONDENSE_VALUE = 2;
    /**
     * <code>RESIN_COST_TYPE_REUNION_PRIVILEGE = 3;</code>
     */
    public static final int RESIN_COST_TYPE_REUNION_PRIVILEGE_VALUE = 3;
    /**
     * <code>RESIN_COST_TYPE_OP_ACTIVITY = 4;</code>
     */
    public static final int RESIN_COST_TYPE_OP_ACTIVITY_VALUE = 4;
    /**
     * <code>RESIN_COST_TYPE_MATERIAL = 5;</code>
     */
    public static final int RESIN_COST_TYPE_MATERIAL_VALUE = 5;


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
    public static ResinCostType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResinCostType forNumber(int value) {
      switch (value) {
        case 0: return RESIN_COST_TYPE_NONE;
        case 1: return RESIN_COST_TYPE_NORMAL;
        case 2: return RESIN_COST_TYPE_CONDENSE;
        case 3: return RESIN_COST_TYPE_REUNION_PRIVILEGE;
        case 4: return RESIN_COST_TYPE_OP_ACTIVITY;
        case 5: return RESIN_COST_TYPE_MATERIAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResinCostType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResinCostType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResinCostType>() {
            public ResinCostType findValueByNumber(int number) {
              return ResinCostType.forNumber(number);
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
      return emu.protoshift.net.newproto.ResinCostTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResinCostType[] VALUES = values();

    public static ResinCostType valueOf(
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

    private ResinCostType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ResinCostType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ResinCostType.proto*\311\001\n\rResinCostType\022" +
      "\030\n\024RESIN_COST_TYPE_NONE\020\000\022\032\n\026RESIN_COST_" +
      "TYPE_NORMAL\020\001\022\034\n\030RESIN_COST_TYPE_CONDENS" +
      "E\020\002\022%\n!RESIN_COST_TYPE_REUNION_PRIVILEGE" +
      "\020\003\022\037\n\033RESIN_COST_TYPE_OP_ACTIVITY\020\004\022\034\n\030R" +
      "ESIN_COST_TYPE_MATERIAL\020\005B\035\n\033emu.protosh" +
      "ift.net.newprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
