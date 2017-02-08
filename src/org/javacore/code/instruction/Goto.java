package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Goto extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.GOTO;
    }
}
