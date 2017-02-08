package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ALoad_1 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ALOAD_1;
    }
}
