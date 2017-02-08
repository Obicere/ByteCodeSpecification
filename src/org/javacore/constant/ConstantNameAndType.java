package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantNameAndType extends Constant {

    public String getName();

    public String getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_NAME_AND_TYPE;
    }

}
