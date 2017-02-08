package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.annotation.ElementValue;

/**
 */
public interface AnnotationDefaultAttribute extends Attribute {

    public ElementValue getDefaultValue();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ANNOTATION_DEFAULT_ATTRIBUTE;
    }
}
