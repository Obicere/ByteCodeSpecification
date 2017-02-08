package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface IntegerVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INTEGER_VARIABLE_INFO;
    }
}
