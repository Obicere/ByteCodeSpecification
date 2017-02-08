package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.Annotation;

/**
 */
public interface RuntimeInvisibleParameterAnnotationsAttribute extends Attribute {

    public Annotation[][] getParameterAnnotations();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS_ATTRIBUTE;
    }
}
