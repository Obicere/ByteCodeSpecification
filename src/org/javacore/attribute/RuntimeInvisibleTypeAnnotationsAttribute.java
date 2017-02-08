package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface RuntimeInvisibleTypeAnnotationsAttribute extends AnnotationsAttribute {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_INVISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE;
    }
}
