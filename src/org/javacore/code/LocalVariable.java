package org.javacore.code;

import org.javacore.code.block.label.Label;
import org.javacore.type.Type;

/**
 */
public interface LocalVariable {

    public String getName();

    public Type getType();

    public int getIndex();

    public Label getStart();

    public Label getEnd();

}
