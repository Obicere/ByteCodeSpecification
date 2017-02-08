package org.javacore.type.signature;

/**
 */
public interface MethodSignature {

    public TypeParameter[] getTypeParameters();

    public JavaTypeSignature[] getParameters();

    public ResultSignature getResult();

    public ThrowsSignature[] getThrowsSignatures();
}
