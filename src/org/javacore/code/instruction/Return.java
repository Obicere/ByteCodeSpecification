package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Return extends ReturnInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RETURN;
    }
}
