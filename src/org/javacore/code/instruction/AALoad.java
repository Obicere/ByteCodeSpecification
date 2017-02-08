package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.AALOAD;
    }

}
