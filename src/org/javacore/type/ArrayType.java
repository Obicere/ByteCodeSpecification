package org.javacore.type;

/**
 */
public interface ArrayType extends ReferenceType {

    @Override
    default public boolean isGeneric() {
        return false;
    }

    @Override
    default public boolean isArray() {
        return true;
    }
}
