package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FConst_2 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FCONST_2;
    }
}
