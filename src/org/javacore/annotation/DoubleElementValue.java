package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface DoubleElementValue extends ElementValue {

    public double getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DOUBLE_ELEMENT_VALUE;
    }

}
