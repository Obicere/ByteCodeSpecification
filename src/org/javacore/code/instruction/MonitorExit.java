package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface MonitorExit extends Instruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.MONITOREXIT;
    }
}
