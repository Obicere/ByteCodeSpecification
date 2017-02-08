package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IAdd extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IADD;
    }
}
