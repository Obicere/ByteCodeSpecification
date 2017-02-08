package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface LConst_0 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LCONST_0;
    }
}
