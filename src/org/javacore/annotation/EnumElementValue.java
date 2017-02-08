package org.javacore.annotation;

import org.javacore.Identifier;
import org.javacore.JCClass;

/**
 */
public interface EnumElementValue extends ElementValue {

    public JCClass getType();

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ENUM_ELEMENT_VALUE;
    }

}
