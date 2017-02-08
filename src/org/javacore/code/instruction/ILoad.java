package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface ILoad extends LoadInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ILOAD;
    }
}
