package org.javacore;

import org.javacore.type.Type;
import org.javacore.type.generic.Declaration;
import org.javacore.type.generic.MethodGenericDeclaration;

/**
 */
public interface JCMethod extends Declaration<MethodGenericDeclaration>, Attributable {

    public String getName();

    public Type getReturnType();

    public Type[] getParameterTypes();

    public Type[] getExceptionTypes();

    public JCClass getDeclaringClass();

    public void setDeclaringClass(final JCClass declaring);

    @Override
    default public Identifier getIdentifier() {
        return Identifier.METHOD;
    }
}
