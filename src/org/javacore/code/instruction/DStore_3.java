package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DStore_3 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DSTORE_3;
    }
}
