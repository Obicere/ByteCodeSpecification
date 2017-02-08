package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface L2D extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.L2D;
    }
}
