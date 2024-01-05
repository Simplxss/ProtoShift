package emu.protoshift.net.packet;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;

public class PacketOpcodesUtil {
    private static void LoadMap(Field[] fields, Map<Integer, String> map) {
        for (Field f : fields) {
            if (f.getType().equals(int.class)) {
                try {
                    map.put(f.getInt(null), f.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static final Map<Integer, String> newopcodeMap = new HashMap<>();
    private static final Map<Integer, String> oldopcodeMap = new HashMap<>();

    static {
        LoadMap(PacketOpcodes.newOpcodes.class.getFields(), newopcodeMap);
        LoadMap(PacketOpcodes.oldOpcodes.class.getFields(), oldopcodeMap);
    }

    public static String getOpcodeName(PacketOpcodes opcode) {
        if (opcode.value <= 0) return "UNKNOWN";
        return opcode.type == 1 ? newopcodeMap.getOrDefault(opcode.value, "UNKNOWN") : oldopcodeMap.getOrDefault(opcode.value, "UNKNOWN");
    }
}
