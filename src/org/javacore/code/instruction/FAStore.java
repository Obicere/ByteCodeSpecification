package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FASTORE;
    }
}
