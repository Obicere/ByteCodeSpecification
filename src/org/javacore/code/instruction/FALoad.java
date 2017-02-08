package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FALOAD;
    }
}
