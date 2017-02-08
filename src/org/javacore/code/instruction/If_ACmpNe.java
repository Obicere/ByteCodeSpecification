package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface If_ACmpNe extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IF_ACMPNE;
    }
}
