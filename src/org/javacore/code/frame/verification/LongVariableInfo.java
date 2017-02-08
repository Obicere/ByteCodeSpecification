package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface LongVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.LONG_VARIABLE_INFO;
    }
}
