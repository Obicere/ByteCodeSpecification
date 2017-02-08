package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.common.BootstrapMethod;

/**
 */
public interface BootstrapMethodsAttribute extends Attribute {

    public BootstrapMethod[] getMethods();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.BOOTSTRAP_METHODS_ATTRIBUTE;
    }
}
