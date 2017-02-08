package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.code.LineNumber;

/**
 */
public interface LineNumberTableAttribute extends Attribute {

    public LineNumber[] getTable();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LINE_NUMBER_TABLE_ATTRIBUTE;
    }

}
