package org.javacore.annotation;

import org.javacore.Identifier;
import org.javacore.annotation.path.Path;
import org.javacore.annotation.target.Target;

/**
 */
public interface TypeAnnotation extends Annotation {

    public int getTargetType();

    public Target getTarget();

    public Path[] getPath();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.TYPE_ANNOTATION;
    }
}
