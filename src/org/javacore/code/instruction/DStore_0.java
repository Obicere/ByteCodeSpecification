package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DStore_0 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DSTORE_0;
    }
}
