package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface NewArray extends NewInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NEWARRAY;
    }
}
