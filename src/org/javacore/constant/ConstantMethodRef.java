package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface ConstantMethodRef extends ConstantRef {

    @Override
    public Reference<JCMethod> getReference();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_METHOD_REF;
    }

}
