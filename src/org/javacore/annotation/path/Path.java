package org.javacore.annotation.path;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface Path extends Identifiable {

    public PathKind getKind();

    public int getArgumentIndex();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.PATH;
    }

}
