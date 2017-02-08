package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.TypeAnnotation;

/**
 */
public interface RuntimeVisibleTypeAnnotationsAttribute extends AnnotationsAttribute {

    @Override
    public TypeAnnotation[] getAnnotations();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_VISIBLE_TYPE_ANNOTATIONS_ATTRIBUTE;
    }
}
