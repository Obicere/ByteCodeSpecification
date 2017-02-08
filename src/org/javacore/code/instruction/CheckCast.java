package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.type.Type;

/**
 */
public interface CheckCast extends CastInstruction {

    public Type getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CHECKCAST;
    }

}
