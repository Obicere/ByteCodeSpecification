package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LRem extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LREM;
    }
}
