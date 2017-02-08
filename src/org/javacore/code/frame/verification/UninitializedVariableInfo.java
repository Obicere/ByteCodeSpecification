package org.javacore.code.frame.verification;

import org.javacore.Identifier;
import org.javacore.code.block.label.Label;

/**
 */
public interface UninitializedVariableInfo extends VerificationTypeInfo {

    public Label getOffset();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.UNINITIALIZED_VARIABLE_INFO;
    }
}
