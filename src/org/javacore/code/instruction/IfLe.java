package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfLe extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFLE;
    }
}
