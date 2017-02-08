package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface SAStore extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SASTORE;
    }
}
