package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Dup2 extends StackInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DUP2;
    }
}
