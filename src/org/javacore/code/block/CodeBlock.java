package org.javacore.code.block;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface CodeBlock extends Identifiable {

    public int getStartPC();

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CODE_BLOCK;
    }

}
