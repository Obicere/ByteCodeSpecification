package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface PutField extends FieldInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.PUTFIELD;
    }
}
