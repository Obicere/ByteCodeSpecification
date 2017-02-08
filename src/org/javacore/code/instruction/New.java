package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface New extends NewInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NEW;
    }
}
