package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantFieldRef extends ConstantRef {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_FIELD_REF;
    }

}
