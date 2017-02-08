package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantLong extends Constant {

    public long getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_LONG;
    }

}
