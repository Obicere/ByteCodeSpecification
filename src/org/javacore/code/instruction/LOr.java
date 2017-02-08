package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LOr extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOR;
    }
}
