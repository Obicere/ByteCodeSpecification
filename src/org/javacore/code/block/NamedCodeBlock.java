package org.javacore.code.block;

import org.javacore.Identifier;

/**
 */
public interface NamedCodeBlock extends CodeBlock {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NAMED_CODE_BLOCK;
    }
}
