package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LShR extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LSHR;
    }
}
