package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.constant.Constant;

/**
 */
public interface LdC_w extends ConstantInstruction {

    public Constant getConstant();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LDC_W;
    }
}
