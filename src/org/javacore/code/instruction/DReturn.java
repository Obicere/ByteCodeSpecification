package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DReturn extends ReturnInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DRETURN;
    }
}
