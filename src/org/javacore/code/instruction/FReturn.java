package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FReturn extends ReturnInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FRETURN;
    }
}
