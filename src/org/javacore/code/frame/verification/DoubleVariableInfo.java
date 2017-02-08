package org.javacore.code.frame.verification;

import org.javacore.Identifier;

/**
 */
public interface DoubleVariableInfo extends VerificationTypeInfo {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.DOUBLE_VARIABLE_INFO;
    }

}
