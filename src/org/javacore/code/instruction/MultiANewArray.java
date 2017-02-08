package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface MultiANewArray extends NewInstruction {

    public int getDimensions();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.MULTIANEWARRAY;
    }
}
