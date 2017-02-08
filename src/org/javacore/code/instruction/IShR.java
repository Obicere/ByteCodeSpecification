package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IShR extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ISHR;
    }
}
