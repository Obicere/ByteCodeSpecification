package org.javacore.annotation;

import org.javacore.Identifier;

/**
 */
public interface AnnotationElementValue extends ElementValue {

    public Annotation getAnnotation();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ANNOTATION_ELEMENT_VALUE;
    }

}
