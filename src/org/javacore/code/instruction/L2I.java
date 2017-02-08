package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface L2I extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.L2I;
    }
}
