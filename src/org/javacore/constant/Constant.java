package org.javacore.constant;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface Constant extends Identifiable {

    public int getTag();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CONSTANT;
    }

}
