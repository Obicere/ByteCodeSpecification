package org.javacore.common;

import org.javacore.JCMethod;
import org.javacore.constant.Constant;

/**
 */
public interface BootstrapMethod {

    public MethodHandle<JCMethod> getMethodHandle();

    public Constant[] getArguments();

}
