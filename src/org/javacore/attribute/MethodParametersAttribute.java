package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.common.Parameter;

/**
 */
public interface MethodParametersAttribute extends Attribute {

    public Parameter[] getParameters();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.METHOD_PARAMETERS_ATTRIBUTE;
    }
}
