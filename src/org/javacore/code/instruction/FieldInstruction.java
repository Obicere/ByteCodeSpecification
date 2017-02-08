package org.javacore.code.instruction;

import org.javacore.JCField;
import org.javacore.reference.Reference;

/**
 */
public interface FieldInstruction extends Instruction {

    public Reference<JCField> getField();

}
