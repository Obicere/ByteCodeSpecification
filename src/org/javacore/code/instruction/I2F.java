package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface I2F extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.I2F;
    }
}
