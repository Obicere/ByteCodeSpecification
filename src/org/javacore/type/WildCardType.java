package org.javacore.type;

/**
 */
public interface WildCardType extends Type {

    public WildCardIndicator getBoundType();

    public ReferenceType getBound();

    @Override
    default public boolean isPrimitive() {
        return false;
    }

    @Override
    default public boolean isReference() {
        return false;
    }

    @Override
    default public boolean isGeneric() {
        return true;
    }

    @Override
    default public boolean isArray() {
        return false;
    }

}
