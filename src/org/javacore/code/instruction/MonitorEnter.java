package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface MonitorEnter extends Instruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.MONITORENTER;
    }
}
