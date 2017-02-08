package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfEq extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFEQ;
    }
}
