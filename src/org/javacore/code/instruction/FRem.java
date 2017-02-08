package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FRem extends OperandInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FREM;
    }
}
