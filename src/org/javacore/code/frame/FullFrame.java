package org.javacore.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 */
public interface FullFrame extends StackMapFrame {

    public VerificationTypeInfo[] getLocals();

    public VerificationTypeInfo[] getStack();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.APPEND_FRAME;
    }
}
