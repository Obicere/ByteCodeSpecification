package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface INeg extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INEG;
    }
}
