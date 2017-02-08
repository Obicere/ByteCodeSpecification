package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IXor extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IXOR;
    }
}
