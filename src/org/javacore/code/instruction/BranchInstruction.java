package org.javacore.code.instruction;

import org.javacore.code.block.label.Label;

/**
 */
public interface BranchInstruction extends Instruction {

    public Label getBranch();

}
