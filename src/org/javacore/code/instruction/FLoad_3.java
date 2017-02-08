package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FLoad_3 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FLOAD_3;
    }
}
