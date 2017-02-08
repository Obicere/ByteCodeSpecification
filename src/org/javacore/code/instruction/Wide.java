package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Wide extends Instruction {

    // TODO decide best way to handle wrapped instruction
    public int getInstruction();

    public int getIndex();

    public int getConstant();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.WIDE;
    }
}
