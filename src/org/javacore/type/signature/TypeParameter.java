package org.javacore.type.signature;

/**
 */
public interface TypeParameter extends ReferenceTypeSignature {

    public String getIdentifier();

    public ReferenceTypeSignature getClassBound();

    public ReferenceTypeSignature[] getInterfaceBounds();

}
