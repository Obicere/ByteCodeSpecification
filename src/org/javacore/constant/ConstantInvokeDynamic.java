package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.common.BootstrapMethodLink;

/**
 */
public interface ConstantInvokeDynamic extends Constant {

    public BootstrapMethodLink getInvocation();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_INVOKE_DYNAMIC;
    }

}
