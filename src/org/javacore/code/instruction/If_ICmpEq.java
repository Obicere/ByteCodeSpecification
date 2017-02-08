package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface If_ICmpEq extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IF_ICMPEQ;
    }
}
