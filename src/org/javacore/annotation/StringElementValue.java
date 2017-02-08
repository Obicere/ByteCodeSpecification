package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface StringElementValue extends ElementValue {

    public String getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.STRING_ELEMENT_VALUE;
    }

}
