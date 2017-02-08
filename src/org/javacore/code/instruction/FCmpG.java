package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FCmpG extends ComparisonInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FCMPG;
    }
}
