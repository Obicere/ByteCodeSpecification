package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfGt extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFGT;
    }
}
