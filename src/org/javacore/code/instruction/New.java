package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.JCClass;

/**
 */
public interface New extends NewInstruction {

    @Override
    public JCClass getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NEW;
    }
}
