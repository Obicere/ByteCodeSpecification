package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LALOAD;
    }
}
