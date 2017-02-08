package org.javacore.type;

/**
 */
public interface PrimitiveType extends Type {

    @Override
    default public boolean isPrimitive() {
        return true;
    }

    @Override
    default public boolean isGeneric() {
        return false;
    }

    @Override
    default public boolean isArray() {
        return false;
    }

    @Override
    default public boolean isReference() {
        return false;
    }
}
