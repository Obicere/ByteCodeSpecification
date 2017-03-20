package org.javacore.code.table;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.CodeBlock;

/**
 */
public interface CodeBlockTable extends Identifiable {

    // Might have to introduce line numbers here as well, to make the
    // LineCodeBlock work smoothly

    public CodeBlock getCodeBlock(final int pc);

    public CodeBlock[] getCodeBlocks();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_BLOCK_TABLE;
    }

}
