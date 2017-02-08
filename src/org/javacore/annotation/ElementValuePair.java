package org.javacore.annotation;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface ElementValuePair extends Identifiable {

    public String getName();

    public ElementValue getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ELEMENT_VALUE_PAIR;
    }

}
