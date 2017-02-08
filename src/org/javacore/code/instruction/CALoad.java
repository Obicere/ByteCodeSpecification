package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface CALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CALOAD;
    }
}
