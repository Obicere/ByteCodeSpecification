package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.constant.Constant;

/**
 */
public interface LdC2_w extends ConstantInstruction {

    public Constant getConstant();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LDC2_W;
    }
}
