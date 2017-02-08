package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantInteger extends Constant {

    public int getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_INTEGER;
    }

}
