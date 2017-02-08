package org.javacore.type.generic;

/**
 * @author Obicere
 */
public interface GenericDeclarationDeclarer<D extends GenericDeclaration> {

    public D getDeclaration();

}
