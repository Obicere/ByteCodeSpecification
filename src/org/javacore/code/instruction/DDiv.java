package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DDiv extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DDIV;
    }
}
