package org.javacore.common;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface Parameter extends Identifiable {

    public String getName();

    public int getAccessFlags();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.PARAMETER;
    }

}
