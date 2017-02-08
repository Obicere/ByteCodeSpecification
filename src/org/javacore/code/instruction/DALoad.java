package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DALoad extends ArrayInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DALOAD;
    }
}
