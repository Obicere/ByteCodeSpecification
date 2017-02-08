package org.javacore.code.instruction;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface Instruction extends Identifiable {

    public String getMnemonic();

    public int getOpCode();

    public int getLength();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INSTRUCTION;
    }

}
