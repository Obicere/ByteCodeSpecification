package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface ShortElementValue extends ElementValue {

    public short getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SHORT_ELEMENT_VALUE;
    }

}
