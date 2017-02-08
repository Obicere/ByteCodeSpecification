package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IMul extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IMUL;
    }
}
