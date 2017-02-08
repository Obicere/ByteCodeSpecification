package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LAdd extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LADD;
    }
}
