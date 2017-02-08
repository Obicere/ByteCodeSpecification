package org.javacore.code.block.label;

import org.javacore.Identifiable;
import org.javacore.Identifier;
import org.javacore.code.block.CodeBlock;

/**
 * @author Obicere
 */
public interface Label extends Identifiable {

    public CodeBlock getBlock();

    public void setCodeBlock(final CodeBlock block);

    public int getOffset();

    public void setOffset(final int offset);

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LABEL;
    }

}
