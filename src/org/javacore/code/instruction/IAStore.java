package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IASTORE;
    }
}
