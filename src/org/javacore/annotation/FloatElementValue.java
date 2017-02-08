package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface FloatElementValue extends ElementValue {

    public float getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FLOAT_ELEMENT_VALUE;
    }

}
