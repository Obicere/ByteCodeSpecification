package org.javacore.code.instruction;

import org.javacore.Identifier;

/**
 */
public interface IConst_m1 extends ConstantInstruction {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ICONST_M1;
    }
}
