package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IStore_1 extends StoreInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ISTORE_1;
    }
}
