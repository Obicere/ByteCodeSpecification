package org.javacore.attribute;

import org.javacore.Identifier;
import org.javacore.code.Code;
import org.javacore.code.table.CodeExceptionTable;

/**
 */
public interface CodeAttribute extends Attribute {

    public int getMaxStack();

    public int getMaxLocals();

    public int getCodeLength();

    public Code getCode();

    public int getExceptionTableLength();

    public CodeExceptionTable getExceptionTable();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_ATTRIBUTE;
    }
}
