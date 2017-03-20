package org.javacore.annotation.target;

import org.javacore.code.block.label.Label;

/**
 */
public interface LocalVar {

    public Label getStart();

    public Label getEnd();

    public int getIndex();

}
