package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface If_ICmpLe extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IF_ICMPLE;
    }
}
