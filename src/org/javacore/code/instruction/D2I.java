package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface D2I extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.D2I;
    }
}
