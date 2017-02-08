package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface GetStatic extends FieldInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.GETSTATIC;
    }
}
