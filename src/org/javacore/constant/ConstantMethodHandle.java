package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.common.MethodHandle;

/**
 */
public interface ConstantMethodHandle extends Constant {

    public MethodHandle<?> getHandle();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_METHOD_HANDLE;
    }

}
