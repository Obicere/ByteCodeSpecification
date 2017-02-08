package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LASTORE;
    }
}
