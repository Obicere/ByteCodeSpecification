package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FAdd extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FADD;
    }
}
