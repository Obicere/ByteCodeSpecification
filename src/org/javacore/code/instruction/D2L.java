package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface D2L extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.D2L;
    }
}
