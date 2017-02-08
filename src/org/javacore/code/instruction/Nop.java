package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Nop extends Instruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NOP;
    }
}
