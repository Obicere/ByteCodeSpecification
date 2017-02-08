package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DRem extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DREM;
    }
}
