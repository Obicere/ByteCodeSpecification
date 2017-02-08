package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface ByteElementValue extends ElementValue {

    public byte getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BYTE_ELEMENT_VALUE;
    }

}
