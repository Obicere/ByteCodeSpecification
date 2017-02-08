package org.javacore.type;

/**
 * @author Obicere
 */
public interface ReferenceType extends Type {

    @Override
    default public boolean isReference() {
        return true;
    }

    @Override
    default public boolean isPrimitive() {
        return false;
    }
}
