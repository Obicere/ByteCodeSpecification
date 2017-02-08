package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface GetField extends FieldInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.GETFIELD;
    }
}
