package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface FloatVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.FLOAT_VARIABLE_INFO;
    }
}
