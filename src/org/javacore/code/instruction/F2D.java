package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface F2D extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.F2D;
    }
}
