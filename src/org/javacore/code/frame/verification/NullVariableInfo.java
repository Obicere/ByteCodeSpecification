package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface NullVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.NULL_VARIABLE_INFO;
    }
}
