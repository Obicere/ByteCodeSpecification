package org.javacore.code.frame;

import org.javacore.Identifier;

/**
 */
public interface ChopFrame extends StackMapFrame {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.CHOP_FRAME;
    }
}
