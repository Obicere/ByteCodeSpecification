package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface PutStatic extends FieldInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.PUTSTATIC;
    }
}
