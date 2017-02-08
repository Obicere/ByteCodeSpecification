package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ISub extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ISUB;
    }
}
