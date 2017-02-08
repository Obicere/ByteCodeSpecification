package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LLoad_2 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LLOAD_2;
    }
}
