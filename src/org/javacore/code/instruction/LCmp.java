package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LCmp extends ComparisonInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LCMP;
    }
}
