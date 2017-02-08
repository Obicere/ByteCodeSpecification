package org.javacore.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 */
public interface AppendFrame extends StackMapFrame {

    public VerificationTypeInfo[] getLocals();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.APPEND_FRAME;
    }

}
