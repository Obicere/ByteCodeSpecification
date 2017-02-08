package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DLoad_1 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DLOAD_1;
    }
}
