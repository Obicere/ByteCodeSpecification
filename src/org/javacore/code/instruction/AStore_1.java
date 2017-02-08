package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AStore_1 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ASTORE_1;
    }
}
