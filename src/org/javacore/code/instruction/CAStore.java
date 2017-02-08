package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface CAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CASTORE;
    }
}
