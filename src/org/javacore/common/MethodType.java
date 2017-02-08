package org.javacore.common;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.type.signature.MethodSignature;

/**
 */
public interface MethodType extends Identifiable {

    public MethodSignature getSignature();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.METHOD_TYPE;
    }
}
