package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface ArrayElementValue extends ElementValue {

    public ElementValue[] getValues();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ARRAY_ELEMENT_VALUE;
    }

}
