package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FNeg extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FNEG;
    }
}
