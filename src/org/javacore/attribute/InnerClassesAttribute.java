package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.common.InnerClass;

/**
 */
public interface InnerClassesAttribute extends Attribute {

    public int getNumberOfClasses();

    public InnerClass[] getClasses();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INNER_CLASSES_ATTRIBUTE;
    }
}
