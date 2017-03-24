package org.javacore.annotation.target;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.label.Label;

/**
 */
public interface LocalVar extends Identifiable {

    public Label getStart();

    public Label getEnd();

    public int getIndex();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LOCAL_VAR;
    }

}
