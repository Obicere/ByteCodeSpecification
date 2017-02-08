package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface RuntimeInvisibleAnnotationsAttribute extends AnnotationsAttribute {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_INVISIBLE_ANNOTATIONS_ATTRIBUTE;
    }

}
