package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DASTORE;
    }
}
