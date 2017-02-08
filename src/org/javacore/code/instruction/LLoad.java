package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LLoad extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LLOAD;
    }
}
