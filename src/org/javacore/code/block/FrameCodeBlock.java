package org.javacore.code.block;

import org.javacore.Identifier;
import org.javacore.code.frame.StackMapFrame;

/**
 */
public interface FrameCodeBlock extends CodeBlock {

    public StackMapFrame getFrame();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FRAME_CODE_BLOCK;
    }

}
