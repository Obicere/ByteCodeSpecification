package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Swap extends StackInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SWAP;
    }
}
