package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LMul extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LMUL;
    }
}
