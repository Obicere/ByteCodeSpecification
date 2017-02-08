package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.code.LocalVariable;

/**
 */
public interface LocalVariableTableAttribute extends Attribute {

    public LocalVariable[] getTable();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOCAL_VARIABLE_TABLE_ATTRIBUTE;
    }
}
