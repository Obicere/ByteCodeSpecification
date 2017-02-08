package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface SIPush extends Instruction {

    public int getShort();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SIPUSH;
    }
}
