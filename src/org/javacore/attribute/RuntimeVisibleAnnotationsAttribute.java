package org.javacore.attribute;

import org.javacore.Identifier;

/**
 */
public interface RuntimeVisibleAnnotationsAttribute extends AnnotationsAttribute {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_VISIBLE_ANNOTATIONS_ATTRIBUTE;
    }

}
