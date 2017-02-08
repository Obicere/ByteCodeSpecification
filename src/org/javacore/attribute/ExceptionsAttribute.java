package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.type.Type;

/**
 */
public interface ExceptionsAttribute extends Attribute {

    public int getNumberOfExceptions();

    public Type[] getExceptions();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.EXCEPTIONS_ATTRIBUTE;
    }

}
