package org.javacore.code.block;

import org.javacore.Identifier;

/**
 */
public interface ImplicitCodeBlock extends CodeBlock {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.IMPLICIT_CODE_BLOCK;
    }

}
