package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface FConst_1 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FCONST_1;
    }
}
