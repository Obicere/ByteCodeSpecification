package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface UnknownAttribute extends Attribute {

    public byte[] getInformation();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.UNKNOWN_ATTRIBUTE;
    }

}
