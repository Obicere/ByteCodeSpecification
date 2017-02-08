package org.javacore.code.block;

import org.javacore.Identifier;
import org.javacore.code.LineNumber;

/**
 */
public interface LineCodeBlock extends CodeBlock {

    public LineNumber getLineNumber();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LINE_CODE_BLOCK;
    }

}
