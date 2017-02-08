package org.javacore.type.generic;

import org.javacore.JCMethod;
import org.javacore.type.Type;

/**
 */
public interface MethodGenericDeclaration extends GenericDeclaration {

    @Override
    public JCMethod getDeclarer();

    public Type[] getParameterTypes();

    public Type getReturnType();

    public Type[] getExceptionTypes();

}
