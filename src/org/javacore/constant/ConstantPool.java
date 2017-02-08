package org.javacore.constant;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface ConstantPool extends Identifiable {

    public Constant get(final int i);

    public Constant[] getConstants();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_POOL;
    }
}
