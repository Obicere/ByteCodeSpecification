package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface BALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BALOAD;
    }
}
