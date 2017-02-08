package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface SALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SALOAD;
    }
}
