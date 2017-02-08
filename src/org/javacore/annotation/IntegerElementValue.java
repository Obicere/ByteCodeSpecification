package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface IntegerElementValue extends ElementValue {

    public int getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INTEGER_ELEMENT_VALUE;
    }

}
