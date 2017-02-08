package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ALoad_2 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ALOAD_2;
    }
}
