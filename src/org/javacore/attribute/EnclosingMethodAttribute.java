package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.type.Type;

/**
 */
public interface EnclosingMethodAttribute extends Attribute {

    public Type getEnclosingClass();

    public JCMethod getEnclosingMethod();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.ENCLOSING_METHOD_ATTRIBUTE;
    }
}
