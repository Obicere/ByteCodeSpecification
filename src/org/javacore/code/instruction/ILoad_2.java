package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ILoad_2 extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ILOAD_2;
    }
}
