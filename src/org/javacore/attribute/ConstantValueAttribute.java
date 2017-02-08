package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.constant.Constant;

/**
 */
public interface ConstantValueAttribute extends Attribute {

    public Constant getConstantValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_VALUE_ATTRIBUTE;
    }

}
