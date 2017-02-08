package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AThrow extends Instruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ATHROW;
    }
}
