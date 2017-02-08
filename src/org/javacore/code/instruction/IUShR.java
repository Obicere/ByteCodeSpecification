package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IUShR extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IUSHR;
    }
}
