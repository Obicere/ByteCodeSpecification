package org.javacore.code.instruction;

import org.javacore.code.block.label.Label;

/**
 */
public interface SwitchInstruction extends Instruction {

    public Label getDefault();

    public Label[] getOffsets();

}
