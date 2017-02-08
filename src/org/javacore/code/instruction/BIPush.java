package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface BIPush extends Instruction {

    public int getByte();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BIPUSH;
    }
}
