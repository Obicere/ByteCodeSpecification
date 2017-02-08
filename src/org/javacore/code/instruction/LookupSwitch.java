package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LookupSwitch extends SwitchInstruction {

    public int getNumberOfPairs();

    public int[] getMatches();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOOKUPSWITCH;
    }
}
