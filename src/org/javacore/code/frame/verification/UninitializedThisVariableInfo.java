package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface UninitializedThisVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.UNINITIALIZED_THIS_VARIABLE_INFO;
    }
}
