package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface SourceDebugExtensionAttribute extends Attribute {

    public String getDebugExtension();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SOURCE_DEBUG_EXTENSION_ATTRIBUTE;
    }
}
