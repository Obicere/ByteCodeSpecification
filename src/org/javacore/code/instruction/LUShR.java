package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LUShR extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LUSHR;
    }
}
