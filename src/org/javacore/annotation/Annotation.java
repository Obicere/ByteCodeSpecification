package org.javacore.annotation;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.JCClass;

/**
 */
public interface Annotation extends Identifiable {

    public JCClass getType();

    public ElementValuePair[] getValues();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ANNOTATION;
    }

}
