package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LLoad_3 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LLOAD_3;
    }
}
