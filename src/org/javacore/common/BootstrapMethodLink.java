package org.javacore.common;

import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface BootstrapMethodLink {

    public BootstrapMethod getBootstrapMethod();

    public Reference<JCMethod> getImplementation();

}
