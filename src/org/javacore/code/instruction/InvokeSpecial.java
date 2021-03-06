package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface InvokeSpecial extends InvokeInstruction {

    public Reference<JCMethod> getMethod();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INVOKESPECIAL;
    }
}
