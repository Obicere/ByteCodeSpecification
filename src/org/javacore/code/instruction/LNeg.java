package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LNeg extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LNEG;
    }
}
