package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DCmpG extends ComparisonInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DCMPG;
    }
}
