package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface JSR extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.JSR;
    }
}
