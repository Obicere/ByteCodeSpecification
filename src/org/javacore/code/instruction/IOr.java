package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IOr extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IOR;
    }
}
