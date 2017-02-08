package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface InvokeVirtual extends InvokeInstruction {

    public Reference<JCMethod> getMethod();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INVOKEVIRTUAL;
    }
}
