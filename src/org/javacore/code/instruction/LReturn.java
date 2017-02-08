package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LReturn extends ReturnInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LRETURN;
    }
}
