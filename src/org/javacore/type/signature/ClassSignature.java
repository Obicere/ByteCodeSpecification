package org.javacore.type.signature;

/**
 */
public interface ClassSignature {

    public TypeParameter[] getTypeParameters();

    public ClassTypeSignature getSuperClass();

    public ClassTypeSignature[] getSuperInterfaces();

}
