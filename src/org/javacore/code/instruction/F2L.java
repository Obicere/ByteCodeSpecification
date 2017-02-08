package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface F2L extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.F2L;
    }
}
