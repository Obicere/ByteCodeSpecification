package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantInterfaceMethodRef extends ConstantRef {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_INTERFACE_METHOD_REF;
    }

}
