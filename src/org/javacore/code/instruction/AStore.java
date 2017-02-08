package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AStore extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ASTORE;
    }
}
