package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.code.LocalVariable;

/**
 */
public interface LocalVariableTypeTableAttribute extends Attribute {

    public LocalVariable[] getTable();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOCAL_VARIABLE_TYPE_TABLE_ATTRIBUTE;
    }
}
