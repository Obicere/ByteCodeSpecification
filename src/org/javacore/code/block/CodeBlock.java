package org.javacore.code.block;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface CodeBlock extends Identifiable {

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_BLOCK;
    }

}
