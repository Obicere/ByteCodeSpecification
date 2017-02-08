package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IRem extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IREM;
    }
}
