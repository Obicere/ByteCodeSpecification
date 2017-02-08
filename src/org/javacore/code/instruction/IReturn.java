package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IReturn extends ReturnInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IRETURN;
    }
}
