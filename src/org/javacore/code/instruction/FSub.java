package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FSub extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FSUB;
    }
}
