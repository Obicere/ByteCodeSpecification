package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IAnd extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IAND;
    }
}
