package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantDouble extends Constant {

    public double getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_DOUBLE;
    }

}
