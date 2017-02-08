package org.javacore.type.signature;

/**
 */
public interface ClassTypeSignature extends ReferenceTypeSignature, ThrowsSignature {

    public String getPackage();

    public SimpleClassTypeSignature getSignature();

    public SimpleClassTypeSignature[] getSuffixes();

}
