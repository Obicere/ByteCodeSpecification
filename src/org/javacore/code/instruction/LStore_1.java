package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LStore_1 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LSTORE_1;
    }
}
