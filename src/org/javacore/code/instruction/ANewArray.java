package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ANewArray extends NewInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ANEWARRAY;
    }
}
