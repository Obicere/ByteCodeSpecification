package org.javacore.annotation.target;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface Target extends Identifiable {

    public int getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.TARGET;
    }
}
