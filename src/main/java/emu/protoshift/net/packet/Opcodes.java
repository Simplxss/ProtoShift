package emu.protoshift.net.packet;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
public @interface Opcodes {
	/** Opcode for the packet/handler */
	int value();

	int type();
	
	/** HANDLER ONLY - will disable this handler from being registered */
	boolean disabled() default false;
}
