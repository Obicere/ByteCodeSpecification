package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FStore_3 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FSTORE_3;
    }
}
