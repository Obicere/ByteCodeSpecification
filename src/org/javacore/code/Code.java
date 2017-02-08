package org.javacore.code;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.instruction.Instruction;
import org.javacore.code.table.CodeBlockTable;
import org.javacore.code.table.CodeExceptionTable;
import org.javacore.code.table.LocalVariableTable;

/**
 */
public interface Code extends Identifiable {

    public CodeBlockTable getCodeBlockTable();

    public CodeExceptionTable getCodeExceptionTable();

    public LocalVariableTable getLocalVariableTable();

    public int getStartPC();

    public void setStartPC(final int pc);

    public int getSize();

    public Instruction[] getInstructions();

    /*
    public boolean contains(final int pc);

    public boolean contains(final Label label);

    public boolean contains(final Instruction instruction);

    public boolean containsAny(final Instruction[] instructions);

    public boolean containsAll(final Instruction[] instructions);

    public boolean containsAny(final Label[] label);

    public boolean containsAll(final Label[] label);

    public Iterator<Instruction> instructions();

    public boolean addInstruction(final Instruction instruction);

    public boolean addInstruction(final Instruction instruction, final int pc);

    public boolean addInstructions(final Instruction[] instructions);

    public boolean addInstructions(final Iterable<Instruction> instructions);

    public boolean addInstructions(final Instruction[] instructions, final int pc);

    public boolean addInstructions(final Iterable<Instruction> instructions, final int pc);

    public Instruction[] removeAllInstructions();

    public Instruction removeAllInstructions(final Instruction instruction);

    public Instruction[] removeAllInstructions(final Predicate<Instruction> condition);

    public Instruction removeInstruction(final Instruction instruction);

    public Instruction removeInstruction(final int pc);

    public Instruction[] removeInstructions(final int startPc, final int endPc);
    */

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE;
    }
}
