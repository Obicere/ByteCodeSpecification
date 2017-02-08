package org.javacore.code;

import org.javacore.code.block.label.Label;
import org.javacore.type.Type;

/**
 */
public interface CodeException {

    public Type getType();

    public Label getStart();

    public Label getEnd();

    public Label getHandler();

}
