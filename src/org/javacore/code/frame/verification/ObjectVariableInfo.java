package org.javacore.code.frame.verification;

import org.javacore.Identifier;
import org.javacore.type.Type;

/**
 */
public interface ObjectVariableInfo extends VerificationTypeInfo {

    public Type getType();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.OBJECT_VARIABLE_INFO;
    }
}
