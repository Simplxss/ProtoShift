// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FriendOnlineState.proto

package emu.protoshift.net.newproto;

public final class FriendOnlineStateOuterClass {
  private FriendOnlineStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FriendOnlineState}
   */
  public enum FriendOnlineState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FriendOnlineState_FreiendDisconnect = 0;</code>
     */
    FriendOnlineState_FreiendDisconnect(0),
    /**
     * <code>FriendOnlineState_FriendOnline = 1;</code>
     */
    FriendOnlineState_FriendOnline(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FriendOnlineState_FreiendDisconnect = 0;</code>
     */
    public static final int FriendOnlineState_FreiendDisconnect_VALUE = 0;
    /**
     * <code>FriendOnlineState_FriendOnline = 1;</code>
     */
    public static final int FriendOnlineState_FriendOnline_VALUE = 1;


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
    public static FriendOnlineState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FriendOnlineState forNumber(int value) {
      switch (value) {
        case 0: return FriendOnlineState_FreiendDisconnect;
        case 1: return FriendOnlineState_FriendOnline;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FriendOnlineState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FriendOnlineState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FriendOnlineState>() {
            public FriendOnlineState findValueByNumber(int number) {
              return FriendOnlineState.forNumber(number);
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
      return emu.protoshift.net.newproto.FriendOnlineStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FriendOnlineState[] VALUES = values();

    public static FriendOnlineState valueOf(
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

    private FriendOnlineState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FriendOnlineState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027FriendOnlineState.proto*`\n\021FriendOnlin" +
      "eState\022\'\n#FriendOnlineState_FreiendDisco" +
      "nnect\020\000\022\"\n\036FriendOnlineState_FriendOnlin" +
      "e\020\001B\035\n\033emu.protoshift.net.newprotob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
