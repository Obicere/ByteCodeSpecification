package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LStore extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LSTORE;
    }
}
