package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface AConst_Null extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ACONST_NULL;
    }
}
