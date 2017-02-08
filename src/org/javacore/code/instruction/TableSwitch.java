package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface TableSwitch extends SwitchInstruction {

    public int getLow();

    public int getHigh();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.TABLESWITCH;
    }
}
