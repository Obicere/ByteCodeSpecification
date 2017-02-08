package org.javacore.code.frame;

import org.javacore.Identifier;

/**
 */
public interface SameFrame extends StackMapFrame {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SAME_FRAME;
    }
}
