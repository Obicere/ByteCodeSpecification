package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DSub extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DSUB;
    }
}
