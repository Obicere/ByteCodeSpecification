package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ALoad extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ALOAD;
    }
}
