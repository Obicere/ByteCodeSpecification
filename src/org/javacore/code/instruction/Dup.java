package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Dup extends StackInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DUP;
    }
}
