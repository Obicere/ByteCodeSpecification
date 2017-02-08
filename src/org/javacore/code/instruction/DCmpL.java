package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DCmpL extends ComparisonInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DCMPL;
    }
}
