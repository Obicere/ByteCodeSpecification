package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfNe extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFNE;
    }
}
