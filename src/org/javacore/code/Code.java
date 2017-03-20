package org.javacore.code;

import org.javacore.Attributable;
import org.javacore.Identifier;
import org.javacore.code.block.label.Label;
import org.javacore.code.instruction.Instruction;
import org.javacore.code.table.CodeBlockTable;
import org.javacore.code.table.CodeExceptionTable;
import org.javacore.code.table.LocalVariableTable;

/**
 */
public interface Code extends Attributable {

    public int getMaxLocals();

    public int getMaxStack();

    public CodeBlockTable getCodeBlockTable();

    public CodeExceptionTable getCodeExceptionTable();

    public LocalVariableTable getLocalVariableTable();

    public int getSize();

    public Label getLabel(final int pc);

    public Label getLabel(final int pc, final boolean special);

    public Instruction[] getInstructions();

    public Instruction[] getInstructions(final int from, final int to);

    public boolean insertBefore(final int pc, final Instruction[] instructions);

    public boolean insertBefore(final int pc, final Instruction[] instructions, final int start, final int length);

    public boolean insert(final Instruction[] instructions);

    public boolean insert(final int pc, final Instruction[] instructions);

    public boolean insert(final int pc, final Instruction[] instructions, final boolean updateLabels);

    public boolean insert(final int pc, final Instruction[] instructions, final int start, final int length);

    public boolean insert(final int pc, final Instruction[] instructions, final int start, final int length, final boolean updateLabels);

    public Instruction[] removeAll();

    public Instruction[] remove(final int startPc, final int endPc);

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

    public Instruction removeAllInstructions(final Instruction instruction);

    public Instruction[] removeAllInstructions(final Predicate<Instruction> condition);

    public Instruction removeInstruction(final Instruction instruction);

    public Instruction removeInstruction(final int pc);
    */

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE;
    }
}
