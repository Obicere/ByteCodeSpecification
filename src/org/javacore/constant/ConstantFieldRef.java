package org.javacore.constant;

import org.javacore.Identifier;
import org.javacore.JCField;
import org.javacore.reference.Reference;

/**
 */
public interface ConstantFieldRef extends ConstantRef {

    @Override
    public Reference<JCField> getReference();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT_FIELD_REF;
    }

}
