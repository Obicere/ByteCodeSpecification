package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantString extends Constant {

    public String getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_STRING;
    }

}
