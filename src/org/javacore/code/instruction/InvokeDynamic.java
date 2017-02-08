package org.javacore.code.instruction;

import org.javacore.Identifier;
import org.javacore.common.BootstrapMethodLink;

/**
 */
public interface InvokeDynamic extends InvokeInstruction {

    public BootstrapMethodLink getInvocation();

    public int getByte3();

    public int getByte4();

    @Override
    default public Identifier getIdentifier() {
        return Identifier.INVOKEDYNAMIC;
    }
}
