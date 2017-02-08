package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface SyntheticAttribute extends Attribute {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SYNTHETIC_ATTRIBUTE;
    }
}
