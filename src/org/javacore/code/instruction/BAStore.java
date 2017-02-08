package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface BAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BASTORE;
    }
}
