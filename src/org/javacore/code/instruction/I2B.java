package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface I2B extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.I2B;
    }
}
