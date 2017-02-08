package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FStore extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FSTORE;
    }
}
