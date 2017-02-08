package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.common.MethodType;

/**
 */
public interface ConstantMethodType extends Constant {

    public MethodType getMethodType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_METHOD_TYPE;
    }

}
