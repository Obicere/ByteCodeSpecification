package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LDiv extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LDIV;
    }
}
