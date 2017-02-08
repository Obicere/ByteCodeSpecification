package org.javacore.type;

import org.javacore.type.generic.GenericDeclaration;

/**
 */
public interface GenericType extends ReferenceType {

    @Override
    default public boolean isGeneric() {
        return true;
    }

    @Override
    default public boolean isArray() {
        return false;
    }

    public GenericDeclaration<?> getGenericDeclaration();

    public ReferenceType getClassBound();

    public ReferenceType[] getInterfaceBounds();
}
