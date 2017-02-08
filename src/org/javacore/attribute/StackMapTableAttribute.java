package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.code.frame.StackMapFrame;

/**
 */
public interface StackMapTableAttribute extends Attribute {

    public int getNumberOfEntries();

    public StackMapFrame[] getEntries();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.STACK_MAP_TABLE_ATTRIBUTE;
    }
}
