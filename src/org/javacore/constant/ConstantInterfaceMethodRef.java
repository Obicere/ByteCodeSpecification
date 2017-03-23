package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface ConstantInterfaceMethodRef extends ConstantRef {

    @Override
    public Reference<JCMethod> getReference();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_INTERFACE_METHOD_REF;
    }

}
