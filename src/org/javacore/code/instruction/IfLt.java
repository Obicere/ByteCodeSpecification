package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfLt extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFLT;
    }
}
