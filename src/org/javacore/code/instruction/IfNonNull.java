package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IfNonNull extends BranchInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IFNONNULL;
    }
}
