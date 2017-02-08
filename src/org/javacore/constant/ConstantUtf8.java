package org.javacore.constant;

import org.javacore.Identifier;

/**
 */
public interface ConstantUtf8 extends Constant {

    public String getValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_UTF8;
    }
}
