package org.javacore.common;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.constant.Constant;

/**
 */
public interface BootstrapMethod extends Identifiable {

    public MethodHandle<JCMethod> getMethodHandle();

    public Constant[] getArguments();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BOOTSTRAP_METHOD;
    }

}
