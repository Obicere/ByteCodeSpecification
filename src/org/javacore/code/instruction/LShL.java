package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LShL extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LSHL;
    }
}
