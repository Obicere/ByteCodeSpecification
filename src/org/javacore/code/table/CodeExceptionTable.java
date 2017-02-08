package org.javacore.code.table;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.CodeException;

/**
 */
public interface CodeExceptionTable extends Identifiable {

    public CodeException[] getCodeExceptions();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_EXCEPTION_TABLE;
    }
}
