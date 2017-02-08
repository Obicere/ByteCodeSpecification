package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface D2F extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.D2F;
    }
}
