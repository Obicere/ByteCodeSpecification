package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface DConst_1 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DCONST_1;
    }
}
