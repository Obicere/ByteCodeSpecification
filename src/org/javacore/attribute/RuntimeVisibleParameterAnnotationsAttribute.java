package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.Annotation;

/**
 */
public interface RuntimeVisibleParameterAnnotationsAttribute extends Attribute {

    public Annotation[][] getParameterAnnotations();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE;
    }

}
