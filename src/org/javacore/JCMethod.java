package org.javacore;

import org.javacore.type.generic.GenericDeclarationDeclarer;
import org.javacore.type.generic.MethodGenericDeclaration;

/**
 */
public interface JCMethod extends GenericDeclarationDeclarer<MethodGenericDeclaration>, Attributable {

    @Override
    default public Identifier getIdentifier() {
        return Identifier.METHOD;
    }
}
