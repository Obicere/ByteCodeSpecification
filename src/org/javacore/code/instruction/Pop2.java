package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Pop2 extends StackInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.POP2;
    }
}
