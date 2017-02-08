package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface I2C extends CastInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.I2C;
    }
}
