package org.javacore.code;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.label.Label;
import org.javacore.type.Type;

/**
 */
public interface LocalVariable extends Identifiable {

    public String getName();

    public Type getType();

    public int getIndex();

    public Label getStart();

    public Label getEnd();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOCAL_VARIABLE;
    }

}
