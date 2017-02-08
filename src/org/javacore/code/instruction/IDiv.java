package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IDiv extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IDIV;
    }
}
