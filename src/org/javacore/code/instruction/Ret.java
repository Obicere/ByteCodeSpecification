package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Ret extends Instruction {

    public int getIndex();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RET;
    }
}
