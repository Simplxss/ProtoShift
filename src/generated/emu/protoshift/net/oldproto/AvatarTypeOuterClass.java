// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarType.proto

package emu.protoshift.net.oldproto;

public final class AvatarTypeOuterClass {
  private AvatarTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code AvatarType}
   */
  public enum AvatarType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>AVATAR_TYPE_NONE = 0;</code>
     */
    AVATAR_TYPE_NONE(0),
    /**
     * <code>AVATAR_TYPE_FORMAL = 1;</code>
     */
    AVATAR_TYPE_FORMAL(1),
    /**
     * <code>AVATAR_TYPE_TRIAL = 2;</code>
     */
    AVATAR_TYPE_TRIAL(2),
    /**
     * <code>AVATAR_TYPE_MIRROR = 3;</code>
     */
    AVATAR_TYPE_MIRROR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>AVATAR_TYPE_NONE = 0;</code>
     */
    public static final int AVATAR_TYPE_NONE_VALUE = 0;
    /**
     * <code>AVATAR_TYPE_FORMAL = 1;</code>
     */
    public static final int AVATAR_TYPE_FORMAL_VALUE = 1;
    /**
     * <code>AVATAR_TYPE_TRIAL = 2;</code>
     */
    public static final int AVATAR_TYPE_TRIAL_VALUE = 2;
    /**
     * <code>AVATAR_TYPE_MIRROR = 3;</code>
     */
    public static final int AVATAR_TYPE_MIRROR_VALUE = 3;


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
    public static AvatarType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AvatarType forNumber(int value) {
      switch (value) {
        case 0: return AVATAR_TYPE_NONE;
        case 1: return AVATAR_TYPE_FORMAL;
        case 2: return AVATAR_TYPE_TRIAL;
        case 3: return AVATAR_TYPE_MIRROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AvatarType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AvatarType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AvatarType>() {
            public AvatarType findValueByNumber(int number) {
              return AvatarType.forNumber(number);
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
      return emu.protoshift.net.oldproto.AvatarTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final AvatarType[] VALUES = values();

    public static AvatarType valueOf(
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

    private AvatarType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:AvatarType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AvatarType.proto*i\n\nAvatarType\022\024\n\020AVAT" +
      "AR_TYPE_NONE\020\000\022\026\n\022AVATAR_TYPE_FORMAL\020\001\022\025" +
      "\n\021AVATAR_TYPE_TRIAL\020\002\022\026\n\022AVATAR_TYPE_MIR" +
      "ROR\020\003B\035\n\033emu.protoshift.net.oldprotob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
