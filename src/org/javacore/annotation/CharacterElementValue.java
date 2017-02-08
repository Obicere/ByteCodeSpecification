package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface CharacterElementValue extends ElementValue {

    public char getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CHARACTER_ELEMENT_VALUE;
    }

}
