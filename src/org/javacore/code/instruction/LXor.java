package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LXor extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LXOR;
    }
}
