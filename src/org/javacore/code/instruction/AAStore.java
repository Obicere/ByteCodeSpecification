package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.AASTORE;
    }
}
