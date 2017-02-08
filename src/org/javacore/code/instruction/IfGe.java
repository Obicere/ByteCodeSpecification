package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfGe extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFGE;
    }
}
