package org.javacore.annotation;

import org.javacore.Identifier;
import org.javacore.type.Type;

/**
 */
public interface ClassElementValue extends ElementValue {

    public Type getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CLASS_ELEMENT_VALUE;
    }

}
