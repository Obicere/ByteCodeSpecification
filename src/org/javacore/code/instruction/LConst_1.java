package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LConst_1 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LCONST_1;
    }
}
