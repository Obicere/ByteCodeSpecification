package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface TopVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.TOP_VARIABLE_INFO;
    }
}
