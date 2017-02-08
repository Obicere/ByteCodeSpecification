package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface BooleanElementValue extends ElementValue {

    public boolean getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BOOLEAN_ELEMENT_VALUE;
    }

}
