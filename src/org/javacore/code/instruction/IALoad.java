package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IALOAD;
    }
}
