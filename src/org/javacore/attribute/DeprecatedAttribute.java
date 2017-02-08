package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface DeprecatedAttribute extends Attribute {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DEPRECATED_ATTRIBUTE;
    }

}
