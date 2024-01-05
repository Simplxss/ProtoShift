// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DealAddFriendResultType.proto

package emu.protoshift.net.oldproto;

public final class DealAddFriendResultTypeOuterClass {
  private DealAddFriendResultTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DealAddFriendResultType}
   */
  public enum DealAddFriendResultType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEAL_ADD_FRIEND_RESULT_TYPE_REJECT = 0;</code>
     */
    DEAL_ADD_FRIEND_RESULT_TYPE_REJECT(0),
    /**
     * <code>DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT = 1;</code>
     */
    DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DEAL_ADD_FRIEND_RESULT_TYPE_REJECT = 0;</code>
     */
    public static final int DEAL_ADD_FRIEND_RESULT_TYPE_REJECT_VALUE = 0;
    /**
     * <code>DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT = 1;</code>
     */
    public static final int DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT_VALUE = 1;


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
    public static DealAddFriendResultType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DealAddFriendResultType forNumber(int value) {
      switch (value) {
        case 0: return DEAL_ADD_FRIEND_RESULT_TYPE_REJECT;
        case 1: return DEAL_ADD_FRIEND_RESULT_TYPE_ACCEPT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DealAddFriendResultType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DealAddFriendResultType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DealAddFriendResultType>() {
            public DealAddFriendResultType findValueByNumber(int number) {
              return DealAddFriendResultType.forNumber(number);
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
      return emu.protoshift.net.oldproto.DealAddFriendResultTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DealAddFriendResultType[] VALUES = values();

    public static DealAddFriendResultType valueOf(
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

    private DealAddFriendResultType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DealAddFriendResultType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035DealAddFriendResultType.proto*i\n\027DealA" +
      "ddFriendResultType\022&\n\"DEAL_ADD_FRIEND_RE" +
      "SULT_TYPE_REJECT\020\000\022&\n\"DEAL_ADD_FRIEND_RE" +
      "SULT_TYPE_ACCEPT\020\001B\035\n\033emu.protoshift.net" +
      ".oldprotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
