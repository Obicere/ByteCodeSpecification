package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantClass extends Constant {

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_CLASS;
    }

}
