package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantFloat extends Constant {

    public float getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_FLOAT;
    }

}
