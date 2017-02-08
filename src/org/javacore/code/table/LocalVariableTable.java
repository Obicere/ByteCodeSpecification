package org.javacore.code.table;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.LocalVariable;

/**
 */
public interface LocalVariableTable extends Identifiable {

    public LocalVariable[] getLocalVariables();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOCAL_VARIABLE_TABLE;
    }

}
