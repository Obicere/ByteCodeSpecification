package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IShL extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ISHL;
    }
}
