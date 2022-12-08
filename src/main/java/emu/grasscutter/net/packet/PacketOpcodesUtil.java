package emu.grasscutter.net.packet;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;

public class PacketOpcodesUtil {
    private static final Map<Integer, String> newopcodeMap = new HashMap<>();
    private static final Map<Integer, String> oldopcodeMap = new HashMap<>();

    static {
        Field[] fields1 = PacketOpcodes.newOpcodes.class.getFields();

        for (Field f : fields1) {
            if (f.getType().equals(int.class)) {
                try {
                    newopcodeMap.put(f.getInt(null), f.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        Field[] fields2 = PacketOpcodes.oldOpcodes.class.getFields();

        for (Field f : fields2) {
            if (f.getType().equals(int.class)) {
                try {
                    oldopcodeMap.put(f.getInt(null), f.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getOpcodeName(PacketOpcodes opcode) {
        if (opcode.value <= 0) return "UNKNOWN";
        return opcode.type == 1 ? newopcodeMap.getOrDefault(opcode.value, "UNKNOWN") : oldopcodeMap.getOrDefault(opcode.value, "UNKNOWN");
    }
}
