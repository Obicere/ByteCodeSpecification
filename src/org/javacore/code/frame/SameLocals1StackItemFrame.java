package org.javacore.code.frame;

import org.javacore.Identifier;
import org.javacore.code.frame.verification.VerificationTypeInfo;

/**
 */
public interface SameLocals1StackItemFrame extends StackMapFrame {

    public VerificationTypeInfo getStackItem();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.SAME_LOCALS_1_STACK_ITEM_FRAME;
    }

}
