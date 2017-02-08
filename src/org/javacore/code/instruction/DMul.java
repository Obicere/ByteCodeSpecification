package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DMul extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DMUL;
    }
}
