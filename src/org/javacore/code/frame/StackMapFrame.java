package org.javacore.code.frame;

import org.javacore.Identifiable;
import org.javacore.Identifier;

/**
 */
public interface StackMapFrame extends Identifiable {

    public int getFrameType();

    public int getOffsetDelta();

    public String getName();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.STACK_MAP_FRAME;
    }
}
