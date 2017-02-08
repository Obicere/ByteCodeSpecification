package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LStore_2 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LSTORE_2;
    }
}
