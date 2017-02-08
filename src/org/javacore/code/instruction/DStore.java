package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DStore extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DSTORE;
    }
}
