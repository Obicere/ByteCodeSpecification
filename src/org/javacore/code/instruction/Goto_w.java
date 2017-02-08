package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface Goto_w extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.GOTO_W;
    }
}
