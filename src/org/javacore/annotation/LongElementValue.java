package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface LongElementValue extends ElementValue {

    public long getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LONG_ELEMENT_VALUE;
    }

}
