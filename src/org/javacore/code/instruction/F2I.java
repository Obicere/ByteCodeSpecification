package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface F2I extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.F2I;
    }
}
