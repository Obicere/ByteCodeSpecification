package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.JCMethod;
import org.javacore.reference.Reference;

/**
 */
public interface InvokeInterface extends InvokeInstruction {

    public Reference<JCMethod> getMethod();

    public int getCount();

    public int getByte4();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INVOKEINTERFACE;
    }
}
