package org.javacore.type.generic;

import org.javacore.type.GenericType;
import org.javacore.type.factory.TypeFactory;

/**
 * @author Obicere
 */
public interface GenericDeclaration<G extends GenericDeclarationDeclarer<? extends GenericDeclaration<G>>> {

    public GenericType[] getGenericTypes();

    public GenericType getGenericType(final String name);

    public GenericDeclaration<?> getOuterDeclaration();

    public G getDeclarer();

    public TypeFactory getFactory();

}
