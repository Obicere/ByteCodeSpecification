package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IInc extends Instruction {

    public int getIndex();

    public int getConstant();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IINC;
    }

}
